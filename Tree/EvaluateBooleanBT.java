
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
public class EvaluateBooleanBT {
    public boolean evaluateTree(TreeNode root) {
        return getres(root);
    }
    public static boolean getres(TreeNode root){
        if(root.val==0 || root.val==1){
            return root.val==1;
        }
        boolean l=getres(root.left);
        boolean r=getres(root.right);
        if(root.val==2) return l||r;
        else return l&&r;
    }
}
