package TreePackage;

public interface MinHeapInterface<T extends Comparable<? super T>> {
	int STARTING_SIZE = 15;
	
	/**
	 * Adds an item to the heap. If the backing array is full and you're trying
	 * to add a new item, then double its size.
	 *
	 * @throws IllegalArgumentException if the item is null
	 * @param item the item to be added to the heap
	 */
	void add(T item);
	
	/**
	 * Removes and returns the first item of the heap.
	 *
	 * @throws java.util.NoSuchElementException if the heap is empty
	 * @return the item removed
	 */
	 T remove();
	
	/**
	 * Finds if the heap is empty
	 * @return a boolean representing if the heap is empty
	 */
	boolean isEmpty();
	
	/**
	 * Finds the size of the heap
	 * @return the size of the heap
	 */
	int size();
	
	/**
	 * Clears the heap and returns array to starting size.
	 */
	void clear();
}
