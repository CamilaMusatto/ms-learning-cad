package br.com.cmarchi.dto.response;

import java.util.UUID;

public class StudentIdResponse {

    private UUID studentId;

    public StudentIdResponse(){

    }

    public StudentIdResponse(UUID studentId){
        this.studentId = studentId;
    }

    public UUID getStudentId() {
        return studentId;
    }

    public void setStudentId(UUID studentId) {
        this.studentId = studentId;
    }
}
