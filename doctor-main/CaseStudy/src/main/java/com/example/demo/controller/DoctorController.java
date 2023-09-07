package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Doctor;
import com.example.demo.exception.DoctorNotFoundException;
import com.example.demo.service.DoctorService;

@RestController
@CrossOrigin(origins = "http://localhost", maxAge = 3600)
public class DoctorController {
	@Autowired
	private DoctorService doctorService;
	
	@PostMapping(value = "/register", consumes={MediaType.APPLICATION_JSON_VALUE})
	public Doctor registerDoctor(@Valid @RequestBody Doctor doctor) {
		return doctorService.registerDoctor(doctor);
	}
	
	@PutMapping(value = "/update",consumes={MediaType.APPLICATION_JSON_VALUE})
	public Doctor updateDoctor(@RequestBody @Valid Doctor doctor) {
		return doctorService.updateDoctor(doctor);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public Doctor deleteDoctor(@PathVariable("id") int empid) throws DoctorNotFoundException {
		return doctorService.deleteDoctor(empid);
	}
	
	@GetMapping(value = "/get/{id}")
	public Doctor getDoctor(@PathVariable("id") int empid) throws DoctorNotFoundException{
		return doctorService.getDoctor(empid);
	}
	
	@GetMapping(value = "/getAll")
	public List<Doctor> getDoctors() {
		return doctorService.getDoctors();
	}
}
