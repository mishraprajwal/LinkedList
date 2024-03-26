public class LastNodeToFirstLinkedList {
    
    public void lastNodeToFirst (CreateLinkedList list) {
        if (list.head == null || list.head.next == null) {
            System.out.println("The list is empty");
        } else {
            Node temp = list.head;
            while (temp.next.next != null) {
                temp = temp.next;
            }

            Node last = temp.next;
            temp.next = null;
            last.next = list.head;
            list.head = last;
            
            
        }

    }

}
