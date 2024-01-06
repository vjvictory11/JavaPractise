package dsa.linkedlist;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class SinglyLinkedList {

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

        curr.next = new Node(value, null, null);
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

            System.out.print(node.val+" -> ");
            node = node.next;
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
            prev = curr;
            curr = next;
        }
        head = prev;
    }
}
