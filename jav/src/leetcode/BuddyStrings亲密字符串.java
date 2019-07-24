package leetcode;

public class BuddyStrings�����ַ��� {
    /*
        ����������Сд��ĸ���ɵ��ַ��� A �� B ��ֻҪ���ǿ���ͨ������ A �е�������ĸ�õ��� B ��ȵĽ����
    �ͷ��� true �����򷵻� false ��

    ʾ�� 1��
          ���룺 A = "ab", B = "ba"
          ����� true
    ʾ�� 2��
          ���룺 A = "ab", B = "ab"
          ����� false
    ʾ�� 3:
          ���룺 A = "aa", B = "aa"
          ����� true
    ʾ�� 4��
          ���룺 A = "aaaaaaabc", B = "aaaaaaacb"
          ����� true
    ʾ�� 5��
          ���룺 A = "", B = "aa"
          ����� false
    ��ʾ��
        0 <= A.length <= 20000
        0 <= B.length <= 20000
        A �� B ����Сд��ĸ���ɡ�
        charAt : ����ָ�������µ�ֵ
     */
    public static void main(String[] args) {
        String A = "aad";
        String B = "aad";
        System.out.println(buddyStrings(A, B));

        /*
         * ������д������һ���﷨�ǣ���д����
         */
        int aa[] = {1, 2, 3};
    }

    private static boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) return false;
        if (A.equals(B)) {
            int[] count = new int[26];
            // ��ȡÿһ���ַ����ֵĸ���
            for (int i = 0; i < A.length(); ++i) {
                count[A.charAt(i) - 'a']++;
            }
            // �� add add Ϊ���������������ַ���������ͨ�����������d ��d ��ʵ���ַ�����ͬ
            for (int c : count) {
                // Ŀ���� ��ͬ���ַ������棬�������ͬ���ַ��������ͨ����������ͬ���ַ���ʵ��Ч��
                if (c > 1) return true;
            }
            return false;
        } else {
            int first = -1, second = -1;
            int count = 1;

            for (int i = 0; i < A.length(); ++i) {
                // �������ַ�����ͬ����λ�������ݲ����
                if (A.charAt(i) != B.charAt(i)) {
                    // ������һ���ַ�����ȣ��ȸ�first��ֵΪ��ǰ����
                    //         first = i;
                    //         // �����������ַ�����ȣ����second��ֵΪ��ǰ����
                    //     } else if (second == -1) {
                    //         second = i;
                    //         // �����������ַ�����ȵĻ�����һ������ͨ��һ�ν���ʵ����ͬ
                    //     } else {
                    //         return false;
                    //     }
                    if (count == 1) {
                        first = count;
                        ++count;
                    } else if (count == 2) {
                        second = count;
                        ++count;
                    } else {
                        return false;
                    }
                }
            }

            if (second == -1) {
                return false;
            }
            // ����һ���ַ����ĵ�һ����ͬλ�ú͵ڶ����ַ�����
            return (A.charAt(first) == B.charAt(second) && A.charAt(second) == B.charAt(first));

        }
    }
}