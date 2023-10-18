package lab6.ex2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class LabEx2 {
	public static void main(String[] args) {
		
		System.out.println("Print name");
		Scanner sc = new Scanner(System.in);

		
		String name = sc.next();
		name=name.toLowerCase();
		 char[] ch = name.toCharArray();
		 HashMap<Character, Integer> map  = new HashMap<>(); 
		 for(Character c:ch) {
			 if(map.containsKey(c)) {
				 map.put(c, map.get(c)+1);
			 }else {
				 map.put(c, 1);
			 }
		 }
		 
		 System.out.println(map);
		
		
	}

}
