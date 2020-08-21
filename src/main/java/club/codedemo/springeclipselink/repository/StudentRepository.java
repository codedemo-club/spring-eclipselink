package club.codedemo.springeclipselink.repository;

import club.codedemo.springeclipselink.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}