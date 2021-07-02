package activities;

import java.util.Arrays;

public class Activity2 {

	public static void main(String[] args) {
		int[] num = {10,77,10,54,-11,10};
		System.out.println("The original Array is: " +Arrays.toString(num));
		
		int searchnum = 10;
		int sum = 30;
		System.out.println("Result is "+ result(num,searchnum,sum));
		
	}
	public static boolean result(int[] i,int searchnum,int sum) {
		
		int initial_sum = 0;
		for(int x:i) {
			if(x== searchnum) {
				initial_sum+= searchnum;
			}
			if (initial_sum > sum) {
				break;
			}
			
				
		}
		return initial_sum == sum;
		
	}
	

}
