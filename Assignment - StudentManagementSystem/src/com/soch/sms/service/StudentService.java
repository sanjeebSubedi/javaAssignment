package com.soch.sms.service;

import java.sql.SQLException;
import java.util.List;

import com.soch.sms.dto.StudentDto;

public interface StudentService {
	
public void saveStudentInfo(StudentDto studentDto) throws ClassNotFoundException, SQLException;
	
	public void updateStudentInfo(StudentDto studentDto);
	
	public List<StudentDto> getAllStudentInfo();
	
	public void deleteStudentInfo(int id);
	
	public StudentDto getStudentById(int id);

}
