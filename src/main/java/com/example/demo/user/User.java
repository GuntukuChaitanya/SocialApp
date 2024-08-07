package com.example.demo.user;

import com.example.demo.location.Location;

public class User {
private String id;
private String firstName;
private String lastName;
private String email;
private Location location;
public User( String id, String firstName, String lastName, String email, Location location) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.location = location;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Location getLocation() {
	return location;
}
public void setLocation(Location location) {
	this.location = location;
}

}
