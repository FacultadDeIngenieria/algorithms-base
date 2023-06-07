package algorithms.tree;

public class Node<K, V> {
    K key;                      // sorted by key
    V value;                    // associated data
    Node<K, V> left, right;     // left and right subtrees
    boolean color;              // true for RED and false for BLACK

    public Node(K key, V val) {
        this.key = key;
        this.value = val;
    }

    public Node(K key, V val, boolean color) {
        this.key = key;
        this.value = val;
        this.color = color;
    }
}