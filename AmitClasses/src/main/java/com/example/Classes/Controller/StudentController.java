package com.example.Classes.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Classes.Entity.DTO;
import com.example.Classes.Entity.EntityForStudent;
import com.example.Classes.Service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService service;

	@PostMapping("save")
	public String save(@RequestBody DTO s) {

		return service.saveStudent(s);

	}

	@DeleteMapping("delete/{id}")
	public String delete(@PathVariable int id) {
		return service.deleteStudent(id);

	}

	@PutMapping("update/{id}")
	public String update(@RequestBody EntityForStudent s, @PathVariable int id) {

		return service.updateStudent(s, id);
	}

	@GetMapping("get/{id}")
	public EntityForStudent getStudent(@PathVariable int id) {
		return service.getStudent(id);

	}

	@GetMapping("getAll")
	public List<EntityForStudent> getAll() {
		return service.getAllStudent();
		
	}
}
