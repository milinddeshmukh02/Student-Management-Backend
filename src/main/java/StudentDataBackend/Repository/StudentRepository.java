package StudentDataBackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import StudentDataBackend.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
