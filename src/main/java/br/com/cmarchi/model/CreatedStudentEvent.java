package br.com.cmarchi.model;

import java.io.Serializable;
import java.util.UUID;

public class CreatedStudentEvent implements Serializable {
    private UUID studentId;
    private String fullName;
    private UUID courseId;

    public CreatedStudentEvent(UUID studentId, String fullName, UUID courseId) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.courseId = courseId;
    }

    public UUID getStudentId() {
        return studentId;
    }

    public void setStudentId(UUID studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public UUID getCourseId() {
        return courseId;
    }

    public void setCourseId(UUID courseId) {
        this.courseId = courseId;
    }

}
