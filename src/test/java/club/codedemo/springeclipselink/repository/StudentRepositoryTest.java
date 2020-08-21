package club.codedemo.springeclipselink.repository;

import club.codedemo.springeclipselink.entity.Student;
import net.bytebuddy.utility.RandomString;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    StudentRepository studentRepository;

    @Test
    void save() {
        Student student = new Student();
        student.setName(RandomString.make(4));
        this.studentRepository.save(student);
    }
}