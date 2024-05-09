package algorithms.tree;

import java.util.Iterator;

/**
 * AYED TreeVisitor interface. Traverses in different ways a given tree
 */
public interface TreeVisitor<K> {

    /**
     * Returns an iterator of keys traversed inorder
     * Params:
     * Node<K, ?> root – root node where the traversal starts
     *
     * @return a set view of the mappings contained in this map
     */
    Iterator<K> inOrder(Node<K, ?> root);

    /**
     * Returns an iterator of keys traversed postorder
     * Params:
     * Node<K, ?> root – root node where the traversal starts
     *
     * @return a set view of the mappings contained in this map
     */
    Iterator<K> postOrder(Node<K, ?> root);

    /**
     * Returns an iterator of keys traversed preorder
     * Params:
     * Node<K, ?> root – root node where the traversal starts
     *
     * @return a set view of the mappings contained in this map
     */
    Iterator<K> preOrder(Node<K, ?> root);

    /**
     * Returns an iterator of keys traversed in level order
     * Params:
     * Node<K, ?> root – root node where the traversal starts
     *
     * @return a set view of the mappings contained in this map
     */
    Iterator<K> levelOrder(Node<K, ?> root);
}
