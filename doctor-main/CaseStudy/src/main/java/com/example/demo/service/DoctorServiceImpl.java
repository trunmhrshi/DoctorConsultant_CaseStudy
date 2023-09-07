package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DoctorRepository;
import com.example.demo.entity.Doctor;
import com.example.demo.exception.DoctorNotFoundException;

@Service
public class DoctorServiceImpl implements DoctorService{

	@Autowired
	private DoctorRepository docRepo;
	
	@Override
	public Doctor registerDoctor(Doctor Doctor) {
		// TODO Auto-generated method stub
		return docRepo.save(Doctor);
	}

	@Override
	public Doctor updateDoctor(Doctor Doctor) {
		// TODO Auto-generated method stub
		return docRepo.save(Doctor);
	}

	@Override
	public Doctor deleteDoctor(int docid) throws DoctorNotFoundException {
		Optional<Doctor> docloyee = docRepo.findById(docid);
		
		Doctor doc = null;
		if(docloyee.isPresent()) {
			docRepo.deleteById(docid);
			doc = docloyee.get();
		}else {
			throw new DoctorNotFoundException("No such docloyee");
		}
		return doc;
	}

	@Override
	public Doctor getDoctor(int docid) throws DoctorNotFoundException {
		Optional<Doctor> docloyee = docRepo.findById(docid);
		Doctor doc = null;
		if(docloyee.isPresent()) {
			doc = docloyee.get();
		}else {
			throw new DoctorNotFoundException("No such docloyee");
		}
		return doc;
	}

	@Override
	public List<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		return docRepo.findAll();
	}

}
