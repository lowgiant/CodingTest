import java.util.ArrayList;

public class PalindromeLinkedList{

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static boolean palindromeLinkedList(ListNode head) {
        boolean answer = true;

        ArrayList<Integer> list = new ArrayList<Integer>();

        ListNode node = head;
        while (node != null) {
            list.add(node.val);
            node = node.next;
        }

        int len = list.size();
        for (int index = 0; index < (len / 2); index++) {

            if (list.get(index).intValue() != list.get(len - index - 1).intValue()) {
                answer = false;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        ListNode headTwo = new ListNode(1, head);
        System.out.println(palindromeLinkedList(headTwo));
    }
}


