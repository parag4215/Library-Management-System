import java.sql.PreparedStatement;
import java.sql.*;
import java.util.Scanner;

public class LibraryService {

	Scanner sc = new Scanner(System.in);
	public void addbooks()throws Exception{
		System.out.println("Enter the book title");
		String title = sc.nextLine();
		System.out.println("Enter the name of Author");
		String author = sc.nextLine();
	}

	try (Connection conn = DatabaseUtil.getConnections()){
		
	String sql = "INSERT INTO BOOKS (title, author) values (?, ?)";
	PreparedStatement stmt = conn.PreparedStatement(sql);
	stmt.setString(1, title);
	stmt.setString(2, author);
	stmt.executeUpdate();
	System.out.println("Book added successfully!");


	}
	
}
