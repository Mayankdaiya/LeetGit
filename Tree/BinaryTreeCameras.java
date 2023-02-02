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
    int Count=0;
    public int minCameraCover(TreeNode root) {
       int c=count(root);
       if(c==-1) Count++;
       return Count; 
    }
    public int count(TreeNode root){
        if(root==null) return 1;
        int left=count(root.left);
        int right=count(root.right);
        if(left==-1 || right==-1){
            Count++;
            return 2;
        }
        if(left==1 && right==1){
            return -1;
        }
        return 1;
    }
}