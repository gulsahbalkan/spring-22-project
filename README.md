# spring-22-project

Gülşah Balkan - S020912
Serkan Sürel - S017796

//Problem
How does the execution time change when problem size is increased? 
Report it by running the same algorithm for the given datasets.

//Explanation
First we equated facilities to unassignedFacilities. 
Then we kept the sum of the distances of all points belonging to each facility in the sums array.
Next in the while loop we found the minimum to match with the right facility until our openedFacilities size is P.
We added the facilty(the min)to openedFacilities and removed it from the unassignedFacilities.
Lastly, we calculated the execution time.

//Answer
When (P = 4, Facility = 5, Point = 20) = Execution time is:4384800 nanoseconds.

When (P = 8, Facility = 10, Point = 50) = Execution time is:7799100 nanoseconds.

When (P = 12, Facility = 15, Point = 80) = Execution time is:9238000 nanoseconds.

When (P = 16, Facility = 20, Point = 110) = Execution time is:11672000 nanoseconds.

When (P = 20, Facility = 25, Point = 140) = Execution time is:12205700 nanoseconds.

//Conclusion
When the size of the problem increases, the execution time of our solution increases as well.
