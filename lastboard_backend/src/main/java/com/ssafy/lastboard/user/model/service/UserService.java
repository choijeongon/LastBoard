package com.ssafy.lastboard.user.model.service;

import java.util.List;

import com.ssafy.lastboard.user.model.dto.UserDTO;

public interface UserService {
	public List<UserDTO> selectAll() throws Exception;
	
	public void signUp(UserDTO userDto) throws Exception;
}
