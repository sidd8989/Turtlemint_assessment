package org.example.com.turtlemint.assessment.entity;

import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Pharmacy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String location;

    @OneToMany(mappedBy = "pharmacy")
    private List<Inventory> inventories;

    @ManyToMany
    @JoinTable(
            name = "prescription_pharmacy",
            joinColumns = @JoinColumn(name = "pharmacy_id"),
            inverseJoinColumns = @JoinColumn(name = "prescription_id")
    )
    private List<Prescription> prescriptions;
}

