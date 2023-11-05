package dynamicnotificationsecurity.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.swing.text.html.Option;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dynamicnotificationsecurity.entity.Courses;
import dynamicnotificationsecurity.repository.CoursesRepository;

@Repository
public class CourseDao {
	
	@Autowired
	private CoursesRepository repo;
	
	public Courses saveCourses(Courses courses) {
		
		return repo.save(courses);
	}
	
	public Courses findCoursesById(int id) {
		
		Optional<Courses> optional = Optional.of(repo.findById(id));
		
		if(optional.isPresent()) {
			
			return optional.get();
			
		}else {
			
			return null;
			
		}
	}
		
		public Courses DeleteCourse(int id) {
			
			Optional<Courses> op = Optional.of(repo.findById(id));
			
			if(op.isPresent()) {
				Courses courses = op.get();
				
				repo.deleteById(id);
				
				return courses;
				
			} else {
				
				return null;
				
			}
			
		}
		
		public Courses updateCourses(int id, Courses courses) {
			Optional<Courses> optional = Optional.of(repo.findById(id));
			if (optional.isPresent()) {
				courses.setId(id);
				return repo.save(courses);
			} else {
				return null;
			}
		}
		
		public List<Courses> findAllCourses() {
			return repo.findAll();
		}

		public Courses findCoursesById1(int id) {
			return repo.findById(id);
		}

		public Courses findCoursesByPrice(double price) {
			return repo.coursesByPrice(price);
		}
}

		

	


		
		
				
				
			
			
		
		
			
	