package com.oxyloans.service;

import java.util.List;

import com.oxyloans.to.TaskTO;

public interface TaskManagerService {

	public void addTask(TaskTO task) throws Exception;

	public List<TaskTO> getTaskList() throws Exception;

	public TaskTO endTask(long taskId)throws Exception;

	public TaskTO getTask(long taskId) throws Exception;

	public void updateTask(TaskTO task)throws Exception;

}
