package leetcode;

/**
 * @user taozhu
 * @date 2020/6/4 11:05
 * @description 尾递归
 **/
public class 尾递归 {

    public static void main(String[] args) {
        int a = 0;
        a = ss(1, 1, 10);
        System.out.println(a);
    }

    /**
     * @param lastMonth  上个月的兔子数量
     * @param count      总的兔子数
     * @param monthCount 一共多少个月
     * @return 函数本身
     */
    private static int ss(int lastMonth, int count, int monthCount) {
        if (monthCount == 0) {
            return count;
        }

        return ss(count, count + lastMonth, --monthCount);
    }

}