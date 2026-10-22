public class LinkedListPractice {
    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public static Node reverse(Node head) {
        // TODO W3-L02-01: redirect links while retaining the unprocessed suffix.
        return head;
    }

    public static Node secondMiddle(Node head) {
        // TODO W3-L02-02: second middle for even length; null for empty.
        return null;
    }

    public static boolean hasCycle(Node head) {
        // TODO W3-L02-03: use references, not node values.
        return false;
    }
}
