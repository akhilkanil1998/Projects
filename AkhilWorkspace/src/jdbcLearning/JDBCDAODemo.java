package jdbcLearning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCDAODemo {
	public static void main(String[] args) throws Exception {
		StudentDAO studentDAO = new StudentDAO();
		studentDAO.insertData(8, "Kathir", 65);
	}
}

class StudentDAO {
	public Student getStudent(int rollNo) throws Exception {
		Student s = new Student();
		s.rollNo = rollNo;
		String url = "jdbc:mysql://127.0.0.1:3306/school";
		String user = "root";
		String password = "root";
		String sql = "Select * from student where rollNo=?";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url, user, password);
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1, s.rollNo);
		ResultSet rs = statement.executeQuery();
		rs.next();
		s.studentName = rs.getString("studentName");
		s.marks = rs.getInt("marks");
		System.out.println(s.rollNo + " " + s.studentName + " " + s.marks);
		return s;
	}
	
	public void insertData(int rollNo,String studentName, int marks) throws Exception
	{
		String url = "jdbc:mysql://127.0.0.1:3306/school";
		String user = "root";
		String password = "root";
		String sql = "insert into student values(?,?,?)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url, user, password);
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1, rollNo);
		statement.setString(2, studentName);
		statement.setInt(3, marks);
		
		statement.executeUpdate();
		statement.close();
		connection.close();
		
	}
}

class Student {
	int rollNo;
	String studentName;
	int marks;
}
