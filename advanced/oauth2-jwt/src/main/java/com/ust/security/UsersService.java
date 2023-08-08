package com.ust.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UsersService implements UserDetailsService {
	
	 @Autowired
	   UserRepository ur;

	   @Override
	   public UsersHelper loadUserByUsername(final String username) throws UsernameNotFoundException {
	      UsersPojo usersPojo = null;
	      try {
//	    	  usersPojo = usersDBQuery.getUserDetails(username);
	    	  Optional<UsersPojo> temp = ur.findById(username);
	    	  
	    	  if(temp.isPresent())
	    	  {
	    		usersPojo=temp.get();  
	    	  }
	    	  else
	    		  throw new UsernameNotFoundException("User " + username + " was not found in the database");
	    	  UsersHelper userDetail = new UsersHelper(usersPojo);
	         return userDetail;
	      } catch (Exception e) {
	         e.printStackTrace();
	         throw new UsernameNotFoundException("User " + username + " was not found in the database");
	      }
	   }

}