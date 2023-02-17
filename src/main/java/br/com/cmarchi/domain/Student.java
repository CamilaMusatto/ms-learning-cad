package br.com.cmarchi.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@Document
public class Student {

    @Id
    private String id;
    private UUID studentId;
    private String firstName;
    private String lastName;
    private String document;
    //private Date birthdate;
    private UUID courseId;
    private boolean status;
    private LocalDateTime createdOn;

    public Student( String firstName, String lastName, String document, /*Date birthdate , */ UUID courseId) {
        this.studentId = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.document = document;
        //this.birthdate = birthdate;
        this.courseId = courseId;
        this.status = true;
        this.createdOn = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UUID getStudentId() {
        return studentId;
    }

    public void setStudentId(UUID studentId) {
        this.studentId = studentId;
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

   /* public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }  */


    public UUID getCourseId() {
        return courseId;
    }

    public void setCourseId(UUID courseId) {
        this.courseId = courseId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }
}
