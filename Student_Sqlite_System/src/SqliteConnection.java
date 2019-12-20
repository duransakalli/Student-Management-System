import java.sql.*;
import javax.swing.*;

public class SqliteConnection {
	
	public static Connection ConnectDB()
	{
		String path = "C:/Users/Duran/eclipse-workspace/Student_Sqlite_System/Student.db";
		
		try {
			
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection("jdbc:sqlite:" + path);
			JOptionPane.showMessageDialog(null, "Database Connected");
			return conn;
		} catch (Exception e) 
		{
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
	}
	
	
}
