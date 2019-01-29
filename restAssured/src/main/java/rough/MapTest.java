package rough;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	
	public static void main(String[] args){
		
		
		Map<String,String> map1 = new HashMap<String,String>();
		map1.put("1", "FirstName");
		map1.put("2", "LastName");
		map1.put("3", "Phone");
		
//		System.out.println(map1.get("2"));
		
		
		for(Map.Entry<String, String> m:map1.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
	}
	

}
