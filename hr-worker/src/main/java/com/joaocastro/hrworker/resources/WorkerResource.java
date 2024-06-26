package com.joaocastro.hrworker.resources;

import org.springframework.web.bind.annotation.RestController;

import com.joaocastro.hrworker.entities.Worker;
import com.joaocastro.hrworker.repositories.WorkerRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {

    @Autowired
    private WorkerRepository repository;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll() {
        List<Worker> list = repository.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id) {
        Worker objWorker = repository.findById(id).get();
        return ResponseEntity.ok(objWorker);
    }
}
