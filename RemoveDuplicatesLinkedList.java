public class RemoveDuplicatesLinkedList {

    public void removeDuplicates (CreateLinkedList list) {
        if (list.head == null) {
            System.out.println ("The list is empty. No Duplicates to be removed.");
        }

        else {
            Node curr_node = list.head;
            while (curr_node != null && curr_node.next != null) {
                Node temp_node = curr_node;
                while (temp_node.next != null) {
                    if (temp_node.next.data == curr_node.data) {
                       temp_node.next = temp_node.next.next;
                    } else {
                        temp_node = temp_node.next;
                    }
    
                }
                curr_node = curr_node.next;
            }
            
        }

    }
    
}
