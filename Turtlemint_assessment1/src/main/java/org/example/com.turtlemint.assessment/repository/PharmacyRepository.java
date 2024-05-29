package org.example.com.turtlemint.assessment.repository;


import com.turtlemint.assessment.entity.Pharmacy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PharmacyRepository extends JpaRepository<Pharmacy, Long> {
}

