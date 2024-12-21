package map;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Pro {
	public static void main(String[] args) {

		Properties properties = new Properties();
		String string;
		
		properties.put("INDIA", "DELHI");
		properties.put("CHINA", "SANGHAI");
		properties.put("BIHAR", "PATNA");
		
		Set set = properties.keySet();
		
		Iterator iterator =set.iterator();
		while (iterator.hasNext()) {
			string=(String)iterator.next();
			System.out.println(string+properties.getProperty(string));
			
		}
		string=properties.getProperty("US", "NOT FOUND");

		System.out.println(string);
	}
}
// public static void main(String[] args) {
//	 Properties properties = new Properties();
//	 String string ;
//	 
//	 properties.put("India", "Delhi");
//	 properties.put("China", "Sanghai");
//	 properties.put("UP", "Lucknow");
//	 properties.put("Bihar", "Patna");
//	 
//	 Set set = properties.keySet();
//	 Iterator iterator = set.iterator();
//	 while (iterator.hasNext()) {
//			string = (String) iterator.next();
//		System.out.println(string+properties.getProperty(string));
//			}
//
//	 string=properties.getProperty("US", "NOT FOUND");
//	 System.out.println(string);
//
//}
//
//
//
//
//}