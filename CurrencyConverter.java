package currencyConverter;
import java.awt.*;
import javax.swing.*;
public class CurrencyConverter
{public static void main(String[] ar)
 {try
    {UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());}
  catch(Throwable e)
    {e.printStackTrace();}
  EventQueue.invokeLater(new Runnable()
                        {public void run()
                         {try
                            {MainWindow mainWindow=new MainWindow();
                             mainWindow.setVisible(true);
                            }
                          catch(Exception e)
                            {e.printStackTrace();}
                          }
                        });
 }
}