package com.in28minutes.learn_spring_boot.courses.beans;

public class Course {
	private long id;
	private String title;
	private String author;
	
	public Course(long id, String title, String author) {
		this.id = id;
		this.title = title;
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return String.format("[Course:id-%l,title-%s,author-%s]", 
				this.id,this.title,this.author);
	}
}
