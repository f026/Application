import javax.swing.*;//графическая библиотека
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;//слушатель кнопки
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
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
        try{ 
            settings.setIconImage(ImageIO.read(new File("images/calc.jpg")));
         }
         catch(IOException e)
         {
            e.printStackTrace();
         }
        settings.add(exit);
        settings.setSize(400, 400);
        settings.setLocationRelativeTo(null);
        settings.setLayout(null);
        settings.setVisible(true);
    }
}
class MainWindow
{
    final int buttonHeight = 80;
    final int buttonWidth = 60;
    int cols = 0;
    String text = "";
    public void window()
    {
        JTextField textField = new JTextField();
        Settings sett = new Settings();
        MessageBox MB = new MessageBox();
        JFrame window = new JFrame("калькулятор");
        JButton exit  = new JButton("выход");
        JButton settings = new JButton("настройки");
        ImageIcon nine_icon = new ImageIcon("images/9.png"); 
        ImageIcon eight_icon = new ImageIcon("images/8.png");
        ImageIcon seven_icon = new ImageIcon("images/7.png");
        ImageIcon six_icon = new ImageIcon("images/6.png");
        ImageIcon five_icon = new ImageIcon("images/5.png");
        ImageIcon four_icon = new ImageIcon("images/4.png");
        ImageIcon three_icon = new ImageIcon("images/3.png");
        ImageIcon two_icon = new ImageIcon("images/2.png");
        ImageIcon one_icon = new ImageIcon("images/1.png");
        JButton nine = new JButton();
        nine.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                text = "9";
                cols = cols+1;
                for(int i = 0;i<cols-1;i++)
                {
                    text = text+9;
                }
                textField.setText(text);          
            }
        });
        nine.setIcon(nine_icon);
        JButton eight = new JButton();
        eight.setIcon(eight_icon);
        eight.addActionListener(new ActionListener()
        {
           public void actionPerformed(ActionEvent e) 
           {
                text = "8";
                cols = cols+1;
                for(int i = 0;i<cols-1;i++)
                {
                    text = text+8;
                }
                textField.setText(text);
                 
           }
        });
      exit.addActionListener(new ActionListener() 
      {
       public void actionPerformed(ActionEvent e) 
       {
           MB.window();
       }
       });
        JButton seven = new JButton();
        seven.setIcon(seven_icon);
        JButton six = new JButton();
        six.setIcon(six_icon);
        JButton five = new JButton();
        five.setIcon(five_icon);
        JButton four = new JButton();
        four.setIcon(four_icon);
        JButton three = new JButton();
        three.setIcon(three_icon);
        JButton two = new JButton();
        two.setIcon(two_icon);
        JButton one = new JButton();
        one.setIcon(one_icon);
        JButton zero = new JButton();
        
        textField.setLocation(80,10);
        textField.setSize(240,30);
        exit.setLocation(310,340);
        exit.setSize(80,20);
        settings.setLocation(10,340);
        settings.setSize(120,20);
        seven.setLocation(80,50);
        seven.setSize(80,60);
        eight.setLocation(160,50);
        eight.setSize(80,60);
        nine.setLocation(240,50);
        nine.setSize(80,60);
        four.setLocation(80,110);
        four.setSize(80,60);
        five.setLocation(160,110);
        five.setSize(80,60);
        six.setLocation(240,110);
        six.setSize(80,60);
        one.setLocation(80,170);
        one.setSize(80,60);
        two.setLocation(160,170);
        two.setSize(80,60);
        three.setLocation(240,170);
        three.setSize(80,60);
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
        }
        );
        try{ 
            window.setIconImage(ImageIO.read(new File("images/calc.jpg")));
         }
         catch(IOException e)
         {
            e.printStackTrace();
         }
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