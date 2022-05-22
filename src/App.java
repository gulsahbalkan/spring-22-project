import java.lang.Math;
import java.util.ArrayList;

import medianProblem.*;
public class App {
    public static void main(String[] args){
        Operators operator = new Operators();
        double[][] facs_coordinates = operator.createDistanceMatrix(5,2);
        double[][] points_coordinates = operator.createDistanceMatrix(20,2);
        Facility[] facs = new Facility[5];
        Point[] points = new Point [20];
        for (int i=0; i<facs.length;i++){
            Facility f1 = new Facility(i, facs_coordinates[i][0], facs_coordinates[i][1], 20*Math.random()+50);
            facs[i] = f1;
        }
        for (int i=0; i<points.length;i++){
            Point p1 = new Point (i, points_coordinates[i][0], points_coordinates[i][1], 2*Math.random()+1);
            points[i] = p1;
        }
        double[][] distanceMatrix = operator.distanceMatrix(facs, points);
        ArrayList<Facility> openedFacilities = new ArrayList<>();
        ArrayList<Facility> unassignedFacilities = new ArrayList<>();
        ArrayList<ArrayList<Point>> assignmentList = new ArrayList<>();

        int P=4;
        int facilityIndex=0;
        while(facilityIndex<facs.length){
            unassignedFacilities.add(facs[facilityIndex]);
            facilityIndex++;
        }
        double[]sums=new double[unassignedFacilities.size()];
        for(int i=0; i<distanceMatrix.length;i++){
            double sum=0;
            for(int j=0;j< distanceMatrix[0].length;j++){
                sum=sum+distanceMatrix[i][j];
            }
            sums[i]=sum;
        }
        while (openedFacilities.size() !=P){
            double min= Double.MAX_VALUE;
            int min_i=0;
            for(int i=0;i< sums.length;i++){
                if (min > sums[i] && sums[i]>-1) {
                    min =sums[i];
                    min_i=i;
                }
            }
            openedFacilities.add(facs[min_i]);
            unassignedFacilities.remove(facs[min_i]);
        }
    }
}



