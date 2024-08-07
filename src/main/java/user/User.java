package user;

import location.Location;

public class User {
private String id;
private String firstName;
private String lastName;
private String email;
private Location location;
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
