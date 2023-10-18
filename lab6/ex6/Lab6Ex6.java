package lab6.ex6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lab6Ex6 {
	
	public static List<Integer>findEligibility(HashMap<Integer,Integer> h) {
		List<Integer> a=new ArrayList<Integer>();
		h.forEach((k,v)->{
			if(v>=18) {
				a.add(k);
			}
		});
		System.out.println(a);
		return a;
		
	}
	
	public static void main(String[] args) {
		HashMap<Integer, Integer> map  = new HashMap<>();
		 map.put(01, 77);
		 map.put(02, 5);
		 map.put(03, 50);
		 map.put(04, 14);
		 map.put(05, 93);
		 findEligibility(map);
	}

}
