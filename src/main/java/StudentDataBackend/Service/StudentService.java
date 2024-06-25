package StudentDataBackend.Service;

import java.util.*;

import StudentDataBackend.Entity.Student;

public interface StudentService {

	public Student addStudent(Student student);
	public List<Student> All();
	public boolean deletStudent(int id);
	public Student findStudentById(int id);
	
	
	
}
