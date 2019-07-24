package leetcode;

public class MergeTwoBinaryTrees�ϲ������� {
    /*
             * ���������������������㽫�����е�һ�����ǵ���һ����ʱ��
             * ������������һЩ�ڵ����ص���
                ����Ҫ�����Ǻϲ�Ϊһ���µĶ��������ϲ��Ĺ�������������ڵ��ص���
                ��ô�����ǵ�ֵ�����Ϊ�ڵ�ϲ������ֵ������Ϊ NULL �Ľڵ㽫ֱ����Ϊ�¶������Ľڵ㡣
                      ʾ�� 1:
              ����:
              	Tree 1                     Tree 2
                        1                         2
                       / \                       / \
                      3   2                     1   3
                     /                           \   \
                    5                             4   7
              ���:
              �ϲ������:
              	     3
              	    / \
              	   4   5
              	  / \   \
              	 5   4   7
              ע��: �ϲ�������������ĸ��ڵ㿪ʼ��

              ��Դ�����ۣ�LeetCode��
              ���ӣ�https://leetcode-cn.com/problems/merge-two-binary-trees
              ����Ȩ������������С���ҵת������ϵ�ٷ���Ȩ������ҵת����ע��������
     */
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        }
        TreeNode newTreeNode = new TreeNode((t1 == null ? 0 : t1.val) + (t2 == null ? 0 : t2.val));
        newTreeNode.left = mergeTrees(t1 == null ? null : t1.left, t2 == null ? null : t2.left);
        newTreeNode.right = mergeTrees(t1 == null ? null : t1.right, t2 == null ? null : t2.right);
        return newTreeNode;
    }
}