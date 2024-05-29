package org.example.com.turtlemint.assessment.entity;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class Prescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String medicine;
    private String dosage;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    @ManyToMany(mappedBy = "prescriptions")
    private List<Pharmacy> pharmacies;
}
