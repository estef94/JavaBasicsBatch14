package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String Name="Estefani";
String Last="Alvares";
String Grade="A";
String City="Alexandria";
String State="VA";
String Phone="571 000 0000";

System.out.println("My name is " +Name + " ");
System.out.println("and my last name is " +Last);
System.out.println("I am an " +Grade +" student");
System.out.println("I live in " +City +" " +State);
System.out.println("And my phone number is " +Phone);
				
  //Rules for Identifiers=names (variables, methods
  // 1. cannot use keywords as identifiers
  //String new= "Hello"; -> error

  //2 cannot have spaces in identifiers
  //String last name="Smith";

  //3. identifiers cannot start with numbers

	// int 1number=123;
	int number1=123; //number can be anywhere after 1 character
	
	/* 4. identifiers cannot contain any special characters
	 * boolean hello!=true;
	 * char #chara='A';
	 * 
	 * except $ or _	
     */
	double $price=9.98;
	float _price1=1.99F;
	
	/*
	 * Naming Conventions
	 * 
	 * Class should start with Uppercase and follow camel casing
	 * variables should start with lowercase and follow camel casing
	 */

	String Weather="hot";
	
	String myWeather="cold";
	
	
	
	}

}
