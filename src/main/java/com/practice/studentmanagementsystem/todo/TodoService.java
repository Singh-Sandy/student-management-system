package com.practice.studentmanagementsystem.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
private static List<Todo> todos = new ArrayList<>();
	
	private static int todosCount = 0;

	static {
		todos.add(new Todo(++todosCount, "sandy", "Get AWS Certified", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(++todosCount, "sandy", "Learn DevOps", LocalDate.now().plusYears(2), false));
		todos.add(new Todo(++todosCount, "sandy", "Learn Full Stack Development", LocalDate.now().plusYears(3), false));
	}
	
	public List<Todo> findByUsername(String username){
		return todos;
	}
	
}