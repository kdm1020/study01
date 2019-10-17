package study02.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {
	private static final String URL;
	private static final String ID ;
	private static final String PWD;
	private static final String DRIVER_NAME;
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
	
	private static Connection con;
	
	public static Connection getCon() {
		if(con==null) {
			try {
				con = DriverManager.getConnection(URL, ID, PWD);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return con;
	}
	

}
