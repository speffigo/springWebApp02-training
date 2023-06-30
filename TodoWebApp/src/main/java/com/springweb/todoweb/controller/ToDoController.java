package com.springweb.todoweb.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springweb.todoweb.service.LogIn;
import com.springweb.todoweb.service.ToDoService;
import com.springweb.todoweb.todo.ToDo;

@Controller
public class ToDoController {

	private ToDoService services;
	private LogIn login;

	public ToDoController(ToDoService services, LogIn login) {
		super();
		this.services = services;
		this.login = login;
	}

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String getToDo(@RequestParam String name, @RequestParam String password, ModelMap model) {
		if (login.checkAuthentication(name, password)) {
			List<ToDo> todolist = services.retrievetodo("Saurabh");
			model.put("todos", todolist);
			return "todo";
		}
		return "login";
	}
}
