package com.nt.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	public void configure(HttpSecurity http)throws Exception{
		http.authorizeHttpRequests().antMatchers("/","/login","/home").permitAll()
		.anyRequest().authenticated()
		.and().formLogin()
		.and().oauth2Login()	//we develop custom login form having hyper link to login ad FB user
		.and().csrf().disable();
	}

}
