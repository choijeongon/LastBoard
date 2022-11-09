package com.ssafy.lastboard.user.model.mapper;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.lastboard.user.model.dto.UserDTO;

@Mapper
public interface UserMapper {
	
	public List<UserDTO> selectAll() throws SQLException;
	
	public void singUp(UserDTO userDto) throws SQLException;
}
