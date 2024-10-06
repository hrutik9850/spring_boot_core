package com.nt.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class securityConfigure extends WebSecurityConfigurerAdapter {
	@Autowired
	private DataSource ds;
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		// Build Authentication by taking given Authentication Info Provider
		// (InMemaeryDB)
		/*	auth.inMemoryAuthentication().withUser("raj").password("akola").authorities("CUSTOMER");
			auth.inMemoryAuthentication().withUser("hrutik").password("pune").authorities("MANAGER");
			*/
		/*	
			auth.inMemoryAuthentication().withUser("raj").password("{noop}akola").roles("CUSTOMER");
			auth.inMemoryAuthentication().withUser("hrutik").password("{noop}pune").roles("MANAGER");
			*/
		
		// encode password 
		/*	$2a$10$Q9WHCnUp44hUsFU57lPZsuVoFsuS/U3IFmy1wbMS6iF4eQ3HDX0v.
			$2a$10$2xzlfkw7cRDVzR6vpnBwNuvCHoUe0CdjkkEJSxugZLOad01FpdDZe
		*/

		/*auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder()).withUser("raj").password("$2a$10$Q9WHCnUp44hUsFU57lPZsuVoFsuS/U3IFmy1wbMS6iF4eQ3HDX0v.").roles("CUSTOMER");
		auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder()).withUser("hrutik").password("$2a$10$2xzlfkw7cRDVzR6vpnBwNuvCHoUe0CdjkkEJSxugZLOad01FpdDZe").roles("MANAGER");
		*/
		auth.jdbcAuthentication().dataSource(ds).passwordEncoder(new BCryptPasswordEncoder())
		.usersByUsernameQuery("SELECT UNAME,pws ,status FROM USERS WHERE UNAME =?")
		.authoritiesByUsernameQuery("SELECT UNAME, ROLE FROM USER_ROLES WHERE UNAME=?");

	}

	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/").permitAll() // not authentication an on authorization
				.antMatchers("/offers").authenticated()// only authentication
				.antMatchers("/balance").hasAnyAuthority("CUSTOMER", "MANAGER") 
																			// "customer","manager" role users
				.antMatchers("/loanApprove").hasAnyRole("MANAGER")// authentication +authorization for
				.anyRequest().authenticated()// remain all requests url mus be authtenticated
				// specif authentication mode (use browser manage dialog for collection username
				// password from enduser)
				.and().httpBasic() 		// given BASIC mode of authetication
				.and().formLogin() 		// given FORM  mode of mode of authetication (we can redymade forms or customs
				
				.and().rememberMe()
			//	.and().logout()
				.and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/signout"))
				// exception /error handling ( for 403 error)
				.and().exceptionHandling().accessDeniedPage("/denied")
				.and().sessionManagement().maximumSessions(2).maxSessionsPreventsLogin(true);
			

		System.out.println("securityConfigure.configure()");
	}

}
