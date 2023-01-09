import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class main
{
    public static void main(String[] args)
    {
        Window w = new Window();
        w.window();
    }
}
class Window
{
    private static void exit()
    {
        System.exit(0);
    }
    public static void window()
    {
        JFrame okno = new JFrame("Main window");
        JButton btn  = new JButton("exit");
        JButton msg = new JButton("msg");
        JTextField textField = new JTextField(null);
        textField.setBounds(50,100,200,30);
        msg.setActionCommand("msg is pressed!");
        msg.setBounds(80,200,85,20);
        btn.setBounds(180,200,85,20);
  
        msg.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 textField.setText(e.getActionCommand());
                
            }
       });
       btn.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
                exit();
        }
   });

        okno.add(btn);
        okno.add(msg);
        okno.add(textField);
        okno.setSize(300, 300);
        okno.setLayout(null);
        okno.setVisible(true);
    }
}