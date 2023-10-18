package lab6.ex5;

import java.util.Arrays;

public class Lab6Ex6 {
	
	public static int findSmall(int[] arr) {
		Arrays.sort(arr);
		return arr[1];
	}
	
	public static void main(String[] args) {
		int arr[]= {8,3,7,10,5};
		System.out.println(findSmall(arr));
	}

}
