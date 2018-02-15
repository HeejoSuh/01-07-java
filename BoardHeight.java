/****************************************************************************
 *
 * Created by: Heejo Suh
 * Created on: Feb 2018
 * Created for: learning
 * 
 * Program that has a procedure called public static void RollDie(int maxValue) 
 Which will randomly generate a value between 1 and maxValue and then place the value in the console.
 *     
 *
 ****************************************************************************/



//have to import the following:
import java.util.Scanner;
import java.util.Random;

//****************************************************************************
public class BoardHeight {

	public static void BoardFoot(float length, float width) {
    	//calculate height so result is 1 board foot

    	// height= volume / (width x length)
		float height= 144/(length*width);
    	System.out.println("The height should be " + height + " inches.");
    }//closing for BoardFoot

	//for return methods
		     //return type is float
    public static float getNumericalInput(String askWhat){
	//Gets the input from the user
    	//Checks if FLOAT

    Scanner scanner = new Scanner(System.in);
	String input = null;
	Float inputNumber;
	while (true) {
    		//keep asking for input
    		System.out.println("Input the " + askWhat);
		
    		//Get input as a string value-----
    		input = scanner.nextLine();
    		//check if number
    		try {
       			//check if response if a number
    			inputNumber = Float.parseFloat(input);//Convert string to float
       			return inputNumber;
       		} catch (NumberFormatException stringInput) {
       			//if not number then
       			System.out.println("Try again with a number!");
       		}
    	}//closing for while
    }//closing for getNumericalInput
	
    public static void main(String[] args) {
    	//get input
    	
    	float width, length;
    	
    	width= BoardHeight.getNumericalInput("width in inches");
    	length= BoardHeight.getNumericalInput("length in inches");
    	
    	BoardFoot(width, length);
    	
    	
    			
    
    }//closing for main
}//closing for public class BoardHeight
