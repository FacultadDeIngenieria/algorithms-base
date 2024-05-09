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

    public Node(K key, V val, Node<K, V> left, Node<K, V> right) {
        this(key, val);
        this.left = left;
        this.right = right;
    }

    public Node(K key, V val, boolean color) {
        this(key, val);
        this.color = color;
    }

    public Node(K key, V val, boolean color, Node<K, V> left, Node<K, V> right) {
        this(key, val, left, right);
        this.color = color;
    }
}
