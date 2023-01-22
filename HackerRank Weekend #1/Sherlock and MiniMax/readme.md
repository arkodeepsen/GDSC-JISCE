Watson gives Sherlock an array of integers. Given the endpoints of an integer range, for all  in that inclusive range, determine the minimum( abs(arr[i]-M) for all ) ). Once that has been determined for all integers in the range, return the  which generated the maximum of those values. If there are multiple 's that result in that value, return the lowest one.

For example, your array  and your range is from  to  inclusive.

M	|arr[1]-M|	|arr[2]-M|	|arr[3]-M|	|arr[4]-M|	Min
6	   3		   1		   1		   3		 1
7	   4		   2		   0		   2		 0
8	   5		   3		   1		   1		 1
We look at the Min column and see the maximum of those three values is . Two 's result in that answer so we choose the lower value, .

Function Description

Complete the sherlockAndMinimax function in the editor below. It should return an integer as described.

sherlockAndMinimax has the following parameters:
- arr: an array of integers
- p: an integer that represents the lowest value of the range for 
- q: an integer that represents the highest value of the range for 

Input Format

The first line contains an integer , the number of elements in .
The next line contains  space-separated integers .
The third line contains two space-separated integers  and , the inclusive endpoints for the range of .

Constraints




Output Format

Print the value of  on a line.

Sample Input

3
5 8 14
4 9
Sample Output

4
Explanation


M	|arr[1]-M|	|arr[2]-M|	|arr[3]-M|	Min
4	   1		   4		   10		 1
5	   0		   3		    9		 0
6	   1		   2		    8		 1
7	   2		   1		    7		 1
8	   3		   0		    6		 0
9	   4		   1		    5		 1
For , or , the result is . Since we have to output the smallest of the multiple solutions, we print .
