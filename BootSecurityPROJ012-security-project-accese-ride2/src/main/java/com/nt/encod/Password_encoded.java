package com.nt.encod;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Password_encoded {
	public static void main(String[] args) {
	
		BCryptPasswordEncoder encode = new BCryptPasswordEncoder();
		String pass1 = encode.encode("akola");
		String pass2 = encode.encode("pune");
		System.out.println(pass1);
		System.out.println(pass2);
	}

}
