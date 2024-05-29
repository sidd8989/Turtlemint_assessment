package org.example.com.turtlemint.assessment.service;

import com.turtlemint.assessment.entity.Doctor;
import com.turtlemint.assessment.repository.DoctorRepository;
import org.springframework.stereotype.Service;

@Service
public class DoctorService extends BaseService<Doctor, Long> {
    public DoctorService(DoctorRepository repository) {
        super(repository);
    }
}
