package singleton;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//Are these red herrings? otherwise it looks like we would have to do a proper jdbc connection and then do statements to sql but we haven't gotten there yet
//tried to keep scope small


//static classes must be nested
public class Singleton {
	private volatile static Singleton instance;
	private static Connection conn = null;
	
	//connection objects must be placed in try blocks, seeing as we are doing jdbc next I assumed a connection pattern I've used in the past
	private Singleton() {
		try {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection("port", "user", "pass");
	
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
		//I used the double checked locking from yesterday to fix the constructor
		public static Singleton getInstance() {
			if(instance == null) {
				synchronized (Singleton.class) {
					if (instance == null) {
						instance = new Singleton();
					}
				}
			}
			return instance;
		}	
	
		public Connection getConnection() {
	        return conn;
	    }
}
