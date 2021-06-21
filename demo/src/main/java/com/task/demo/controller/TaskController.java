package com.task.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.task.demo.entity.Task;
import com.task.demo.service.TaskService;

@RestController
@RequestMapping("task")
public class TaskController {
	
	@Autowired
	private TaskService taskService;
	
	@PostMapping("/save-Details")
	public String saveDetails(@RequestBody Task task) {
		return taskService.saveDetails(task);
	}
	
	

}
