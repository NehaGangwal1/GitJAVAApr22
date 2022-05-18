/*
	Program 1 : Write a program to print student's grade using if else ladder.

	If score is between 90 to 100 (including 90 and 100) --> A+ grade
	If score is between 80 to 90 (including 80) --> A grade
	If score is between 70 to 80 (including 70) --> B+ grade
	If score is between 60 to 70 (including 60) --> B grade
	If score is between 50 to 60 (including 50) --> C grade
	less than 50 --> Failed
	Input less than 0 and more than 100 --> invalid input
*/
package assignments;

public class Assignment3_StudentGrade {

	void displayGrade(int score) {

		if (score >= 90 && score <= 100) {
			System.out.println("Score is " + score + " and grade A+");
		} else if (score >= 80 && score < 90) {
			System.out.println("Score is " + score + " and grade A");
		} else if (score >= 70 && score < 80) {
			System.out.println("Score is " + score + " and grade B+");
		} else if (score >= 60 && score < 70) {
			System.out.println("Score is " + score + " and grade B");
		} else if (score >= 50 && score < 60) {
			System.out.println("Score is " + score + " and grade C");
		} else if (score < 50 && score > 0) {
			System.out.println("Score is " + score + " and Result is Failed ");
		} else if (score < 0 || score > 100) {
			System.out.println("Invalid input");
		}
	}

	public static void main(String[] args) {
		Assignment3_StudentGrade assignment3_StudentGrade = new Assignment3_StudentGrade();
		assignment3_StudentGrade.displayGrade(95);
		assignment3_StudentGrade.displayGrade(87);
		assignment3_StudentGrade.displayGrade(78);
		assignment3_StudentGrade.displayGrade(65);
		assignment3_StudentGrade.displayGrade(59);
		assignment3_StudentGrade.displayGrade(45);
		assignment3_StudentGrade.displayGrade(195);
		assignment3_StudentGrade.displayGrade(-95);
	}
}
