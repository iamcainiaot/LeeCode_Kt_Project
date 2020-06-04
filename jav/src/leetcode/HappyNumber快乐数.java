package leetcode;

public class HappyNumber������ {

    public static void main(String[] args) {
        /*
         * ��дһ���㷨���ж�һ�����ǲ��ǡ�����������
         * <p>
         * һ����������������Ϊ������һ����������ÿһ�ν������滻Ϊ��ÿ��λ���ϵ����ֵ�ƽ���ͣ�
         * Ȼ���ظ��������ֱ���������Ϊ 1��Ҳ����������ѭ����ʼ�ձ䲻��1��������Ա�Ϊ 1����ô��������ǿ�������
         * ����: 19 ���: true
         * ����: 12 + 92 = 82
         * 82 + 22 = 68
         * 62 + 82 = 100
         * 12 + 02 + 02 = 1
         */
        int n = 32;
        System.out.println(isHappy(n) ? "�ǿ�����" : "���ǿ�����");
    }

    private static boolean isHappy(int n) {
        int fast = n;
        int slow = n;
        do {
            slow = squareSum(slow);
            System.out.print("slow" + slow + "  ");
            fast = squareSum(fast);
            fast = squareSum(fast);
            System.out.println("fast" + fast + "  ");
        } while (slow != fast);
        // ��ƽ����Ϊ1��ʱ�򣬱�ʾ�ǿ�����
        return fast == 1;
    }

    private static int squareSum(int m) {
        // ƽ����
        int squaresum = 0;
        while (m != 0) {
            squaresum += (m % 10) * (m % 10);
            m /= 10;
        }
        return squaresum;
    }

        //   ???????????????????????
        /*
         * class Solution {
         public boolean isHappy(int n) {
         for(int j=0;j<100;j++){
         int sum=0;
         int i=0;
         while(n>0){
         i=n % 10;
         n=n/10;
         sum+=i*i;
         }
         if(sum==1) return true;
         n=sum;
         }
         return false;
         }
         }
         */
        }
