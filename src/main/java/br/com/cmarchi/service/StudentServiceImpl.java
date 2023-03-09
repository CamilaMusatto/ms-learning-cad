package br.com.cmarchi.service;

import br.com.cmarchi.client.CourseClient;
import br.com.cmarchi.domain.Student;
import br.com.cmarchi.dto.request.StudentRequestDto;
import br.com.cmarchi.dto.response.StudentIdResponse;
import br.com.cmarchi.http.CourseDto;
import br.com.cmarchi.http.StudentDto;
import br.com.cmarchi.kafka.ProducerKafka;
import br.com.cmarchi.model.CreatedStudentEvent;
import br.com.cmarchi.repositories.StudentRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.UUID;

@Service
public class StudentServiceImpl implements StudentService {


    CourseClient client;
    StudentRepository repository;

    ProducerKafka producer;

    public StudentServiceImpl(CourseClient client, StudentRepository repository, ProducerKafka producer) {
        this.client = client;
        this.repository = repository;
        this.producer = producer;
    }

    @Override
    public StudentIdResponse createStudentResult(StudentRequestDto studentRequestDto) throws JsonProcessingException {
        List<CourseDto> courses = client.buscaPeloCourseId(studentRequestDto.getCourseId());

        if(courses.size() == 1){
            Student student = new Student(studentRequestDto.getFirstName(), studentRequestDto.getLastName(),
                    studentRequestDto.getDocument(), studentRequestDto.getBirthdate(), studentRequestDto.getCourseId());
            repository.save(student);
            producer.send(studentEventBuilder(student));
            return new StudentIdResponse(student.getStudentId());

            //return savedStudent.getStudentId().toString();

        } else {
            //System.out.println(courses);

           throw new RuntimeException("Deu errado");

        }

    }

    @Override
    public StudentDto searchStudent(UUID studentId){

        Student student = repository.findByStudentId(studentId);
        String courseName = client.buscaPeloCourseId(student.getCourseId()).get(0).getCourseName();

        String fullName = String.format("%s %s", student.getFirstName(), student.getLastName());

        StudentDto studentDto = new StudentDto(fullName, student.getDocument(), student.getBirthdate(), courseName, student.isStatus());

        return studentDto;

    }

    private CreatedStudentEvent studentEventBuilder(Student student){
         return new CreatedStudentEvent(student.getStudentId(),
                student.getFirstName() + " " + student.getLastName(),
                student.getCourseId());

    }


}
