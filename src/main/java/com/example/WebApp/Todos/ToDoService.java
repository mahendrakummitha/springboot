package com.example.WebApp.Todos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ToDoService {
	
	private static int todosCount=0;
	
	private static List<Todo> todos = new ArrayList();
	static {
		todos.add(new Todo(++todosCount,"id1","AWS",false));
		todos.add(new Todo(++todosCount,"id2","devops",false));
		todos.add(new Todo(++todosCount,"id3","dullstack",false));
	}
	
	public List<Todo> findByUsername(String username){
		return todos;
	}
	
	public void addTodo(int id,String Username,String description, Boolean done) {
		Todo todo = new Todo(++todosCount,Username,description,done);
		todos.add(todo);
	}

}
