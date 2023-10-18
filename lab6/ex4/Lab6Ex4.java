package lab6.ex4;

import java.util.HashMap;

public class Lab6Ex4 {
	
	public static HashMap<Integer, String> findMedal(HashMap<Integer,Integer> h) {
		 HashMap<Integer, String> map  = new HashMap<>(); 
		 h.forEach((k,v)->{
			 if(v>=90) {
				 map.put(k, "Gold");
			 }
			 else if(v>=80 && v<90) {
				 map.put(k, "Silver");
			 }
			 else if(v>=70 && v<80) {
				 map.put(k, "Bronze");
			 }
			 
		 });
		 System.out.println(map);
		 return map;
		
	} 
	
	public static void main(String[] args) {
		 HashMap<Integer, Integer> map  = new HashMap<>();
		 map.put(01, 77);
		 map.put(02, 98);
		 map.put(03, 88);
		 map.put(04, 85);
		 map.put(05, 93);
		 
		 findMedal(map);
	}

}
