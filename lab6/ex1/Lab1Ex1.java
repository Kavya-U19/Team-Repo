package lab6.ex1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Lab1Ex1 {
	
	public static void main(String[] args) {
		HashMap<String, Integer> map  = new HashMap<>(); 
		map.put("vishal", 900); 
	    map.put("sachin", 950); 
	    map.put("vaibhav", 200); 
	    map.put("Neha", 1020); 
	    map.put("Priya", 300); 
	    map.put("Sam", 100); 
	    
	    Collection<Integer> values = map.values(); 
	    List<Integer> arr= new ArrayList<>(values); 
	    
	    Collections.sort(arr);
	    
	    for(Integer a:arr) {
	    	System.out.println(a);
	    }
	} 
        
	
   

}
