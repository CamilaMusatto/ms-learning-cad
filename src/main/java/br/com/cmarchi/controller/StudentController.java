package br.com.cmarchi.controller;

import br.com.cmarchi.domain.Student;
import br.com.cmarchi.dto.request.StudentRequestDto;
import br.com.cmarchi.dto.response.StudentIdResponse;
import br.com.cmarchi.http.StudentDto;
import br.com.cmarchi.service.StudentService;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Tag(name = "Student", description = "Endpoints for managing students")
@RestController
@RequestMapping("/api/v1")
public class StudentController {

    @Autowired
    private StudentService service;

    @Operation(summary = "Create student", description = "Create a student", tags = {"Student"},
    responses = {
            @ApiResponse(description = "Sucess", responseCode = "200", content = {
                    @Content (mediaType = "application/json",
                    schema = @Schema (implementation = StudentIdResponse.class))
            })
    })
    @PostMapping(value = "/student", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StudentIdResponse> createStudent(@RequestBody StudentRequestDto studentRequestDto) throws JsonProcessingException {

        return ResponseEntity.status(HttpStatus.CREATED).body(service.createStudentResult(studentRequestDto));

    }

    @Operation(summary = "Search students", description = "Get student by studentId", tags = {"Student"},
            responses = {
                    @ApiResponse(description = "Sucess", responseCode = "200",
                            content = @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = StudentDto.class))
                    )
            })
    @GetMapping(value = "/student", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StudentDto> searchStudent(@RequestParam(value = "studentId") UUID studentId){

        return ResponseEntity.ok(service.searchStudent(studentId));
    }


}
