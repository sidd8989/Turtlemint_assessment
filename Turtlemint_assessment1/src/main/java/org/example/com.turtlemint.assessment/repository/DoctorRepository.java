package org.example.com.turtlemint.assessment.repository;

import com.turtlemint.assessment.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
