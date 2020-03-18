import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
 
public class FocusListenerExample {
 
    public static void main(String args[]) {
 
  JFrame jFrame = new JFrame();
 
  Container cPan = jFrame.getContentPane();
 
  FocusListener focusListener = new FocusListener() {
 
@Override
 
public void focusGained(FocusEvent event) {
 
    printInfo(event);
 
}
 
@Override
 
public void focusLost(FocusEvent event) {
 
    printInfo(event);
 
}
 
private void printInfo(FocusEvent event) {
 
    System.out.println("Source  : " + getComponentName(event.getComponent()));
 
    System.out.println("Opposite : "
 
+ getComponentName(event.getOppositeComponent()));
 
    System.out.println("Temporary: " + event.isTemporary());
 
}
 
private String getComponentName(Component component) {
 
    return (component == null) ? null : component.getName();
 
}
 
  };
 
  JPanel jPanel = new JPanel();
 
  JLabel jLabel = new JLabel("Label 1: ");
 
  JTextField textField = new JTextField("Type Here", 15);
 
  textField.setName("First");
 
  textField.addFocusListener(focusListener);
 
  jLabel.setDisplayedMnemonic(KeyEvent.VK_1);
 
  jLabel.setLabelFor(textField);
 
  jPanel.add(jLabel);
 
  jPanel.add(textField);
 
  cPan.add(jPanel, BorderLayout.NORTH);
 
  jPanel = new JPanel();
 
  jLabel = new JLabel("Label 2: ");
 
  textField = new JTextField("14.0", 10);
 
  textField.setName("Second");
 
  textField.addFocusListener(focusListener);
 
  textField.setHorizontalAlignment(JTextField.RIGHT);
 
  jLabel.setDisplayedMnemonic(KeyEvent.VK_2);
 
  jLabel.setLabelFor(textField);
 
  jPanel.add(jLabel);
 
  jPanel.add(textField);
 
  cPan.add(jPanel, BorderLayout.SOUTH);
 
  jFrame.pack();
 
  jFrame.setVisible(true);
    }
}
