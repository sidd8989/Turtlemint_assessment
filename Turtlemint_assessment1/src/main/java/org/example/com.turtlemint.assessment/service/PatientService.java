package org.example.com.turtlemint.assessment.service;

import com.turtlemint.assessment.entity.Patient;
import com.turtlemint.assessment.repository.PatientRepository;
import org.springframework.stereotype.Service;

@Service
public class PatientService extends BaseService<Patient, Long> {
    public PatientService(PatientRepository repository) {
        super(repository);
    }
}
