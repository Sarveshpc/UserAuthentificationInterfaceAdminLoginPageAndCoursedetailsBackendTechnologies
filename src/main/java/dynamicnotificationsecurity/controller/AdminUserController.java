package dynamicnotificationsecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dynamicnotificationsecurity.dao.AdminUserDao;
import dynamicnotificationsecurity.entity.AdminAccount;

@RestController
public class AdminUserController {
	
	@Autowired
	AdminUserDao dao;
	
	@RequestMapping
	("/hello")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public String m1() {
		return "hi " ;
	}
	
	@RequestMapping("/welcome")
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public String m2() {
		return "welcome admin portal!" ;
	}
	
	@PostMapping("/saveAdminUser")
	public  String saveAdminUser(@RequestBody AdminAccount adminacco) {
		
			return AdminUserDao.saveAdminUser(adminacco);
			
	}
			
			
			
			
			
			
		
		
	
}
	
	
	


