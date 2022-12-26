package com.spring.restspring.services;
import java.util.List;

import com.spring.restspring.entities.UserData;

public interface UserService {
	List<UserData> getuserdata();
	UserData getuserdata(int id);
	List<UserData> adduserdata(UserData us);
	List<UserData> deleteuserdata(UserData us);

}
