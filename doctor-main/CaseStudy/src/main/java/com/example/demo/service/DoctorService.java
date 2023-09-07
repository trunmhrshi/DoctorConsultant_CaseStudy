package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Doctor;
import com.example.demo.exception.*;

public interface DoctorService {
	public Doctor registerDoctor(Doctor Doctor);
	public Doctor updateDoctor(Doctor Doctor);
	public Doctor deleteDoctor(int empid) throws DoctorNotFoundException;
	public Doctor getDoctor(int empid) throws DoctorNotFoundException;
	public List<Doctor> getDoctors();
}
