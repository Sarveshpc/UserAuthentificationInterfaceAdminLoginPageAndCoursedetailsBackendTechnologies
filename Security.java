package dynamicnotificationsecurity.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import dynamicnotificationsecurity.service.UserInfoUserDetails;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity

public class Security {
	@Bean
	public UserInfoUserDetails userDetailsManager(PasswordEncoder pe) {
		
		//UserDetails userDetails = User.withUsername("SarveshChitkeshiwar123").password(pe.encode("sarvesh@12345")).roles("ADMIN").build() ;
//		UserDetails userDetails2 = User.withUsername("karthik12").password(pe.encode("karthik123")).roles("USER").build() ;
		return new UserInfoUserDetails();
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new  BCryptPasswordEncoder() ;
	}
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		return http.csrf().disable().authorizeHttpRequests().requestMatchers("/welcome","/saveUser").permitAll().and().authorizeHttpRequests().requestMatchers("/hello").authenticated().and().formLogin().and().build() ;
	}
}
		
		
		
	


