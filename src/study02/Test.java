package study02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		
		Connection con =null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "bdi";
			String pwd = "12345678";
			
			con =DriverManager.getConnection(url,id,pwd);              //연결
			
			Statement stmt = con.createStatement();    //칠판  보통 쓰지않음. 다른거씀. 입력자가 ''를 입력하지 않아서.
			
			String sql = "SELECT * FROM USER_INFO";   //이부분도 대소문자 구분해야하나??상관없네;;
			ResultSet rs = stmt.executeQuery(sql);
			List<Map<String,String>>  userList = new ArrayList<Map<String,String>>();
			
			while(rs.next()) {
//				System.out.println("ID : "+rs.getString("id")+", 비밀번호 : "+rs.getString("pwd")+", 이름 : "+rs.getString("name")+", 나이 : "+rs.getString("age")+", ETC : "+rs.getString("etc"));
				Map<String,String> userMap = new HashMap<String,String>();
				userMap.put("id", rs.getString("id"));
				userMap.put("pwd", rs.getString("pwd"));
				userMap.put("name", rs.getString("name"));
				userMap.put("age", rs.getString("age"));
				userMap.put("etc", rs.getString("etc"));
				userList.add(userMap);
			}
			System.out.println(userList);
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
			if(con!=null) {  //연결O
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		//순서대로 입력하고 순서대로 출력할때 ArrayList
		//순서는 상관없이 수정을 자주 할때는 LikedList??
	}
}
