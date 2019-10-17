package study02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Insert {

	public static void main(String[] args) {
//		try {
//			Class.forName(ConnectionTest2.DRIVER_NAME);  //이미 만들어둔 하나만 바라보게 함.
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
		Connection con = null;

		try {
			con = DriverManager.getConnection(ConnectionTest2.URL, ConnectionTest2.ID, ConnectionTest2.PWD );
			String sql = "insert into user_info(id,pwd,name,age,etc) ";
			Scanner scan = new Scanner(System.in);
			System.out.println("당신의 정보를 \",\"를 기준으로 입력해주십시오.");
			String info = scan.nextLine();
			String[] infos = info.split(",");
			
			sql +="values( ";
			for(int i=0;i<infos.length;i++) {
				sql+="'"+infos[i]+"',";
			}
			sql=sql.substring(0, sql.length()-1);
			sql+=") ";
			
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate(sql);
			System.out.println("인서트된 갯수 : " +result+" ");   //제대로 인서트되었는지 확인.
			
			System.out.println(sql);
			
			
			
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
