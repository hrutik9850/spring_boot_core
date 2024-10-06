package com.nt.conffiger;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig{
	@Bean
	public SecurityFilterChain defaultSecurityfilterChain(HttpSecurity http)throws Exception{
		http.authorizeHttpRequests((requests)->requests
		.requestMatchers("/bank/welcome").permitAll()
		.requestMatchers("/bank/balance","/bank/loan","/bank/offers").authenticated())
		.formLogin(Customizer.withDefaults());
		return http.build();
	}
	
	@Bean
	public InMemoryUserDetailsManager userDetailsService() {
		//Approach 1  where we use withDefaultsPasswordEncoder()(deprecated)method while creating the user details
		/*UserDetails admin = User.withDefaultPasswordEncoder()
		.username("admin")
		.password("12345")
		.authorities("admin")
		.build();
		UserDetails user = User.withDefaultPasswordEncoder()
				.username("user")
				.password("112345")
				.authorities("readd")
				.build();
		
		return InMemoryUserDetailsManager(admin,user);*/
		
		//APProach 2  where we use BCryptPAsswoedEncoder Bean while created 
		UserDetails user1 = User.withUsername("raja")
				.password(encodr().encode("akola"))
				.authorities("CUSTOMER")
				.build();
		UserDetails user2 = User.withUsername("hrutik")
				.password(encodr().encode("pune"))
				.authorities("MANAGER","CUSTOMER")
				.build();
		return new InMemoryUserDetailsManager(user1,user2);
				
	}
	@Bean
	public PasswordEncoder encodr() {
		return new BCryptPasswordEncoder();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
