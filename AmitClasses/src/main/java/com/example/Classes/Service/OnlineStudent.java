package com.example.Classes.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Classes.Entity.EntityForStudent;
import com.example.Classes.Repository.StudentRepository;

@Service
public class OnlineStudent implements StudentService {
	@Autowired
	StudentRepository repo;

	@Override
	public String saveStudent(EntityForStudent s) {
		repo.save(s);
		return s.getName() + " are added in Amit institute";
	}

	@Override
	public String deleteStudent(int id) {
		repo.deleteById(id);
		return "deleted";
	}

	@Override
	public String updateStudent(EntityForStudent s, int id) {

		Optional<EntityForStudent> opt = repo.findById(id); // student detail present or not , if present inject in opt
															// and if not present opt is empty

		if (opt.isPresent()) // chek opt is empty or student detail present , if is present then get student
								// all detail and inject in s1
		{
			EntityForStudent s1 = opt.get();
			s1.setName(s.getName());
			s1.setAge(s.getAge());
			s1.setAadhhar(s.getAadhhar());
			s1.setBranch(s.getBranch());
			s1.setCollage(s.getCollage());

			repo.save(s1);
			return s1.getName() + " are updated.";
		}
		return "you enter wrong id";
	}

	@Override
	public EntityForStudent getStudent(int id) {

		return repo.findById(id).orElse(null);
	}

	@Override
	public List<EntityForStudent> getAllStudent() {
		// TODO Auto-generated met
		
		return repo.findAll();
	}

}
