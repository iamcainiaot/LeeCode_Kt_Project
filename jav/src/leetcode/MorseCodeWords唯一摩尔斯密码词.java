package leetcode;

import java.util.HashSet;
import java.util.Set;

public class MorseCodeWordsΨһĦ��˹����� {
    /*
     * ����Ħ��˹���붨��һ�ֱ�׼���뷽ʽ����ÿ����ĸ��Ӧ��һ����һϵ�е�Ͷ�����ɵ��ַ�����
     * ����: "a" ��Ӧ ".-", "b" ��Ӧ "-...", "c" ��Ӧ "-.-.", �ȵȡ�
     * Ϊ�˷��㣬����26��Ӣ����ĸ��ӦĦ��˹��������£�
     * [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",
     * ".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
     *
     * ����һ�������б�ÿ�����ʿ���д��ÿ����ĸ��ӦĦ��˹�������ϡ����磬"cab" ����д�� "-.-..--..."��(�� "-.-." + "-..." + ".-"�ַ����Ľ��)�����ǽ�����һ�����ӹ��̳������ʷ��롣
     * �������ǿ��Ի�����дʲ�ͬ���ʷ����������
     *
     * ����:
     * ����: words = ["gin", "zen", "gig", "msg"]
     * ���: 2
     *
     * ����:
     * �����ʷ�������:
     * "gin" -> "--...-."
     * "zen" -> "--...-."
     * "gig" -> "--...--."
     * "msg" -> "--...--."
     * ���� 2 �ֲ�ͬ����, "--...-." �� "--...--.".
     *
     * ע��:
     * �����б�words �ĳ��Ȳ��ᳬ�� 100��
     * ÿ������ words[i]�ĳ��ȷ�ΧΪ [1, 12]��
     * ÿ������ words[i]ֻ����Сд��ĸ��
     */

    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};

        int size = uniqueMorseRepresentations(words);
        System.out.println(size);
    }

    /**
     * ˼·��1�����õ��ʵ�ÿһ����ĸȡ�����������ȥ97����ȡ��Ӧ�����֣�eg��a = 97
     * 2�����ݸ����֣�ȥĦ˹����������н�������Ϊ������ȡ��Ӧ��Ħ˹����
     */
    static int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        int baseIndex = 97;
        Set<String> set = new HashSet<>();
        for (String word : words) {
            int lenght = word.length();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < lenght; i++) {
                sb.append(morse[word.charAt(i) - baseIndex]);
            }
            set.add(sb.toString());
        }
        return set.size();
    }

}
