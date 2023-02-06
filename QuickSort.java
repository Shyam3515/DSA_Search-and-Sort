/*
  * Link  : https://www.geeksforgeeks.org/quick-sort/
 * Link  : https://www.javatpoint.com/quick-sort
 * Video** : https://www.youtube.com/watch?v=COk73cpQbFQ&t=1037s (MyCodeSchool)
 * Video : https://www.youtube.com/watch?v=QN9hnmAgmOc&t=1184s
 * Question:
 * Algorithm:
 *    -->The key process in quickSort is partition(). Target of partitions is, given an array and an element x of array as pivot,
 *       put x at its correct position in sorted array and put all smaller elements (smaller than x) before x, 
 *       and put all greater elements (greater than x) after x. All this should be done in linear time.
 *
 * Time Complexity/Space Complexity
 * O(nlogn)/O(logn)	             
 */

package sorting;

public class QuickSort {

		int partition (int a[], int start, int end)  
	    {  
	        int pivot = a[end]; // pivot element  
	        int i = start; //Consider first elelment 

	        for (int j = start; j <end; j++)  
	        {  
	            // If current element is smaller than the pivot  
	            if (a[j] <= pivot)  
	            {  
	                // increment index of smaller element  
	                int t = a[i];  //Swap that element with starting element
	                a[i] = a[j];  
	                a[j] = t;  
	                 i++;
	            }  
	        }  
	        int t = a[i];  
	        a[i] = a[end]; //swap end  with i(element)
	        a[end] = t;  
	        return (i);  
	    }  
	/* function to implement quick sort */  
	    void quick(int a[], int start, int end) /* a[] = array to be sorted, start = Starting index, end = Ending index */  
	    {  
	        if (start < end)  
	        {  
	            int p = partition(a, start, end);  //p is partitioning index  
	            quick(a, start, p - 1);  
	            quick(a, p + 1, end);  
	        }  
	    }  
	/* function to print an array */  
	    void printArr(int a[], int n)  
	    {  
	        int i;  
	        for (i = 0; i < n; i++)  
	            System.out.print(a[i] + " ");  
	    }  
	        public static void main(String[] args) 
	        {  
	            int a[] = { 13, 18, 27, 2, 19, 25 };  
	            int n = a.length;  
	            System.out.println("\nBefore sorting array elements are - ");  
	            QuickSort q1 = new QuickSort();  
	            q1.printArr(a, n);  
	            q1.quick(a, 0, n - 1);//Calling Quick sort  
	            System.out.println("\nAfter sorting array elements are - ");  
	            q1.printArr(a, n);  
	            System.out.println();  
	        }  

	}


