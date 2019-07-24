package leetcode;

import java.util.Arrays;

public class ����֮�� {
    /*
         ����һ���������� nums ��һ��Ŀ��ֵ target�������ڸ��������ҳ���ΪĿ��ֵ���� ���� ���������������ǵ������±ꡣ
         ����Լ���ÿ������ֻ���Ӧһ���𰸡����ǣ��㲻���ظ��������������ͬ����Ԫ�ء�
         ʾ��:
         ���� nums = [2, 7, 11, 15], target = 9
         ��Ϊ nums[0] + nums[1] = 2 + 7 = 9
         ���Է��� [0, 1]
     */
    public static void main(String[] args) {
        int[] nums = new int[]{1, 4, 6, 3};
        int target = 7;
        int[] num = twoSum(nums, target);
        System.out.println(Arrays.toString(num));
    }

    private static int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}