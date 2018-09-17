//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;


public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot color=new Robot();
		color.setSpeed(50);
		//3. Ask the user what color they would like the robot to draw
		String Chooser;
		//5. Use an if/else statement to set the pen color that the user requested
		for(int i=0; i<10; i++) {
		 Chooser=JOptionPane.showInputDialog("What color would you like to draw?");
//int Color10=Integer.parseInt(Chooser);

if(Chooser.equals("Yellow")) {
	color.setPenColor(Color.yellow);
}
else if(Chooser.equals("Blue")) {
	color.setPenColor(Color.BLUE);
}        //6. If the user doesn’t enter anything, choose a random color
else if(Chooser.equals("Orange")) {
	color.setPenColor(Color.orange);
}
else if(Chooser.equals("Purple")) {
color.setPenColor(Color.magenta);
} 
else if(Chooser.equals("Red")) {
	color.setPenColor(Color.red);
}
else if(Chooser.equals("Green")) {
	color.setPenColor(Color.green);
}
else if(Chooser.equals("Pink")) {
	color.setPenColor(Color.pink);
}
else if(Chooser.equals("Gray")) {
	color.setPenColor(Color.GRAY);
} 
else if(Chooser.equals("Tan")) {
	JOptionPane.showMessageDialog(null, "Sorry, we don't have that color");
} 
else if(Chooser.equals("Black")) {
	color.setPenColor(Color.black);
}   
else if(Chooser.equals("White")) {
	color.setPenColor(Color.white);
} 
else if(Chooser.equals("Cyan")) {
	color.setPenColor(Color.cyan);
}else {
	color.setRandomPenColor();
}
		

        
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		color.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
for( i=0; i<6; i++) {
	color.penDown();
	color.move(100);
	color.turn(360/6);
	
}
		}

	}
}
