package com.joaocastro.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaocastro.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
