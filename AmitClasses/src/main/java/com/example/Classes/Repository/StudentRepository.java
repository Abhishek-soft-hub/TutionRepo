package com.example.Classes.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Classes.Entity.EntityForStudent;

public interface StudentRepository extends JpaRepository<EntityForStudent, Integer> {

}
