package jdbcLearning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 * Helps to connect java application with db. Steps: 1) import package -->
 * java.sql 2) load and register the driver --> com.mysql.jdbc.Driver 3) Create
 * connection --> Connection. 4) Create a statement. 5) Execute the query. 6)
 * Process the results. 7) Close.
 * 
 * @author Akhil K Anil
 *
 */
public class JDBCDemo {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://127.0.0.1:3306/school";
		String user = "root";
		String password = "root";
		int noOfStudentsToBeAdded;
		int rollNo;
		String studentName;
		int marks;
		Scanner scan = new Scanner(System.in);

		String query = "insert into student values(?,?,?)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url, user, password);
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		System.out.println("Enter the no of students to be added: ");
		noOfStudentsToBeAdded = scan.nextInt();

		for (int i = 0; i < noOfStudentsToBeAdded; i++) {
			System.out.println("Enter the rollNo: ");
			rollNo = scan.nextInt();
			scan.nextLine();
			System.out.println("Enter the Name: ");
			studentName = scan.nextLine();
			System.out.println("Enter the Marks: ");
			marks = scan.nextInt();
			scan.nextLine();
			preparedStatement.setInt(1, rollNo);

			preparedStatement.setString(2, studentName);

			preparedStatement.setInt(3, marks);
			preparedStatement.executeUpdate();
		}
		scan.close();
		preparedStatement.close();

		connection.close();
	}

}
