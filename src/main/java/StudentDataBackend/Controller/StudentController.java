package StudentDataBackend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import StudentDataBackend.Entity.Student;
import StudentDataBackend.Service.StudentService;

@RestController
@CrossOrigin("*")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping("addStudent")
	public Student saveStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}
	
	@GetMapping("getStudent")
	public List<Student> getStudent() {
		return studentService.All();
	}
	
	
	@DeleteMapping("delet/{id}")
	public boolean deletStudent(@PathVariable("id") int id) {
		return studentService.deletStudent(id);
	}
	
	

}
