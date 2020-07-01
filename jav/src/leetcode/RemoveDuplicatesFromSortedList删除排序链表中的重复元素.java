package leetcode;

public class RemoveDuplicatesFromSortedListɾ�����������е��ظ�Ԫ�� {
    /*
    ����һ����������ɾ�������ظ���Ԫ�أ�ʹ��ÿ��Ԫ��ֻ����һ�Ρ�
    ʾ�� 1:
    ����: 1->1->2
    ���: 1->2
    ʾ�� 2:
    ����: 1->1->2->3->3
    ���: 1->2->3
     */
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        deleteDuplicates(listNode);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;
        while (current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;

    }
}
