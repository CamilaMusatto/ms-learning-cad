package br.com.cmarchi.dto.request;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.UUID;

public class StudentRequestDto {

    private String firstName;
    private String lastName;
    private String document;
    private LocalDate birthdate;
    private UUID courseId;

    public StudentRequestDto(){}

    public StudentRequestDto(String firstName, String lastName, String document, String birthdate, UUID courseId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.document = document;
        this.birthdate = convertStringToLocalDate(birthdate) ;
        this.courseId = courseId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public UUID getCourseId() {
        return courseId;
    }

    public void setCourseId(UUID courseId) {
        this.courseId = courseId;
    }

    private LocalDate convertStringToLocalDate(String birthdate){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.parse(birthdate, formato);

    }
}
