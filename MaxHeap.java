/*
 * Link  : https://www.javatpoint.com/heap-sort
 * Video : https://www.youtube.com/watch?v=Q_eia3jC9Ts
 * Question : Find sort using max heap
 * 
 * Algorithm:
 *       1)Heapify
 *       2)Take first element in sorted array
 *       3)replace the first position with last element
 *       4)check if the tree is in heapify, otherwise heapify
 * 
 * Time Complexity/Space Complexity
 * O(nlogn)/O(n)	 
 */

package sorting;

public class MaxHeap {
	static int i;
    void max_heapify(int[] arr, int n, int i) 
    {
		int largest = i;
		int l = 2*i+1;  // left child
		int r = 2*i+2;  // right child
		if(l < n && arr[l] > arr[largest]) {
			largest = l;
		}
		if(r < n && arr[r] > arr[largest]) {
			largest = r;
		}
		// If largest is not root
		if (largest != i) {  // It means it has been updated,swaping i (current element) with largest element.
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
  
			// Recursively heapify the affected sub-tree
			max_heapify(arr, n, largest);//After swapping we need to adjust the tree
		}
	}
	void heapSort(int[] arr, int n)
	{
		int startIndex = n/2 - 1;//we are going to start heapify method from non-leaf            
		                         //method that is at (n/2-1)
		
		// building Max_heap from given array..
		for (i = startIndex; i >= 0; i--) { //building Max_heap means parent should be greater than child
			max_heapify(arr, n, i);
		}
		// One by one extract an element from heap.
		for(i = n-1; i >=0; i--) {
		    // Move current root to end
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp; //pushing max to end.
			// call max heapify on the reduced heap
			max_heapify(arr, i, 0); // passing i as array length, as we stored max at end, 
			                      // we can reduce array size as we are decrementing after extracting.
		}                         // 0 means starting index
		
		//In descending Order
		/*for(i = 0; i >n; i++) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp; 
			max_heapify(arr, i, 0);
		}*/
	}
	
	void largest(int k,int n,int arr[]) {
		int l=arr[n-k];
		System.out.println();
		System.out.println(k+"rd largest Element is:"+l);
	}
	
	public static void main(String[] args) {
		System.out.println("Heap Sorting...");
	    int[] arr = {50,20,1,3,10,5,100};
		int n = arr.length;
		MaxHeap heap=new MaxHeap();
		heap.heapSort(arr,n);
		
		for(i = 0; i < n;i++) {
		System.out.print(arr[i]+" ");
			}
		
		int k=3;
		heap.largest(k,n,arr);
	}
	
}
