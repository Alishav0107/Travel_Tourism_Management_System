package tourism.managementSystem;

import java.sql.*;

public class Conn {
	
	Connection c;
	Statement s;
	
	
	Conn(){
     try {
    	Class.forName("com.mysql.cj.jdbc.Driver"); 
    	c=DriverManager.getConnection("jdbc:mysql:///travelManagementSystem","root","ameesha@123");
    	s=c.createStatement();
     }catch(Exception e) {
    	 e.printStackTrace();
     }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void add(String string) {
		// TODO Auto-generated method stub
		add(string);
	}

}
