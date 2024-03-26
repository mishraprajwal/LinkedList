
public class LengthLinkedList {

    public void lengthOfLinkedList (CreateLinkedList list) {
        if (list.head == null) {
            System.out.println("The list is empty. Hence the sixe is 0.");
        }

            else {
                Node temp = list.head;
                int i=0;
                while (temp!=null) {
                    i++;
                    temp = temp.next;
                }

                System.out.println("The length of linked list is " + i);
            }   
    
    }

}
