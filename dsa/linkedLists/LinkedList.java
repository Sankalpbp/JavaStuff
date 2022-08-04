import java.util.Scanner;

public class LinkedList {

    private Node head;
    private final static Scanner scanner = LinkedListUtils.getScanner ();

    public LinkedList () {
    }

    public LinkedList (Node head) {
        this.head = head;
    }

    public Node getHead () {
        return this.head;
    }

    public void setHead (Node head) {
        this.head = head;
    }

    public static LinkedList createLinkedList () {
        LinkedList linkedList = new LinkedList ();

        System.out.println ( LinkedListConstants.PROMPT_FOR_HEAD_VALUE );
        int x = scanner.nextInt ();
        linkedList.setHead (new Node (x));

        Node lastNode = linkedList.getHead ();
        System.out.println ( LinkedListConstants.PROMPT_FOR_NODE_VALUE );
        x = scanner.nextInt ();

        while (x != -1) {
            lastNode.setNext (new Node (x));
            lastNode = lastNode.getNext ();
            System.out.println ( LinkedListConstants.PROMPT_FOR_NODE_VALUE );
            x = scanner.nextInt ();
        }

        return linkedList;
    }

    public void print () {
        Node ptr = head;

        System.out.println ();
        while (ptr != null) {
            System.out.print (ptr.getValue () + " ");
            ptr = ptr.getNext ();
        }
        System.out.println ();
    }

}
