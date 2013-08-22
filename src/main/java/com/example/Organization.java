package com.example;

import java.util.ArrayList;
import java.util.Collection;

public class Organization {
	private String name;
	private Collection< User > users = new ArrayList< User >();
	private Collection< Group > groups = new ArrayList< Group >();

	public String getName() {
		return name;
	}

	public void setName( final String name ) {
		this.name = name;
	}

	public Collection< Group > getGroups() {
		return groups;
	}

	public void setGroups( final Collection< Group > groups ) {
		this.groups = groups;
	}

	public Collection< User > getUsers() {
		return users;
	}

	public void setUsers( final Collection< User > users ) {
		this.users = users;
	}
}
