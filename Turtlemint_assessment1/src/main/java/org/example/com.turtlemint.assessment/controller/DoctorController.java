package org.example.com.turtlemint.assessment.controller;


import com.turtlemint.assessment.entity.Doctor;
import com.turtlemint.assessment.service.DoctorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctors")
public class DoctorController extends BaseController<Doctor, Long> {
    public DoctorController(DoctorService service) {
        super(service);
    }
}
