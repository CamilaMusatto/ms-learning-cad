package br.com.cmarchi.service;

import br.com.cmarchi.domain.Student;
import br.com.cmarchi.http.StudentDto;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.UUID;

public interface StudentService {


    String createStudentResult(Student student) throws JsonProcessingException;

    StudentDto searchStudent(UUID studentId);
}
