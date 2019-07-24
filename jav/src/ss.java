public class ss {
    public static void main(String[] args) {
        int index = 1;
        int[][] arr = {{1, 2}, {3, 1}};
        sort(index, arr);
    }

    /**
     * @param index 列数
     * @param arr   二维数组
     */
    private static void sort(int index, int[][] arr) {
        // 第index列 升序排序
        int size = arr.length;
        for (int j = 0; j < size - 1; j++) {
            // 前面数大于后面数则交换
            if (arr[index][j] > arr[index][j + 1]) {
                int s = arr[index][j];
                arr[index][j] = arr[index][j + 1];
                arr[index][j + 1] = s;
            }
        }
        for (int[] s : arr) {
            for (int ss : s) {
                System.out.println(ss);
            }
        }
    }
}