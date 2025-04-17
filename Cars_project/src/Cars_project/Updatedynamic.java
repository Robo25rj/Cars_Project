package Cars_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Updatedynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String place=sc.nextLine();
		int id=sc.nextInt();
		 try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
				
				PreparedStatement pstmt=con.prepareStatement("update info.student set studentplace=? where idstudent=?");
				
				pstmt.setString(1, place);
				pstmt.setInt(2, id);
				pstmt.executeUpdate();
				
				
				System.out.println("inserted");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
