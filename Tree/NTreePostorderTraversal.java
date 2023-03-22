import java.util.ArrayList;
import java.util.List;
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

public class NTreePostorderTraversal {
    public List<Integer> postorder(Node root) {
        if(root==null){
            List<Integer> list=new ArrayList<>();
            return list;
        } 
        List<Node> child=root.children;
        List<Integer> list=new ArrayList<>();
        for(Node n:child){
            list.addAll(postorder(n));
        }
        list.add(root.val);
        return list;
    }
}