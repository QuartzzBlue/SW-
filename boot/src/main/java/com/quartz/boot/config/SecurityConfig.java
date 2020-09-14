package com.quartz.boot.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	// HTTPSecurity
	
	@Override
	protected void configure(HttpSecurity security) throws Exception { 
		security
			.logout()
				.logoutUrl("/api/logout")
				.and()
			.csrf() //csrf 방지 (Cross site request forgery) :  사이트의 취약점을 이용하여 이용자가 의도하지 하지 않은 요청을 통한 공격
				.disable() // basic auth를 사용하기 위해 csrf 보호 기능 disable
			.authorizeRequests()
				.anyRequest().authenticated()
				.and()
			.formLogin()
				.and()
			.httpBasic(); 
		//모든 요청에 authenticate가 필요하다고 설정
		//form based login을 제공하여 인증
		//http basic authentication을 제공
	} 
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{ 
		//Spring 4.0.0 기준 
		//https://docs.spring.io/spring-security/site/docs/4.0.0.RELEASE/reference/pdf/spring-security-reference.pdf
		auth
			.inMemoryAuthentication()
			.withUser("test").password("test").roles("USER"); 
		
	}

}
