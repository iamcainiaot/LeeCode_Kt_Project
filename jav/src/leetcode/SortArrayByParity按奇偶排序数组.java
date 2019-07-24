package leetcode;

public class SortArrayByParity����ż�������� {
    /*
     * ����һ���Ǹ��������� A������һ���� A ������ż��Ԫ����ɵ����飬����� A ����������Ԫ�ء�
     *
     * ����Է���������������κ�������Ϊ�𰸡�
     *
     * ʾ����
     *
     * ���룺[3,1,2,4] �����[2,4,3,1] ��� [4,2,3,1]��[2,4,1,3] �� [4,2,1,3] Ҳ�ᱻ���ܡ�
     *
     * ��ʾ�� 1 <= A.length <= 5000 0 <= A[i] <= 5000
     */

    public static void main(String[] args) {
        int a[] = {3, 1, 2, 4};
        int[] s = sortArrayByParity2(a);
        for (int s1 : s) {
            System.out.println(s1);
        }

    }

    /**
     * int[] N = {1,2,3,4};
     * new[] b = new [N.length];
     * ˼·1��������������Σ�ż���ȷŽ�ȥ���ٷ�������ȥ
     */
    private static int[] sortArrayByParity(int[] A) {
        int N = A.length;
        int[] ans = new int[N];
        int t = 0;
        for (int x : A) {
            if (x % 2 == 0) {
                ans[t] = x;
                t += 1;
            }
        }
        for (int x : A) {
            if (x % 2 == 1) {
                ans[t] = x;
                t += 1;
            }
        }
        return ans;
    }

    /**
     * ˼·2�����������һ�Σ��������ż����b�зţ�ż����ǰ�ţ������Ӻ�ʼ��
     */
    private static int[] sortArrayByParity2(int[] A) {
        int N = A.length;
        int[] b = new int[N];
        int ouCount = 0;
        int jiCount = N - 1;
        for (int x : A) {
            // ��ż��
            if (x % 2 == 0) {
                b[ouCount] = x;
                ouCount++;
            } else {
                // ������
                b[jiCount] = x;
                jiCount--;
            }
        }
        return b;
    }
}