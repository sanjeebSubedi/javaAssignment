import javax.swing.*;
import java.awt.event.*;

class Calculator extends JFrame {
	JTextField number1, number2, result;
	JButton button1, button2;
	

	public Calculator() {
		
	ClickPerformed obj = new ClickPerformed(this);
	
	JLabel label1 = new JLabel("Number 1: ");
	JLabel label2 = new JLabel("Number 2: ");
	JLabel label3 = new JLabel("Result: ");
	
	label1.setBounds(30, 30, 100, 20);
	label2.setBounds(30, 60, 100, 20);
	label3.setBounds(30, 90, 100, 20);
	
	button1 = new JButton("Add");
	button1.addActionListener(obj);
	
	button2 = new JButton("Sub");
	button2.addActionListener(obj);
	
	number1 = new JTextField();
	number2 = new JTextField();
	result = new JTextField();
	
	number1.setBounds(100, 30, 100, 20);
	number2.setBounds(100, 60, 100, 20);
	result.setBounds(100, 90, 100, 20);
	
	button1.setBounds(40, 130, 60, 30);
	button2.setBounds(120, 130, 60, 30);
	
	add(label1);
	add(label2);
	add(label3);
	
	add(number1);
	add(number2);
	add(result);
	add(button1);
    add(button2);
	setLayout(null);
	
	
	setSize(250, 230);
	setVisible(true);
	
	}
	public static void main(String[] args) {
		new Calculator();
	}
}
	
	class ClickPerformed implements ActionListener {
		Calculator cp;
		ClickPerformed(Calculator cp){
			this.cp = cp;
		}
		
		public void actionPerformed(ActionEvent e) {
			
			int num1 = Integer.parseInt(cp.number1.getText().toString());
			int num2 = Integer.parseInt(cp.number2.getText().toString());
			
			if (e.getSource() == cp.button1) {
				cp.result.setText(""+ (num1 + num2));
			}
			else {
				cp.result.setText(""+(num1 - num2));
			}
		}
	
	}
