package com.ie.enrolment_service;

import org.apache.coyote.Response;
import org.springframework.stereotype.Service;

@Service
public class EnrolmentService {
    private final EnrolmentRepository enrolmentRepository;

    public EnrolmentService(EnrolmentRepository enrolmentRepository) {
        this.enrolmentRepository = enrolmentRepository;
    }

    public Enrolment add(Enrolment enrolmentInput) {
        Enrolment newEnrolment = enrolmentRepository.save(enrolmentInput);
        return newEnrolment;
    }

    public Enrolment get(String id) {
        return enrolmentRepository.findById(id);
    }

    public Response delete(String id) {
        Response response = enrolmentRepository.remove(enrolmentRepository.findById(id));
        return response;
    }
}
