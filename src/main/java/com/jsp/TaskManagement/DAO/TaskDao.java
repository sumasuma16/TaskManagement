package com.jsp.TaskManagement.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.TaskManagement.DTO.Task;
import com.jsp.TaskManagement.REPOSITORY.TaskRepository;

@Repository

public class TaskDao 
{
	@Autowired
   TaskRepository repository;
	
	//to perform insertion
	public String insertTask(Task t)
	{
		repository.save(t);// inbuilt method present in taskRepository
		return "Task Added Successfully........";
	}
	//..... TaskDao class....
	// to find a task based on id
	public Task serachTask(int id)
	{
		Optional<Task> opt= repository.findById(id);
		if(opt.isPresent())
		{
			return opt.get();
		}
		return null;
		
	}
	// retirve all  Task objects  from DB
	public List<Task> getAllTask()
	{
	   return repository.findAll()	;
	}
	// update title and status based on id
	public Task updateTask(int id, String newtitle, String newstatus)
	{
	 Task t=serachTask(id);
	 if(t!=null)
	 {
		 t.setTitle(newtitle);
		 t.setStatus(newstatus);
	 }
	 return null;
	}
	public void  deleteTask(int id)
	{
	   Task t=serachTask(id);
	   if(t!=null)
	   {
		   repository.deleteById(id);
	   }
	}
	
}
