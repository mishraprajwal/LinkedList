public class DeleteLinkedList {
    
    public void deleteFromStart (CreateLinkedList list) {
        if (list.head == null) {
            System.err.println("The list is empty, deletion cannot be performed");
        }
        
        else {
            Node temp = list.head;
            list.head = temp.next;
            temp.next = null;
            }
        
    }

    public void deleteFromEnd (CreateLinkedList list) {
        if (list.head == null) {
            System.err.println("The list is empty, deletion cannot be performed");
        }

        else {
            Node temp = list.head;
            Node prev = list.head;
            while (temp.next != null) {
                prev = temp;
                temp = temp.next;
            }

            prev.next = null;

        }
    }

    public void deleteFromDesiredPosition (CreateLinkedList list, int position) {
        
        if (list.head == null) {
            System.err.println("The list is empty, deletion cannot be performed");
        }
        else {
            Node temp = list.head;
            Node prev = list.head;
            int i=0;
            while (i < position-1) {
                prev = temp;
                temp = temp.next;
                i++;
            }

            prev.next = temp.next;
            temp.next = null;

        }
        
    }
}
