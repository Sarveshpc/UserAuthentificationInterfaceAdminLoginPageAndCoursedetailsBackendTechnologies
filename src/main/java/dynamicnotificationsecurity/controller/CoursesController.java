package dynamicnotificationsecurity.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import dynamicnotificationsecurity.dao.CourseDao;
import dynamicnotificationsecurity.entity.Courses;
import dynamicnotificationsecurity.repository.CoursesRepository;
import dynamicnotificationsecurity.service.CoursesServices;


@RestController
public class CoursesController {
	
	@Autowired
	 private CoursesRepository repo;
	
	@PostMapping("/savecourse")
	public String addCourses() {
		
		return "Coffee with us Java technologies";
		
 	}
	
	@PostMapping("/saveDatacourse")
	public String saveData(@RequestBody Courses course) {
		repo.save(course);
		return "data saved successfully!";
		
	}
	
	@GetMapping("/welcome to knowledge world!") 
	
	public String WelcomePage() {
		return "welcome to Springboot Application version!";
		
	}
	
	
	@GetMapping("/getdataCourses")
	public Courses getCoursesByIdCourses(@RequestParam int id) {
		
		Optional<Courses> optional = Optional.of(repo.findById(id));
		Courses courses = optional.get();
		
//		
//		
		return courses;
		
	}
	
	@PutMapping("/UpdateDataCourses")
	public String updateCourses(@RequestBody Courses courses) {
		
		repo.save(courses);
		
		return "data update successfully!";
		
	}
	
	@DeleteMapping("/DeletedataCourses")
	public String deleteData(@RequestParam int id) {
		
		repo.deleteById(id);
		return "Delete data successfully!";
		
	}
	
	@GetMapping("/fetchAllData")
	public List<Courses> fetchAllCourses() {
		List<Courses> courses = repo.findAll();
		
		return courses;
		
		
	}
	
	//without any passed primary key fetch data how to solve logic of spring boot :
	
	@GetMapping("/findByenameCourse")
	public List<Courses> getCoursesByCourseName(@RequestParam String CourseName) {
		return  repo.findByMoreThanCourses(CourseName);
		
	}
		
//		//H.W findByAge , findByAddress etc smart design of code dynamically without any primary key fetch the data 
//		
//		
//	
//	
//	
	
	
	
	
	
}
		
		
		
	
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	


