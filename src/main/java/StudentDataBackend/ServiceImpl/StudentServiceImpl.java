package StudentDataBackend.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import StudentDataBackend.Entity.Student;
import StudentDataBackend.Repository.StudentRepository;
import StudentDataBackend.Service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public Student addStudent(Student student) {
		Student save = studentRepository.save(student);
		return save;
	}

	@Override
	public List<Student> All() {
		return studentRepository.findAll();
	}

	@Override
	public boolean deletStudent(int id) {
		studentRepository.deleteById(id);
		return true;
	}

	@Override
	public Student findStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
