package com.ssafy.lastboard.user.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.lastboard.user.model.dto.UserDTO;
import com.ssafy.lastboard.user.model.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<UserDTO> selectAll() throws Exception {
		return userMapper.selectAll();
	}

	@Override
	public void signUp(UserDTO userDto) throws Exception {
		userMapper.singUp(userDto);
	}

}
