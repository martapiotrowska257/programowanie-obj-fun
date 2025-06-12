package pl.edu.pw.fizyka.java.lab10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class WypisywanieTabeli {

	public static void main(String[] args) throws SQLException {
		
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(
					"jdbc:h2:./data/nazwabazy", "sa",
					"");


			Statement statement = conn.createStatement();
			
			//Wyswietlanie dat dni, w których kurs dolara był większy niż kurs euro:
			statement.execute("SELECT data FROM waluty WHERE usd < eur");

			
			ResultSet rs = statement.getResultSet();
			
			ResultSetMetaData md  = rs.getMetaData();
					

			for (int ii = 1; ii <= md.getColumnCount(); ii++){
				System.out.print(md.getColumnName(ii)+ " | ");						
				
			}
			System.out.println();
			
			while (rs.next()) {
				for (int ii = 1; ii <= md.getColumnCount(); ii++){
					System.out.print( rs.getObject(ii) + " | ");							
				}
				System.out.println();
			}
		} finally {
			if (conn!= null){
				conn.close();
			}
		}
		

	}

}
