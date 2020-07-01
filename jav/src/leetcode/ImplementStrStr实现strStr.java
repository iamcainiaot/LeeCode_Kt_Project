package leetcode;

/**
 * @user taozhu
 * @date 2020/6/29 9:39
 * @description ʵ��strStr()����
 **/
public class ImplementStrStrʵ��strStr {
    /*
    ʵ�� strStr() ������
    ����һ�� haystack �ַ�����һ�� needle �ַ������� haystack �ַ������ҳ� needle �ַ������ֵĵ�һ��λ�� (��0��ʼ)����������ڣ��򷵻� -1��
    ʾ�� 1:
    ����: haystack = "hello", needle = "ll"
    ���: 2
    ʾ�� 2:
    ����: haystack = "aaaaa", needle = "bba"
    ���: -1
    ˵��:
    �� needle �ǿ��ַ���ʱ������Ӧ������ʲôֵ�أ�����һ���������кܺõ����⡣
    ���ڱ�����ԣ��� needle �ǿ��ַ���ʱ����Ӧ������ 0 ������C���Ե� strstr() �Լ� Java�� indexOf() ���������
     */
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        int s = ss(haystack, needle);
        System.out.println("s��" + s);
    }

    private static int ss(String haystack, String needle) {
        int L = needle.length(), n = haystack.length();

        for (int start = 1; start < n - L + 1; start++) {
            if (haystack.substring(start, start + L).equals(needle)) {
                return start;
            }
        }
        return -1;
    }
}

