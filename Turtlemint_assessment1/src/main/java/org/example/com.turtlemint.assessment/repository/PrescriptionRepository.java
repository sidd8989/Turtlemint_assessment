package org.example.com.turtlemint.assessment.repository;


import com.turtlemint.assessment.entity.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrescriptionRepository extends JpaRepository<Prescription, Long> {
}
