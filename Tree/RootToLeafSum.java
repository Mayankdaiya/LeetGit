
class Solution {    
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public int sumNumbers(TreeNode root) {
        return getSum(root,0);
    }
    public static int getSum(TreeNode root,int n){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return n*10+root.val;
        int left=getSum(root.left,n*10+root.val);
        int right=getSum(root.right,n*10+root.val);
        return left+right;
    }
}