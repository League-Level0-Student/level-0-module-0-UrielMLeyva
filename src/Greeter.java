import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	String a=JOptionPane.showInputDialog("What's your name?");
	JOptionPane.showMessageDialog(null,"Hello, " + a);
	String b=JOptionPane.showInputDialog("Here's a joke for you. What do they call the protectors of Samsung?");
	JOptionPane.showMessageDialog(null, b);
	JOptionPane.showInputDialog("Guardians of the Galaxy");
}
}
