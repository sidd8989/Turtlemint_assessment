package org.example.com.turtlemint.assessment.repository;

import com.turtlemint.assessment.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
