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
public class getLeafSequence {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        return getLeafSequence(root1).equals(getLeafSequence(root2));
    }
    public static String getLeafSequence(TreeNode root){
        if(root==null){
            return "";
        } else if(root.left==null && root.right==null){
            return ""+root.val+"+";
        }
        String ans="";
        ans+=getLeafSequence(root.left);
        ans+=getLeafSequence(root.right);
        return ans;
    }
}