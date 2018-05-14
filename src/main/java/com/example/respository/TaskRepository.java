package com.example.respository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.task.controller.models.ToDoModel;

public interface TaskRepository extends MongoRepository<ToDoModel, String>{

}
