import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.* ;
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
        JLabel jl = new JLabel("Bye");
        btn.setBounds(180,200,85,20);

    btn.addActionListener(new ActionListener() 
    {
        public void actionPerformed(ActionEvent e) 
            {
                jl.setBounds(40,40,90,20);

                try 
                {
                    Thread.sleep(2000);
                } 
                catch (InterruptedException e1) 
                {
                    e1.printStackTrace();
                }
                exit();
            }
        });
        okno.add(btn);
        okno.add(jl);
        okno.setSize(300, 300);
        okno.setLayout(null);
        okno.setVisible(true);
    }
}