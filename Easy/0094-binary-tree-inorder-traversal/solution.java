/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> answer;
    public List<Integer> inorderTraversal(TreeNode root) {
        answer = new ArrayList<>();
        inorder(root);

        return answer;
    }

    private void inorder(TreeNode root) {
        if(root == null) return;

        inorder(root.left);
        answer.add(root.val);
        inorder(root.right);
    }
}