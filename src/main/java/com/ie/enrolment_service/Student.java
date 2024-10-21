package com.ie.enrolment_service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private String studentId;
    private String firstName;
    private String lastName;
    private String email;
    private String dateOfBirth;

}
