package TreePackage;

public class MinHeap<T extends Comparable<? super T>> implements MinHeapInterface<T> {
	private T[] heap;
	private int size;
	
	public MinHeap() {
		heap = (T[]) new Comparable[STARTING_SIZE];
		heap[0] = null;
		size = 0;
	}
	
	public void add(T item) {
		if (item == null) {
			throw new IllegalArgumentException("Item is null.");
		}
		
		if (size + 1 >= heap.length) {
			T[] original = heap;
			heap = (T[]) new Comparable[(size + 1) * 2];
			for (int i = 1; i <= size; i++) {
				heap[i] = original[i];
			}
		}
		
		heap[size + 1] = item;
		size++;
		if (size > 1) {
			addSort(size);
		}
	}
	
	/**
	 * Helper method to sort heap after adding an element.
	 * @param index Index number of the element to start sorting from
	 */
	private void addSort(int index) {
		int i = index;
		T current = heap[i];
		if (i > 1 && current.compareTo(heap[i / 2]) < 0) {
			T parent = heap[i / 2];
			heap[i / 2] = current;
			heap[i] = parent;
			i = i / 2;
		}
		if (i > 1 && current.compareTo(heap[i / 2]) < 0) {
			addSort(i);
		}
	}
	
	@Override
	public T remove() {
		if (size == 0) {
			throw new java.util.NoSuchElementException("Heap is empty.");
		}
		T removed = heap[1];
		heap[1] = heap[size];
		heap[size] = null;
		size--;
		if (size > 1) {
			removeSort(1);
		}
		
		return removed;
	}
	
	/** Helper method that retrieves the kth smallest item
	 * @return Print the kth smallest object in the heap
	 * @param list*/
	public void getKthSmallest(int[] list) {
		// create heap from list
		
		// sort heap
		
		//
	}
	
	/**
	 * Helper method to sort heap after removing an element.
	 * @param index Index number of element to start sorting from
	 */
	private void removeSort(int index) {
		int left = 2 * index;
		int right = 2 * index + 1;
		int min = index;
		
		if (left <= size
				&& heap[left].compareTo(heap[min]) < 0) {
			min = left;
		}
		if (right <= size
				&& heap[right].compareTo(heap[min]) < 0) {
			min = right;
		}
		
		if (min != index) {
			T parent = heap[index];
			T child = heap[min];
			heap[index] = child;
			heap[min] = parent;
			removeSort(min);
		}
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int size() {
		return size;
	}
	
	public void clear() {
		heap = (T[]) new Comparable[STARTING_SIZE];
		size = 0;
	}
	
}
