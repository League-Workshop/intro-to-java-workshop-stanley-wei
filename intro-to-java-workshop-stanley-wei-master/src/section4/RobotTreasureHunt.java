package section4;

import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URI;

import javax.swing.JOptionPane;

//import org.teachingextensions.logo.ImageBackground;
//import org.teachingextensions.logo.Paintable;
//import org.teachingextensions.logo.robot;
import org.jointheleague.graphical.robot.Robot;

public class RobotTreasureHunt implements KeyEventDispatcher{

	// 1. Create a new mini robot (type "mini" inside the parentheses)
	
	private void goUp() throws InterruptedException {
		// 2. Make the robot move up the screen (use setAngle(angle) and microMove(distance))
		
	}

	private void goDown() throws InterruptedException{
		// 3. make the robot move down the screen (use setAngle(angle) and microMove(distance))
		
	}

	private void turnLeft() throws InterruptedException{
		// 4. Make the robot turn to the left (use setAngle(angle) and microMove(distance))

	}

	private void turnRight() throws InterruptedException{
		// 5. make the robot turn to the right (use setAngle(angle) and microMove(distance))
		
	}

	private void spaceBarWasPressed() {

		// 5. Change ROBOTNAME below to match the name of the robot you created in step 1.  THEN, remove the slashes at the beginning of the next two lines
		//int robotXLocation = ROBOTNAME.getX();
		//int robotYLocation = ROBOTNAME.getY();
		
		// 6. Print the robotXLocation and robotYLocation variables to the console 
		
		// 7. If robot is at same location as the little girl
		//      --make a pop-up tell the robot where to go next
		
		// 8. Give the user subsequent clues at different locations on the image
		// (pirate robot, swamp, parrots, etc.)
		
		// 9.  If the robot is in the final location
		//     --call the treasureFound() method
		
	}

	private void go() {
		KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
		Robot.setWindowImage("day4/treasure_hunt.jpg");
	
		JOptionPane.showMessageDialog(null, "Ask the girl for help with your quest. Press the space bar to ask.");

	}

	public boolean dispatchKeyEvent(KeyEvent e) {
		if (e.getID() == KeyEvent.KEY_PRESSED) {
			if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				try {
					turnRight();
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
			else if (e.getKeyCode() == KeyEvent.VK_LEFT)
				try {
					turnLeft();
				} catch (InterruptedException e2) {
					e2.printStackTrace();
				}
			else if (e.getKeyCode() == 38)
				try {
					goUp();
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			else if (e.getKeyCode() == KeyEvent.VK_DOWN)
				try {
					goDown();
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			else if (e.getKeyCode() == KeyEvent.VK_SPACE)
				spaceBarWasPressed();
		}
		return false;
	}
	
	static void treasureFound() {
		try {
			URI uri = new URI("https://www.youtube.com/watch?v=G0aIg4N6aro");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public static void main (String[] args) throws MalformedURLException {
		new RobotTreasureHunt().go();
	}
}
