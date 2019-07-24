package leetcode;

public class NonDecreasingArray�ǵݼ����� {
    /*
    ����һ������Ϊ n ���������飬����������ж������ı� 1 ��Ԫ�ص�����£��������ܷ���һ���ǵݼ����С�
    ��������������һ���ǵݼ����еģ� �������������е� i (1 <= i < n)������ array[i] <= array[i + 1]��

    ʾ�� 1:
    ����: [4,2,3]
    ���: True
    ����: �����ͨ���ѵ�һ��4���1��ʹ������Ϊһ���ǵݼ����С�

    ʾ�� 2:
    ����: [4,2,1]
    ���: False
    ����: �㲻����ֻ�ı�һ��Ԫ�ص�����½����Ϊ�ǵݼ����С�
     */
    public static void main(String[] args) {
        int[] numbs = {3, 4, 2, 3};
        System.out.println(checkPossibility(numbs));
    }

    private static boolean checkPossibility(int[] nums) {
        /**
         *  ˼·�����Ƚ���ǰ��ĵ�һ�����ڶ��������бȽ�
         *  ����ߴ����ұߣ�����������У���߱�С�����ұ߱��
         *  ������ǰ�������������Ϊ���û���ˣ����Ե�һ������С����ʵ��Ŀ�깦�ܡ�
         */
        int size = nums.length;
        if (size < 3) {
            return true;
        }
        int count = 0;
        if (nums[0] > nums[1]) {
            nums[0] = nums[1];
            count++;
        }
        for (int i = 1; i < size - 1; i++) {
            /**
             * ���Ǻ�������ݣ�����ߴ����ұߵ�ʱ���ж�count
             * ����1������false
             *
             *   if (left > right) {
             *            nums[i + 1] = nums[i];
             *        } else {
             *            nums[i] = right;
             *        }
             * С��1������Խ�nums[i]��Ϊnum[i-1]
             */
            if (nums[i] > nums[i + 1]) {
                count++;
                if (count > 1) {
                    return false;
                }
                int left = nums[i - 1];
                int right = nums[i + 1];
                if (left > right) {
                    nums[i + 1] = nums[i];
                } else {
                    nums[i] = right;
                }
                // ���һ�αȶ���ɺ���Ҫ����������Ϊǰһ����
                nums[i] = nums[i - 1];
            }
        }
        return true;


        /**
         *  ��һ�����Ա� ��һ�����͵ڶ�����
         *  �ڶ���������һ�������ڵڶ��������򽫵�һ������ֵΪ�ڶ��������ɣ�count++��
         *                                    ����һ����С�ڵڶ����������
         *  ����������������ǰһ�������ں�һ�������������ֱ�ӷ���false
         *  ���Ĳ������򣬽�������������������бȽϣ�����ߴ����ұߣ�������ұ���Ϊ����
         *                                            ���ұ�С����ߣ�����ĸ���Ϊ�ұ���
         *  ���岽��
         */


    }
}