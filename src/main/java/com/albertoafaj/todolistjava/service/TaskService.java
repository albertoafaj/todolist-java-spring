package com.albertoafaj.todolistjava.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.albertoafaj.todolistjava.model.Task;
import com.albertoafaj.todolistjava.repository.TaskRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TaskService {

  @Autowired
  private TaskRepository taskRepository;

  public Task createTask(Task task) {
    return taskRepository.save(task);
  }

}
