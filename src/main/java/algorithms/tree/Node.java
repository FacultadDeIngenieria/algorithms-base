package algorithms.tree;

public class Node<K, V> {
    K key;                      // sorted by key
    V value;                      // associated data
    Node<K, V> left, right;     // left and right subtrees

    public Node(K key, V val) {
        this.key = key;
        this.value = val;
    }
}