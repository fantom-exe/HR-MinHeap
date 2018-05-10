package TreePackage;

public interface MinHeapInterface<T extends Comparable<? super T>> {
	int STARTING_SIZE = 15;
	
	/** Adds a new entry to this heap
	 * @param newEntry An object to be added
	 */
	void add(T newEntry);
	
	/** Removes and returns the smallest item in this heap.
	 * @return Either the smallest object in the heap or null (if heap is empty)
	 */
	 T removeMin();
	
	/** Retrieves the smallest item in this heap
	 * @return Either the smallest object in the heap or null (if heap is empty)
	 */
	T getMin();
	
	/** Detects whether this heap is empty
	 * @return True if the heap is empty, false otherwise
	 */
	boolean isEmpty();
	
	/** Gets the size of this heap
	 * @return The number of entries currently in the heap
	 */
	int getSize();
	
	// Removes all entries from this heap
	void clear();
}
