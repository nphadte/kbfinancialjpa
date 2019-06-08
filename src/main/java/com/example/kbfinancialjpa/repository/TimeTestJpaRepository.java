package com.example.kbfinancialjpa.repository;

import com.example.kbfinancialjpa.model.TimeTest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface  TimeTestJpaRepository extends JpaRepository<TimeTest,Long> {

    public List<TimeTest> findAll();

    public Optional<TimeTest> findById(Long Id);

}
