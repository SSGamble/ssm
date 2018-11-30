package top.qingrang.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.qingrang.beans.Student;
import top.qingrang.dao.IStudentDao;
import top.qingrang.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private IStudentDao dao;

	@Override
	public void addStudent(Student student) {
		dao.insertStudent(student);
	}
}
