package com.spring_boot.sb;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	
	@RequestMapping("/courses")
	public List<Course> getCourses(){
		
		return Arrays.asList(new Course(1, "Java", "Aditya"),
				new Course(2, "Python", "Ayush"),
				new Course(3, "Spring", "YASh"),
				new Course(3, "Spring", "YASh")
				);
		
	}

}
