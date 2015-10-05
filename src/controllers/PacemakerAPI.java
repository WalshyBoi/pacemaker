package controllers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.google.common.base.Objects;

import models.User;

public class PacemakerAPI
{
	private Map<String, User> users = new HashMap<>();
	

 public void deleteUser(String email) 
 {
   users.remove(email);
 }

  public User createUser(String firstName, String lastName, String email, String password) 
  {
    User user = new User (firstName, lastName, email, password);
    users.put(email, user);
    return user;
  }

  public Collection<User> getUsers ()
  {
    return users.values();
  }

  
  
  
}