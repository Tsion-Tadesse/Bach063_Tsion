package com.cogent.day12;

import java.util.Scanner;

public class ClassWork {
public static void main(String[] args) {
	/*
	 * reverse the string input: Java is easy
	 * output: easy is Java
	 * 
	 * option1: using string methods
	 * option2: without using string methods
	 * 
	 * q2. create a class peron with fields pid and pname
	 * create an array and add 10 objects of person class
	 * print all the person objects where the name is starting with A, a, J, j
	 * 
	 * q3. Take input from user as a String and check if the input is a number or not
	 */

	reverseString("Java is easy");
	System.out.println("\n-------");
		
	Person[] p = new Person[10];
	
	p[0] = new Person(1, "Adam");
	p[1] = new Person(2, "Mark");
	p[2] = new Person(3, "Jaden");
	p[3] = new Person(4, "Jordan");
	p[4] = new Person(5, "alisha");
	p[5] = new Person(6, "Robert");
	p[6] = new Person(7, "John");
	p[7] = new Person(8, "Tishan");
	p[8] = new Person(9, "James");
	p[9] = new Person(10, "Uno");
	
for(int i=0; i<p.length; i++) {
		if(p[i].getPname().toUpperCase().charAt(0) == 'A' || p[i].getPname().toUpperCase().charAt(0) == 'J' )
		System.out.println(p[i].getPId() + " " +  p[i].getPname());
	}
Scanner in = new Scanner(System.in);
System.out.println("enter the string:");
String s= in.nextLine();
boolean a = isInputString(s); 
System.out.println("Is this a string? " + a);
}
//Question 1
public static void reverseString(String s) {
	
	String[] a = s.split(" ");
	for(int i=a.length - 1; i>=0; i--) {
		System.out.print(a[i] + " ");
	}
}
//Question 3

public static boolean isInputString(String s) {
	boolean isString = true;
	for(int i=0; i<s.length(); i++) {
		//not a wisest way but inorder to practice the string method i did this
		if((s.charAt(i) == '1')  || (s.charAt(i) == '2')  || (s.charAt(i) =='3')  || (s.charAt(i) == '4' ) || (s.charAt(i) =='5') ||(s.charAt(i) == '6') || (s.charAt(i) =='7') ||(s.charAt(i) == '8' ) ||(s.charAt(i) == '9')  ||(s.charAt(i) == '0')) {
			isString = false;
		}
	}
	
	return isString;
}

}

//Question 2
class Person{
	int pid;
	String pname;
	
public Person() {
	super();
}
public Person(int pid, String pname) {
	this.pid = pid;
	this.pname = pname;
}
public int getPId(){
    return pid;
}
public void setpId(int pid){
    this.pid = pid;
}
public String getPname(){
    return pname;
}
public void setPname(String pname){
    this.pname = pname;
}
}