/*
 * Bubble Sort:
    Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping
    the adjacent elements if they are in the wrong order. This algorithm is not 
    suitable for large data sets as its average and worst-case time complexity is quite high.
    
 * Algorithm:
     Follow the below steps to solve the problem:
	1.Run a nested for loop to traverse the input array using two variables i and j.
	  First loop is for condition and second is for comparing elements.
	2.If arr[j] is greater than arr[j+1] then swap these adjacent elements, else move on
	3.Print the sorted array.
	
 * Time Complexity: O(N2)
   Auxiliary Space: O(1) 	
 */
package sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr= {3,7,5,0,2,9};
		
		for(int i=arr.length-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		//for(int ele :arr)
			//System.out.print(ele+" ");
	}

}
