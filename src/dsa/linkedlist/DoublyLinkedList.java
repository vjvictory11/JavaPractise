package dsa.linkedlist;

public class DoublyLinkedList {
    Node head;

    void insert(int value) {
        if (head == null) {
            head = new Node(value, null, null);
            return;
        }

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        Node node = new Node(value, null, null);
        curr.next = node;
        node.prev = curr;
    }

    void delete(int value) {
        if (head == null) {
            return;
        }
        Node prev = null;
        Node curr = head;
        if (head.val == value) {
            head = head.next;
            return;
        }
        while (curr != null) {
            if (curr.val == value) {
                prev.next = curr.next;
                if(curr.next!=null) {
                    curr.next.prev = prev;
                }
                curr.prev = prev;
                break;
            } else {
                prev = curr;
                curr = curr.next;
            }
        }
    }

    void print() {
        Node node = head;
        while (node != null) {

            System.out.print(node.val+" <-> ");
            node = node.next;
        }
        System.out.print("null");
        System.out.println();
    }

    void printReverse() {
       Node node = head;
       Node prev  =null;
       while (node!=null) {
           prev = node;
           node = node.next;
       }

       node = prev;
        while (node != null) {

            System.out.print(node.val+" <-> ");
            node = node.prev;
        }
        System.out.print("null");
        System.out.println();
    }
    void reverse() {
        Node prev = null;
        Node curr = head;
        while (curr!=null) {
            Node next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
}
