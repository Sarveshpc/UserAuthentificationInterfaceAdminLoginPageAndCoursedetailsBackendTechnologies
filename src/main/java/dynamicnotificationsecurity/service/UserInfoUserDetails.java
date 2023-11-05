package dynamicnotificationsecurity.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.provisioning.UserDetailsManager;

import dynamicnotificationsecurity.dto.AdminUserDto;
import dynamicnotificationsecurity.entity.AdminAccount;
import dynamicnotificationsecurity.repository.AdminUserRepository;

public class UserInfoUserDetails implements UserDetailsManager {

	@Autowired
	AdminUserRepository adminrepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<AdminAccount> adminacco = adminrepo.findByName(username);
		return adminacco.map(AdminUserDto :: new).orElseThrow(()-> new UsernameNotFoundException("Username not found:"+username));
		
		
		
	}

	@Override
	public void changePassword(String oldPassword, String newPassword) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createUser(UserDetails user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(String username) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(UserDetails user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean userExists(String username) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	

}
