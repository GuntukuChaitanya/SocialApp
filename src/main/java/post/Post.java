package post;

import user.User;

public class Post {
private String id;
private String postDate;
private String details;
private User user;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getPostDate() {
	return postDate;
}
public void setPostDate(String postDate) {
	this.postDate = postDate;
}
public String getDetails() {
	return details;
}
public void setDetails(String details) {
	this.details = details;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}

}
