import java.util.*;

import org.apache.ibatis.session.*;

public class Test {

	public static void main(String[] args) {
		SqlSession session = SqlMapClient.getSqlSession();
	
		Map param = new HashMap();
		param.put("NAME", "차");
		param.put("STD_NO", "2023");
		
		List<Map<String, String>> list = session.selectList("Test.select");
		System.out.println(list);
		
	}

}
