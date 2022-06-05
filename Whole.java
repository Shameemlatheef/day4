package com.day45;

public class Whole {
	public void show(int i) {
		if(i%2==0) {
			int x=i/10;
			if(i%10==0)
			{
				System.out.println(x*10);
			}
			else
			{
				System.out.println(x*10+10);	
			}
			
		}
		else if(i%2==1) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Whole h1=new Whole();
		h1.show(50);
	}
}
