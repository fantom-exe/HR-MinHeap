import TreePackage.MinHeap;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Driver {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Random rand = new Random(System.currentTimeMillis());
		
		// populate list with 50 rand ints
		for(int i = 0; i < 50; i++) {
			list.add(rand.nextInt(100));
		}
		
		// display list
		System.out.print("\nList contents: ");
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		// use MinHeap to find the kth smallest int
		MinHeap minHeap = new MinHeap();
		
		//                   ( list,  k )
		minHeap.getKthSmallest(list, 2);
	}
	
}
