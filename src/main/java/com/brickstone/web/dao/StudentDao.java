package com.brickstone.web.dao;

import com.brickstone.web.model.Student;
import java.sql.*;

public class StudentDao {
	Student stud = new Student();
	public Student getStudent(int sid)
	{

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from studentdetails where sid="+ sid);
			if(rs.next())
			{
				stud.setSid(rs.getInt("sid"));
				stud.setSname(rs.getString("sname"));
				stud.setTech(rs.getString("tech"));
			}
			rs.close();
			st.close();
			con.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

		
		return stud;
	}
	

}
