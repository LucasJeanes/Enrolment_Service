package com.ie.enrolment_service;

import org.springframework.boot.autoconfigure.mongo.MongoConnectionDetails;
import org.springframework.stereotype.Service;

@Service
public interface EnrolmentRepository extends MongoConnectionDetails {
}
