import org.w3c.dom.Node;

import java.util.* ;
class LL{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("is");
        list.add("a");
        list.addLast("List");
        list.addFirst("This");
        list.add(3, "linked");
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.size());
        list.remove(3);
        System.out.println(list);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}
class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode temp;
        while (current != null) {
            temp = current.next; // Save the next node
            current.next = prev;  // Reverse the link
            // Move to the next pair of nodes
            prev = current;
            current = temp;
        }
        // The 'prev' node is now the new head of the reversed list
        return prev;
    }
    // Helper method to print the elements of the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        System.out.println("Original linked list:");
        printList(head);
        // Reverse the linked list
        head = reverseList(head);
        System.out.println("Reversed linked list:");
        printList(head);
    }
}


class nthremove{
    public static ListNode removeNthFromEnd(ListNode head, int n){
        ListNode dummy = new ListNode(0)  ;
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;
        for (int i = 1; i<= n; i++) {
            fast = fast.next;
        }
        while (fast.next != null)
        {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int n = 5;
        System.out.println("Original list:");
        printList(head);

        head = removeNthFromEnd(head, n);

        System.out.println("List after removing the " + n + "th node from the end:");
        printList(head);
    }
}

