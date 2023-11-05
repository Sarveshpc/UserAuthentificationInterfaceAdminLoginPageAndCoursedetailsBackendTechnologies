package dynamicnotificationsecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import dynamicnotificationsecurity.dao.CourseDao;
import dynamicnotificationsecurity.entity.Courses;
import dynamicnotificationsecurity.repository.CoursesRepository;

@Service
public class CoursesServices {
	
		@Autowired
		private CoursesRepository repo;
		
		public Courses saveCourses(Courses coursesreq) {
			
			Courses courses = new Courses();
			
//			courses.setId(1);
			courses.setCourseName(coursesreq.getCourseName());
			courses.setPrice(coursesreq.getPrice());
			courses.setCourseOverview(coursesreq.getCourseOverview());
			return repo.save(courses);
			
			
			
			
		}
}
			
		
		
		

		