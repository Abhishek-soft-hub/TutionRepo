package com.example.Classes.Service;

import java.util.List;

import com.example.Classes.Entity.EntityForStudent;

public interface StudentService {

	public String saveStudent(EntityForStudent s);

	public String deleteStudent(int id);

	public String updateStudent(EntityForStudent s, int id);

	public EntityForStudent getStudent(int id);

	public List<EntityForStudent> getAllStudent();

}
