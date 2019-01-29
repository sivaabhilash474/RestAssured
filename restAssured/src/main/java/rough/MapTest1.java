package rough;

import java.util.HashMap;
import java.util.Map;

public class MapTest1 {
	
//	String RegisteredUser = "abhilash";
	public static Map<String,String> getUser(String userType){
		Map<String,String> map1 = new HashMap<String,String>();
		
		if(userType.equals("Registered User")){
			map1.put(userType, "siva");
		}
		
		else if(userType.equals("Manager")){
			map1.put(userType, "Naveen");
		}
		
		else if(userType.equals("Product Owner")){
			map1.put(userType, "Corina");
		}
		
		return map1;
	}
	
	public static void main(String[] args){
		
		String userName = "";
		Map<String,String> credentials = getUser("Product Owner");
		
		  for(Map.Entry m:credentials.entrySet()){  
//			   System.out.println(m.getKey()+" "+m.getValue());
			   userName = (String) m.getValue();
			  }  
		
		System.out.println("UserName: "+userName);
	}

}
