 import javax.swing.*;//графическая библиотека
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;//слушатель кнопки
public class main
{
    public static void main(String[] args)
    {
        MainWindow w = new MainWindow();
        w.window();
    }
}
class MessageBox
{
    private static void exit()
    {
        System.exit(0);
    }
    public void window()
    {
        JFrame messagebox = new JFrame("выход");
        JButton yes = new JButton("Да");
        JButton no = new JButton("нет");
        JLabel label = new JLabel("Вы действительно хотите выйти?");
        label.setBounds(1,5,800,50);
        yes.setLocation(10,60);
        yes.setSize(80,20);
        no.setLocation(160,60);
        no.setSize(80,20);
        yes.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {   
                exit();      
            }
        });
        no.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {   
                messagebox.dispose();
                MainWindow w = new MainWindow();
                w.window();       
            }
        });
        messagebox.add(label);
        messagebox.add(yes);
        messagebox.add(no);
        messagebox.setSize(250,120);
        messagebox.setLocationRelativeTo(null);
        messagebox.setLayout(null);
        messagebox.setVisible(true);
    }
}
class Settings
{
 
    public static void window()
    {
        JFrame settings = new JFrame("settings");
        JButton exit  = new JButton("выход");
        exit.setLocation(310,340);
        exit.setSize(80,20);
       exit.addActionListener(new ActionListener() 
       {
        public void actionPerformed(ActionEvent e) 
        {   
            settings.dispose();//закрыть окно,если оно не используется
            MainWindow w = new MainWindow();
            w.window();      
        }
        });

        settings.add(exit);
        settings.setSize(400, 400);
        settings.setLocationRelativeTo(null);
        settings.setLayout(null);
        settings.setVisible(true);
    }
}
class MainWindow
{
    public void window()
    {
        Settings sett = new Settings();
        MessageBox MB = new MessageBox();
        JFrame window = new JFrame("калькулятор");
        JButton exit  = new JButton("выход");
        JButton settings = new JButton("настройки");
        JButton nine = new JButton("9");
        JButton eight = new JButton("8");
        JButton seven = new JButton("7");
        JButton six = new JButton("6");
        JButton five = new JButton("5");
        JButton four = new JButton("4");
        JButton three = new JButton("3");
        JButton two = new JButton("2");
        JButton one = new JButton("1");
        JButton zero = new JButton("0");
        JTextField textField = new JTextField();
        textField.setLocation(80,10);
        textField.setSize(240,30);
        exit.setLocation(310,340);
        exit.setSize(80,20);
        settings.setLocation(10,340);
        settings.setSize(120,20);
        nine.setLocation(80,50);
        nine.setSize(80,60);
        eight.setLocation(160,50);
        eight.setSize(80,60);
        seven.setLocation(240,50);
        seven.setSize(80,60);
        six.setLocation(80,110);
        six.setSize(80,60);
        five.setLocation(160,110);
        five.setSize(80,60);
        four.setLocation(240,110);
        four.setSize(80,60);
        three.setLocation(80,170);
        three.setSize(80,60);
        two.setLocation(160,170);
        two.setSize(80,60);
        one.setLocation(240,170);
        one.setSize(80,60);
        settings.addActionListener(new ActionListener()
         {
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
            MB.window();
        }
        });
        window.add(textField);
        window.add(exit);
        window.add(settings);
        window.add(nine);
        window.add(eight);
        window.add(seven);
        window.add(six);
        window.add(five);
        window.add(four);
        window.add(three);
        window.add(two);
        window.add(one);
        window.setSize(400, 400);
        window.setLocationRelativeTo(null);
        window.setLayout(null);
        window.setVisible(true);
    }
}