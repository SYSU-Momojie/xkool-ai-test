package ai.xkool.bst;

import ai.xkool.bst.factory.BSTNodeFactory;
import ai.xkool.bst.node.BSTNode;
import ai.xkool.bst.util.BSTUtil;
import org.junit.Assert;
import org.junit.Test;

public class BSTUtilTest {

    private static final BSTNodeFactory<Integer, Integer> factory = new BSTNodeFactory<>(Integer::valueOf);

    /**
     * 5
     * /\
     * 1 7
     * /  /
     * 0   6
     */
    @Test
    public void normalBST() {
        BSTNode root = BSTUtilTest.factory.generateNode(5);
        BSTNode node1 = BSTUtilTest.factory.generateNode(1);
        BSTNode node0 = BSTUtilTest.factory.generateNode(0);
        BSTNode node7 = BSTUtilTest.factory.generateNode(7);
        BSTNode node6 = BSTUtilTest.factory.generateNode(6);
        root.setLeftChild(node1);
        node1.setLeftChild(node0);
        root.setRightChild(node7);
        node7.setLeftChild(node6);
        Assert.assertTrue(BSTUtil.isBST(root));
    }


    /**
     * 5
     * /\
     * 7 1
     * \ /
     * 6 0
     */
    @Test
    public void reverseBST() {
        BSTNode root = BSTUtilTest.factory.generateNode(5);
        BSTNode node1 = BSTUtilTest.factory.generateNode(1);
        BSTNode node0 = BSTUtilTest.factory.generateNode(0);
        BSTNode node7 = BSTUtilTest.factory.generateNode(7);
        BSTNode node6 = BSTUtilTest.factory.generateNode(6);
        root.setRightChild(node1);
        node1.setRightChild(node0);
        root.setLeftChild(node7);
        node7.setRightChild(node6);
        Assert.assertTrue(BSTUtil.isBST(root));
    }

    /**
     * 5
     * /\
     * 7 1
     * \ /
     * 4 0
     */
    @Test
    public void illegalBST() {
        BSTNode root = BSTUtilTest.factory.generateNode(5);
        BSTNode node1 = BSTUtilTest.factory.generateNode(1);
        BSTNode node0 = BSTUtilTest.factory.generateNode(0);
        BSTNode node7 = BSTUtilTest.factory.generateNode(7);
        BSTNode node4 = BSTUtilTest.factory.generateNode(4);
        root.setRightChild(node1);
        node1.setRightChild(node0);
        root.setLeftChild(node7);
        node7.setRightChild(node4);
        Assert.assertFalse(BSTUtil.isBST(root));
    }

    /**
     * 5
     * /\
     * 6 7
     */
    @Test
    public void illegalBST2() {
        BSTNode root = BSTUtilTest.factory.generateNode(5);
        BSTNode node6 = BSTUtilTest.factory.generateNode(6);
        BSTNode node7 = BSTUtilTest.factory.generateNode(7);
        root.setLeftChild(node6);
        root.setRightChild(node7);
        Assert.assertFalse(BSTUtil.isBST(root));
    }

    @Test
    public void generateTest() {
        Integer[] values = {1, 2, 3, 4, 5};
        Assert.assertTrue(BSTUtil.isBST(BSTUtil.convertSortedArrayToBST(values, BSTUtilTest.factory)));
    }
}
