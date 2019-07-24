package leetcode;

public class ToLowerCaseת����Сд��ĸ {
    /*
   ʵ�ֺ��� ToLowerCase()���ú�������һ���ַ������� str���������ַ����еĴ�д��ĸת����Сд��ĸ��֮�󷵻��µ��ַ�����

   ʾ�� 1��

   ����: "Hello"
   ���: "hello"
   ʾ�� 2��

   ����: "here"
   ���: "here"
   ʾ�� 3��

   ����: "LOVELY"
   ���: "lovely"
   */
    public static void main(String[] args) {
        String ch = toLowerCase("LOVELY");
        System.out.println(ch);
    }

    /**
     * ˼·����д��ĸ��Сд��ĸ���Ϊ32����'A' + 32 = 'a'
     */
    private static String toLowerCase(String str) {
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'A' && ch[i] <= 'Z') {
                ch[i] += 32;
            }

        }
        return new String(ch);
    }
}
