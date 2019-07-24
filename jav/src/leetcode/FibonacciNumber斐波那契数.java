package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FibonacciNumber쳲������� {
    /*
        쳲���������ͨ���� F(n) ��ʾ���γɵ����г�Ϊ쳲��������С��������� 0 �� 1 ��ʼ��
        �����ÿһ�����ֶ���ǰ���������ֵĺ͡�Ҳ���ǣ�
        F(0) = 0,   F(1) = 1
        F(N) = F(N - 1) + F(N - 2), ���� N > 1.
        ���� N������ F(N)��

        ʾ�� 1��

        ���룺2
        �����1
        ���ͣ�F(2) = F(1) + F(0) = 1 + 0 = 1.
        ʾ�� 2��

        ���룺3
        �����2
        ���ͣ�F(3) = F(2) + F(1) = 1 + 1 = 2.
        ʾ�� 3��

        ���룺4
        �����3
        ���ͣ�F(4) = F(3) + F(2) = 2 + 1 = 3.

        1  1  2  3  5  8  13  21  34  55 89  144
      */
    public static void main(String[] args) {
        int s = fib2(11);
        System.out.println(s);
    }

    /**
     * ���ϱ�β�ݹ��
     */
    static int fib(int N) {
        if (N < 2) {
            return N;
        } else {
            return fib(N - 1) + fib(N - 2);
        }
    }

    /**
     * f3
     * 3  f2    +   1 f1
     * 1 f1
     */
        /*
         // �ü��ϱ�ֱ�ӵݹ黹Ҫ��
         */
    static int fib2(int a) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        for (int i = 1; i < a; i++) {
            list.add(list.get(i - 1) + list.get(i));
        }
        return list.get(a);
    }
}
