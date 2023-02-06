/*
 * Link : https://www.javatpoint.com/merge-sort
 * Video: https://www.youtube.com/watch?v=jlHkDBEumP0
 * Question : Question : Find sort using Merge Sort
 * Algorithm:
 *       #MergeSort(arr[], l,  r)
           If r > l
		     1. Find the middle point to divide the array into two halves:  
		             middle m = l+ (r-l)/2
		     2. Call mergeSort for first half:   
		             Call mergeSort(arr, l, m)
		     3. Call mergeSort for second half:
		             Call mergeSort(arr, m+1, r)
		     4. Merge the two halves sorted in step 2 and 3:
	             Call merge(arr, l, m, r)
	             
 * Time Complexity/Space Complexity
 * O(nlogn)/O(n)	             
 */

package sorting;

public class MergeSort
{
	static int c=0;
	void mergeSort(int a[], int beg, int end)  
	{  
	    if (beg < end)   
	    {  
	        int mid = (beg + end) / 2;  
	        mergeSort(a, beg, mid);  
	        mergeSort(a, mid + 1, end);  
	        merge(a, beg, mid, end);  
	    }  
	}  
	
	/* Function to merge the subarrays of a[] */  
	void merge(int[] a, int beg, int mid, int end)    
	{    
	    int i, j, k;  
	    int n1 = mid - beg + 1; //passing limit to left array   
	    int n2 = end - mid;    //passing limit to right array   
	      
	   /* temporary Arrays */  
        int LeftArray[] = new int[n1];  
        int RightArray[] = new int[n2];  
	      
	    /* copy data to temp arrays */  
	    for (i = 0; i < n1; i++) {    
		    LeftArray[i] = a[beg + i];
	    }
	    for (j = 0; j < n2; j++)    
	    RightArray[j] = a[mid + 1 + j];    
	      
	    i = 0; /* initial index of first sub-array */  
	    j = 0; /* initial index of second sub-array */   
	    k = beg;  /* initial index of merged sub-array */  
	      
	  //If in this while j>n2 then,it goes to next while condition, similarly for i>n1.
	  //This works when their, size is not equal, because if i=2 and j=4, i comes out of loop first.
	  while (i < n1 && j < n2)    
	  {    
	        if(LeftArray[i] <= RightArray[j])    
	        {    
	            a[k] = LeftArray[i];    
	            i++;    
	        }    
	        else    
	        { 
	        	//Check out Code with ALISHA...
	        	//For inversions,if an element in left array is greater than an element
	        	//in right array,then  all the elements present in left array are greater
	        	//than the element present in right array, as the both lists are sorted.
	        	//so, we are taking n-i.
	        	c+=n1-i;
	        	//System.out.print("\n("+LeftArray[i]+","+RightArray[j]+")");
	            a[k] = RightArray[j]; 
	            j++;    
	        }    
	        k++;    
	   }    
	   while (i<n1) //If i-size greater than j.    
	   {    
	        a[k] = LeftArray[i];    
	        i++;    
	        k++;    
	   }    
	      
	   while (j<n2) //If j-size greater than i.     
	   {    
	        a[k] = RightArray[j];    
	        j++;    
	        k++;    
	   }
	}      
	  
	/* Function to print the array */  
	void printArray(int a[], int n)  
	{  
	    int i;  
	    for (i = 0; i < n; i++)  
	        System.out.print(a[i] + " ");  
	}  
	  
	public static void main(String args[])  
	{  
	    int a[] = {8, 4, 2, 1};  
	    int n = a.length;  
	    MergeSort m1 = new MergeSort();  
	    System.out.println("Before sorting array elements are - ");  
	    m1.printArray(a, n);  
	    m1.mergeSort(a, 0, n - 1);  
	    System.out.println("\nAfter sorting array elements are - ");  
	    m1.printArray(a, n);  
	    System.out.println("\nNumber of Inversions are: "+c);
	}  
} 
