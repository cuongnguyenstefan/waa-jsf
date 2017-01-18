package edu.mum.waa.service;

import org.springframework.stereotype.Service;

import edu.mum.waa.model.User;

@Service
public class LoginServiceImpl implements LoginService {
	
	public boolean login(User user) {
		if ("admin".equals(user.getUsername()) && "test123".equals(user.getPassword())) {
			return true;
		}
		if ("cuong".equals(user.getUsername()) && "test".equals(user.getPassword())) {
			return true;
		}
		if ("stefan".equals(user.getUsername()) && "test".equals(user.getPassword())) {
			return true;
		}
		return false;
	}
	
}
