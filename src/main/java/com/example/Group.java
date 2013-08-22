package com.example;

import java.util.ArrayList;
import java.util.Collection;

public class Group {
	private String name;
	private Collection< User > users = new ArrayList< User >();

	public void setName( final String name ) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Collection< User > getUsers() {
		return users;
	}

	public void setUsers( final Collection< User > users ) {
		this.users = users;
	}
}
