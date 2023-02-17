    
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
    public static int height(TreeNode nn){
        if(nn==null){
            return 0;
        }
        int l=height(nn.left);
        int r=height(nn.right);
        return Math.max(l,r)+1;
    }
   
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int l=diameterOfBinaryTree(root.left);
        int r=diameterOfBinaryTree(root.right);
        int h=height(root.right)+height(root.left);
        return Math.max(h,Math.max(r,l));
    }
    }