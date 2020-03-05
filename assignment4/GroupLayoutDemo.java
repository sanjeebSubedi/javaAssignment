import javax.swing.*;
import java.awt.*;
public class GroupLayoutDemo {
	public GroupLayoutDemo(){
		 JFrame frame = new JFrame("GroupLayout");  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        Container contentPanel = frame.getContentPane();  
        GroupLayout groupLayout = new GroupLayout(contentPanel);  
  
        contentPanel.setLayout(groupLayout);  
  
        JButton b1 = new JButton("Button 1");  
        JButton b2 = new JButton("Button 2");  
  
        groupLayout.setHorizontalGroup(  
                    groupLayout.createSequentialGroup()  
                                .addComponent(b1)  
                                .addGap(10, 20, 100)  
                                .addComponent(b2));  
        groupLayout.setVerticalGroup(  
                     groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)  
                                .addComponent(b1)  
                                .addComponent(b2)); 
        frame.pack();  
        frame.setVisible(true);
	}  
    public static void main(String[] args) {  
         new GroupLayoutDemo();
    }  
}
