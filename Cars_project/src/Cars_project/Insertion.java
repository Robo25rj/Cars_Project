package Cars_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insertion {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			
			Statement stmt=con.createStatement();
			
			stmt.executeUpdate("insert into cars_project.cars values(1000,'BMW','White','BMW X7')");
			stmt.executeUpdate("insert into cars_project.cars values(1001,'BMW','Blue','BMW X5')");
			stmt.executeUpdate("insert into cars_project.cars values(1002,'BMW','Copper Brown','BMW i7 M70')");
			stmt.executeUpdate("insert into cars_project.cars values(1003,'Audi','Silver','Audi A4')");
			stmt.executeUpdate("insert into cars_project.cars values(1004,'Audi','Black','Audi Q3')");
			
			stmt.executeUpdate("insert into cars_project.latestcars values(2000,'Toyota','White','GR Supra')");
			stmt.executeUpdate("insert into cars_project.latestcars values(2001,'Toyota','Yellow','Celica Supra')");
			stmt.executeUpdate("insert into cars_project.latestcars values(2002,'Ferrari','Red','F8 Spider')");
			stmt.executeUpdate("insert into cars_project.latestcars values(2003,'Ferrari','Blue','F50')");
			stmt.executeUpdate("insert into cars_project.latestcars values(2004,'Ford','Yellow','Mustang 1967')");
			System.out.println("inserted");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
