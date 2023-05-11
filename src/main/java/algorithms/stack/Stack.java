package algorithms.stack;

import org.jetbrains.annotations.NotNull;

/**
 * Algoritmos.
 *
 * Basic Interface for all {@link Stack stacks}. All Stack implementations should implement {@link Stack}.
 *
 * Common implementations:
 *
 * <ul>
 *   <li>ArrayStack</li>
 *   <li>LinkedListStack</li>
 * </ul>
 */
public interface Stack<E> extends Iterable<E> {
    //~ Methods ..................................................................................................................
    /**
     * Adds a new item to the Stack
     *
     * @param  item to be pushed in the stack
     */
    void push(@NotNull final E item);

    /**
     * Remove and return the item most recently added
     *
     * @return  item
     */
    E pop();

    /**
     * Returns true if the stack has no items
     *
     * @return  true or false
     */
    boolean isEmpty();

    /**
     * Returns the number of items in the stack
     *
     * @return  size
     */
    int size();
}
