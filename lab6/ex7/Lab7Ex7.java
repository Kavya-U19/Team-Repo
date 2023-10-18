package lab6.ex7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab7Ex7 {
	
	public static List<Integer> ReverseArray(List<Integer> arr) {
		
		Collections.reverse(arr);
		System.out.println("Reversed Array");
		System.out.println(arr);
		Collections.sort(arr);
		System.out.println(arr);
		return arr;
		
		
	}
	
	public static void main(String[] args) {
		List<Integer> arr=new ArrayList<Integer>();
		arr.add(5);
		arr.add(10);
		arr.add(2);
		arr.add(9);
		arr.add(6);
		arr.add(8);
		
		ReverseArray(arr);
	}

}
