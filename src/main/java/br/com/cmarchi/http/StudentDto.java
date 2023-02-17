package br.com.cmarchi.http;

public class StudentDto {

    private String fullName;
    private String document;

    //private Date birthday;
    private String courseName;

    private boolean isActive;

    public StudentDto(String fullName, String document, String courseName, boolean isActive) {
        this.fullName = fullName;
        this.document = document;
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
