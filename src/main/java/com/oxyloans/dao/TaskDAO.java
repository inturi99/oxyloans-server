package com.oxyloans.dao;

import org.springframework.data.repository.CrudRepository;

import com.oxyloans.model.Task;

public interface TaskDAO extends CrudRepository<Task,Long>{

}
