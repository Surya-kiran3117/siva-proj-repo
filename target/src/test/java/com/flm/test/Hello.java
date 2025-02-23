package com.flm.test;

public class Hello {
static void display(String[] names) {

for(String name : names)
	System.out.println(name);
}
	public static void main(String[] args) {
		String values[] = {"siva","sai","mani"};
		display(values );
	}

}
