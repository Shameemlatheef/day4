package com.day45;

public class Demo {
public Demo() {
	System.out.println("inside empty");
}
public Demo(int i) {
System.out.println("inside int"+i);	
}
public Demo(String s) {
	System.out.println("insdie string"+s);
}
public Demo(float f) {
	System.out.println("insided floatr f"+f);
}

public static void main(String[] args) {
//	Demo k1=new Demo();
//	Demo K1=new Demo(5);
//	Demo k1=new(Demo("shameem");
//	
	Demo k1=new Demo(12.5f);
	
 
}
}
