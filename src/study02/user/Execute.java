package study02.user;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Execute {
	Connection con = DBCon.getCon();
	Scanner scan = new Scanner(System.in);

	void insert() {
		System.out.println("ID를 입력해주세요.");
		String id = "'" + scan.nextLine() + "'";
		System.out.println("PWD를 입력해주세요.");
		String pwd = "'" + scan.nextLine() + "'";
		System.out.println("NAME를 입력해주세요.");
		String name = "'" + scan.nextLine() + "'";
		System.out.println("AGE를 입력해주세요.");
		String age = "'" + scan.nextLine() + "'";
		System.out.println("etc를 입력해주세요.");
		String etc = "'" + scan.nextLine() + "'";
		String sql = "insert into user_info(id,pwd,name,age,etc) ";
		sql += " values(" + id + "," + pwd + "," + name + "," + age + "," + etc + ")";

		try {
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate(sql);
			System.out.println("인서트된 갯수 : " + result + " ");
			System.out.println(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	void update() {
		System.out.println("업데이트할 유저의 이름을 입력해주세요. ");
		String upname = scan.nextLine();
		System.out.println("변경할 항목를 입력해주세요. (단, ID/PWD/NAME/AGE/ETC 중 하나.)");
		String cgd = scan.nextLine();
		System.out.println("변경할 값을 입력해주세요. ");
		String upd = scan.nextLine();

		String sql = " update user_info set " + cgd + " = " + upd + " where name = '" + upname + "' ";

		try {
			Statement stmt = con.createStatement();

			int result = stmt.executeUpdate(sql);
			System.out.println("업데이트된 갯수 : " + result + " "); // 변경 전 값과 변경 후 값을 출력해주고 싶다...
			System.out.println(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	void delete() {
		System.out.println("삭제할 아이디를 작성해주세요 : ");
		String id = scan.nextLine();
		String sql = " delete from user_info where id = '" + id + "' ";
		System.out.println(sql);

		try {
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate(sql);
			System.out.println("삭제된 갯수 : " + result);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	void select() {
		String sql = "select * from user_info ";
		Scanner scan = new Scanner(System.in);
		System.out.println("검색할 아이디를 입력해주세요. : ");
		String id = "'%" + scan.nextLine() + "%'";
		sql += " where id like  " + id + " ";

		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getString("id"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	void initResponse() {
		String res = "";
		while(!res.equals("q")) {
			System.out.println("원하는 서비스 번호를 입력하세요.");
			System.out.println("1. 유저 생성.");
			System.out.println("2. 유저 삭제.");
			System.out.println("3. 유저 수정.");
			System.out.println("4.유저 조회.");
			System.out.println("q. 종료.");
			res = scan.nextLine();
			System.out.println("선택한 명령어. "+res);	
			if("1".equals(res)) {
				
			}else if("2".equals(res)) {
				
			}else if("3".equals(res)) {
				
			}else if("4".equals(res)) {
				
			}else if("q".equals(res)) {
				System.out.println("시스템이 종료됩니다.");
			}else {
				System.out.println("입력하신 서비스 번호가 없습니다.");
				
			}
		}
	}
	public static void main(String[] args) {
		Execute ct = new Execute();
		Scanner scan1 = new Scanner(System.in);
		int start = 0;
		while (start == 0) {
			System.out.println("1.insert.  2.delete.  3.update 4.select 5.종료");
			String choice = scan1.nextLine();
			int num = Integer.parseInt(choice);
			
			if (num == 1) {
				ct.insert();
				System.out.println("");
			} else if (num == 2) {
				ct.delete();
				System.out.println("");
			} else if (num == 3) {
				ct.update();
				System.out.println("");
			} else if (num == 4) {
				ct.select();
				System.out.println("");
			} else if (num == 5) {
				start = num;
				System.out.println("종료합니다. 수고링~");
			}
			else {
				System.out.println("다시 입력해주십시오.");
			}
		}
	}
}
