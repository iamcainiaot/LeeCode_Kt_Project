package leetcode;

public class HammingDistance�������� {
    /*
     * ��������֮��ĺ�������ָ�������������ֶ�Ӧ������λ��ͬ��λ�õ���Ŀ��
     * ������������ x �� y����������֮��ĺ������롣
     * ע�⣺
     * 0 �� x, y < 231.
     * ʾ��:
     * ����: x = 1, y = 4
     * ���: 2
     * ����:
     * 1   (0 0 0 1)
     * 5   (0 1 0 1)
     * ��   ��
     * ����ļ�ͷָ���˶�Ӧ������λ��ͬ��λ�á�
     */
    public static void main(String[] args) {
        hammingDistance(1, 4);
    }

    public static int hammingDistance(int x, int y) {
        // k = 5
        int k = x ^ y;
        System.out.println(k);
        int count = 0;
        while (k != 0) {

            //����ģ������ţ����˻������6ms
            if (k % 2 == 1) {
                count++;
            }
            k = k / 2;
        }
        System.out.println(count);
        return count;
    }
}