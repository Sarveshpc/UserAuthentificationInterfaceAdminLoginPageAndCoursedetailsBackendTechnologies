package dynamicnotificationsecurity.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import dynamicnotificationsecurity.entity.AdminAccount;
import dynamicnotificationsecurity.repository.AdminUserRepository;

@Repository
public class AdminUserDao {

	
		@Autowired
		AdminUserRepository  AdminuserRepository  ;
		
		@Autowired
		PasswordEncoder passwordEncoder ;
		
		public String saveAdminUser(AdminAccount admin) {
			admin.setPassword(passwordEncoder.encode(admin.getPassword()));
			AdminuserRepository.save(admin) ;
			return "data saved successfully " ;
		}
}

		
	
	
	


