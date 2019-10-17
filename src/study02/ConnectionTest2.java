package study02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectionTest2 {
	
	public static final String URL;
	public static final String ID ;
	public static final String PWD;
	public static final String DRIVER_NAME;
	//바뀌지 않는다는 가정하에 final로 선언. 
	static {
		URL  = "jdbc:oracle:thin:@localhost:1521:xe";
		ID = "bdi";
		PWD = "12345678";
		DRIVER_NAME="oracle.jdbc.driver.OracleDriver";
		try {
			Class.forName(DRIVER_NAME);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();//이건 뭐하는애지?
		}
	}
	
	public static void main(String[] args) {
		
		
		Connection con = null;  //선언만 하면 작동안됨
		try {
			con = DriverManager.getConnection(URL,ID,PWD);
			String sql = "select * from user_info ";
			Scanner scan = new Scanner(System.in);
			System.out.println("검색할 아이디를 입력해주세요. : ");
			String id = "'%"+scan.nextLine()+"%'";
			sql += " where id like  "+id+" ";   //like에는 =가 안붙음.	
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getString("id"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
