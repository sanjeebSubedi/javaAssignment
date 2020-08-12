package com.soch.sms.service;

import java.sql.SQLException;
import java.util.List;

import com.soch.sms.dao.StudentDao;
import com.soch.sms.dao.StudentDaoImpl;
import com.soch.sms.dto.StudentDto;

public class StudentServiceImpl implements StudentService {
	
	StudentDao studentDao = new StudentDaoImpl();

	@Override
	public void saveStudentInfo(StudentDto studentDto) throws ClassNotFoundException, SQLException {
		studentDao.saveStudentInfo(studentDto);
	}

	@Override
	public void updateStudentInfo(StudentDto studentDto) {
		studentDao.updateStudentInfo(studentDto);
	}

	@Override
	public List<StudentDto> getAllStudentInfo() {
		return studentDao.getAllStudentInfo();
	}

	@Override
	public void deleteStudentInfo(int id) {
		studentDao.deleteStudentInfo(id);
	}

	@Override
	public StudentDto getStudentById(int id) {
		return studentDao.getStudentById(id);
	}

}
