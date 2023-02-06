package sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr= {3,7,5,0,2,9,6};
		
		for(int i=1;i<arr.length;i++) {
			int temp=arr[i];
			int j=i-1;
			//we need to keep it in order,because first if we check for j when j is in 0th position
			//it may lead to an error when it moves to -1th position.
			while(j>-1 && temp<arr[j]) {
				arr[j+1]=arr[j];
				arr[j]=temp;
				j--;
			}
			System.out.println(Arrays.toString(arr));
		}

	}

}
