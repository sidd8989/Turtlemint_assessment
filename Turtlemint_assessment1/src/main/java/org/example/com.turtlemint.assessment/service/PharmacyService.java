package org.example.com.turtlemint.assessment.service;

import com.turtlemint.assessment.entity.Pharmacy;
import com.turtlemint.assessment.repository.PharmacyRepository;
import org.springframework.stereotype.Service;

@Service
public class PharmacyService extends BaseService<Pharmacy, Long> {
    public PharmacyService(PharmacyRepository repository) {
        super(repository);
    }
}
