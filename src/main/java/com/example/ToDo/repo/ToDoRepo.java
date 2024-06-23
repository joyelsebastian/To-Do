package com.example.ToDo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ToDo.model.ToDo;

@Repository
public interface ToDoRepo extends JpaRepository<ToDo, Long> {

}
