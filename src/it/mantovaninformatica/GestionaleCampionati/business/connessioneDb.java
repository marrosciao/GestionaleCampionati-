package it.mantovaninformatica.GestionaleCampionati.business;
import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connessioneDb {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Connection conn = null;
		String url = "jdbc:mysql://127.0.0.1/";
		String dbName = "fc";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root";
		String password = "";
		try {
		Class.forName(driver).newInstance();
		conn = DriverManager.getConnection(url+dbName,userName,password);
		System.out.println("Connesso.");
		
		} catch (Exception e) {
		e.printStackTrace();
		System.out.println("Non connesso.");

		}
		}
}
