 Single File Programming Question

Problem Statement


For hiring a car, a travel agency charges R1 rupees per hour for the first N hours and then R2 rupees per hour. Given the total time of travel in minutes is X. The task is to find the total traveling cost in rupees.


Note: While converting minutes into hours, floor value should be considered as the total number of hours. For example: If the total traveling time is 90 minutes, i.e. 1.5 hours, it must be considered as 1 hour.


Example 1

Input

20 ---Value of R1 

4 --- Value of N in hours 

40 --- Value of R2 

300 --- Value of X in minutes

Output

120

Explanation

For total traveling hours hr = (300 + 59) / 60 = 5 (rounded up to the floor values).

Since hr (5) is greater than n (4), the additional hours are calculated.

focus = N * R1 + (hr - N) * r2 = 4 * 20 + (5 - 4) * 40 = 80 + 40 = 120.

Example 2

Input

30 --- Value of R1

5 --- Value of N in hours.

35 --- Value of R2

100 -- Value of X in minutes

Output

150

Explanation

Total traveling hours hr = (100 + 59) / 60 = 2 (rounded up to the floor values).

Since hr (2) is less than n (5), the additional hours are calculated.

Hence, the total travelling cost = N * R1 = 5 * 30 = 150.
Input format :

The first line of input contains an integer R1, representing the rate for the initial hours.

The second line of input contains an integer N, representing the number of initial hours.

The third line of input contains an integer R2, representing the rate for additional hours exceeding n.

The fourth line of input contains an integer X, representing the total duration in minutes.
Output format :

The output prints a single integer representing the cost calculated based on the given rates and duration.


Refer to the sample output for the formatting specifications.
Code constraints :

1 < R1 < R2< 100 

1 < = N < = 100

1 < = X < 10000
Sample test cases :
Input 1 :

20
4
40
300

Output 1 :

120

Input 2 :

30
5
35
100

Output 2 :

150


