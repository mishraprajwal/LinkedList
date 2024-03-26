public class SearchLinkedList {
    
    public void searchInsideLinkedList (CreateLinkedList list, int target) {

        if (list.head == null) {
            System.out.println("The list is empty. No element to be searched.");
            }   else {
                    Node temp = list.head;
                    int i=0;
                    while (temp != null && temp.data != target) {
                        temp = temp.next;
                        i++;
                    }

                    if (temp == null) {
                        System.out.println("The element " + target + " does not exist in the list.");
                    } else{
                        System.out.println("Yes, the element exists at position " + (i+1));
                    }
            

                    }

    }

}
