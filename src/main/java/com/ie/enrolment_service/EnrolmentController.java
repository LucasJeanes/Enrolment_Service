package com.ie.enrolment_service;

import org.apache.coyote.Response;
import org.springframework.web.bind.annotation.*;

@RestController
public class EnrolmentController {

    private EnrolmentService enrolmentService;

    public EnrolmentController(EnrolmentService enrolmentService) {
        this.enrolmentService = enrolmentService;
    }

    @PostMapping("/enrolment/add")
    public Enrolment addEnrolment(@RequestBody Enrolment enrolmentInput) {
        return enrolmentService.add(enrolmentInput);
    }

    @GetMapping("/enrolment/find/{id}")
    public Enrolment getEnrolment(@PathVariable String id) {
        return enrolmentService.get(id);
    }

    @GetMapping("/enrolment/delete/{id}")
    public Response deleteEnrolment(@PathVariable String id) {
        return enrolmentService.delete(id);
    }
}
