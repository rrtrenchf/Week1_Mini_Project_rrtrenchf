package com.rrtrenchf.code;
import java.util.Scanner;



public class MainDriver {


	public MainDriver() {
		// TODO Auto-generated constructor stub
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("Name your thermometer");

	String name = scan.nextLine();
	
	
	System.out.println("Your thermometer is called "+ name);
	
	System.out.println("Enter degrees in farenheight");
	int degreesF = scan.nextInt();
	System.out.println("You entered "+ degreesF + "F");
	
	System.out.println("Enter degrees in Celcium");
	int degreesC = scan.nextInt();
	System.out.println("You entered "+ degreesC + "C");
	
	System.out.println("enter 3 temp readings for the average temp");
	
	int  tempReadings[] = new int[3];
	  for (int i = 0 ; i < tempReadings.length; i++ ) {
          tempReadings[i] = scan.nextInt();
          
          System.out.println("You entered " + tempReadings[i]);
       }
	  System.out.println("No more values allowed");
	  
	  
	
	
	
	}
	
	

}
