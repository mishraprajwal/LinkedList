public class InsertLinkedList {

    public void insertAtStart(CreateLinkedList list, int data) {
        Node newNode = new Node(data);
        if (list.head == null) {
            list.head = newNode;
        } else {
            Node temp =  list.head;
            list.head = newNode;
            list.head.next = temp;

        }
    }

    public void insertAtEnd(CreateLinkedList list, int data) {
        Node newNode = new Node(data);
        if (list.head == null) {
            list.head = newNode;
        } else {
            Node temp = list.head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            
        }
    }

    public void insertAtDesiredPosition (CreateLinkedList list, int data, int position) {
        Node newNode = new Node(data);
        if (list.head == null) {
            list.head = newNode;
        } else {
            Node temp = list.head;
            int i=0;
            while (i < position - 1) {
                temp = temp.next;
                i++;
            }

            newNode.next = temp.next;
            temp.next = newNode;

        }
    
    }

}
