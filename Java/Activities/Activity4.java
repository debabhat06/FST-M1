package activities;

import java.util.Arrays;

public class Activity4 {

	public static void main(String[] args) {
		int[] numbers = {4,8,1,9,67,43,78,35,76,33,24,76};
		ascendingSorting(numbers);
		System.out.println("The array in ascending order is: ");
		System.out.println(Arrays.toString(numbers));

	}

	 static void ascendingSorting(int arr[]) {
		
		int size = arr.length;
		int i;
		
		for(i=1; i<size; i++) {
			int key = arr[i];
			int j = i-1;
			while (j>=0 && key<arr[j]) {
				arr[j+1] = arr [j];
				--j;
			}
			arr[j+1]= key;
		}
	}

}
