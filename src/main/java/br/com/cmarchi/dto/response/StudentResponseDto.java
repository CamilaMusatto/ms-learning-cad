package br.com.cmarchi.dto.response;

import java.time.LocalDate;

public class StudentResponseDto {

    private String fullName;
    private String document;
    private LocalDate birthdate;
    private String courseName;
    private boolean isActive;


    public StudentResponseDto() {
    }

    public StudentResponseDto(String fullName, String document, LocalDate birthdate, String courseName, boolean isActive) {
        this.fullName = fullName;
        this.document = document;
        this.birthdate = birthdate;
        this.courseName = courseName;
        this.isActive = isActive;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
