package study02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnetionTest2 {
	
	public static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String ID = "bdi";
	public static final String PWD = "12345678";
	public static final String DRIVER_NAME="oracle.jdbc.driver.OracleDriver";
	//바뀌지 않는다는 가정하에 final로 선언. 
	public static void main(String[] args) {
		try {
			Class.forName("DRIVER_NAME");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection con = null;
		try {
			con = DriverManager.getConnection(URL,ID,PWD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
