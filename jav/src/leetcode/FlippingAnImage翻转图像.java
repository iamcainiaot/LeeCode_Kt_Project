package leetcode;

public class FlippingAnImage��תͼ�� {

    /*
     * ����һ�������ƾ��� A����������ˮƽ��תͼ��Ȼ��תͼ�񲢷��ؽ����
     * ˮƽ��תͼƬ���ǽ�ͼƬ��ÿһ�ж����з�ת�����������磬ˮƽ��ת [1, 1, 0] �Ľ���� [0, 1, 1]��
     * ��תͼƬ����˼��ͼƬ�е� 0 ȫ���� 1 �滻�� 1 ȫ���� 0 �滻�����磬��ת [0, 1, 1] �Ľ���� [1, 0, 0]��
     *
     * ʾ�� 1:
     * ����: [[1,1,0],[1,0,1],[0,0,0]] ���: [[1,0,0],[0,1,0],[1,1,1]] ����: ���ȷ�תÿһ��:
     *
     * [[0,1,1],[1,0,1],[0,0,0]]�� Ȼ��תͼƬ: [[1,0,0],[0,1,0],[1,1,1]]
     *
     * ʾ�� 2:
     * ����: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]] ���:
     * [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
     *
     * ����: ���ȷ�תÿһ��:
     * [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]]��
     * Ȼ��תͼƬ:
     * [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
     *
     * ˵��:
     * 1 <= A.length = A[0].length <= 20 0 <= A[i][j] <= 1
     */
    public static void main(String[] args) {
        int[][] A = {{1, 1, 1}, {1, 0, 1}, {0, 1, 1}};
        flipAndInvertImage(A);
    }

    private static int[][] flipAndInvertImage(int[][] A) {
        for (int a[] : A) {
            for (int b : a) {
                System.out.print(b);
            }
            System.out.println();
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length / 2; j++) {
                int temp = A[i][j];
                A[i][j] = A[i][A[i].length - j - 1];
                A[i][A[i].length - j - 1] = temp;
            }

            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j] == 1) {
                    A[i][j] = 0;
                } else {
                    A[i][j] = 1;
                }
            }
        }


        return A;

        /*
         * int count = b.length % 2; int lengthCount = b.length / 2; int blength
         * = b.length; if (count == 0) {// ˵����������������
         * System.out.println("Ssssss"); for (int i = 0; i < lengthCount; i++) {
         * b[i] = b[blength - i];// ���ݽ��� } } else { System.out.println("sss");
         * for (int i = 0; i < lengthCount; i++) { b[i] = b[blength - i - 1];//
         * ���ݽ��� } // System.out.print(b); }
         *
         * for (int j = 0; j < blength; j++) { if (b[j] == 0) { b[j] = 1; } else
         * { b[j] = 0; } }
         */
        /*
         * } for (int b[] : a) { for (int i = 0; i < b.length; i++) {
         * System.out.print(b[i]); } System.out.println(); }
         */

    }
}
