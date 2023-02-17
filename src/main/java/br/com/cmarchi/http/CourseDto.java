package br.com.cmarchi.http;

import java.util.UUID;

public class  CourseDto {

    private UUID courseId;
    private String courseName;

    public CourseDto(UUID courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public UUID getCourseId() {
        return courseId;
    }

    public void setCourseId(UUID courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
