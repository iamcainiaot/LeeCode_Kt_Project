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
        String str = "    <string name=\"reset_password_ing\">重置密码中...</string>\n" +
                "    <string name=\"reset_password_fail\">重置密码失败，请重试！</string>\n" +
                "    <string name=\"reset_password_success_title\">重置密码成功</string>\n   <string name=\"send_homework_ing\">发送中...</string>\n" +
                "    <string name=\"save_homework_ing\">保存更改中...</string>\n" +
                "    <string name=\"save_homework_unknown_error\">保存更改未知错误！</string>\n" +
                "      <string name=\"delete_send_homework_message\">将同时删除学生的练习数据</string>\n" +
                "    <string name=\"delete_to_be_sent_homework_message\">撤回后，学生不会收到该练习</string>\n" +
                "    <string name=\"delete_ing\">删除中...</string>\n" +
                "    <string name=\"delete_homework_success\">删除练习成功</string>\n" +
                "    <string name=\"delete_homework_success_2\">练习已删除</string>\n" +
                "    <string name=\"delete_homework_fail\">删除练习失败</string>\n    <string name=\"get_default_setting_ing\">获取默认设置中...</string>\n" +
                "    <string name=\"get_default_setting_fail\">获取默认设置失败，请重试！</string>\n" +
                "    <string name=\"get_class_stu_by_tea_ing\">获取班级中...</string>\n" +
                "    <string name=\"get_class_stu_by_tea_fail\">获取班级失败，请重试！</string>\n" +
                "    <string name=\"get_class_stu_by_tea_unknown_error\">获取班级未知错误！</string>\n" +
                "    <string name=\"get_homework_detail_ing\">获取练习详情中...</string>\n" +
                "    <string name=\"get_homework_detail_unknown_error\">获取练习详情未知错误！</string>\n" +
                "    <string name=\"delete_homework_ing\">删除练习中...</string>\n" +
                "    <string name=\"delete_homework_unknown_error\">删除练习未知错误！</string>\n" +
                "    <string name=\"get_class_list_ing\">正在获取班级列表...</string>\n" +
                "    <string name=\"get_class_list_fail_click_retry\">获取班级列表失败，点击重试</string>\n" +
                "    <string name=\"get_class_student_list_ing\">正在获取班级学生列表...</string>\n" +
                "    <string name=\"get_class_student_list_fail_click_retry\">获取班级学生列表失败，点击重试</string>\n" +
                "    <string name=\"get_class_student_list_unknown_error\">获取班级学生列表未知错误！</string>\n" +
                "    <string name=\"get_group_student_list_ing\">正在获取小组学生列表...</string>\n" +
                "    <string name=\"get_group_student_list_fail_click_retry\">获取小组学生列表失败，点击重试</string>\n" +
                "    <string name=\"get_group_student_list_unknown_error\">获取小组学生列表未知错误！</string>\n" +
                "    <string name=\"add_group_ing\">添加中...</string>\n" +
                "    <string name=\"add_group_success\">添加成功</string>\n" +
                "    <string name=\"add_group_unknown_error\">添加小组未知错误！</string>\n" +
                "    <string name=\"add_stus_to_group_ing\">添加中...</string>\n" +
                "    <string name=\"add_stus_to_group_success\">添加成功</string>\n" +
                "    <string name=\"add_stus_to_group_unknown_error\">添加学生到小组未知错误！</string>\n" +
                "    <string name=\"remove_student_from_group_ing\">移除中...</string>\n" +
                "    <string name=\"remove_student_from_group_success\">移除成功</string>\n" +
                "    <string name=\"remove_student_from_group_unknown_error\">移除小组学生未知错误！</string>\n" +
                "    <string name=\"group_name_duplicate\">小组名称重复</string>\n" +
                "    <string name=\"group_student_empty\">小组内学生为空</string>\n" +
                "    <string name=\"delete_group_ing\">解散小组中...</string>\n" +
                "    <string name=\"delete_group_success\">小组已解散</string>\n" +
                "    <string name=\"delete_group_unknown_error\">解散小组未知错误！</string>\n" +
                "    <string name=\"delete_group_error_minus_1122\">该小组有待接收练习哦</string>\n" +
                "    <string name=\"update_group_name_ing\">重命名小组中...</string>\n" +
                "    <string name=\"update_group_name_success\">已重命名小组</string>\n" +
                "    <string name=\"update_group_name_unknown_error\">重命名小组未知错误！</string>\n" +
                "    <string name=\"get_work_class_list_ing\">获取练习班级列表中...</string>\n" +
                "    <string name=\"get_work_class_list_fail_click_retry\">获取练习班级列表失败，点击重试</string>\n" +
                "    <string name=\"get_work_class_list_unknown_error\">获取练习班级列表未知错误！</string>\n" +
                "    <string name=\"get_work_class_report_ing\">获取练习报告中...</string>\n" +
                "    <string name=\"get_work_class_report_fail_click_retry\">获取练习报告失败，点击重试</string>\n" +
                "    <string name=\"get_work_class_report_unknown_error\">获取练习报告未知错误！</string>\n" +
                "    <string name=\"get_class_circle_list_ing\">获取班级圈列表中...</string>\n" +
                "    <string name=\"get_class_circle_list_fail\">获取班级圈列表失败，请重试！</string>\n" +
                "    <string name=\"get_class_circle_list_unknown_error\">获取班级圈列表未知错误！</string>\n" +
                "    <string name=\"delete_notification_ing\">删除通知中...</string>\n" +
                "    <string name=\"delete_notification_fail\">删除通知失败，请重试！</string>\n" +
                "    <string name=\"delete_notification_unknown_error\">删除通知未知错误！</string>\n" +
                "    <string name=\"delete_share_ing\">删除分享中...</string>\n" +
                "    <string name=\"delete_share_fail\">删除分享失败，请重试！</string>\n" +
                "    <string name=\"delete_share_unknown_error\">删除分享未知错误！</string>\n" +
                "    <string name=\"work_back_ing\">打回练习中...</string>\n" +
                "    <string name=\"work_back_success\">练习已打回</string>\n" +
                "    <string name=\"work_back_unknown_error\">打回练习未知错误！</string>\n" +
                "    <string name=\"get_hit_work_detail_ing\">获取任务详情中...</string>\n" +
                "    <string name=\"get_hit_work_detail_fail_click_retry\">获取任务详情失败，点击重试</string>\n" +
                "    <string name=\"get_hit_work_detail_unknown_error\">获取练习详情未知错误！</string>\n" +
                "    <string name=\"get_hit_work_list_ing\">获取打卡任务列表中...</string>\n" +
                "    <string name=\"get_hit_work_list_fail\">获取打卡任务列表失败，请重试！</string>\n" +
                "    <string name=\"get_hit_work_list_unknown_error\">获取打卡任务列表未知错误！</string>\n" +
                "    <string name=\"set_tea_judgement_ing\">点评中...</string>\n" +
                "    <string name=\"set_tea_judgement_fail\">点评失败，请重试！</string>\n" +
                "    <string name=\"set_tea_judgement_unknown_error\">点评未知错误！</string>\n    <string name=\"commiting\">提交中...</string>\n" +
                "    <string name=\"loading\">加载中...</string>\n" +
                "    <string name=\"commit_fail\">连接失败，请稍后重试</string>\n" +
                "    <string name=\"get_comment_list\">获取评语列表中...</string>\n" +
                "    <string name=\"get_comment_list_fail\">获取评语列表失败，点击重试</string>\n" +
                "    <string name=\"edit_comment_list\">列表编辑中...</string>\n" +
                "    <string name=\"commit_suc\">提交成功</string>\n   <string name=\"get_teaching_material_unknown_error\">获取教材信息未知错误！</string>\n" +
                "    <string name=\"loading_teaching_material\">获取教材信息中...</string>\n" +
                "    <string name=\"get_teaching_material_error\">获取教材信息失败，点击重试</string>\n" +
                "    <string name=\"chinese_sinology\">经典诵读</string>\n" +
                "    <string name=\"loading_chinese_sinology\">获取内容中...</string>\n" +
                "    <string name=\"loading_chinese_sinology_books\">获取书本中...</string>\n" +
                "    <string name=\"loading_chinese_sinology_books_failed\">获取书本信息失败</string>\n" +
                "    <string name=\"loading_chinese_sinology_failed\">获取内容失败，点击重试</string>\n" +
                "    <string name=\"loading_chinese_sinology_un_know_error\">获取书本内容未知错误！</string>\n" +
                "    <string name=\"loading_chinese_chapter_info\">\"获取章节目录信息中...</string>\n" +
                "    <string name=\"loading_chinese_chapter_info_error\">\"获取章节目录信息未知错误！</string>\n" +
                "    <string name=\"loading_chinese_chapter_info_failed\">\"获取章节目录信息失败，点击重试</string>\n" +
                "    <string name=\"loading_user_bind_teaching_material_error\">\"获取用户绑定教材未知错误！</string>\n" +
                "    <string name=\"loading_user_bind_teaching_material\">\"正在获取教材...</string>\n   <string name=\"release_ban_words\">解禁</string>\n" +
                "    <string name=\"ban_words_loading\">禁言中...</string>\n" +
                "    <string name=\"release_ban_words_loading\">解禁中...</string>\n" +
                "    <string name=\"ban_words_dialog\">禁言？</string>\n" +
                "    <string name=\"release_ban_words_dialog\">解禁？</string>\n" +
                "    <string name=\"ban_words_success\">禁言成功</string>\n" +
                "    <string name=\"release_ban_words_success\">解禁成功</string>\n" +
                "    <string name=\"ban_words_failed\">禁言失败</string>\n" +
                "    <string name=\"release_ban_words_failed\">解禁失败</string>\n    <string name=\"delete_notification\">删除通知？</string>\n" +
                "    <string name=\"ban_words_dialog_message\">被禁言学生不能发表评论</string>\n" +
                "    <string name=\"release_words_dialog_message\">解禁后学生可发表评论</string>\n" +
                "    <string name=\"ban_words_unknown_error\">禁言操作未知错误%d</string>\n" +
                "    <string name=\"multiple_operate_unknown_error\">批量禁言未知错误%d</string>\n  <string name=\"publishing\">数据发布中...</string>\n" +
                "    <string name=\"publish_fail\">发布失败</string>\n" +
                "    <string name=\"video_compress_img\">视频压缩中，请稍后</string>\n" +
                "     <string name=\"get_publish_info\">获取信息中...</string>\n" +
                "    <string name=\"get_publish_info_fail\">获取信息失败，请点击重试</string>\n   <string name=\"get_hit_work_template_loading\">获取打卡任务模板列表中...</string>\n" +
                "    <string name=\"get_hit_work_template_error_please_retry\">获取打卡任务模板列表失败，点击重试...</string>\n    <string name=\"get_hit_work_list_loading\">获取打卡任务列表中...</string>\n" +
                "    <string name=\"get_hit_work_list_error_please_retry\">获取打卡任务列表失败，点击重试...</string>\n    <string name=\"clock_statistics_data_loading\">获取打卡统计信息中...</string>\n   <string name=\"hit_card_detail_loading\">获取打卡任务详情...</string>\n" +
                "     <string name=\"hit_card_detail_loading_fail\">获取打卡任务详情失败，点击重试</string>\n    <string name=\"hit_card_record_detail_loading\">获取打卡记录详情...</string>\n" +
                "    <string name=\"hit_card_record_detail_loading_fail\">获取打卡记录详情失败，点击重试</string>\n" +
                "    <string name=\"get_hit_work_template_fail_please_retry\">获取打卡记录详情失败，点击重试</string>\n  <string name=\"get_answer_card_detail\">获取题目数据中...</string>\n" +
                "    <string name=\"get_answer_card_detail_fail\">获取题目数据失败，请重试！</string>\n  <string name=\"answer_save_ing\">答案保存中...</string>\n" +
                "    <string name=\"answer_save_fail\">答案保存失败，请稍后重试</string>\n" +
                "    <string name=\"answer_save_suc\">保存成功</string>\n  <string name=\"get_stu_detail_ing\">获取学生作答详情中...</string>\n" +
                "    <string name=\"get_stu_detail_fai\">获取学生作答详情失败，点击重试</string>\n" +
                "    <string name=\"get_stu_detail_unknown\">获取学生作答详情未知错误！%d</string>\n    <string name=\"get_single_stu_answer_detail_unknown_error\">获取单个学生答题信息未知错误！</string>\n" +
                "    <string name=\"get_single_stu_answer_detail_detail_loading\">获取单个学生答题信息详情中...</string>\n" +
                "    <string name=\"get_single_stu_answer_detail_failed\">获取单个学生答题信息失败，点击重试</string>\n    <string name=\"get_personalized_exercise_class_list_ing\">获取练习班级列表中...</string>\n" +
                "    <string name=\"get_personalized_exercise_class_list_error_please_retry\">获取练习班级列表失败，点击重试</string>\n" +
                "    <string name=\"get_personalized_exercise_class_list_unknown_error\">获取练习班级列表未知错误！</string>\n    <string name=\"get_personalized_exercise_report_ing\">获取自主学习班级报告中...</string>\n" +
                "    <string name=\"get_personalized_exercise_report_error_please_retry\">获取自主学习班级报告失败，点击重试</string>\n" +
                "    <string name=\"get_personalized_exercise_report_unknown_error\">获取自主学习班级报告未知错误！</string>\n    <string name=\"loading_decorate_practice_error\">布置页面加载失败，点击重试</string>\n    <string name=\"get_correct_list_ing\">数据请求中……</string>\n" +
                "    <string name=\"get_correct_list_fai\">列表请求失败，点击重试</string>\n" +
                "    <string name=\"upload_correct_data_text\">正在上传批改结果</string>\n" +
                "    <string name=\"upload_re_correct_data_text\">正在上传重批结果</string>\n    <string name=\"your_internet_being_error\">网络异常，请回到主页后重新进入此页面！</string>\n    <string name=\"loading_award_setting_ing\">获取奖励与评价设置中....</string>\n" +
                "    <string name=\"loading_award_setting_error\">获取奖励与评价设置失败，点击重试</string>\n    <string name=\"get_correct_question_detail_ing\">批改数据请求中……</string>\n" +
                "    <string name=\"get_correct_question_detail_fai\">批改数据请求失败，点击重试</string>\n    <string name=\"get_title_detail_ing\">获取题目详情中...</string>\n" +
                "    <string name=\"get_title_detail_load_again\">获取题目详情失败，点击重试</string>\n" +
                "    <string name=\"get_title_detail_error\">获取题目详情未知错误！</string>\n    <string name=\"get_comment_student_ids_start\">正在获取数据...</string>\n" +
                "    <string name=\"get_comment_student_ids_fail\">数据获取失败，点击重试</string>\n    <string name=\"get_template_content_str\">正在获取模板...</string>\n" +
                "    <string name=\"get_template_content_failed\">获取模板失败,点击重试</string>\n" +
                "    <string name=\"get_template_content_fail\">获取模板未知错误！</string>\n    <string name=\"get_wait_dictation_detail_fail\">获取内容失败,点击重试</string>\n" +
                "    <string name=\"get_wait_dictation_detail_failed\">获取内容失败</string>";
        ;
        str = str.replaceAll("[a-zA-Z]", "");
        System.out.println(StringFilter(str));
    }

    public static String StringFilter(String str) throws PatternSyntaxException {
// 只允许字母和数字 // String regEx ="[^a-zA-Z0-9]";
// 清除掉所有特殊字符
        String regEx = "[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？\"_]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(str);
        return m.replaceAll("").trim();
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