package br.com.cmarchi.service;

import br.com.cmarchi.domain.Student;
import br.com.cmarchi.dto.request.StudentRequestDto;
import br.com.cmarchi.dto.response.StudentIdResponse;
import br.com.cmarchi.dto.response.StudentResponseDto;
import br.com.cmarchi.http.StudentDto;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.UUID;

public interface StudentService {


    StudentIdResponse createStudentResult(StudentRequestDto studentRequestDto) throws JsonProcessingException;

    StudentDto searchStudent(UUID studentId);
}
