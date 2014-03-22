package com.seeyon.manager;

import com.seeyon.vo.Person;

public interface  PersonManager {
	public void save(Person person);  
	public void del(Person person);  
	public void update(Person person);
	public Person getPerson(String userName);
	public void searchAll();
}

