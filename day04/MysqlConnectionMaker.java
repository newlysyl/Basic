package day04;

import java.sql.Connection;

public class MysqlConnectionMaker implements ConnectionMaker{
	private final String URL = "mySQL 연결 주소";
	private final String ID = "mySQL 연결 id";
	private final String PW = "mySQL 연결 비밀번호";
	public Connection makeConnection() {
		Connection conn = null;
		System.out.println("mySQL 연결");
		//여기에 mySQL 연결하는 코드 구현
		return conn;
	}
}
