package leetcode;

public class ƽ����֮�� {
    /*
     *      ����һ���Ǹ�����c����Ҫ�ж��Ƿ������������ a �� b��ʹ�� a2 + b2 = c��
     *      ʾ��1:
     *      ����: 5
     *      ���: True
     *      ����: 1 * 1 + 2 * 2 = 5
     *      ʾ��2:
     *      ����: 3
     *      ���: False
     */
    public static void main(String[] args) {
        int c = 384;
        boolean flag = judgeSquareSum(c);
        System.out.println(flag);
    }

    /**
     *
     */
    private static boolean judgeSquareSum(int c) {
        int a = 0;
        int b = (int) Math.sqrt(c);
        while (a <= b) {
            if (a * a + b * b == c) {
                System.out.println("a=" + a + "��b=" + b);
                return true;
            } else if (a * a + b * b < c) {
                ++a;
            } else {
                --b;
            }
            if (b <= 0 || a >= c) {
                System.out.println("a=" + a + "��b=" + b);
                return false;
            }
        }
        System.out.println("a=" + a + "��b=" + b);
        return false;
    }
}