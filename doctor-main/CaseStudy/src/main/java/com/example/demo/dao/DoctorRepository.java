package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Doctor;
@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Integer> {

}
