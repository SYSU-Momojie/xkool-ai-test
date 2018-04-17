package ai.xkool.bst.node;

public class BSTNode<V, K extends Comparable> implements TreeNode<V>, Comparable<BSTNode> {

    protected K key;
    protected V value;

    private TreeNode leftChild;
    private TreeNode rightChild;

    public BSTNode(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public int compareTo(BSTNode o) {
        return key.compareTo(o.key);
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public V getValue() {
        return value;
    }

    public void setLeftChild(BSTNode node) {
        leftChild = node;
    }

    public void setRightChild(BSTNode node) {
        rightChild = node;
    }
}
