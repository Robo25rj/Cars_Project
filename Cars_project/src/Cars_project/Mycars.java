package Cars_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Mycars {

	static int carNo;
	static String carName;
	static String carColor;
	static String carModel;
	
	public static void insertIntoLatestCars() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter car number");
		carNo=sc.nextInt();
		sc.nextLine();
		System.out.println("enter car name");
		carName=sc.nextLine();
		System.out.println("enter car color");
		carColor=sc.nextLine();
		System.out.println("enter car model");
		carModel=sc.nextLine();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			
			PreparedStatement pstmt=con.prepareStatement("insert into cars_project.latestcars values(?,?,?,?)");
			
			//ResultSet rs=pstmt.executeQuery();
			
			pstmt.setInt(1, carNo);	
			pstmt.setString(2, carName);
			pstmt.setString(3, carColor);
			pstmt.setString(4, carModel);
			pstmt.executeUpdate();
			
			System.out.println();
			System.out.println("<----records inserted successfully---->");
			System.out.println();
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}
	
	//Insertion of records into cars table
	
	public static void insertIntoCars() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter car number");
		carNo=sc.nextInt();
		sc.nextLine();
		System.out.println("enter car name");
		carName=sc.nextLine();
		System.out.println("enter car color");
		carColor=sc.nextLine();
		System.out.println("enter car model");
		carModel=sc.nextLine();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			
			PreparedStatement pstmt=con.prepareStatement("insert into cars_project.cars values(?,?,?,?)");
			
			pstmt.setInt(1, carNo);	
			pstmt.setString(2, carName);
			pstmt.setString(3, carColor);
			pstmt.setString(4, carModel);
			pstmt.executeUpdate();
			
			System.out.println();
			System.out.println("<----records inserted successfully---->");
			System.out.println();
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	//thank you method
	public static void thankYou() {
		System.out.println("<---------------------------------->");
		System.out.println("<---------------------------------->");
		System.out.println();
		System.out.println("<--Thank You For Visiting-->");
		System.out.println();
		System.out.println("<---------------------------------->");
		System.out.println("<---------------------------------->");
	}
	
	// Update  records in both tables
	public static void updateRecords() {
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("press 1 to update record from Cars table");
			System.out.println("press 2 to update record from Latest Cars table");
			System.out.println("press 0 to go back main menu");
			
			int x=sc.nextInt();
			sc.nextLine();
			switch(x) {
			case 1:
				update1();
				break;
			case 2:
				update2();
				break;
			default :
				System.err.println("invalid input..Try again!!");
				mainMenu();
				break;
			}
		}
		
	}
	//update 1
	public static void update1() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the carNumber of record u want to update");
		carNo=sc.nextInt();
		sc.nextLine();
		
		 try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
				
				System.out.println("press 1 to update carName");
				System.out.println("press 2 to update carColour");
				System.out.println("press 3 to update carModel");
				int x=sc.nextInt();
				sc.nextLine();
				switch(x){
				case 1:
					System.out.println("enter car name");
					carName=sc.nextLine();
					PreparedStatement pstmt=con.prepareStatement("update cars_project.cars set CarName=? where CarNo=?");
					pstmt.setString(1, carName);
					pstmt.setInt(2, carNo);
					pstmt.executeUpdate();
					System.out.println();
					System.out.println("<--record updated successfully-->");
					System.out.println();
					break;
				case 2:
					System.out.println("enter car color");
					carColor=sc.nextLine();
					PreparedStatement pstmt1=con.prepareStatement("update cars_project.cars set Carcolor=? where CarNo=?");
					pstmt1.setString(1, carColor);
					pstmt1.setInt(2, carNo);
					pstmt1.executeUpdate();
					System.out.println();
					System.out.println("<--record updated successfully-->");
					System.out.println();
					break;
				case 3:
					System.out.println("enter car model");
					carModel=sc.nextLine();
					PreparedStatement pstmt2=con.prepareStatement("update cars_project.cars set CarModel=? where CarNo=?");
					pstmt2.setString(1, carModel);
					pstmt2.setInt(2, carNo);
					pstmt2.executeUpdate();
					System.out.println();
					System.out.println("<--record updated successfully-->");
					System.out.println();
					break;
				default :
					System.err.println("invalid input......Try again!!!");
					update1();
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}
	
	//update 2
	
	public static void update2() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the carNumber of record u want to update");
		carNo=sc.nextInt();
		sc.nextLine();
		
		 try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
				
				System.out.println("press 1 to update carName");
				System.out.println("press 2 to update carColour");
				System.out.println("press 3 to update carModel");
				int x=sc.nextInt();
				sc.nextLine();
				switch(x){
				case 1:
					System.out.println("enter car name");
					carName=sc.nextLine();
					PreparedStatement pstmt=con.prepareStatement("update cars_project.latestcars set CarName=? where CarNo=?");
					pstmt.setString(1, carName);
					pstmt.setInt(2, carNo);
					pstmt.executeUpdate();
					System.out.println();
					System.out.println("<--record updated successfully-->");
					System.out.println();
					break;
				case 2:
					System.out.println("enter car color");
					carColor=sc.nextLine();
					PreparedStatement pstmt1=con.prepareStatement("update cars_project.latestcars set CarColor=? where CarNo=?");
					pstmt1.setString(1, carColor);
					pstmt1.setInt(2, carNo);
					pstmt1.executeUpdate();
					System.out.println();
					System.out.println("<--record updated successfully-->");
					System.out.println();
					break;
				case 3:
					System.out.println("enter car color");
					carModel=sc.nextLine();
					PreparedStatement pstmt2=con.prepareStatement("update cars_project.latestcars set CarModel=? where CarNo=?");
					pstmt2.setString(1, carModel);
					pstmt2.setInt(2, carNo);
					pstmt2.executeUpdate();
					System.out.println();
					System.out.println("<--record updated successfully-->");
					System.out.println();
					break;
				default :
					System.err.println("invalid input......Try again!!!");
					update2();
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}
	
	//Collection of Latest cars
	
	public static void collectionLatestCars() {
		 try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
			  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			  
			  PreparedStatement pstmt=con.prepareStatement("select * from cars_project.latestcars");
			   ResultSet rs= pstmt.executeQuery();
			   
			   System.out.println();
			   System.out.println("=====Collection Of latest cars=====");
			   System.out.println();
			   
			   while (rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			  }
			 
			   System.out.println();
	     }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
	}
	
	
	//collection of both cars and latest cars
	public static void collectionOfBothCars() {
		 try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
			  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			  
			  PreparedStatement pstmt1=con.prepareStatement("select * from cars_project.cars");
			   ResultSet rs1= pstmt1.executeQuery();
			   
			   System.out.println();
			   System.out.println("=====Collection Of  cars=====");
			   System.out.println();
			   
			   while (rs1.next()) {
				System.out.println(rs1.getInt(1)+" "+rs1.getString(2)+" "+rs1.getString(3)+" "+rs1.getString(4));
			  }
			 
			   System.out.println();
			  
			  PreparedStatement pstmt=con.prepareStatement("select * from cars_project.latestcars");
			   ResultSet rs= pstmt.executeQuery();
			   
			   System.out.println();
			   System.out.println("=====Collection Of latest cars=====");
			   System.out.println();
			   
			   while (rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			  }
			 
			   System.out.println();
			   
			  
	     }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
	}
	
	public static void deleteFromlatestCars() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the car Number of record you want to delete");
		carNo=sc.nextInt();
		sc.nextLine();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			
			PreparedStatement stmt=con.prepareStatement("delete from cars_project.latestcars where CarNo=?");
			stmt.setInt(1, carNo);
			
			stmt.executeUpdate();
			
			System.out.println();
			System.out.println("<--record deleted successfully-->");
			System.out.println();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//main menu
	public static void mainMenu() {
     
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("=========Welcome to Car World=======");
			System.out.println("Press 1 to insert records in Latest_cars table");
			System.out.println("Press 2 to insert records in  Cars table");
			System.out.println("Press 3 to Update records in Both table");
			System.out.println("Press 4 to See collection Of Latest cars table");
			System.out.println("Press 5 to See collection of Cars And Latest cars table");
			System.out.println("Press 6 to delete records from latest cars");
			System.out.println("Press 0 to Exit");
			
			int x=sc.nextInt();
			sc.nextLine();
			switch(x) {
			case 1:
				insertIntoLatestCars();
				break;
			case 2:
				insertIntoCars();
				break;
			case 3:
				updateRecords();
				break;
			case 4:
				collectionLatestCars();
				break;
			case 5:
				collectionOfBothCars();
				break;
			case 6:
				deleteFromlatestCars();
				break;
			case 0:
				thankYou();
				System.exit(0);
				break;
			default :
				System.out.println("invalid input... Plz Try again..!!");
				mainMenu();
			}
		}
	}
	//main Method-->
	public static void main(String[] args) {
		
		mainMenu();
	}

}
