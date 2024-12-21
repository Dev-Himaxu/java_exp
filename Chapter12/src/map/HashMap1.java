package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {
	public static void main(String[] args) {

		HashMap< String, Integer>hashMap = new HashMap<String, Integer>();
		hashMap.put("A", 1);
		hashMap.put("B", 2);
		hashMap.put("C", 3);
		
		Set set = hashMap.entrySet();
		Iterator iterator= set.iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Integer>entry=(Entry<String, Integer>)iterator.next();
			System.out.println("Keys:"+entry.getKey()+"Values:"+entry.getValue());
			
		}
		
		System.out.println(hashMap.remove("A"));
		
		Set set2 = hashMap.entrySet();
		Iterator iterator2 = set2.iterator();
		while (iterator2.hasNext()) {
			Map.Entry<String, Integer>entry=(Entry<String, Integer>)iterator2.next();
			System.out.println("Keys:"+entry.getKey()+"Values:"+entry.getValue());
		}
		}
	}

//		
//		System.out.println(hashMap.remove("A"));
//		
//		Set set2 = hashMap.entrySet();
//		
//		Iterator iterator2 = set2.iterator();
//		while (iterator2.hasNext()) {
//			Map.Entry<String, Integer>entry2=(Entry<String, Integer>)iterator2.next();
//			System.out.println("Keys:"+entry2.getKey()+"Values:"+entry2.getValue());
//			
//		}
	//}
//}

//		HashMap<String , Integer>hashMap = new HashMap<String, Integer>();
//		hashMap.put("A", 1);
//		hashMap.put("B", 2);
//		hashMap.put("C", 3);
//		hashMap.put("D", 4);
//		
//		System.out.println(hashMap.containsKey("A"));
//		System.out.println(hashMap.containsValue(5));
//		
//		
//		Set  set = hashMap.entrySet();
//		
//		Iterator iterator = set.iterator();
//		while (iterator.hasNext()) {
//			Map.Entry<String, Integer> entry = (Entry<String, Integer>)iterator.next();
//			System.out.println("Key:"+entry.getKey()+"Value:"+entry.getValue());
//		}
//			System.out.println(hashMap.remove("A"));
//			
//			Set set2 =hashMap.entrySet();
//			
//			Iterator iterator2 = set2.iterator();
//			while (iterator2.hasNext()) {
//				Map.Entry<String, Integer>entry2=(Entry<String, Integer>)iterator2.next();
//				System.out.println("Keys:"+entry2.getKey()+"Values:"+entry2.getKey());
//				
//			}
//		}
//	
//	
//	}
//	
//
