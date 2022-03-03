package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	List<Course> list;
	
	public CourseServiceImpl() {
		
	    list = new ArrayList<>();
		list.add(new Course(123,"Java Programming","Creating constructor"));
		list.add(new Course(243,"Spring Boot","Creating rest api"));

		
	}

	@Override
	public List<Course> getCourses() {
		
		return list;
	}
	
	@Override
	public Course getCourse(long courseId) 
	{
		Course c = null;
		for(Course course : list)
		{
			if(course.getId()==courseId)
			{
			 c= course;
			 break;
			}
		 }
	
		return c;
	}
	@Override
	public Course addCourse(Course course)
	{
		list.add(course);
		return course;
	}
	

}
