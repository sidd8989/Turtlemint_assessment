package org.example.com.turtlemint.assessment.controller;

import com.turtlemint.assessment.entity.Patient;
import com.turtlemint.assessment.service.PatientService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patients")
public class PatientController extends BaseController<Patient, Long> {
    public PatientController(PatientService service) {
        super(service);
    }
}
