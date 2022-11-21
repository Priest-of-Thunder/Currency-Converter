package currencyConverter;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import javax.swing.*;
import javax.swing.border.*;
public class AboutWindow extends JFrame 
{private static final ResourceBundle BUNDLE=ResourceBundle.getBundle("localization.translation");
 private JPanel contentPane;
 private static AboutWindow windowInstance=null;
 private AboutWindow()
 {setTitle(BUNDLE.getString("AboutWindow.this.title"));
  setBounds(100,100,347,260);
  setLocationRelativeTo(null);
  setResizable(false);
  contentPane=new JPanel();
  contentPane.setBorder(new EmptyBorder(5,5,5,5));
  setContentPane(contentPane);
  JLabel lblAuthor=new JLabel(BUNDLE.getString("AboutWindow.lblAuthor.text"));
  lblAuthor.setHorizontalAlignment(SwingConstants.CENTER);
  lblAuthor.setBounds(65,122,219,33);
  JLabel lblLink=new JLabel("http://www.abose.in");
  lblLink.setBounds(65,159,219,33);
  lblLink.setHorizontalAlignment(SwingConstants.CENTER);
  lblLink.setForeground(Color.BLUE);
  lblLink.setCursor(new Cursor(Cursor.HAND_CURSOR));
  lblLink.addMouseListener(new MouseAdapter()
                          {@Override
                           public void mouseClicked(MouseEvent e)
                           {try
                              {Desktop.getDesktop().browse(new URI("http://www.abose.in"));}
                            catch(Exception ex)
                              {ex.printStackTrace();}
                           }
                          });
  contentPane.setLayout(null);
  JLabel lblTitle=new JLabel("Currency Converter");
  lblTitle.setBounds(65,12,219,33);
  lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
  lblTitle.setFont(new Font("Noto Sans",Font.BOLD,15));
  contentPane.add(lblTitle);
  JLabel lblLicenceMit=new JLabel("License GNU GPL v3.0");
  lblLicenceMit.setBounds(65,77,219,33);
  lblLicenceMit.setHorizontalAlignment(SwingConstants.CENTER);
  contentPane.add(lblLicenceMit);
  JLabel lblVersion=new JLabel("Version 1.0");
  lblVersion.setHorizontalAlignment(SwingConstants.CENTER);
  lblVersion.setBounds(65,45,219,33);
  contentPane.add(lblVersion);
  contentPane.add(lblAuthor);
  contentPane.add(lblLink);
}
public static AboutWindow getInstance()
{if(windowInstance==null)
    windowInstance=new AboutWindow();
 return windowInstance;
}
}