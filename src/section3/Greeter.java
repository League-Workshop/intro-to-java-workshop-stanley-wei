package section3;

import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		String name=JOptionPane.showInputDialog(null,"Name");
		JOptionPane.showMessageDialog(null, "Hello " + name);
	}

}
