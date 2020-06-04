package leetcode;

import org.junit.Test;

public class searchInsert��������λ�� {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 4,};
        int target = 3;
        System.out.println(searchInsert(nums, target));
        ;
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) { // ע��
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
