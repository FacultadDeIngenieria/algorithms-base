package algorithms.tree;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.NoSuchElementException;

/** AYED TreeMap interface. Modified subset of java.util.Map */
public interface TreeMap<K,V> {

    /**
     * Returns the number of key-value mappings in this map.  If the
     * map contains more than Integer.MAX_VALUE elements, returns
     * Integer.MAX_VALUE.
     *
     * @return the number of key-value mappings in this map
     */
    int size();

    /**
     * @return true if this map contains no key-value mappings
     */
    default boolean isEmpty() { return size() == 0; }

    /**
     * Returns true if this map contains a mapping for the specified
     * key.  More formally, returns true if and only if
     * this map contains a mapping for a key k such that key.equals(k).
     * (There can be at most one such mapping.)
     *
     * @param key key whose presence in this map is to be tested
     * @return true if this map contains a mapping for the specified key
     * @throws NullPointerException if the specified key is null
     */
    boolean contains(@NotNull final K key);

    /**
     * Returns the value to which the specified key is mapped,
     * or {@code null} if this map contains no mapping for the key.
     *
     * More formally, if this map contains a mapping from a key
     * {@code k} to a value {@code v} such that {@code key.equals(k)},
     * then this method returns {@code v}; otherwise it returns {@code null}.
     * (There can be at most one such mapping.)
     *
     * @param key the key whose associated value is to be returned
     * @return the value to which the specified key is mapped, or
     *         {@code null} if this map contains no mapping for the key
     * @throws NullPointerException if the specified key is null
     */
    V get(@NotNull final K key);

    /**
     * Associates the specified value with the specified key in this map
     * (optional operation).  If the map previously contained a mapping for
     * the key, the old value is replaced by the specified value.  (A map
     * m is said to contain a mapping for a key k if and only
     * if {@link #contains(Object) m.contains(k)} would return true.)
     *
     * @param key key with which the specified value is to be associated
     * @param value value to be associated with the specified key
     * @return the previous value associated with key, or null if there was no mapping for key.
     * @throws NullPointerException if the specified key is null
     */
    V put(@NotNull final K key, final V value);

    /**
     * Removes the mapping for a key from this map if it is present
     * (optional operation).   More formally, if this map contains a mapping
     * from key <tt>k</tt> to value <tt>v</tt> such that
     * <code>(key==null ?  k==null : key.equals(k))</code>, that mapping
     * is removed.  (The map can contain at most one such mapping.)
     *
     * @param key key with which the specified value is to be removed
     */
    void remove(K key);

    /**
     * Removes all of the mappings from this map. The map will be empty after this call returns.
     */
    void clear();

    /**
     * Returns an iterator of keys traversed inorder
     * @return a set view of the mappings contained in this map
     */
    Iterator<K> inOrder();

    /**
     * Returns an iterator of keys traversed postorder
     * @return a set view of the mappings contained in this map
     */
    Iterator<K> postOrder();

    /**
     * Returns an iterator of keys traversed preorder
     * @return a set view of the mappings contained in this map
     */
    Iterator<K> preOrder();
    /**
     * Returns an iterator of keys traversed in level order
     * @return a set view of the mappings contained in this map
     */
    Iterator<K> levelOrder();


    /**
     * Removes the smallest key and associated value from the symbol table.
     *
     * @throws NoSuchElementException if the symbol table is empty
     */
    void removeMin();

    /**
     * Removes the largest key and associated value from the symbol table.
     *
     * @throws NoSuchElementException if the symbol table is empty
     */
    void removeMax();

    /**
     * Returns the smallest key in the symbol table.
     *
     * @return the smallest key in the symbol table
     * @throws NoSuchElementException if the symbol table is empty
     */
    K min();


    /**
     * Returns the largest key in the symbol table.
     *
     * @return the largest key in the symbol table
     * @throws NoSuchElementException if the symbol table is empty
     */
    K max();
}
