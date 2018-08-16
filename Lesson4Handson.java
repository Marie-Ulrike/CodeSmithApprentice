package Lesson4Handson;

public class Lesson4Handson {
    public static void main(String[] args) {
		//1. Double a number
		 int number = 9;
		 int doubleNumber = doubleMe(number);
		 
		 //2.Quadruple a number using the doubleMe Method
		 int num = 11;
		 int quadruple = doubleMe(num)+ doubleMe(num);
		 
		 //3.
		 int numY = 7;
		 int numX = 6;
		 double result = raiseMeXTimes(numY,numX);
		 
		 System.out.println("Step1: Your number Doubled: " + doubleNumber);
		 System.out.println("Step2: Your number Quadrupled: " + quadruple);
		 System.out.println("Step3: Your number: "+ numY + " raised to the power of " + numX + " is: " + result);
	}
	public static int doubleMe(int number) {
		 return number * 2;
	}
	public static int quadrupleMe(int num) {
		return num * 4;
	}
	public static double raiseMeXTimes(int numY, int numX) {
		return Math.pow(numY,numX);
	}
}