package LinkedListQuestions;

import java.util.HashSet;

public class Questions {

    void deleteDups(LinkedList ll) {
        HashSet<Integer> hs = new HashSet<>();
        Node current = ll.head;
        Node prev = null;

        while (current != null) {
            int curval = current.value;
            if (hs.contains(curval)) {
                prev.next = current.next;
                ll.size--;
            } else {
                hs.add(curval);
                prev = current;
            }
            current = current.next;
        }
    }

    // Question 2 - Nth to Last
    Node nthToLast(LinkedList ll, int n) {
        Node p1 = ll.head;
        Node p2 = ll.head;
        for (int i = 0; i < n; i++) {
            if (p2 == null) {
                return null;
            }
            p2 = p2.next;
        }
        while (p2 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
}
