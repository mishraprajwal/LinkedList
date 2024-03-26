public class CreateLinkedList {
    Node head;

    // Method to add a new node
    public void create(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next=newNode;
            
        }
        
    }

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("Done!");
        }
    }

