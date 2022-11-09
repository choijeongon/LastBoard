package com.ssafy.lastboard.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.lastboard.user.model.dto.UserDTO;
import com.ssafy.lastboard.user.model.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;

	@PostMapping("/signup")
	public ResponseEntity<String> signUp(@RequestBody UserDTO userDto){
		try {
			userService.signUp(userDto);
			return new ResponseEntity<String>("success", HttpStatus.OK);
		} catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("fail", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/list")
	public ResponseEntity<List<UserDTO>> selectAll() throws Exception{
		System.out.println("회원가입 컨트롤러 들어옴!!!!!!!!");
		List<UserDTO> userList = userService.selectAll();
		return new ResponseEntity<List<UserDTO>>(userList, HttpStatus.OK);
	}
}
