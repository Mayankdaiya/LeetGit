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

 public class IncreasingOrderST {
    static TreeNode t=new TreeNode();
    static TreeNode tr=t;
    public TreeNode increasingBST(TreeNode root) {
        t=new TreeNode();
        tr=t;
        inc(root);
        return tr.right;
    }
    public void inc(TreeNode root){
        if(root==null) return;
        inc(root.left);
        if(t==null) t.val=root.val;
        else{
            t.right=new TreeNode(root.val);
            t=t.right;    
        }
        inc(root.right);
    }
}