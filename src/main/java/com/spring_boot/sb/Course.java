package com.spring_boot.sb;

public class Course {

	
	private long id;
	private String course_name;
	private String author;
	
	public Course(long id, String course_name, String author) {
		super();
		this.id = id;
		this.course_name = course_name;
		this.author = author;
	}

	public long getId() {
		return id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public String getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", course_name=" + course_name + ", author=" + author + "]";
	}
	
}
