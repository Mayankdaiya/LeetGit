import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
public class AverageLevels {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            if(q.peek()==null){
                q.poll();
                continue;
            }
            double temp=0d;
            int c=0;
            while(q.peek()!=null){
                TreeNode t=q.poll();
                temp+=t.val;
                if(t.left!=null) q.add(t.left);
                if(t.right!=null) q.add(t.right);
                c++;
            }
            q.poll();
            q.add(null);
            ans.add(temp/c);
        }
        return ans;
    }
}
