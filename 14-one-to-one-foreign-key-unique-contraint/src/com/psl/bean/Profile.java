package com.psl.bean;

public class Profile {
	
  private int profileId;
  private String school,college;
  private Contact contact;
  
public Profile() {
	super();
}

public Profile(String school, String college) {
	super();
	this.school = school;
	this.college = college;
}

public int getProfileId() {
	return profileId;
}
public void setProfileId(int profileId) {
	this.profileId = profileId;
}
public String getSchool() {
	return school;
}
public void setSchool(String school) {
	this.school = school;
}
public String getCollege() {
	return college;
}
public void setCollege(String college) {
	this.college = college;
}

public Contact getContact() {
	return contact;
}

public void setContact(Contact contact) {
	this.contact = contact;
}
  
}
