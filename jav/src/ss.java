import com.sun.xml.internal.bind.v2.runtime.reflect.ListTransducedAccessorImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class ss {
    public static void main(String[] args) {
        int index = 1;
        int[][] arr = {{1, 2}, {3, 1}};
        // sort(index, arr);
        // sss();
        test();
    }

    private static void test() {
        Object o = null;
        List s = null;
        s.add(o);
        System.out.println(s);
    }

    private static void sss() {
        String str = "    <string name=\"reset_password_ing\">����������...</string>\n" +
                "    <string name=\"reset_password_fail\">��������ʧ�ܣ������ԣ�</string>\n" +
                "    <string name=\"reset_password_success_title\">��������ɹ�</string>\n   <string name=\"send_homework_ing\">������...</string>\n" +
                "    <string name=\"save_homework_ing\">���������...</string>\n" +
                "    <string name=\"save_homework_unknown_error\">�������δ֪����</string>\n" +
                "      <string name=\"delete_send_homework_message\">��ͬʱɾ��ѧ������ϰ����</string>\n" +
                "    <string name=\"delete_to_be_sent_homework_message\">���غ�ѧ�������յ�����ϰ</string>\n" +
                "    <string name=\"delete_ing\">ɾ����...</string>\n" +
                "    <string name=\"delete_homework_success\">ɾ����ϰ�ɹ�</string>\n" +
                "    <string name=\"delete_homework_success_2\">��ϰ��ɾ��</string>\n" +
                "    <string name=\"delete_homework_fail\">ɾ����ϰʧ��</string>\n    <string name=\"get_default_setting_ing\">��ȡĬ��������...</string>\n" +
                "    <string name=\"get_default_setting_fail\">��ȡĬ������ʧ�ܣ������ԣ�</string>\n" +
                "    <string name=\"get_class_stu_by_tea_ing\">��ȡ�༶��...</string>\n" +
                "    <string name=\"get_class_stu_by_tea_fail\">��ȡ�༶ʧ�ܣ������ԣ�</string>\n" +
                "    <string name=\"get_class_stu_by_tea_unknown_error\">��ȡ�༶δ֪����</string>\n" +
                "    <string name=\"get_homework_detail_ing\">��ȡ��ϰ������...</string>\n" +
                "    <string name=\"get_homework_detail_unknown_error\">��ȡ��ϰ����δ֪����</string>\n" +
                "    <string name=\"delete_homework_ing\">ɾ����ϰ��...</string>\n" +
                "    <string name=\"delete_homework_unknown_error\">ɾ����ϰδ֪����</string>\n" +
                "    <string name=\"get_class_list_ing\">���ڻ�ȡ�༶�б�...</string>\n" +
                "    <string name=\"get_class_list_fail_click_retry\">��ȡ�༶�б�ʧ�ܣ��������</string>\n" +
                "    <string name=\"get_class_student_list_ing\">���ڻ�ȡ�༶ѧ���б�...</string>\n" +
                "    <string name=\"get_class_student_list_fail_click_retry\">��ȡ�༶ѧ���б�ʧ�ܣ��������</string>\n" +
                "    <string name=\"get_class_student_list_unknown_error\">��ȡ�༶ѧ���б�δ֪����</string>\n" +
                "    <string name=\"get_group_student_list_ing\">���ڻ�ȡС��ѧ���б�...</string>\n" +
                "    <string name=\"get_group_student_list_fail_click_retry\">��ȡС��ѧ���б�ʧ�ܣ��������</string>\n" +
                "    <string name=\"get_group_student_list_unknown_error\">��ȡС��ѧ���б�δ֪����</string>\n" +
                "    <string name=\"add_group_ing\">�����...</string>\n" +
                "    <string name=\"add_group_success\">��ӳɹ�</string>\n" +
                "    <string name=\"add_group_unknown_error\">���С��δ֪����</string>\n" +
                "    <string name=\"add_stus_to_group_ing\">�����...</string>\n" +
                "    <string name=\"add_stus_to_group_success\">��ӳɹ�</string>\n" +
                "    <string name=\"add_stus_to_group_unknown_error\">���ѧ����С��δ֪����</string>\n" +
                "    <string name=\"remove_student_from_group_ing\">�Ƴ���...</string>\n" +
                "    <string name=\"remove_student_from_group_success\">�Ƴ��ɹ�</string>\n" +
                "    <string name=\"remove_student_from_group_unknown_error\">�Ƴ�С��ѧ��δ֪����</string>\n" +
                "    <string name=\"group_name_duplicate\">С�������ظ�</string>\n" +
                "    <string name=\"group_student_empty\">С����ѧ��Ϊ��</string>\n" +
                "    <string name=\"delete_group_ing\">��ɢС����...</string>\n" +
                "    <string name=\"delete_group_success\">С���ѽ�ɢ</string>\n" +
                "    <string name=\"delete_group_unknown_error\">��ɢС��δ֪����</string>\n" +
                "    <string name=\"delete_group_error_minus_1122\">��С���д�������ϰŶ</string>\n" +
                "    <string name=\"update_group_name_ing\">������С����...</string>\n" +
                "    <string name=\"update_group_name_success\">��������С��</string>\n" +
                "    <string name=\"update_group_name_unknown_error\">������С��δ֪����</string>\n" +
                "    <string name=\"get_work_class_list_ing\">��ȡ��ϰ�༶�б���...</string>\n" +
                "    <string name=\"get_work_class_list_fail_click_retry\">��ȡ��ϰ�༶�б�ʧ�ܣ��������</string>\n" +
                "    <string name=\"get_work_class_list_unknown_error\">��ȡ��ϰ�༶�б�δ֪����</string>\n" +
                "    <string name=\"get_work_class_report_ing\">��ȡ��ϰ������...</string>\n" +
                "    <string name=\"get_work_class_report_fail_click_retry\">��ȡ��ϰ����ʧ�ܣ��������</string>\n" +
                "    <string name=\"get_work_class_report_unknown_error\">��ȡ��ϰ����δ֪����</string>\n" +
                "    <string name=\"get_class_circle_list_ing\">��ȡ�༶Ȧ�б���...</string>\n" +
                "    <string name=\"get_class_circle_list_fail\">��ȡ�༶Ȧ�б�ʧ�ܣ������ԣ�</string>\n" +
                "    <string name=\"get_class_circle_list_unknown_error\">��ȡ�༶Ȧ�б�δ֪����</string>\n" +
                "    <string name=\"delete_notification_ing\">ɾ��֪ͨ��...</string>\n" +
                "    <string name=\"delete_notification_fail\">ɾ��֪ͨʧ�ܣ������ԣ�</string>\n" +
                "    <string name=\"delete_notification_unknown_error\">ɾ��֪ͨδ֪����</string>\n" +
                "    <string name=\"delete_share_ing\">ɾ��������...</string>\n" +
                "    <string name=\"delete_share_fail\">ɾ������ʧ�ܣ������ԣ�</string>\n" +
                "    <string name=\"delete_share_unknown_error\">ɾ������δ֪����</string>\n" +
                "    <string name=\"work_back_ing\">�����ϰ��...</string>\n" +
                "    <string name=\"work_back_success\">��ϰ�Ѵ��</string>\n" +
                "    <string name=\"work_back_unknown_error\">�����ϰδ֪����</string>\n" +
                "    <string name=\"get_hit_work_detail_ing\">��ȡ����������...</string>\n" +
                "    <string name=\"get_hit_work_detail_fail_click_retry\">��ȡ��������ʧ�ܣ��������</string>\n" +
                "    <string name=\"get_hit_work_detail_unknown_error\">��ȡ��ϰ����δ֪����</string>\n" +
                "    <string name=\"get_hit_work_list_ing\">��ȡ�������б���...</string>\n" +
                "    <string name=\"get_hit_work_list_fail\">��ȡ�������б�ʧ�ܣ������ԣ�</string>\n" +
                "    <string name=\"get_hit_work_list_unknown_error\">��ȡ�������б�δ֪����</string>\n" +
                "    <string name=\"set_tea_judgement_ing\">������...</string>\n" +
                "    <string name=\"set_tea_judgement_fail\">����ʧ�ܣ������ԣ�</string>\n" +
                "    <string name=\"set_tea_judgement_unknown_error\">����δ֪����</string>\n    <string name=\"commiting\">�ύ��...</string>\n" +
                "    <string name=\"loading\">������...</string>\n" +
                "    <string name=\"commit_fail\">����ʧ�ܣ����Ժ�����</string>\n" +
                "    <string name=\"get_comment_list\">��ȡ�����б���...</string>\n" +
                "    <string name=\"get_comment_list_fail\">��ȡ�����б�ʧ�ܣ��������</string>\n" +
                "    <string name=\"edit_comment_list\">�б�༭��...</string>\n" +
                "    <string name=\"commit_suc\">�ύ�ɹ�</string>\n   <string name=\"get_teaching_material_unknown_error\">��ȡ�̲���Ϣδ֪����</string>\n" +
                "    <string name=\"loading_teaching_material\">��ȡ�̲���Ϣ��...</string>\n" +
                "    <string name=\"get_teaching_material_error\">��ȡ�̲���Ϣʧ�ܣ��������</string>\n" +
                "    <string name=\"chinese_sinology\">�����ж�</string>\n" +
                "    <string name=\"loading_chinese_sinology\">��ȡ������...</string>\n" +
                "    <string name=\"loading_chinese_sinology_books\">��ȡ�鱾��...</string>\n" +
                "    <string name=\"loading_chinese_sinology_books_failed\">��ȡ�鱾��Ϣʧ��</string>\n" +
                "    <string name=\"loading_chinese_sinology_failed\">��ȡ����ʧ�ܣ��������</string>\n" +
                "    <string name=\"loading_chinese_sinology_un_know_error\">��ȡ�鱾����δ֪����</string>\n" +
                "    <string name=\"loading_chinese_chapter_info\">\"��ȡ�½�Ŀ¼��Ϣ��...</string>\n" +
                "    <string name=\"loading_chinese_chapter_info_error\">\"��ȡ�½�Ŀ¼��Ϣδ֪����</string>\n" +
                "    <string name=\"loading_chinese_chapter_info_failed\">\"��ȡ�½�Ŀ¼��Ϣʧ�ܣ��������</string>\n" +
                "    <string name=\"loading_user_bind_teaching_material_error\">\"��ȡ�û��󶨽̲�δ֪����</string>\n" +
                "    <string name=\"loading_user_bind_teaching_material\">\"���ڻ�ȡ�̲�...</string>\n   <string name=\"release_ban_words\">���</string>\n" +
                "    <string name=\"ban_words_loading\">������...</string>\n" +
                "    <string name=\"release_ban_words_loading\">�����...</string>\n" +
                "    <string name=\"ban_words_dialog\">���ԣ�</string>\n" +
                "    <string name=\"release_ban_words_dialog\">�����</string>\n" +
                "    <string name=\"ban_words_success\">���Գɹ�</string>\n" +
                "    <string name=\"release_ban_words_success\">����ɹ�</string>\n" +
                "    <string name=\"ban_words_failed\">����ʧ��</string>\n" +
                "    <string name=\"release_ban_words_failed\">���ʧ��</string>\n    <string name=\"delete_notification\">ɾ��֪ͨ��</string>\n" +
                "    <string name=\"ban_words_dialog_message\">������ѧ�����ܷ�������</string>\n" +
                "    <string name=\"release_words_dialog_message\">�����ѧ���ɷ�������</string>\n" +
                "    <string name=\"ban_words_unknown_error\">���Բ���δ֪����%d</string>\n" +
                "    <string name=\"multiple_operate_unknown_error\">��������δ֪����%d</string>\n  <string name=\"publishing\">���ݷ�����...</string>\n" +
                "    <string name=\"publish_fail\">����ʧ��</string>\n" +
                "    <string name=\"video_compress_img\">��Ƶѹ���У����Ժ�</string>\n" +
                "     <string name=\"get_publish_info\">��ȡ��Ϣ��...</string>\n" +
                "    <string name=\"get_publish_info_fail\">��ȡ��Ϣʧ�ܣ���������</string>\n   <string name=\"get_hit_work_template_loading\">��ȡ������ģ���б���...</string>\n" +
                "    <string name=\"get_hit_work_template_error_please_retry\">��ȡ������ģ���б�ʧ�ܣ��������...</string>\n    <string name=\"get_hit_work_list_loading\">��ȡ�������б���...</string>\n" +
                "    <string name=\"get_hit_work_list_error_please_retry\">��ȡ�������б�ʧ�ܣ��������...</string>\n    <string name=\"clock_statistics_data_loading\">��ȡ��ͳ����Ϣ��...</string>\n   <string name=\"hit_card_detail_loading\">��ȡ����������...</string>\n" +
                "     <string name=\"hit_card_detail_loading_fail\">��ȡ����������ʧ�ܣ��������</string>\n    <string name=\"hit_card_record_detail_loading\">��ȡ�򿨼�¼����...</string>\n" +
                "    <string name=\"hit_card_record_detail_loading_fail\">��ȡ�򿨼�¼����ʧ�ܣ��������</string>\n" +
                "    <string name=\"get_hit_work_template_fail_please_retry\">��ȡ�򿨼�¼����ʧ�ܣ��������</string>\n  <string name=\"get_answer_card_detail\">��ȡ��Ŀ������...</string>\n" +
                "    <string name=\"get_answer_card_detail_fail\">��ȡ��Ŀ����ʧ�ܣ������ԣ�</string>\n  <string name=\"answer_save_ing\">�𰸱�����...</string>\n" +
                "    <string name=\"answer_save_fail\">�𰸱���ʧ�ܣ����Ժ�����</string>\n" +
                "    <string name=\"answer_save_suc\">����ɹ�</string>\n  <string name=\"get_stu_detail_ing\">��ȡѧ������������...</string>\n" +
                "    <string name=\"get_stu_detail_fai\">��ȡѧ����������ʧ�ܣ��������</string>\n" +
                "    <string name=\"get_stu_detail_unknown\">��ȡѧ����������δ֪����%d</string>\n    <string name=\"get_single_stu_answer_detail_unknown_error\">��ȡ����ѧ��������Ϣδ֪����</string>\n" +
                "    <string name=\"get_single_stu_answer_detail_detail_loading\">��ȡ����ѧ��������Ϣ������...</string>\n" +
                "    <string name=\"get_single_stu_answer_detail_failed\">��ȡ����ѧ��������Ϣʧ�ܣ��������</string>\n    <string name=\"get_personalized_exercise_class_list_ing\">��ȡ��ϰ�༶�б���...</string>\n" +
                "    <string name=\"get_personalized_exercise_class_list_error_please_retry\">��ȡ��ϰ�༶�б�ʧ�ܣ��������</string>\n" +
                "    <string name=\"get_personalized_exercise_class_list_unknown_error\">��ȡ��ϰ�༶�б�δ֪����</string>\n    <string name=\"get_personalized_exercise_report_ing\">��ȡ����ѧϰ�༶������...</string>\n" +
                "    <string name=\"get_personalized_exercise_report_error_please_retry\">��ȡ����ѧϰ�༶����ʧ�ܣ��������</string>\n" +
                "    <string name=\"get_personalized_exercise_report_unknown_error\">��ȡ����ѧϰ�༶����δ֪����</string>\n    <string name=\"loading_decorate_practice_error\">����ҳ�����ʧ�ܣ��������</string>\n    <string name=\"get_correct_list_ing\">���������С���</string>\n" +
                "    <string name=\"get_correct_list_fai\">�б�����ʧ�ܣ��������</string>\n" +
                "    <string name=\"upload_correct_data_text\">�����ϴ����Ľ��</string>\n" +
                "    <string name=\"upload_re_correct_data_text\">�����ϴ��������</string>\n    <string name=\"your_internet_being_error\">�����쳣����ص���ҳ�����½����ҳ�棡</string>\n    <string name=\"loading_award_setting_ing\">��ȡ����������������....</string>\n" +
                "    <string name=\"loading_award_setting_error\">��ȡ��������������ʧ�ܣ��������</string>\n    <string name=\"get_correct_question_detail_ing\">�������������С���</string>\n" +
                "    <string name=\"get_correct_question_detail_fai\">������������ʧ�ܣ��������</string>\n    <string name=\"get_title_detail_ing\">��ȡ��Ŀ������...</string>\n" +
                "    <string name=\"get_title_detail_load_again\">��ȡ��Ŀ����ʧ�ܣ��������</string>\n" +
                "    <string name=\"get_title_detail_error\">��ȡ��Ŀ����δ֪����</string>\n    <string name=\"get_comment_student_ids_start\">���ڻ�ȡ����...</string>\n" +
                "    <string name=\"get_comment_student_ids_fail\">���ݻ�ȡʧ�ܣ��������</string>\n    <string name=\"get_template_content_str\">���ڻ�ȡģ��...</string>\n" +
                "    <string name=\"get_template_content_failed\">��ȡģ��ʧ��,�������</string>\n" +
                "    <string name=\"get_template_content_fail\">��ȡģ��δ֪����</string>\n    <string name=\"get_wait_dictation_detail_fail\">��ȡ����ʧ��,�������</string>\n" +
                "    <string name=\"get_wait_dictation_detail_failed\">��ȡ����ʧ��</string>";
        ;
        str = str.replaceAll("[a-zA-Z]", "");
        System.out.println(StringFilter(str));
    }

    public static String StringFilter(String str) throws PatternSyntaxException {
// ֻ������ĸ������ // String regEx ="[^a-zA-Z0-9]";
// ��������������ַ�
        String regEx = "[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~��@#��%����&*��������+|{}������������������������\"_]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(str);
        return m.replaceAll("").trim();
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