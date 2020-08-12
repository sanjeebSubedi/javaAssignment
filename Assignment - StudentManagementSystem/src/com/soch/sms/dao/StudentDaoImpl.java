package com.soch.sms.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.soch.sms.dto.StudentDto;
import com.soch.sms.util.DbUtil;

public class StudentDaoImpl implements StudentDao {
	PreparedStatement ps = null;
	@Override
	public void saveStudentInfo(StudentDto studentDto) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO students(name, college, roll, email, dob, address, gender, subject, departments) values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
		ps = DbUtil.getConnection().prepareStatement(sql);
		ps.setString(1, studentDto.getName());
		ps.setString(2, studentDto.getCollege());
		ps.setInt(3, studentDto.getRoll());
		ps.setString(4, studentDto.getEmail());
		ps.setDate(5, new java.sql.Date(studentDto.getDob().getTime()));
		ps.setString(6, studentDto.getAddress());
		ps.setString(7, studentDto.getGender());
		ps.setString(8, studentDto.getSubject());
		ps.setString(9, studentDto.getDepartments());
		ps.executeUpdate();
	}

	@Override
	public void updateStudentInfo(StudentDto studentDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStudentInfo(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public StudentDto getStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentDto> getAllStudentInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
