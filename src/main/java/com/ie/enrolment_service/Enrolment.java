package com.ie.enrolment_service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Enrolment {

    private String Enrolmentid;
    private String studentId;
    private String studentName;
    private String courseCode;
    private String enrollmentDate;

}
