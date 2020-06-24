package leetcode;

/**
 * @user taozhu
 * @date 2020/6/24 10:39
 * @description ���ַ�Χ��λ��
 **/
public class BitwiseANDofNumbersRange���ַ�Χ��λ�� {
    /*
    ������Χ [m, n]������ 0 <= m <= n <= 2147483647�����ش˷�Χ���������ֵİ�λ�루���� m, n ���˵㣩��

    ʾ�� 1:

    ����: [5,7]
    ���: 4
    ʾ�� 2:

    ����: [0,1]
    ���: 0
     */
    public static void main(String[] args) {
        int m = 2147483646;
        int n = 2147483647;
        int s = rangeBitwiseAnd(m, n);
        System.out.println("s��" + s);
    }

    /**
     * ��λ��
     */
//    private static int rangeBitwiseAnd(int m, int n) {
//        if (m == Integer.MAX_VALUE) {
//            return m;
//        }
//        int s = m;
//        for (int i = m + 1; i <= n; i++) {
//            s &= i;
//            // ��� i = m + 1����m== Integer.MAX_VALUE ���� m=2147483647��ʱ��m+1�Ͳ���2147483648������1000000000000����������100000000000��
//            if (s == 0 || s == Integer.MAX_VALUE) {
//                return 0;
//            }
//        }
//        return s;
//    }

    /**
     * ��λ��
     */
    private static int rangeBitwiseAnd(int m, int n) {
        int zeros = 0;
        while (n > m) {
            zeros++;
            // >> �� >>> ��ȣ�>>�Ǵ��������ƣ���Ϊ���������ƺ��λ��0���������ƺ��λ��1��>>>���ʾ�޷������ƣ���λȫ����0
            m >>= 1;
            n >>= 1;
        }
        return m << zeros;
    }
}