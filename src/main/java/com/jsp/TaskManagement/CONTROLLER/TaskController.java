package com.jsp.TaskManagement.CONTROLLER;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.TaskManagement.DAO.TaskDao;
import com.jsp.TaskManagement.DTO.Task;

@RestController
public class TaskController
{
	 @Autowired
     TaskDao dao;
	 @PostMapping("/task") //end point 
	 public String addTask(@RequestBody Task t)
	 {
		 return dao.insertTask(t);
	 }
	 //................ TaskController class..........
	 @GetMapping("/task")
	 public Task findTask(@RequestParam int id)
	 {
		 return dao.serachTask(id);
	 }
	 @GetMapping("/findall")
	 public List<Task> findAll()
	 {
		return dao.getAllTask(); 
	 }
	  @PutMapping("/task")
	 public Task updateTask(@RequestParam int id,@RequestParam  String title,@RequestParam String status)
	 {
		 return dao.updateTask(id, title, status);
	 }
	  @DeleteMapping("/task")
	  public void deleteTask(@RequestParam int id)
	  {
		 dao.deleteTask(id) ;
	  }
	  
	 
}
 