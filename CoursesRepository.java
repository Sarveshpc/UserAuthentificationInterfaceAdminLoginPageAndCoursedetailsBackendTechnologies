package dynamicnotificationsecurity.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import dynamicnotificationsecurity.entity.Courses;

public interface CoursesRepository extends JpaRepository<Courses, Integer> {
	
	Courses findById(int id);
	
	@Query("SELECT c FROM Courses c WHERE c.price=?1")
	
	Courses coursesByPrice(double price);
	
	List<Courses> findByMoreThanCourses(String courseName);
	
	
	
	
	
	
	
	
	
	

}