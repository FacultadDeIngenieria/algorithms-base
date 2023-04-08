package algorithms.queue;

import org.jetbrains.annotations.NotNull;
import java.util.NoSuchElementException;

/**
 * Algoritmos.
 *
 * Basic Interface for all {@link Queue queues}. All Queue implementations should implement {@link Queue}.
 *
 * Common implementations:
 *
 * <ul>
 *   <li>LinearQueue</li>
 *   <li>CircularQueue</li>
 *   <li>PriorityQueue</li>
 * </ul>
 */
public interface Queue<E> extends Iterable<E> {

    /**
     * Adds a new item to this queue.
     *
     * @param  item the item to add
     */

    void enqueue(@NotNull E item);

    /**
     * Removes and returns the item on this queue that was least recently added.
     *
     * @return the item on this queue that was least recently added
     * @throws NoSuchElementException if this queue is empty
     */
    @NotNull E dequeue();

    /**
     * Returns true if this queue is empty.
     *
     * @return {@code true} if this queue is empty; {@code false} otherwise
     */
    boolean isEmpty();

    /**
     * Returns the number of items in the queue
     *
     * @return  size
     */
    int size();

}