package com.example.service;

public class Passanger {
      private int id;
      private String name;
      private int age;
      private char gender;
	public Passanger(int id, String name, int age, char gender) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	@Override
	public String toString() {
		return "PassangerDetails [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
      
}
