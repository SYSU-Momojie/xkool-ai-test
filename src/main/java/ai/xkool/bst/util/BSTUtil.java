package ai.xkool.bst.util;

import ai.xkool.bst.factory.BSTNodeFactory;
import ai.xkool.bst.node.BSTNode;

public class BSTUtil {

    /**
     * Unified entry.
     * Equal case should depend on real scenario,
     * I assume there will be no duplicate key here
     * Whether allow right < root < left should depend on real scenario
     *
     * @param root
     * @return
     */
    public static boolean isBST(BSTNode root) {
        if (root == null) {
            // Not a tree
            return false;
        }

        BSTNode leftChild = (BSTNode) root.getLeftChild();
        if (leftChild != null) {
            return BSTUtil.isBST(root, leftChild.compareTo(root) > 0, null, null);
        }

        BSTNode rightChild = (BSTNode) root.getRightChild();
        if (rightChild != null) {
            return BSTUtil.isBST(root, rightChild.compareTo(root) < 0, null, null);
        }
        // No sub tree
        return true;
    }

    /**
     * @param root
     * @param reverse if true, leftChild > root > rightChild
     * @return
     */
    public static boolean isBST(BSTNode root, boolean reverse, BSTNode minNode, BSTNode maxNode) {
        if (root == null) {
            // Not a tree
            return false;
        }
        BSTNode leftChild = (BSTNode) root.getLeftChild();
        if (leftChild != null) {
            if ((leftChild.compareTo(root) > 0) == reverse) {
                if (!BSTUtil.inRange(minNode, maxNode, leftChild)) {
                    return false;
                }

                if (!BSTUtil.isBST(leftChild, reverse,
                        reverse ? root : minNode,
                        reverse ? maxNode : root)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        BSTNode rightChild = (BSTNode) root.getRightChild();
        if (rightChild != null) {
            if ((rightChild.compareTo(root) < 0) == reverse) {
                if (!BSTUtil.inRange(minNode, maxNode, rightChild)) {
                    return false;
                }
                return BSTUtil.isBST(rightChild, reverse,
                        reverse ? minNode : root,
                        reverse ? root : maxNode);
            } else {
                return false;
            }
        } else {
            // No sub tree
            return true;
        }
    }

    private static boolean inRange(BSTNode minNode, BSTNode maxNode, BSTNode target) {
        if (target == null) {
            throw new IllegalArgumentException("Can't determine based on null");
        }
        if (minNode != null && target.compareTo(minNode) <= 0) {
            return false;
        }
        if (maxNode != null && target.compareTo(maxNode) >= 0) {
            return false;
        }
        return true;
    }

    /**
     * Generate a BST that left < root < right
     *
     * @param sorted
     * @param factory
     * @param <V>     type of value
     * @param <K>     type of key
     * @return
     */
    public static <V, K extends Comparable> BSTNode<V, K> convertSortedArrayToBST(V[] sorted, BSTNodeFactory<V, K> factory) {
        if (sorted == null || sorted.length == 0) {
            return null;
        }
        return BSTUtil.convertSortedArrayToBST(sorted, factory, 0, sorted.length - 1);
    }

    private static <V, K extends Comparable> BSTNode<V, K> convertSortedArrayToBST(V[] sorted, BSTNodeFactory<V, K> factory,
                                                                                   int st, int ed) {
        if (st > ed) {
            return null;
        }
        int mid = (st + ed) / 2;
        BSTNode current = factory.generateNode(sorted[mid]);
        current.setLeftChild(BSTUtil.convertSortedArrayToBST(sorted, factory, st, mid - 1));
        current.setRightChild(BSTUtil.convertSortedArrayToBST(sorted, factory, mid + 1, ed));
        return current;
    }

}
