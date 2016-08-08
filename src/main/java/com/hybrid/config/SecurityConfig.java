package com.hybrid.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		.withUser("admin")
		.password("1234")
		.roles("ADMIN");
	}
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/index.jsp").permitAll()
		.antMatchers("/Dept.jsp").hasRole("ADMIN")
		.antMatchers("/Emp.jsp").hasRole("ADMIN")
		.antMatchers("/cookie/**").hasRole("ADMIN")
		.antMatchers("/session/**").hasRole("ADMIN")
		.and()
		.formLogin()
		.loginPage("/login.jsp").permitAll()
		.and()
		.logout()
		.logoutSuccessUrl("/index.jsp");
	}
}
