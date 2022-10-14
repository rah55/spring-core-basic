package com.springcore;

public class school {
	private schoolClass Class;

	public schoolClass getSchoolClass() {
		return Class;
	}

	//dependency injection
	public void setClass(schoolClass class1) {
		Class = class1;
	}

	public void greeting() {
		System.out.println("welcome to the school");
		Class.classes();
	}
}
