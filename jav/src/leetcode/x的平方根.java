package leetcode;

public class x��ƽ���� {
    /*
            ʵ�� int sqrt(int x) ������
            ���㲢���� x ��ƽ���������� x �ǷǸ�������
            ���ڷ������������������ֻ���������Ĳ��֣�С�����ֽ�����ȥ��

            ʾ�� 1:
            ����: 4
            ���: 2
            ʾ�� 2:
            ����: 8
            ���: 2

            ˵��: 8 ��ƽ������ 2.82842...,
             ���ڷ���������������С�����ֽ�����ȥ��
            ��Դ�����ۣ�LeetCode��
            ���ӣ�https://leetcode-cn.com/problems/sqrtx
            ����Ȩ������������С���ҵת������ϵ�ٷ���Ȩ������ҵת����ע��������
     */
    public static void main(String[] args) {
        int x = 2;
        System.out.println(mySqrt(x));
    }

    /**
     * ִ����ʱ :��50 ms ,������ Java �ύ�л����� 6.60% ���û�
     * �ڴ����� : 34.2 MB , ������ Java �ύ�л����� 75.02% ���û�
     */
    private static int mySqrt(int x) {
        if (x == 1) {
            return 1;
        }
        long s = x / 2;
        long sqrt = 0;
        for (long i = 1; i <= s; i++) {
            long s1 = i * i;
            if (s1 > x) {
                return (int) i - 1;
            } else if (s1 <= x) {
                sqrt = i;
            }
        }
        return (int) sqrt;
    }

    /**
     * ִ����ʱ������
     * ���ֲ��ҷ�
     */
    private static int mySqrt2(int x) {
        // ע�⣺�������������������� 2147395599
        // Ҫ�������ķ�Χ���óɳ�����
        // Ϊ���չ˵� 0 ����߽�����Ϊ 0
        long l = 0;
        // # Ϊ���չ˵� 1 ���ұ߽�����Ϊ x // 2 + 1
        long r = x / 2 + 1;
        while (l < r) {
            // ע�⣺����һ��ȡ����λ�������ȡ����λ����������ܻ������ѭ��
            long mid = l + (r - l + 1) / 2;
            long square = mid * mid;
            if (square > x) {
                r = mid - 1;
            } else {
                l = mid;
            }
        }
        return (int) l;
    }
}