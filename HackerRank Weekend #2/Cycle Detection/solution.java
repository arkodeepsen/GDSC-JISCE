 // Complete the hasCycle function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static boolean hasCycle(SinglyLinkedListNode head) {
        SinglyLinkedListNode dpoint=head;
        SinglyLinkedListNode apoint=head;
        while(dpoint!=null&&apoint!=null&&apoint.next!=null)
        {
            apoint=apoint.next.next;
            dpoint=dpoint.next;
            if(apoint==dpoint)
            {
                return true;
            }
        }
        return false;
    }
