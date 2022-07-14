package com.miit.calculatorapp.calculatorapp;

import java.util.Scanner;

static int num1;
static int num2;
public class CalculatorApp {

	public static void main(String[] args) {
		//int operator;
		//int num1,num2,total;
		
		
		boolean loopentry = true;
		while(loopentry) {
			Scanner input = new Scanner(System.in);
			System.out.println("Selcet from the below options.\n1. Addition.\n2. Subtraction.\n3. Multiplication.\n4. Division.\n5. Exit.");
			
			int operator = input.nextInt();
			
			//System.out.println("Enter the first number = ");
			//num1 = input.nextInt();
			//System.out.println("Enter the second number = ");
			//num2 = input.nextInt();
			
			//input.close();
			
			switch(operator) {
				case 1:
					getNumbers(input);
					total = num1 + num2;
					System.out.println("Result of addition : " + total);
					//System.out.println("Result of addition : " + cal.add(num1,num2));
					break;
				case 2:
					getNumbers(input);
					total = num1 - num2;
					System.out.println("Result of subtraction : " + total);
					break;
				case 3:
					getNumbers(input);
					total = num1 * num2;
					System.out.println("Result of multiplication : " + total);
					break;
				case 4:
					getNumbers(input);
					if (num2 != 0) {
						total = num1 / num2;
						System.out.println("Result of division : " + total);
					}
					else {
						System.out.println("Can not divide with zero!");
					}
				case 5:
					loopentry = false;
					break;
						
				default:
					System.out.println("Invalid input. Please try again");
					break;
					
			}
		}
	}
	public static void getNumbers(Scanner input) {
		System.out.print("Enter first number = ");
		num1 = input.nextInt();
		System.out.print("Enter the second number = ");
		num2 = input.nextInt();
	}
		

}
