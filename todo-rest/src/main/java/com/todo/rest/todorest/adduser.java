package com.todo.rest.todorest;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class adduser {
	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		for (int i = 0; i <=10; i++) {
			String encodedString = encoder.encode("pass");
			System.out.println(encodedString);
		}
	}
}
