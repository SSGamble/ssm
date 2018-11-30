package top.qingrang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import top.qingrang.beans.Student;
import top.qingrang.service.IStudentService;

@Controller
@RequestMapping("")	//命名空间
public class StudentController{

	@Autowired
//	@Qualifier("studentService")
	private IStudentService service;

	@RequestMapping("register.do")
	public String doRegister(String name, int age){
		Student student = new Student(name, age);
		service.addStudent(student);
		return "welcome";
	}
}
