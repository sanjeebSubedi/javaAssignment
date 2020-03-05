import javax.swing.*;
import java.awt.*;

public class NoLayout  {
	public NoLayout(){
		JFrame frame = new JFrame("NoLayout Test");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setLayout(null);
	    JButton b1 = new JButton("b1");
	    b1.setBounds(20, 20, 100, 20);
	    JButton b2 = new JButton("b2");
	    b2.setBounds(124, 25, 100, 20);
	    frame.add(b1);
	    frame.add(b2);
	    frame.setSize(300, 100);
	    frame.setVisible(true);
	}
  public static void main(String[] args) {
  	new NoLayout();  
  }
}
