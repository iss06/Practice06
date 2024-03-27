package com.javaex.ex01;

public class Person {

	private String name;
	private String hp;

	public Person(String name, String hp) {
		this.name = name;
		this.hp = hp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public void showInfo() {
		System.out.print("\n" + "#이름: " + name + "#핸드폰: " + hp);
	}
}
