import javax.swing.*;

public class gui
{
    public static void main(String args[])
    {
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
      
        JButton button1 = new JButton("Press This Button");
        frame.getContentPane().add(button1);
        frame.setVisible(true);
    }
}
