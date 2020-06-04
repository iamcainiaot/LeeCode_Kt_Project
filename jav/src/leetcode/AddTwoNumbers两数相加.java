package leetcode;

public class AddTwoNumbers������� {
    /*
        �������� �ǿ� ������������ʾ�����Ǹ������������У����Ǹ��Ե�λ���ǰ��� ���� �ķ�ʽ�洢�ģ�
        �������ǵ�ÿ���ڵ�ֻ�ܴ洢 һλ ���֡�
        ��������ǽ��������������������᷵��һ���µ���������ʾ���ǵĺ͡�
        �����Լ���������� 0 ֮�⣬���������������� 0 ��ͷ��
        ʾ����
        ���룺(2 -> 4 -> 3) + (5 -> 6 -> 4)
        �����7 -> 0 -> 8
        ԭ��342 + 465 = 807
     */
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        addTwoNumbers(l1, l2);
    }

    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // ����һ���µ�����
        ListNode LastListNode = new ListNode(0);
        ListNode p = l1, q = l2;
        // ��ֵ��������
        ListNode newListNode = LastListNode;
        int carry = 0;
        while (p != null || q != null) {
            // �������Ϊ�գ���ֵΪ�գ�����Ϊ�����иýڵ��ֵ
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            // �ڵ�ֵ���֮��
            int sum = carry + x + y;
            // �����λ  / ��ģ ,% ȡ��  ; 17 / 5 = 3 ; 17 % 5 = 2
            carry = sum / 10;
            // ����ֵ
            newListNode.next = new ListNode(sum % 10);
            // ָ��ָ������һ���ڵ�
            newListNode = newListNode.next;
            // ָ������
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            newListNode.next = new ListNode(carry);
        }
        return LastListNode.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}