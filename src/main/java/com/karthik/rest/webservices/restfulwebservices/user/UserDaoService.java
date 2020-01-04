package com.karthik.rest.webservices.restfulwebservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	private static List<User> users = new ArrayList<>();
	
	static {
	users.add(new User(1,"Karthi", new Date()));
	users.add(new User(2,"Karthi", new Date()));
	users.add(new User(3,"Karthi", new Date()));
		}

    public List<User> findAll(){
    	return users;
    }

    public User findOne(int uid){
    	
    	for(User user:users) {
    		
    		if(user.getUid()==uid)
    		{
    			return user;
    			
    		}
    		
    		
    	}
		return null;
    	
    	
    }

    

}
