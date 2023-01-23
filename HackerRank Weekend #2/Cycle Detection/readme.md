A linked list is said to contain a cycle if any node is visited more than once while traversing the list. Given a pointer to the head of a linked list, determine if it contains a cycle. If it does, return . Otherwise, return .

Example

 refers to the list of nodes 

The numbers shown are the node numbers, not their data values. There is no cycle in this list so return .

 refers to the list of nodes 

There is a cycle where node 3 points back to node 1, so return .

Function Description

Complete the has_cycle function in the editor below.

It has the following parameter:

SinglyLinkedListNode pointer head: a reference to the head of the list
Returns

int:  if there is a cycle or  if there is not
Note: If the list is empty,  will be null.

Input Format

The code stub reads from stdin and passes the appropriate argument to your function. The custom test cases format will not be described for this question due to its complexity. Expand the section for the main function and review the code if you would like to figure out how to create a custom case.

Constraints

Sample Input

References to each of the following linked lists are passed as arguments to your function:

![Sample Inputs](https://s3.amazonaws.com/hr-challenge-images/1163/1463778594-900a0ae522-inputs.png)

Sample Output

0
1
Explanation

The first list has no cycle, so return .
The second list has a cycle, so return .
