public class ReverseLinkedList {

    public void reverseList (CreateLinkedList list) {
        if (list.head == null) {
            System.out.println("The list is empty.");
        }

            else {
                Node prev_node = null;
                Node curr_node = list.head;
                Node next_node = list.head;
                while (next_node != null) {
                    next_node = next_node.next;
                    curr_node.next = prev_node;
                    prev_node = curr_node;
                    curr_node = next_node;
                }

                list.head = prev_node;
            }

            
    }
    
}
