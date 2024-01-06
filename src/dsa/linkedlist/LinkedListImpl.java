package dsa.linkedlist;

public class LinkedListImpl {
    public static void main(String[] args) {

        System.out.println("<-------Singly Linked list------->");
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.print();
        linkedList.delete(3);
        linkedList.print();
        linkedList.insert(5);
        linkedList.reverse();
        linkedList.print();

        //Doubly Linked List
        System.out.println();
        System.out.println("<-------Doubly Linked list------->");
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insert(2);
        doublyLinkedList.insert(3);
        doublyLinkedList.insert(4);
        doublyLinkedList.print();
        doublyLinkedList.delete(3);
        doublyLinkedList.print();
        doublyLinkedList.insert(5);
        doublyLinkedList.print();
        doublyLinkedList.printReverse();
        doublyLinkedList.reverse();
        doublyLinkedList.print();

    }
}
