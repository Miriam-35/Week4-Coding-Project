package com.promeniotech;

import java.util.Arrays;

public class CodingProjectWeek4 {

	public static void main(String[] args) {
		
		
		System.out.println("----Question 1----");
		//1.
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		//a.
		System.out.println(ages [0] - ages [ages.length - 1]);
		
		//b.	
		int[] ages2 = {17, 24, 17, 85, 21, 63, 47, 34, 6};
		
		System.out.println(ages2 [0] - ages2 [ages2.length - 1]);
		
		//c.
		int sum = 0;
		
		for (int number : ages) {
			sum += number; 
		}
		
		int average = sum / ages.length;
		System.out.println(average);
		
	
		
		System.out.println("----Question 2----");
		//2.
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		//a.
		int sumOfName = 0;
		for (String name : names) {
			sumOfName += name.length();
		}
		
		int nameAverage = sumOfName / names.length;
		System.out.println(nameAverage);
		
		//b.
		String concatNames = "";
		for (String name : names) {
			concatNames += name + " ";
		
		} System.out.println(concatNames);
		
		//3. You access the last element of any array by indexing the array length and subtract it by 1 (array[array.length - 1]);
		
		//4. First element of any array will always be index [0] (array[0]).
		
		
		System.out.println("----Question 5----");
		//5.
		int[] nameLengths = new int [names.length];
		
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		System.out.println(Arrays.toString(nameLengths));		
				
		
		System.out.println("----Question 6----");
		//6.
		
		sum = 0;
		for (int numbers : nameLengths) {
			sum += numbers;
		}
		System.out.println(sum);
		
		
		System.out.println("----Question 7----");
		//7.
		
		System.out.println(concatenateMultipleWords("Hello", 3));
				
		
		System.out.println("----Question 8----");
		//8.
		
		System.out.println(creatingFullName("Tom", "Sawyer"));
		
		
		System.out.println("----Question 9----");
		//9.
		
		int[] intArray = {4, 7, 3, 7, 4, 95};
		
		System.out.println(sumOfIntArray(intArray));
		
		
		System.out.println("----Question 10----");
		//10.
		
		double[] doubleArray = {2.5, 1.2, 6};
		
		System.out.println(averageOfArray(doubleArray));
		
		
		System.out.println("----Question 11----");
		//11. 
		
		double[] doubleArray2 = {4.6, 10.2, 3.1};
		
		System.out.println(isGreaterThan(doubleArray, doubleArray2));
		
		
		System.out.println("----Question 12----");
		//12.
		
		boolean isHotOutside = true;
		
		System.out.println(willBuyDrink(true, 7.50));
		
		
		System.out.println("----Question 13----");
		//13.
		
		double math = 99.4;
		double english = 88.2;
		double science = 70.4;
		double doubleSum = math + english + science;
		
		double gradePercentage = doubleSum / 3;
		
		System.out.println(isItPassingGrade (gradePercentage));
		
		
		
	}
				
	//7. Method
	
	public static String concatenateMultipleWords (String word, int num) {
		String result = "";
		for (int i = 0; i < num; i++) {
			result += word;
		} return result;
	}
	
	//8. Method
	
	public static String creatingFullName (String firstName, String lastName) {
		return firstName + " " + lastName;
		} 
	
	
	//9. Method
	
	public static boolean sumOfIntArray (int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		if (sum > 100) {
			return true;
		}  
		return false;
	}
	
	//10. Method
	
	public static double averageOfArray (double[] numbers) {
		double sum = 0;
		for (double number : numbers) {
			sum += number;
		} 
		double average = sum / numbers.length;
		return average;
	}
	
	
	//11. Method
	
	public static boolean isGreaterThan (double[] num1, double[] num2) {
	//	double 
		return (averageOfArray(num1) > averageOfArray(num2));
	}
	
	//12. Method
	
	public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		return isHotOutside == true && moneyInPocket > 10.50;	
	} 
	
		
	//13. Method
	
	public static boolean isItPassingGrade (double gradePercentage) {
		return gradePercentage > 65.00;
		} 
		
	}
	
	


		

