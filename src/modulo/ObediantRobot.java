package modulo;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObediantRobot {
	static Robot commander=new Robot();
	
public static void main(String[] args) {
	commander.penDown();
	String Shape=JOptionPane.showInputDialog("What shape do you want?");
	String ColorRobot=JOptionPane.showInputDialog("What color do you want?");
	if(ColorRobot.equals("Red")) {
		commander.setPenColor(Color.red);
	}
	else if(ColorRobot.equals("Orange")) {
		commander.setPenColor(Color.orange);
	}
	else if(ColorRobot.equals("Blue")) {
		commander.setPenColor(Color.blue);
	}
	else if(ColorRobot.equals("Green")) {
		commander.setPenColor(Color.green);
	}
	else if(ColorRobot.equals("Yellow")) {
		commander.setPenColor(Color.orange);
	}
	
	if(Shape.equals("Square")) {
		for(int i=0; i<4; i++) {
			drawSquare();
		}
	}
	if(Shape.equals("Triangle")) {
		commander.turn(30);
		for(int i=0; i<3; i++) {
			drawTriangle();
		}
	}
	if(Shape.equals("Circle")) {
		for(int i=0; i<36; i++) {
			drawCircle();
		}
	}

		
	}

public static void drawSquare() {//4 times
	commander.setSpeed(100);
	commander.move(100);
	commander.turn(90);
}
public static void drawTriangle() {//3 times
	commander.setSpeed(100);
	commander.turn(120);
	commander.move(100);

}
public static void drawCircle() {
	commander.setSpeed(100);
	commander.move(10);
	commander.turn(10);
}

}




	
	


