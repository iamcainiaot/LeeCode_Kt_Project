package leetcode;

/**
 * ��ʯ��ʯͷ
 *
 * @author taozhu5
 */
public class JewelsAndStones��ʯ��ʯͷ {
    /*
     * �����ַ���J ����ʯͷ�б�ʯ�����ͣ����ַ��� S������ӵ�е�ʯͷ��
     * S ��ÿ���ַ�������һ����ӵ�е�ʯͷ�����ͣ�����֪����ӵ�е�ʯͷ���ж����Ǳ�ʯ��
     *
     * J �е���ĸ���ظ���J �� S�е������ַ�������ĸ����ĸ���ִ�Сд�����"a"��"A"�ǲ�ͬ���͵�ʯͷ��
     *
     * ʾ�� 1:
     * ����: J = "aA", S = "aAAbbbb"
     * ���: 3
     *
     * ʾ�� 2:
     * ����: J = "z", S = "ZZ"
     * ���: 0
     *
     * ע��:
     * S �� J ��ຬ��50����ĸ��
     * J �е��ַ����ظ���
     */
    public static void main(String[] args) {
        // int s = numJewelsInStones("aA", "aAAbbbb");
        int[] a = {3, 1, 2, 4};
    }

    /**
     * ��ʯ��ʯͷ
     *
     * @param J
     * @param S
     * @return
     */
    public static int numJewelsInStones(String J, String S) {
        char SArr[] = S.toCharArray();
        char JArr[] = J.toCharArray();
        int count = 0;
        for (char j : JArr) {
            for (char s : SArr) {
                if (j == s) {
                    count++;
                }
            }
        }
        return count;
    }
}
