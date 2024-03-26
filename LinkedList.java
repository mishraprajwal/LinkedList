import java.util.Scanner;

public class LinkedList {
    public static void main(String[] args) {
        CreateLinkedList list = new CreateLinkedList();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the number of elements in the linked list:");
            int n = scanner.nextInt();

            System.out.println("Enter the elements:");
            for (int i = 0; i < n; i++) {
                int element = scanner.nextInt();
                list.create(element);
            }
        
        System.out.println("The linked list is:");
        list.display();

        InsertLinkedList inserter = new InsertLinkedList();
            System.out.println("Enter after which position you would like to insert element:");
            int positionToInsert = scanner.nextInt();

            System.out.println("Now enter the element you would like to insert:");
            int element = scanner.nextInt();

            if (positionToInsert == 0) {
                inserter.insertAtStart(list, element);
            }

            else if (positionToInsert == n) {
                inserter.insertAtEnd(list, element);
            }

            else {
                inserter.insertAtDesiredPosition(list, element, positionToInsert);
            }
        
        System.out.println("The linked list after insertion is:");
        list.display();

        DeleteLinkedList deletion = new DeleteLinkedList();
        System.out.println("Enter from which position you would like to delete element:");
        int positionToDelete = scanner.nextInt();

        if (positionToDelete == 0) {
            deletion.deleteFromStart(list);
        }

        else if (positionToDelete == n) {
            deletion.deleteFromEnd(list);
        }

        else {
            deletion.deleteFromDesiredPosition(list, positionToDelete);
        }

        System.out.println("The linked list after deletion is:");
        list.display();

        SearchLinkedList searcher = new SearchLinkedList();
        System.out.println("Enter which element are you looking for:");
        int find = scanner.nextInt();
        searcher.searchInsideLinkedList(list, find);

        LengthLinkedList length = new LengthLinkedList();
        length.lengthOfLinkedList(list);

        ReverseLinkedList reverse = new ReverseLinkedList();
        reverse.reverseList(list);

        System.out.println("The linked list after reversing is:");
        list.display();

        RemoveDuplicatesLinkedList remove = new RemoveDuplicatesLinkedList();
        remove.removeDuplicates(list);

        System.out.println("The linked list after removing duplicate elements is:");
        list.display();

        LastNodeToFirstLinkedList lastToFirst = new LastNodeToFirstLinkedList();
        lastToFirst.lastNodeToFirst(list);

        System.out.println("The linked list after moving last Node to front:");
        list.display();

        } 

    }

}
