package rough;

import java.util.ArrayList;
import java.util.List;

public class ListTest1 {
	
	
	public static void main(String[] args){
		
		
		List<Object> list1 = new ArrayList<Object>();
		list1.add(1);
		list1.add("name");
		list1.add("other");
		list1.add(2);
		
		System.out.println(list1);
		
		for(Object o: list1){
//			System.out.println(o);
			if(o.equals(1)){
				System.out.println("1 is present in the list");
			}
			
		}
		
		
		
	}
	

}
