package leetcode;

/**
 * @user taozhu
 * @date 2020/6/4 11:05
 * @description β�ݹ�
 **/
public class β�ݹ� {

    public static void main(String[] args) {
        int a = 0;
        a = ss(1, 1, 10);
        System.out.println(a);
    }

    /**
     * @param lastMonth  �ϸ��µ���������
     * @param count      �ܵ�������
     * @param monthCount һ�����ٸ���
     * @return ��������
     */
    private static int ss(int lastMonth, int count, int monthCount) {
        if (monthCount == 0) {
            return count;
        }

        return ss(count, count + lastMonth, --monthCount);
    }

}