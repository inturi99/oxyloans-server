package com.oxyloans.service;

import com.oxyloans.to.LoginUserTO;

public interface LoginService {

 public	LoginUserTO Gettoken(LoginUserTO user) throws Exception;

public boolean addUser(LoginUserTO user);

}
