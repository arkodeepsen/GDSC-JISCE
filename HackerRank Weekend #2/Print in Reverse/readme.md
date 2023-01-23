This challenge is part of a tutorial track by [MyCodeSchool](https://www.hackerrank.com/external_redirect?to=http://www.youtube.com/mycodeschool) and is accompanied by a video lesson.

Given a pointer to the head of a singly-linked list, print each  value from the reversed list. If the given list is empty, do not print anything.

Example

 refers to the linked list with  values 

Print the following:
3
2
1

Function Description

Complete the reversePrint function in the editor below.

reversePrint has the following parameters:

SinglyLinkedListNode pointer head: a reference to the head of the list
Prints

The  values of each node in the reversed list.

Input Format

The first line of input contains , the number of test cases.

The input of each test case is as follows:

The first line contains an integer , the number of elements in the list.
Each of the next n lines contains a data element for a list node.
Constraints

, where  is the  element in the list.
Sample Input

3
5
16
12
4
2
5
3
7
3
9
5
5
1
18
3
13
Sample Output

5
2
4
12
16
9
3
7
13
3
18
1
5
Explanation

There are three test cases. There are no blank lines between test case output.

The first linked list has  elements: . Printing this in reverse order produces:
5
2
4
12
16

The second linked list has  elements: . Printing this in reverse order produces:
9
3
7
The third linked list has  elements: . Printing this in reverse order produces:
13
3
18
1
5
