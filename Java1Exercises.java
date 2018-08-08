package com.ulrike.java1exercises;

public class Java1Exercises {

	public static void main(String[] args) {
		/* Let's say a user wants to leave a star rating for a restaurant, which can range between 1 (being the worst) and 5 (being the best). For each of the five possible ratings, we want to 
		 * print out a message that would be seen by the restaurant. 
		 */
		
		//Declare the variables needed
		int rating = 4;
		
		//if the user rated 5-stars, print "This food is the best! I could eat this all day."
		if (rating == 5) {
			System.out.println("This food is the best! I could eat this all day.");
		}
		//if the user rated 4-stars, print "Good meal."
		else if(rating == 4) {
			System.out.println("Good meal.");
		}
		//if the user rated 3-stars, print "It's okay."
		else if(rating == 3) {
			System.out.println("It's okay.");
		}
		//if the user rated 2-stars, print "I do not like this, but it's cheap."
		else if(rating == 2) {
			System.out.println("I do not like this, but it's cheap.");
		}
		//if the user rated 1-star, print "I'd rather eat dirt."
		else if(rating == 1) {
			System.out.println("I'd rather eat dirt.");
		}

	}

}
