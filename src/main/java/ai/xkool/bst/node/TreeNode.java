package ai.xkool.bst.node;

public interface TreeNode<T> {

    TreeNode getLeftChild();

    TreeNode getRightChild();

    T getValue();
}
