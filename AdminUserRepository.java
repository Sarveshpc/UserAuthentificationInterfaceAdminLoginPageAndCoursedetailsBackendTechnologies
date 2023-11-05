package dynamicnotificationsecurity.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import dynamicnotificationsecurity.entity.AdminAccount;

public interface AdminUserRepository extends JpaRepository<AdminAccount, Integer> {
	
	Optional<AdminAccount> findByName(String brand);
	
	

}
