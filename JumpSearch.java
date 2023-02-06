/*
 * Link  : https://www.geeksforgeeks.org/jump-search/ (Just for Reference)
 * Video : https://www.youtube.com/watch?v=CNP1ARmq2rY
 * Question: Find the element using Jump Search
 * 
 * Algorithm:
		1. Find the Sqaure root of the size of the Array. 
		   Set variable "low" to 0.
		   (Store the result in a variable, this is going to be the "jump")
		2. Loop through the array with a gap of jump.
		3. check if the current value matches the element we are searching for.
			3.1 if yes, return the index position
			3.2 if the current value is less than the element,
				make "low" value to the current index.
			3.3 if the current value is greater than the element,
				break the loop as the value will be found (if present)
				before we encounter this current value.				
		4. Apply Linear Search algorithm from the current low value till the 
		   end of the loop.		   
		5. Return -1 if the element is not found
 
 *	Time Complexity : O(root(n)) 
 *  Auxiliary Space : O(1)	
 */
package searching;

public class JumpSearch {
	
	static int jumpSearch(int a[],int element,int size){
		int low = 0;
		int jump = (int)Math.floor(Math.sqrt(size));; // Square root of the size of the array
		for(int i = 0; i<size; i+=jump){
			if(a[i] == element)
				return i;
			if(a[i] < element)
				low = i;
			else
				break;
		}
		
		for(int i = low; i<size; i++){
			if(a[i] == element)
				return i;
		}
		
		return -1;
	}

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		int element = 9;
		int size = a.length;  
		int index = jumpSearch(a,element,size);
		if(index == -1)
			System.out.println("Sorry!..Element "+element+" Not Found...");
		else
			System.out.println("The Element "+element+" is present at:"+index);

	}

}
