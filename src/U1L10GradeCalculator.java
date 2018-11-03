import java.util.Arrays;

import javax.swing.JOptionPane;

public class U1L10GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double newAvg = 0;
		//ask the user how many grades they will be inputting
		String numberGrades = JOptionPane.showInputDialog("how many grades will you be inputting?");
		int numGrades = Integer.parseInt(numberGrades);
		//create an array the length of how many grades they will be entering
		double [ ] grades = new double [numGrades]; 
		int length = grades.length;
		//go through a loop and ask for a grade each time and add it to the index of the array
		for (int i = 0; i < length; i++) {
			String input = JOptionPane.showInputDialog("enter a grade!");
			int gradeVal = Integer.parseInt(input);
			grades [i] = gradeVal; 
		}
		System.out.println(Arrays.toString(grades));
		
		//enter a function that calculates the average of each element
		double initialAverage = average(grades)/grades.length;
		
		System.out.println("The initial average is: " + initialAverage + "%");
		//in the function: takes each index, adds together to one variable
		//divides by length of the list
		
		//enter another function that gives certain number values corresponded to a letter grade
		if (initialAverage >=  90 && initialAverage <= 100) {
			System.out.println("Your initial average is an A!!");
		}
		if (initialAverage >= 80 && initialAverage < 90) {
			System.out.println("Your initial average is a B.");
		}
		if (initialAverage >= 70 && initialAverage <80) {
			System.out.println("your initial average is a C");
		}
		if (initialAverage >= 60 && initialAverage < 70) {
			System.out.println("Your intial average is a D...");
		}
		if (initialAverage >= 0 && initialAverage < 60) {
			System.out.println("Your initial average is an F...");
		}
		
		//enter a loop/function which checks each index against one another 
		double lowestGrade = lowestGrade(grades);
		System.out.println("The lowest grade is: " + lowestGrade + "%");
		double newestAvg = average(grades);
		double finalAvg = (newestAvg - lowestGrade)/(grades.length - 1); 
		System.out.println("The new average with the lowest grade dropped is: " + finalAvg + "%");
		
		

		
		

	}
	public static double average(double[] grades) {
		double totalVal = 0;
		for (int i = 0; i < grades.length; i++) {
			totalVal += grades [i];
		}
		
		return totalVal;
	}
	public static double lowestGrade(double[] grades) {
		double lowestVal = grades [0];
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] < lowestVal) {
				lowestVal = grades[i];
			}
			if (grades[i] >= lowestVal) {
				lowestVal = lowestVal;
			}
			
		}
		return lowestVal;
		
		
	}

}
