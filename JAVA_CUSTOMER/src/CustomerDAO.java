import java.util.*;

import org.apache.ibatis.session.*;

import sql.*;

public class CustomerDAO {
	
	private SqlSessionFactory sqlSessionFactory = SqlMapClient.getSqlSession();
	
	// 조회
	public Vector select(Map<String, String> param) {
		SqlSession session = sqlSessionFactory.openSession();
		
		List sqlData = session.selectList("Customer.select"); // namespace.id
		
		System.out.println(sqlData);
		
		Vector data = new Vector();
		
		session.close();
		return data;
	}
	
	public boolean insert(CustomerDTO dto) {
		return true;
	}
	
	public boolean delete(int idx) {
		return true;
	}
}
