package com.task.demo.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.task.demo.entity.Task;

public interface TaskRepo extends JpaRepository<Task, UUID> {

	

}
