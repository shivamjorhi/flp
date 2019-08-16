package com.cg.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entities.PasswordEntity;
import com.cg.service.passwordService;


@RestController
@RequestMapping("/password")
public class PasswordController {
@Autowired passwordService service;
	
	
	@PostMapping(value = "/change", consumes = { "application/json" })
	public String changePassword(@RequestBody PasswordEntity entity)
	{
		return service.changepassword(entity);
		
	}
}
	




