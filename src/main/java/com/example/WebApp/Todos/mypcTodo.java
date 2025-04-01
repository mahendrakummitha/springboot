package com.example.WebApp.Todos;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class mypcTodo {
	
	private ToDoService todoService;

	public mypcTodo(ToDoService todoService) {
		super();
		this.todoService = todoService;
	}


	@RequestMapping("/todos")
	public String Todo(ModelMap model) {
		List<Todo> todos = todoService.findByUsername("id1");
		model.addAttribute("todos",todos);
		return "ListTodos";
	}
	
	//GET, POST 
	@RequestMapping(value="Add-todo",method=RequestMethod.GET)
	public String ShowNewTodo(ModelMap model) {
		String Username = (String)model.get("name");
		Todo todo = new Todo(0,Username,"",false);
		model.put("todo",todo);
		return "AddTodo";
	}
	
	@RequestMapping(value="Add-todo",method=RequestMethod.POST)
	public String AddNewTodo(ModelMap model, Todo todo) {
		String Usernam = (String)model.get("name");
		todoService.addTodo(4,Usernam , todo.getDescription(), false);
		return "redirect:todos";
	}

}
