package com.qa.persistence;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.qa.app.domain.Todo;

public class TodoRepositoryTest {

	
	private Todo feedCat;
	private Todo feedDog;
	private TodoRepository todoList;
	
	@Before
	public void setup() 
	{

		feedCat = new Todo("Feed cat");
		feedDog = new Todo("Feed dog");
		todoList = new TodoRepository();
	}
	
	@Test
	public void addsANewTodoTest() {
		addOneWithCheck();
		addTwoWithCheck();
	}
	
	@Test
	public void removeATodoFromListTest() {
		addOneWithCheck();
		addTwoWithCheck();
		todoList.removeTodoFromList(1);
		Assert.assertEquals(todoList.getSizeOfTodoList(), 1);
		String message = todoList.removeTodoFromList(5);
		Assert.assertEquals("you are absolutely mental there is nothing in that index", message);
	}
	
	private void addOneWithCheck() {
		int todoListSize = todoList.getSizeOfTodoList();
		Assert.assertEquals(0, todoListSize);
		todoList.addNewTodo(feedCat);
		Assert.assertEquals(todoList.getSizeOfTodoList(), 1);
	}
	
	private void addTwoWithCheck() {
		todoList.addNewTodo(feedDog);
		Assert.assertEquals(todoList.getSizeOfTodoList(), 2);
	}


}
