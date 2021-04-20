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

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> values = new ArrayList<>();
        if (root != null) visit(root, values);
        return values;
    }

    void visit(Node node, List<Integer> values) {
        if (node.children == null) return;
        values.add(node.val);
        for (Node child : node.children) {
            visit(child, values);
        }
    }
}