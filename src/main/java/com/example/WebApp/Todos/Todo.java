package com.example.WebApp.Todos;

import java.time.LocalDate;

public class Todo {

	//need to store these in DataBase
	// Static list of Todos => Database [H2, MySQL]
	
	
	private int id;
	private String Username;
	private String description;
	private boolean done;

	public Todo(int id, String username, String description, boolean done) {
		super();
		this.id = id;
		Username = username;
		this.description = description;;
		this.done = done;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", Username=" + Username + ", description=" + description + ", done=" + done + "]";
	}

	
	
}
