package org.example.com.turtlemint.assessment.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

public abstract class BaseController<T, ID> {
    private final BaseService<T, ID> service;

    public BaseController(BaseService<T, ID> service) {
        this.service = service;
    }

    @GetMapping
    public List<T> getAll() {
    return service.findAll();
    }



    @GetMapping("/{id}")
    public T getById(@PathVariable ID id) {
        return service.findById(id);
    }

    @PostMapping
    public T save(@RequestBody T entity) {
    return service.save(entity);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable ID id) {
        service.deleteById(id);
    }


}
