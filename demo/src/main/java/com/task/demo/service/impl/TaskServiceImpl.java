package com.task.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.demo.entity.Task;
import com.task.demo.repository.TaskRepo;
import com.task.demo.service.TaskService;

@Service
public class TaskServiceImpl implements TaskService {
	
	@Autowired
	private TaskRepo taskrepo;

	@Override
	public String saveDetails(Task task) {
		taskrepo.save(task);
		return "Success";
	}

}
