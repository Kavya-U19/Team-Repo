package lab6.ex3;

import java.util.HashMap;
import java.util.Map;

public class Lab6Ex3 {
	
	public static Map<Integer,Integer>findSquares(int[] arr) {
		 HashMap<Integer, Integer> map  = new HashMap<>(); 
		 for(Integer a:arr) {
			 map.put(a, a*a);
		 }
		 System.out.println(map);
		 return map;
		
	}
	
	public static void main(String[] args) {
		int arr[] = { 3, 1, 2, 5, 4 };
		findSquares(arr);
	}

}
