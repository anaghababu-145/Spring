package org.face.SpringHello;

public class Hello {
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void printHello() {
		System.out.println("Hai " + name);
	}
}
