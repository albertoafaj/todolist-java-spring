package com.albertoafaj.todolistjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.albertoafaj.todolistjava.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}
