package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @user taozhu
 * @date 2020/6/4 11:05
 * @description β�ݹ�  ��������ϵ��
 **/
public class β�ݹ� {

    public static void main(String[] args) {
        // ��ͨ�ݹ�ʱ��
        //   long timeStart = System.currentTimeMillis();
        //   ss(1, 1, 10);
        //   long timeAfter = System.currentTimeMillis();
        //   long s = (timeAfter - timeStart);
        //   System.out.println("s" + s);

        // β�ݹ�ʱ��
        // long timeStart = System.currentTimeMillis();
        // ss(1, 1, 10);
        // long timeAfter = System.currentTimeMillis();
        // System.out.println("��һ��" + (timeAfter - timeStart));

        // ����ʱ��
        long startTime = System.currentTimeMillis();
        System.out.println("time1��" + startTime);
        System.out.println(ss(1, 1, 10));
    }

    /**
     * @param lastMonth  �ϸ��µ���������
     * @param count      �ܵ�������
     * @param monthCount һ�����ٸ���
     * @return ��������
     */
    private static int ss(int lastMonth, int count, int monthCount) {
        if (monthCount == 0) {
            System.out.println("time2��" + System.currentTimeMillis());
            return count;
        }
        return ss(count, count + lastMonth, --monthCount);
    }


    /**
     * ���ϱ�β�ݹ��
     */
    private static int ss1(int N) {
        if (N < 2) {
            return N;
        } else {
            return ss1(N - 1) + ss1(N - 2);
        }
    }

    /**
     * ���ϵķ�ʽ��쳲���������
     *
     * @param a �����·�
     * @return ��������
     */
    private static int ss2(int a) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        for (int i = 1; i < a; i++) {
            list.add(list.get(i - 1) + list.get(i));
        }
        return list.get(a);
    }
}