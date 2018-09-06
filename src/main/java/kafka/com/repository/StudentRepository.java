package kafka.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kafka.com.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
