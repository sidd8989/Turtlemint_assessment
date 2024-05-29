package org.example.com.turtlemint.assessment.entity;

import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String medicalHistory;

    @OneToMany(mappedBy = "patient")
    private List<Prescription> prescriptions;
}
