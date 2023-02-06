/*
 * Link  : https://www.javatpoint.com/binary-search
 * Video : https://www.youtube.com/watch?v=V_T5NuccwRA
 * Question : Find the element using binary Search
 * Examples: 
		Input: arr[] = {10, 20, 30, 50, 60, 80, 110, 130, 140, 170}, x = 110
		Output: 6
		Explanation: Element x is present at index 6
		
		Input: arr[] = {10, 20, 30, 40, 60, 110, 120, 130, 170}, x = 175
		Output: -1
		Explanation: Element x is not present in arr[].
		
 *Step-by-step Binary Search Algorithm: 
    1)We basically ignore half of the elements just after one comparison.
	2)Compare x with the middle element.
	  If x matches with the middle element, we return the mid index.
	3)Else If x is greater than the mid element, then x can only lie in the right half subarray after the mid element. 
	  So we recur for the right half.
	4)Else (x is smaller) recur for the left half.
 *
 *		
 */
package searching;

import java.util.Arrays;

public class BinarySearch {
	
	int binarySearch(int arr[],int n,int data) {
		int left=0;
		int right=n-1;
		
		while(left<right) {
			int mid=(left+right)/2;
			
			if (data==arr[mid]) {
				//System.out.println("The index of element is:"+mid);
			    return mid;
			}
			else if(data<arr[mid]) {
				right=mid-1;
			}
			else {
				left=mid+1;
			}
		}
		//System.out.println("The index of element is:"+ -1);
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = {8, 10, -22, 27, 37, 44, 49, 55, 69};; 
		Arrays.sort(arr);
        int n = arr.length; 
        int data = -22;
        BinarySearch bs=new BinarySearch();
        int res =bs.binarySearch(arr,n,data);
        
        System.out.println("Element to be searched is: " + data);  
        if (res == -1)  
        	System.out.println("Element is not present in the array");  
        else  
        	System.out.println("Element is present at " + res + " position of array");  
        
	
	}

}
