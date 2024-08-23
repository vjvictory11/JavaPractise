package dsa.linkedlist;

public class LinkedListPractise {
    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.insert(5);
        linkedList.insert(6);

//        linkedList.print();

//        Node head = removeDuplicates(linkedList.head);
//        print(head);


//        Node head = rotate(linkedList.head, 2);
//        print(head);

        Node head = reverseKGroup(linkedList.head, 2);
        print(head);



    }

    public static Node reverseKGroup(Node head, int k) {
        Node dummy = new Node(-1);
        Node start = dummy;
        int length = getLength(head);
        int count = length/k;
        Node next = head;
        Node curr = head;

        while(count>0) {
            Node last = curr;
            dummy.next = reverse(curr, next, k);
            dummy = last.next;
            curr = last.next;
            count--;
        }
        dummy.next = next;
        return start.next;
    }

    static int getLength(Node node) {
        if(node==null) return 0;

        return 1+getLength(node.next);
    }

    static Node reverse(Node node, Node next, int k) {
        Node prev = null;
        while(k>0) {
            Node n = node.next;
            node.next = prev;
            if(prev!=null) {
                prev.next = n;
            }
            prev = node;
            node = n;
            k--;
        }
        next = node;
        prev.next = null;
        return prev;

    }

    static void print(Node head) {
        while (head!=null) {
            System.out.print(head.val+" -> ");
            head = head.next;
        }
        System.out.print("null");
        System.out.println();
    }
}
