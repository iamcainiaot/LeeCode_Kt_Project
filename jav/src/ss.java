public class ss {
    public static void main(String[] args) {
        int index = 1;
        int[][] arr = {{1, 2}, {3, 1}};
        sort(index, arr);
    }

    /**
     * @param index ����
     * @param arr   ��ά����
     */
    private static void sort(int index, int[][] arr) {
        // ��index�� ��������
        int size = arr.length;
        for (int j = 0; j < size - 1; j++) {
            // ǰ�������ں������򽻻�
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