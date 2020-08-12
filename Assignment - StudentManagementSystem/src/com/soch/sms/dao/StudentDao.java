package com.soch.sms.dao;

import java.sql.SQLException;
import java.util.List;

import com.soch.sms.dto.StudentDto;

public interface StudentDao {
	public void saveStudentInfo(StudentDto studentDto) throws ClassNotFoundException, SQLException;
	public void updateStudentInfo(StudentDto studentDto);
	public void deleteStudentInfo(int id);
	public StudentDto getStudentById(int id);
	public List<StudentDto> getAllStudentInfo();
}
