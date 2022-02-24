package collection;

import java.util.*;
import java.util.Map.Entry;

public class Ex2 {
	public static void main(String[] args) {
		Map map = new HashMap();
		
		map.put(1, "Java");
		map.put(2, "JSP");
		map.put(3, "Android");
		
		System.out.println(map.toString());
		
		
		System.out.println(map.put(3,"oracle"));
		System.out.println(map);
		
		System.out.println(map.put(4,"JSP"));
		System.out.println(map);
		
		System.out.println(map.get(2));
		System.out.println(map);
		
		Set keySet = map.keySet();
		System.out.println(keySet);
		
		System.out.println(map.values()); 
		
//		Set values = new HashSet(map.values());
//		
//		System.out.println(values);
		
		List values = new ArrayList(map.values());
		
		System.out.println(values);
		
		System.out.println(map.entrySet()); 
		System.out.println(map.isEmpty()); 
		System.out.println(map.size()); 
		System.out.println(map.remove(4)); 
		System.out.println(map.remove(4)); 
		System.out.println(map); 
		
		Map map2 = new HashMap<>();
		
		map2.put("010-1234-5678", "홍길동");
		map2.put("010-2222-3333", "이순신");
		map2.put("010-4444-5555", "강감찬");
		
		Set keySet2 = map2.keySet();
		Iterator it = keySet2.iterator();
		
		while(it.hasNext()) {
			String phone = it.next().toString();
			String name = map2.get(phone).toString();
		}
		
		Set entrySet2 = map2.entrySet();
		Iterator it2 = entrySet2.iterator();
		
		while(it2.hasNext()) {
			Map.Entry entry = (Entry) it2.next();
		}
//		
		Set keySet3 = map2.keySet();
		for (Object phone : keySet3) {
			Object name = map2.get(phone);
			
		}
		
		System.out.println(map2.containsKey("010-1234-5678"));
	}
}




































