import TreePackage.MinHeap;
import java.util.Random;

public class Driver {

	public static void main(String[] args) {
		int[] list = {};
		Random rand = new Random(System.currentTimeMillis());
		
		// populate list with 50 rand ints
		for(int i = 0; i < 50; i++) {
			list[i] = rand.nextInt(100);
		}
		
		// display list
		System.out.print("\nList contents: ");
		for(int i = 0; i < 50; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println();
		
		// use MinHeap to find the kth smallest int
		MinHeap minHeap = new MinHeap();
		
		minHeap.getKthSmallest(list);
	}
	
}
