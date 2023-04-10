import org.w3c.dom.Node;

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

public class MaxDepthNaryTree {
    public int maxDepth(Node root) {
        return countDepth(root,1);
    }
    public static int countDepth(Node root,int depth){
        if(root==null){
            return 0;
        } 
        int count=0;
        int i=0;
        for(Node n:root.children){
            count=Math.max(countDepth(n,depth+1),count);
            i++;
        }
        if(i==0) return depth;
        return count;
    }
}