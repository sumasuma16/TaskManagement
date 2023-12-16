package com.jsp.TaskManagement.REPOSITORY;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.TaskManagement.DTO.Task;

public interface TaskRepository extends JpaRepository<Task, Integer>
{
}