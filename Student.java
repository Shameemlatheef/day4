package com.day45;

public class Student {
// Q1
	private int roll;
private String name;
private int age;
private int marks;
private String address;
private String collegename;
public Student() {
	
}
public static Student getStudent(boolean getcollegename) {
	if(getcollegename==true) {
		Student f1=new Student(3,"shameem","inchivila");
		return f1;
	}
	else {
		Student g1=new Student(20,"shameem","inchivila","riet");
		return g1;
	}
}
public Student(int roll,String name, String address, String collegename) {
	super();
	this.roll=roll;
	this.name = name;
	this.address = address;
	this.collegename = collegename;
}
public Student(int roll,String name, String address) {
	super();
	this.roll=roll;
	this.name = name;
	this.address = address;
	this.collegename="NIT";
	
}
public void display() {
	System.out.println(roll);
	System.out.println(name);
	System.out.println(address);
	System.out.println(collegename);
}





//public int getRoll() {
//	return roll;
//}
//public void setRoll(int roll) {
//	this.roll = roll;
//}
//public String getName() {
//	return name;
//}
//public void setName(String name) {
//	this.name = name;
//}
//public int getAge() {
//	return age;
//}
//public void setAge(int age) {
//	this.age = age;
//}
//public int getMarks() {
//	return marks;
//}
//public void setMarks(int marks) {
//	this.marks = marks;
//}

//public Student(int roll, String name, int age, int marks) {
//	super();
//	this.roll = roll;
//	this.name = name;
//	this.age = age;
//	this.marks = marks;
//}
//public void show() {
//	System.out.println(roll);
//	System.out.println(name);
//	if(age<18) {
//		System.out.println("small");
//	}else {
//		System.out.println(age);
//	}
//	
//	System.out.println(marks);
//}
//Q3
//---------------------------------------------------------------------------------------






}
