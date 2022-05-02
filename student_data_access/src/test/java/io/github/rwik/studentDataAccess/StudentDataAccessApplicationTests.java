package io.github.rwik.studentDataAccess;

import io.github.rwik.studentDataAccess.entities.Student;
import io.github.rwik.studentDataAccess.repos.StudentRepos;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentDataAccessApplicationTests {

	@Autowired
	private StudentRepos studentRepository;

	@Test
	void testCreateStudent() {
		Student student = new Student();
		student.setName("Rajesh");
		student.setCourse("Java");
		student.setFee(1000.00);
		studentRepository.save(student);
	}

	@Test
	void testGetStudentByID() {
		Student student = studentRepository.findById(1).get();
		System.out.println(student);
	}



	@Test
	void testUpdateStudent() {
		Student student = studentRepository.findById(1).get();
		student.setFee(2000.00);
		studentRepository.save(student);
	}

	@Test
	void testDeleteStudent() {
		Student student = studentRepository.findById(1).get();
		studentRepository.delete(student);
	}
}



