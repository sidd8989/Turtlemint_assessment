package org.example.com.turtlemint.assessment.controller;

import com.turtlemint.assessment.entity.Pharmacy;
import com.turtlemint.assessment.service.PharmacyService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pharmacies")
public class PharmacyController extends BaseController<Pharmacy, Long> {
    public PharmacyController(PharmacyService service) {
        super(service);
    }
}
