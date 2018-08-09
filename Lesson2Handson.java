package com.ulrike.javaLesson2Handson;

public class Lesson2Handson {

	public static void main(String[] args) {
		/* Using boolean operations, create a program
		 *  that prints ticket prices determined by age.
		 *  ages 65+ --> $7; 0-12 --> $8; 
		 *  isStudent is true, --> $8;
		 *  ages 13-64 --> $10(default)
		 *  stop checking for prices if age is a negative value
		 */
		int age = -7;
		boolean isStudent = true;
				
		String seniorPrice = "$7.00";
		String childPrice = "$8.00";
		String studentPrice = "$8.00";
		String regularPrice = "$10.00";
		
		
		//Check if age is a negative value
		if (age  < 0) {
			System.out.println("Invalid age!");
		}
		//Check is senior price applies
		else if (age >= 65) {
			System.out.println("Your ticket price: " + seniorPrice);
		}
		//check if child price applies
		else if (age == 0 || age <= 12) {
			System.out.println("Your ticket price: " + childPrice);
		}
		//Price if isStudent is true
		else if (isStudent) {
			System.out.println("Because you're a student, your ticket price is: " + studentPrice);
		}
		//All ages outside of the above ranges get the regular price
		else {
			System.out.println("Your ticket price: " + regularPrice);
		}
		

	}

}
