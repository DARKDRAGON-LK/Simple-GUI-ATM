import java.awt.Dimension;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class login extends MainFunctions 
{
    static JButton loginnext;
    static JTextField accnum;

    static JTextField psb;
    static JButton pscb;
    static boolean accountisunveryfied = true;
    static JFrame logframe;

    public static void main (String[] args) throws Exception{

        databaseinitialization();

        logframe = new JFrame();
        logframe.setSize(500, 300);
        logframe.setResizable(false);
        logframe.setTitle("ATM Login : Central Bank");
        logframe.setLayout(null);
		logframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        logframe.setLocationRelativeTo(null);

        JLabel logo=new JLabel(new ImageIcon("aabcr 2.png"));
		logo.setBounds(0,0,500, 70);
        logo.setVerticalAlignment(JLabel.CENTER);
        logo.setHorizontalAlignment(JLabel.CENTER);
		logframe.add(logo);

        JLabel title = new JLabel();
        title.setBounds(0,80,500,70);
        title.setText("Enter Account Number");
        title.setVerticalAlignment(JLabel.CENTER);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setFont(new Font("",Font.BOLD,24));
        logframe.add(title);

        accnum = new JTextField();
        accnum.setBounds(150, 150, 200, 50);
        accnum.setPreferredSize(new Dimension(250,50));
        accnum.setFont(new Font("",Font.BOLD,25));
        accnum.setHorizontalAlignment(JTextField.CENTER);
        logframe.add(accnum);

        loginnext = new JButton("Next");
        loginnext.setBounds(200, 210, 100, 30);
        loginnext.addActionListener(new ActionListener()
                {
                 public void actionPerformed(ActionEvent e)
                {
                    if(e.getSource()== loginnext){
                        Ac_No = accnum.getText();
                        if(AccountisInvalid()){
                            JOptionPane.showMessageDialog(null,"Entered Account Number is Invalid.","Invalid Account Number",JOptionPane.WARNING_MESSAGE);
                        }else{
                            password();
                        }
                    }
                }
            });
        logframe.add(loginnext);


        logframe.setVisible(true);
    }
    public static void password(){
    
        JFrame psf = new JFrame();
        psf.setSize(400, 200);
        psf.setResizable(false);
        psf.setTitle("ATM PIN Number : Central Bank");
        psf.setLayout(null);
        psf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        psf.setLocationRelativeTo(null);

        JLabel title = new JLabel();
        title.setBounds(0,0,400,70);
        title.setText("Enter PIN Number");
        title.setVerticalAlignment(JLabel.CENTER);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setFont(new Font("",Font.BOLD,16));
        psf.add(title);

        psb = new JPasswordField();
        psb.setBounds(130, 60, 150, 30);
        psb.setPreferredSize(new Dimension(150,30));
        psb.setFont(new Font("",Font.BOLD,20));
        psb.setHorizontalAlignment(JTextField.CENTER);
        psf.add(psb);

        pscb = new JButton("Login");
        pscb.setBounds(150, 100, 100, 30);
        pscb.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()== pscb){
                    Ac_Pin = psb.getText();
                        if(PinisInvalid()){
                            JOptionPane.showMessageDialog(null,"Entered PIN Number is Invalid.","Invalid PIN Number",JOptionPane.WARNING_MESSAGE);
                         }else{
                            MainMenu.mainMenu();
                            psf.dispose();
                            logframe.dispose();
                        }
                    }   
                }
        });
        psf.add(pscb);

        psf.setVisible(true);
    }    
}