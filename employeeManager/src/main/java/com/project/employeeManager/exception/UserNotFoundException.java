package com.project.employeeManager.exception;

public class UserNotFoundException extends RuntimeException{
	public UserNotFoundException(String msg) {
		super(msg);
	}
}
