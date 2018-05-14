package com.example.task.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.respository.TaskRepository;
import com.example.task.controller.models.ToDoModel;
import org.springframework.http.HttpStatus;

@RestController
public class TaskController {
	
	@Autowired
	TaskRepository taskRepository;
	
	List<ToDoModel> todoList = new ArrayList<>();
	
	AtomicLong count = new AtomicLong(0); 
	
	
	@RequestMapping(value="/newTask/", method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public Map<String, String> newTask(@RequestBody ToDoModel todo){
		long id=count.incrementAndGet();
		todo.setId("SKYNET-"+String.valueOf(id));
		taskRepository.save(todo);
		Map<String, String> message = new HashMap<>();
		message.put("Message", "New task added with ID ["+id+"]");
		return message;
	}
	
	@RequestMapping(value="/deleteTask/{id}", method=RequestMethod.DELETE)
	public Map<String, String> deleteTask(){
		Map<String, String> message = new HashMap<>();
		message.put("message", "hello world!!");
		return message;
	}
	
	@RequestMapping(value="/getAllTasks", method=RequestMethod.GET)
	public List<ToDoModel> getAllTasks(){
		
		return taskRepository.findAll();
	}
	
	@RequestMapping(value="/getTask/{id}", method=RequestMethod.GET)
	public Map<String, String> getTaskById(){
		Map<String, String> message = new HashMap<>();
		message.put("message", "hello world!!");
		return message;
	}

}
