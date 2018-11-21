package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;

public class DataBase_Demo {

	public static void main(String[] args) {
		ArrayList<Icecream> icecreams = new ArrayList<>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "12345")) {
				ResultSet rs = conn.createStatement().executeQuery("Select * from Icecream");
				while (rs.next()) {
					icecreams.add(new Icecream(rs.getInt("pid"), rs.getInt("price"), rs.getString("name"),
							rs.getString("category")));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Collections.sort(icecreams);

		for (Icecream ic : icecreams) {
			System.out.println(ic);
		}

	}

}
