package kr.ac.hansung.cse.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
 
	//java class 방식의 security-context.xml이라 볼 수 있다.
	@Override
    protected void configure(HttpSecurity http) throws Exception {
        http        
        	.authorizeRequests() //  권한 o 아직 인증 x
        		.anyRequest()
        		.permitAll() // 어떤 request 든 허용
        		.and()	// 그리고 csrf 토큰과 disable
            .csrf().disable();
    }
}