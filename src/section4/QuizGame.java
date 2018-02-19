package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score=0 ;
		String name= "Cainnan";
		// 2.  Ask the user a question 
		String answer=	JOptionPane.showInputDialog("Who touched my spaget?");
		// 3.  Use an if statement to check if their answer is correct
		if(answer.equals("The Phat Dad") ) {
		// 4.  if the user's answer is correct
		score++;
		// -- add one to their score 
		}
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		answer=	JOptionPane.showInputDialog("Is Harambe Dead?");
		if(answer.equals("No") ) {
			score++;
			
		}
		// 6.  After all the questions have been asked, print the user's score 
		System.out.println(2
				);
	}
}
