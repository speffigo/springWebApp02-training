package com.springweb.todoweb.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springweb.todoweb.todo.ToDo;

@Service
public class ToDoService {

	public static List<ToDo> todos = new ArrayList<>();
	static {
		todos.add(new ToDo("Saurabh", 1, "AWS", LocalDate.now(), true));
		todos.add(new ToDo("Ankit", 2, "JAVA", LocalDate.now(), false));
		todos.add(new ToDo("Raj", 3, "OS", LocalDate.now(), true));
		todos.add(new ToDo("Vikas", 4, "AIML", LocalDate.now(), true));
	}

	public List<ToDo> retrievetodo(String user) {

		return todos;
	}
}
