package com.spring.restspring.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.restspring.entities.UserData;

@Service
public class UserServiceImpl implements UserService {
   
	List<UserData> ls;
	public UserServiceImpl()
	{
		ls=new ArrayList<>();
		ls.add(new UserData(1,"apoorv","moradabad"));
		ls.add(new UserData(2,"ankit","dehradun"));
		ls.add(new UserData(3,"ankur","amritsar"));

	}
	
	
	public List<UserData> getuserdata() {
		// TODO Auto-generated method stub
		return ls;
	}
	public UserData getuserdata(int id)
	{
		UserData u=null;
		for(UserData us:ls)
		{
			if(us.getId()==id)
			{
				u=us;
				break;
			}
		}
		return u;
	}


	@Override
	public List<UserData> adduserdata(UserData us) {
		// TODO Auto-generated method stub
		 ls.add(us);
		 return ls;
	}


	@Override
	public List<UserData> deleteuserdata(UserData us) {
		// TODO Auto-generated method stub
		for(UserData u:ls)
		{
			if(u.getId()==us.getId())
			{
				ls.remove(us);
				break;
			}
		}
		return ls;
	}


}
