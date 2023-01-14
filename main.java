 import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class main
{
    public static void main(String[] args)
    {
        MainWindow w = new MainWindow();
        w.window();
    }
}
class Settings
{
 
    public static void window()
    {
        JFrame settings = new JFrame("settings");
        JButton exit  = new JButton("выход");
        exit.setBounds(180,200,90,20);
       exit.addActionListener(new ActionListener() 
       {
        public void actionPerformed(ActionEvent e) 
        {   
            settings.dispose();
            MainWindow w = new MainWindow();
            w.window();       
        }
        });

        settings.add(exit);
        settings.setSize(300, 300);
        settings.setLayout(null);
        settings.setVisible(true);
    }
}
class MainWindow
{
    
    private static void exit()
    {
        System.exit(0);
    }
    public void window()
    {
        Settings sett = new Settings();
        JFrame window = new JFrame("Main window");
        JButton exit  = new JButton("выход");
        JButton settings = new JButton("настройки");
        settings.setBounds(80,200,90,20);
        exit.setBounds(180,200,90,20);
        settings.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) 
            {
                window.dispose();

                sett.window();
            }
       });
       exit.addActionListener(new ActionListener() 
       {
        public void actionPerformed(ActionEvent e) 
        {

                exit();
        }
        });

        window.add(exit);
        window.add(settings);
        window.setSize(300, 300);
        window.setLayout(null);
        window.setVisible(true);
    }
}