package com.oxyloans.dao;

import org.springframework.data.repository.CrudRepository;

import com.oxyloans.model.AppUser;

public interface AppUserDAO extends CrudRepository<AppUser,Long>{

	public AppUser findAllByuserId(String username);

}
