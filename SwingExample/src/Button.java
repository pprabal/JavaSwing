import javax.swing.*;
public class Button{
    public static void main(String[] args)
    {
        JFrame frame=new JFrame("My Frame");
        JButton button=new JButton("Click Me");
        button.setBounds(50,100,95,30);
        frame.add(button);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
