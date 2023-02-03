class BSTPair{
    Boolean isBST=true;
    long min=Long.MAX_VALUE;
    long max=Long.MIN_VALUE;
}
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

    public boolean isValidBST(TreeNode root) {
        return valid(root).isBST;
    }

    public BSTPair valid(TreeNode root){
        if(root==null)  return new BSTPair();
        BSTPair lbp=valid(root.left);
        BSTPair rbp=valid(root.right);
        BSTPair sbp=new BSTPair();
        sbp.max=Math.max(lbp.max,Math.max(rbp.max,root.val));
        sbp.min=Math.min(lbp.min,Math.min(rbp.min,root.val));
        if(lbp.isBST && rbp.isBST && lbp.max<root.val && rbp.min>root.val){
            sbp.isBST=true;
        } else{
            sbp.isBST=false;
        }
        return  sbp;
    }
}