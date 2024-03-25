package Myjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Myperform {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "root");
		PreparedStatement preparedStatement = connection.prepareStatement("create database Practice");
		boolean b = preparedStatement.execute();
		System.out.println("Done");

		// Class.forName("com.mysql.cj.jdbc.Driver");
		// Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "root");
		// PreparedStatement preparedStatement=connection.prepareStatement("create table devu(id integer primary key,name varchar(20) not null)");
		// int b=preparedStatement.executeUpdate();
		// System.out.println("Done");

		// Class.forName("com.mysql.cj.jdbc.Driver");
		// Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "root");
		// PreparedStatement preparedStatement=connection.prepareStatement("insert into devu values(3,'shivaraj')");
		// int b=preparedStatement.executeUpdate();
		// System.out.println("Done");

		// Class.forName("com.mysql.cj.jdbc.Driver");
		// Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "root");
		// PreparedStatement preparedStatement = connection.prepareStatement("select * from devu where name='shivaraj'");

		// ResultSet r = preparedStatement.executeQuery();
		// r.next();
		// System.out.println(r.getInt(1));
		//  System.out.println(r.getString(2));
		
		// Class.forName("com.mysql.cj.jdbc.Driver");
		// Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
		// PreparedStatement preparedStatement=connection.prepareStatement("select * from devu");
		// ResultSet resultSet=preparedStatement.executeQuery();
		// while(resultSet.next()) {
		// 	System.out.println(resultSet.getInt(1));
		// 	System.out.println(resultSet.getString(2));
		// }
	}
}
