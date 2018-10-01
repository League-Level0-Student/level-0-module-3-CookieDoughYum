package modulo;

import org.jointheleague.graphical.robot.Robot;

public class ObediantRobot {
public static void main(String[] args) {
	Robot commander=new Robot();
	commander.penDown();
	for(int i=0; i<4; i++) {
		drawSquare();
	}
		
	}

public static void drawSquare(String[] args) {
	commander.setSpeed(100);
	commander.move(100);
	commander.turn(90);
}




	
	


