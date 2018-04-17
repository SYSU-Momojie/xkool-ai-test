package ai.xkool.bst.factory;

import ai.xkool.bst.node.BSTNode;

import java.util.function.Function;

public class BSTNodeFactory<V,K extends Comparable> {

    private final Function<V, K> keyGenerator;

    public BSTNodeFactory(Function<V, K> keyGenerator) {
        this.keyGenerator = keyGenerator;
    }

    public BSTNode<V, K> generateNode(V value) {
        return new BSTNode<>(keyGenerator.apply(value), value);
    }
}
