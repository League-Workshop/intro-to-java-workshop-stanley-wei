package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score=0;
		// 2.  Ask the user a question 
		String answer1=JOptionPane.showInputDialog(null, "What is the square root of 256?");
		// 3.  Use an if statement to check if their answer is correct
		if (answer1.equals("16")) {	
		// 4.  if the user's answer is correct
		// -- add one to their score 
			score++;
		}
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String answer2=JOptionPane.showInputDialog(null, "What day is it?");
		if (answer2.equals("April 4th")) {
			score++;
		}
		String answer3=JOptionPane.showInputDialog(null, "What section is this?");
		if (answer3.equals("Four")) {
			score++;
		}
		
		
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null, "Your score was "+score+".");
		
	}
}
