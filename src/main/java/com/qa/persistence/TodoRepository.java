package com.qa.persistence;

import java.util.HashMap;
import java.util.Map;

import com.qa.app.domain.Todo;

public class TodoRepository {

	private Map<Integer, Todo> todoList = new HashMap<>();
	private int counter = 0;
	
	
	public int getSizeOfTodoList() {
		return todoList.size();
	}

	public void addNewTodo(Todo feedCat) {
		todoList.put(counter, feedCat);
		counter ++;
	}

	public String removeTodoFromList(int indexOfTodo) {
		if(todoList.get(indexOfTodo) != null) 
		{
			todoList.remove(0);
			return "Todo succesfully removed";
		}
		return "you are absolutely mental there is nothing in that index";
		
	}

}
