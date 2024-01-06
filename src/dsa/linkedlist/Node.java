package dsa.linkedlist;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Node {
    int val;
    Node next;
    Node prev;

}
