import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

public class MainMenu extends MainFunctions
{
    static JButton Chkbla,withd,Depo,sms,cnpin,logout;
    static JFrame Mmenu;
    public static void mainMenu(){

        Mmenu = new JFrame();
		Mmenu.setSize(700, 500);
        Mmenu.setResizable(false);
		Mmenu.setTitle("Automated Teller Machine : Central Bank");
        Mmenu.setLayout(null);
		Mmenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Mmenu.setLocationRelativeTo(null);

		JLabel Time=new JLabel();
		Time.setBounds(0,0,150, 70);
		new javax.swing.Timer(0, new ActionListener()   {

            @Override
            public void actionPerformed(ActionEvent e) {
               SimpleDateFormat timenow =new SimpleDateFormat("hh:mm:ss a");
               Date LocalTime =  new Date();
               Time.setText(timenow.format(LocalTime));
            }      
        }).start();
        Time.setFont(new Font("",Font.BOLD,16));
        Time.setHorizontalTextPosition(JLabel.CENTER);
        Time.setVerticalTextPosition(JLabel.CENTER);
        Time.setVerticalAlignment(JLabel.CENTER);
        Time.setHorizontalAlignment(JLabel.CENTER);
		Mmenu.add(Time);

		JLabel logo=new JLabel(new ImageIcon("aabcr 2.png"));
		logo.setBounds(150,0,400, 70);
        logo.setVerticalAlignment(JLabel.CENTER);
        logo.setHorizontalAlignment(JLabel.CENTER);
		Mmenu.add(logo);

		JLabel  date=new JLabel();
		date.setBounds(550,0,150, 70);
		SimpleDateFormat datenow = new SimpleDateFormat("dd-MM-yyyy");
		Date LocalDate = new Date();
		date.setText(datenow.format(LocalDate));
        date.setFont(new Font("",Font.BOLD,16));
        date.setHorizontalTextPosition(JLabel.CENTER);
        date.setVerticalTextPosition(JLabel.CENTER);
        date.setVerticalAlignment(JLabel.CENTER);
        date.setHorizontalAlignment(JLabel.CENTER);
		Mmenu.add(date);

        JLabel Welcomemsg = new JLabel();
        Welcomemsg.setBounds(0,80,700, 70);
        Welcomemsg.setHorizontalTextPosition(JLabel.CENTER);
        Welcomemsg.setVerticalTextPosition(JLabel.CENTER);
        Welcomemsg.setVerticalAlignment(JLabel.CENTER);
        Welcomemsg.setHorizontalAlignment(JLabel.CENTER);
        Welcomemsg.setText("Welcome,"+Bank_Client[Client_ID][0]);
        Welcomemsg.setFont(new Font("",Font.BOLD,20));
        Mmenu.add(Welcomemsg);

        Chkbla = new JButton("Account Balance");
        Chkbla.setBounds(75, 150, 150, 70);
        Chkbla.addActionListener(new ActionListener(){

            @Override
              public void actionPerformed(ActionEvent e) {
                if (e.getSource() == Chkbla){
                    acbalance();
                    Mmenu.dispose();
                }
        
            }
        }); 
        Mmenu.add(Chkbla);
        
        withd = new JButton("Money Withdraw");
        withd.setBounds(75, 240, 150, 70);
        withd.addActionListener(new ActionListener(){

            @Override
              public void actionPerformed(ActionEvent e) {
                if (e.getSource() == withd){
                    MoneyWithdraw();
                    Mmenu.dispose();
                }
        
            }
        }); 
        Mmenu.add(withd);

        Depo = new JButton("Money Deposit");
        Depo.setBounds(75, 330, 150, 70);
        Depo.addActionListener(new ActionListener(){

            @Override
              public void actionPerformed(ActionEvent e) {
                if (e.getSource() == Depo){
                    MoneyDeposit();
                    Mmenu.dispose();
                }
        
            }
        }); 
        Mmenu.add(Depo);

        sms = new JButton("SMS Service");
        sms.setBounds(450, 150, 150, 70);
        sms.addActionListener(new ActionListener(){

            @Override
              public void actionPerformed(ActionEvent e) {
                if (e.getSource() == sms){
                    SMSService();
                }
        
            }
        }); 
        Mmenu.add(sms);
        
        cnpin = new JButton("Change PIN");
        cnpin.setBounds(450, 240, 150, 70);
        cnpin.addActionListener(new ActionListener(){

            @Override
              public void actionPerformed(ActionEvent e) {
                if (e.getSource() == cnpin){
                    ChangePIN();
                }
        
            }
        }); 
        Mmenu.add(cnpin);

        logout = new JButton("Logout");
        logout.setBounds(450, 330, 150, 70);
        logout.addActionListener(new ActionListener(){

            @Override
              public void actionPerformed(ActionEvent e) {
                if (e.getSource() == logout){
                    Logout();
                }
        
            }
        }); 
        Mmenu.add(logout);

        JButton exit = new JButton("Exit");
        exit.setBounds(300, 400, 80, 40);
        exit.setForeground(Color.RED);
        exit.addActionListener(new ActionListener(){
            @Override
              public void actionPerformed(ActionEvent e) {
                if (e.getSource() == exit){
                    Exitmsg();
                }
        
            }
        }); 
        Mmenu.add(exit);

        JLabel swvr = new JLabel();
        swvr.setBounds(565, 433, 100, 30);
        swvr.setText("Version : 1.0.1");
        Mmenu.add(swvr);

        Icon img = new ImageIcon("infoicon.png");
        JButton info = new JButton(img);
        info.setBounds(650, 440, 16, 16);
        info.setBorderPainted(false);
        info.addActionListener(new ActionListener(){
            @Override
              public void actionPerformed(ActionEvent e) {
                if (e.getSource() == info){
                    Credits();
                }
        
            }
        }); 
        Mmenu.add(info);

		Mmenu.setVisible(true);
    }
    public static void acbalance(){

        JFrame acbal = new JFrame();
        acbal.setSize(700, 500);
        acbal.setResizable(false);
		acbal.setTitle("Account Balance : Central Bank");
        acbal.setLayout(null);
		acbal.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        acbal.setLocationRelativeTo(null);

        JLabel Time=new JLabel();
		Time.setBounds(0,0,150, 70);
		new javax.swing.Timer(0, new ActionListener()   {

            @Override
            public void actionPerformed(ActionEvent e) {
               SimpleDateFormat timenow =new SimpleDateFormat("hh:mm:ss a");
               Date LocalTime =  new Date();
               Time.setText(timenow.format(LocalTime));
            }      
        }).start();
        Time.setHorizontalTextPosition(JLabel.CENTER);
        Time.setVerticalTextPosition(JLabel.CENTER);
        Time.setVerticalAlignment(JLabel.CENTER);
        Time.setHorizontalAlignment(JLabel.CENTER);
		acbal.add(Time);

		JLabel logo=new JLabel(new ImageIcon("aabcr 2.png"));
		logo.setBounds(150,0,400, 70);
        logo.setVerticalAlignment(JLabel.CENTER);
        logo.setHorizontalAlignment(JLabel.CENTER);
		acbal.add(logo);

		JLabel  date=new JLabel();
		date.setBounds(550,0,150, 70);
		SimpleDateFormat datenow = new SimpleDateFormat("dd-MM-yyyy");
		Date LocalDate = new Date();
		date.setText(datenow.format(LocalDate));
        date.setHorizontalTextPosition(JLabel.CENTER);
        date.setVerticalTextPosition(JLabel.CENTER);
        date.setVerticalAlignment(JLabel.CENTER);
        date.setHorizontalAlignment(JLabel.CENTER);
		acbal.add(date);
        
        JLabel title = new JLabel();
        title.setBounds(0,80,700, 70);
        title.setText(" Account Balance");
        title.setVerticalAlignment(JLabel.CENTER);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setFont(new Font("",Font.BOLD,24));
        acbal.add(title);

        JLabel AccNo = new JLabel();
        AccNo.setBounds(0,160,350, 70);
        AccNo.setText("Account Number : ");
        AccNo.setVerticalAlignment(JLabel.CENTER);
        AccNo.setHorizontalAlignment(JLabel.RIGHT);
        AccNo.setFont(new Font("",Font.BOLD,20));
        acbal.add(AccNo);

        JLabel AccNoText = new JLabel();
        AccNoText.setBounds(350,160,350, 70);
        AccNoText.setText(Bank_Client[Client_ID][1]);
        AccNoText.setVerticalAlignment(JLabel.CENTER);
        AccNoText.setFont(new Font("",Font.BOLD,20));
        acbal.add(AccNoText);

        JLabel Acctype = new JLabel();
        Acctype.setBounds(0,190,350, 70);
        Acctype.setText("Account Type : ");
        Acctype.setVerticalAlignment(JLabel.CENTER);
        Acctype.setHorizontalAlignment(JLabel.RIGHT);
        Acctype.setFont(new Font("",Font.BOLD,20));
        acbal.add(Acctype);

        JLabel Acctypetxt = new JLabel();
        Acctypetxt.setBounds(350,190,350, 70);
        Acctypetxt.setText(Bank_Client[Client_ID][2]);
        Acctypetxt.setVerticalAlignment(JLabel.CENTER);
        Acctypetxt.setFont(new Font("",Font.BOLD,20));
        acbal.add(Acctypetxt);

        JLabel Accbal = new JLabel();
        Accbal.setBounds(0,220,350, 70);
        Accbal.setText("Account Balance : ");
        Accbal.setVerticalAlignment(JLabel.CENTER);
        Accbal.setHorizontalAlignment(JLabel.RIGHT);
        Accbal.setFont(new Font("",Font.BOLD,20));
        acbal.add(Accbal);

        JLabel AccBalText = new JLabel();
        AccBalText.setBounds(350,220,350, 70);
        AccBalText.setText("Rs. "+Bank_Client[Client_ID][5]+".00");
        AccBalText.setVerticalAlignment(JLabel.CENTER);
        AccBalText.setFont(new Font("",Font.BOLD,20));
        acbal.add(AccBalText);

        JLabel Wdbal = new JLabel();
        Wdbal.setBounds(0,250,350, 70);
        Wdbal.setText("Withdrawble Ammount : ");
        Wdbal.setVerticalAlignment(JLabel.CENTER);
        Wdbal.setHorizontalAlignment(JLabel.RIGHT);
        Wdbal.setFont(new Font("",Font.BOLD,20));
        acbal.add(Wdbal);

        JLabel WdbalText = new JLabel();
        WdbalText.setBounds(350,250,350, 70);
        int WAccountBalance = Integer.parseInt(Bank_Client[Client_ID][5]);
        WAccountBalance = WAccountBalance - 1000;
        if(isLocalbank()){
            WdbalText.setText("Rs. "+Bank_Client[Client_ID][5]+".00");
        }else{
            WdbalText.setText("Rs. "+WAccountBalance+".00");
        }
        WdbalText.setVerticalAlignment(JLabel.CENTER);
        WdbalText.setFont(new Font("",Font.BOLD,20));
        acbal.add(WdbalText);

        JButton Accbalbt = new JButton("Main Menu");
        Accbalbt.setBounds(290, 350, 100, 50);
        Accbalbt.setHorizontalAlignment(JButton.CENTER);
        Accbalbt.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()== Accbalbt){
                    MainMenu.mainMenu();
                    acbal.dispose();
                }   
            }
        });
        acbal.add(Accbalbt);

        acbal.setVisible(true);
    }
    public static void MoneyWithdraw(){

        JFrame monwidth = new JFrame();
        monwidth.setSize(700, 500);
        monwidth.setResizable(false);
		monwidth.setTitle("Money Withdraw : Central Bank");
        monwidth.setLayout(null);
		monwidth.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        monwidth.setLocationRelativeTo(null);

        JLabel Time=new JLabel();
		Time.setBounds(0,0,150, 70);
		new javax.swing.Timer(0, new ActionListener()   {

            @Override
            public void actionPerformed(ActionEvent e) {
               SimpleDateFormat timenow =new SimpleDateFormat("hh:mm:ss a");
               Date LocalTime =  new Date();
               Time.setText(timenow.format(LocalTime));
            }      
        }).start();
        Time.setHorizontalTextPosition(JLabel.CENTER);
        Time.setVerticalTextPosition(JLabel.CENTER);
        Time.setVerticalAlignment(JLabel.CENTER);
        Time.setHorizontalAlignment(JLabel.CENTER);
		monwidth.add(Time);

		JLabel logo=new JLabel(new ImageIcon("aabcr 2.png"));
		logo.setBounds(150,0,400, 70);
        logo.setVerticalAlignment(JLabel.CENTER);
        logo.setHorizontalAlignment(JLabel.CENTER);
		monwidth.add(logo);

		JLabel  date=new JLabel();
		date.setBounds(550,0,150, 70);
		SimpleDateFormat datenow = new SimpleDateFormat("dd-MM-yyyy");
		Date LocalDate = new Date();
		date.setText(datenow.format(LocalDate));
        date.setHorizontalTextPosition(JLabel.CENTER);
        date.setVerticalTextPosition(JLabel.CENTER);
        date.setVerticalAlignment(JLabel.CENTER);
        date.setHorizontalAlignment(JLabel.CENTER);
		monwidth.add(date);
        
        JLabel title = new JLabel();
        title.setBounds(0,80,700, 70);
        title.setText("Money Withdraw");
        title.setVerticalAlignment(JLabel.CENTER);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setFont(new Font("",Font.BOLD,24));
        monwidth.add(title);

        JLabel AccNo = new JLabel();
        AccNo.setBounds(0,160,350, 70);
        AccNo.setText("Account Number : ");
        AccNo.setVerticalAlignment(JLabel.CENTER);
        AccNo.setHorizontalAlignment(JLabel.RIGHT);
        AccNo.setFont(new Font("",Font.BOLD,20));
        monwidth.add(AccNo);

        JLabel AccNoText = new JLabel();
        AccNoText.setBounds(350,160,350, 70);
        AccNoText.setText(Bank_Client[Client_ID][1]);
        AccNoText.setVerticalAlignment(JLabel.CENTER);
        AccNoText.setFont(new Font("",Font.BOLD,20));
        monwidth.add(AccNoText);

        JLabel Accbal = new JLabel();
        Accbal.setBounds(0,190,350, 70);
        Accbal.setText("Account Balance : ");
        Accbal.setVerticalAlignment(JLabel.CENTER);
        Accbal.setHorizontalAlignment(JLabel.RIGHT);
        Accbal.setFont(new Font("",Font.BOLD,20));
        monwidth.add(Accbal);

        JLabel AccBalText = new JLabel();
        AccBalText.setBounds(350,190,350, 70);
        AccBalText.setText("Rs. "+Bank_Client[Client_ID][5]+".00");
        AccBalText.setVerticalAlignment(JLabel.CENTER);
        AccBalText.setFont(new Font("",Font.BOLD,20));
        monwidth.add(AccBalText);

        JLabel Wdbal = new JLabel();
        Wdbal.setBounds(0,220,350, 70);
        Wdbal.setText("Withdrawble Ammount : ");
        Wdbal.setVerticalAlignment(JLabel.CENTER);
        Wdbal.setHorizontalAlignment(JLabel.RIGHT);
        Wdbal.setFont(new Font("",Font.BOLD,20));
        monwidth.add(Wdbal);

        JLabel WdbalText = new JLabel();
        WdbalText.setBounds(350,220,350, 70);
        int WAccountBalance = Integer.parseInt(Bank_Client[Client_ID][5]);
        WAccountBalance = WAccountBalance - 1000;
        if(isLocalbank()){
            WdbalText.setText("Rs. "+Bank_Client[Client_ID][5]+".00");
        }else{
            WdbalText.setText("Rs. "+WAccountBalance+".00");
        }
        WdbalText.setVerticalAlignment(JLabel.CENTER);
        WdbalText.setFont(new Font("",Font.BOLD,20));
        monwidth.add(WdbalText);

        JLabel enteram = new JLabel();
        enteram.setBounds(0,250,350, 70);
        enteram.setText("Enter Withdraw Ammount : ");
        enteram.setVerticalAlignment(JLabel.CENTER);
        enteram.setHorizontalAlignment(JLabel.RIGHT);
        enteram.setFont(new Font("",Font.BOLD,20));
        monwidth.add(enteram);

        JLabel rsla = new JLabel();
        rsla.setBounds(88,250,300, 70);
        rsla.setText("Rs. ");
        rsla.setVerticalAlignment(JLabel.CENTER);
        rsla.setHorizontalAlignment(JLabel.RIGHT);
        rsla.setFont(new Font("",Font.BOLD,20));
        monwidth.add(rsla);


        JTextField wdem = new JTextField();
        wdem.setBounds(388,270,100, 30);
        wdem.setPreferredSize(new Dimension(150,30));
        wdem.setHorizontalAlignment(JTextField.RIGHT);
        wdem.setFont(new Font("",Font.BOLD,20));
        monwidth.add(wdem);

        JButton monhmbt = new JButton("Main Menu");
        monhmbt.setBounds(230, 350, 100, 50);
        monhmbt.setHorizontalAlignment(JButton.CENTER);
        monhmbt.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()== monhmbt){
                    MainMenu.mainMenu();
                    monwidth.dispose();
                }   
            }
        });
        monwidth.add(monhmbt);

        JButton mnwithbt = new JButton("Withdraw");
        mnwithbt.setBounds(350, 350, 100, 50);
        mnwithbt.setHorizontalAlignment(JButton.CENTER);
        mnwithbt.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()== mnwithbt){
                    String wdamm = wdem.getText();
                    int Withdraw = Integer.parseInt(wdamm);
		            int AccountBalance = Integer.parseInt(Bank_Client[Client_ID][5]);
                    if(isLocalbank()){
                        if((AccountBalance-Withdraw)>=0){
                            JOptionPane.showMessageDialog(null,"You Have Successfully Withdraw Rs."+Withdraw+".00","Withdraw Successful", JOptionPane.INFORMATION_MESSAGE);
                            int NewBalance =AccountBalance-Withdraw;
                            Bank_Client[Client_ID][5] = String.valueOf(NewBalance);
                            databasefinalizeing();
                            MainMenu.mainMenu();
                            monwidth.dispose();
                        }else{
                            JOptionPane.showMessageDialog(null,"Your Account Balance is Insufficient for this Transaction","Insufficient Balance",JOptionPane.WARNING_MESSAGE);   
                            MainMenu.mainMenu();
                            monwidth.dispose();
                        }
                    }else{
                        if((AccountBalance-Withdraw)>=1000){
                            JOptionPane.showMessageDialog(null,"You Have Successfully Withdraw Rs."+Withdraw+".00","Withdraw Successful", JOptionPane.INFORMATION_MESSAGE);
                            int NewBalance =AccountBalance-Withdraw;
                            Bank_Client[Client_ID][5] = String.valueOf(NewBalance);
                            databasefinalizeing();
                            MainMenu.mainMenu();
                            monwidth.dispose();
                        }else{
                            JOptionPane.showMessageDialog(null,"Your Account Balance is Insufficient for this Transaction","Insufficient Balance",JOptionPane.WARNING_MESSAGE);              
                            MainMenu.mainMenu();
                            monwidth.dispose();
                        }
                    }
                }   
            }
        });
        monwidth.add(mnwithbt);

        monwidth.setVisible(true);
    }
    public static void MoneyDeposit(){

        JFrame mondepo = new JFrame();
        mondepo.setSize(700, 500);
        mondepo.setResizable(false);
		mondepo.setTitle("Money Deposit : Central Bank");
        mondepo.setLayout(null);
		mondepo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mondepo.setLocationRelativeTo(null);

        JLabel Time=new JLabel();
		Time.setBounds(0,0,150, 70);
		new javax.swing.Timer(0, new ActionListener()   {

            @Override
            public void actionPerformed(ActionEvent e) {
               SimpleDateFormat timenow =new SimpleDateFormat("hh:mm:ss a");
               Date LocalTime =  new Date();
               Time.setText(timenow.format(LocalTime));
            }      
        }).start();
        Time.setHorizontalTextPosition(JLabel.CENTER);
        Time.setVerticalTextPosition(JLabel.CENTER);
        Time.setVerticalAlignment(JLabel.CENTER);
        Time.setHorizontalAlignment(JLabel.CENTER);
		mondepo.add(Time);

		JLabel logo=new JLabel(new ImageIcon("aabcr 2.png"));
		logo.setBounds(150,0,400, 70);
        logo.setVerticalAlignment(JLabel.CENTER);
        logo.setHorizontalAlignment(JLabel.CENTER);
		mondepo.add(logo);

		JLabel  date=new JLabel();
		date.setBounds(550,0,150, 70);
		SimpleDateFormat datenow = new SimpleDateFormat("dd-MM-yyyy");
		Date LocalDate = new Date();
		date.setText(datenow.format(LocalDate));
        date.setHorizontalTextPosition(JLabel.CENTER);
        date.setVerticalTextPosition(JLabel.CENTER);
        date.setVerticalAlignment(JLabel.CENTER);
        date.setHorizontalAlignment(JLabel.CENTER);
		mondepo.add(date);
        
        JLabel title = new JLabel();
        title.setBounds(0,80,700, 70);
        title.setText("Money Deposit");
        title.setVerticalAlignment(JLabel.CENTER);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setFont(new Font("",Font.BOLD,24));
        mondepo.add(title);

        JLabel accno = new JLabel();
        accno.setBounds(0,140,700, 70);
        accno.setText("Enter Deposit Ammount");
        accno.setVerticalAlignment(JLabel.CENTER);
        accno.setHorizontalAlignment(JLabel.CENTER);
        accno.setFont(new Font("",Font.BOLD,20));
        mondepo.add(accno);   
        
        JLabel rsla = new JLabel();
        rsla.setBounds(84,190,300, 70);
        rsla.setText("Rs. ");
        rsla.setVerticalAlignment(JLabel.CENTER);
        rsla.setHorizontalAlignment(JLabel.CENTER);
        rsla.setFont(new Font("",Font.BOLD,20));
        mondepo.add(rsla);

        JTextField acnoval = new JTextField();
        acnoval.setBounds(260,210,200, 30);
        acnoval.setHorizontalAlignment(JTextField.CENTER);
        acnoval.setFont(new Font("",Font.BOLD,20));
        mondepo.add(acnoval);
        
        JButton monhmbt = new JButton("Main Menu");
        monhmbt.setBounds(240, 300, 100, 50);
        monhmbt.setHorizontalAlignment(JButton.CENTER);
        monhmbt.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()== monhmbt){
                    MainMenu.mainMenu();
                    mondepo.dispose();
                }   
            }
        });
        mondepo.add(monhmbt);

        JButton mndepobt = new JButton("Deposit");
        mndepobt.setBounds(360, 300, 100, 50);
        mndepobt.setHorizontalAlignment(JButton.CENTER);
        mndepobt.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()== mndepobt){
                    String mondepoval = acnoval.getText();
                    int Deposit = Integer.parseInt(mondepoval);
                    int AccountBalance = Integer.parseInt(Bank_Client[Client_ID][5]);
                    int NewBalance =AccountBalance+Deposit;
                    Bank_Client[Client_ID][5] = String.valueOf(NewBalance);
                    JOptionPane.showMessageDialog(null,"You Have Successfully Deposit Rs."+Deposit+".00","Deposite Successful", JOptionPane.INFORMATION_MESSAGE);
                    databasefinalizeing();
                    MainMenu.mainMenu();
                    mondepo.dispose();
                }   
            }
        });
        mondepo.add(mndepobt);

        mondepo.setVisible(true);       

    }
    public static void SMSService(){

        JFrame smssv = new JFrame();
        smssv.setSize(400, 200);
        smssv.setResizable(false);
        smssv.setTitle("SMS Service : Central Bank");
        smssv.setLayout(null);
        smssv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        smssv.setLocationRelativeTo(null);

        JLabel title = new JLabel();
        title.setBounds(30,20,400,70);
        if(isSMSActivated()){
            title.setText("SMS Service is Activated");
        }else{
            title.setText("SMS Service is Deactivated");
        }
        title.setFont(new Font("",Font.BOLD,14));
        title.setVerticalAlignment(JLabel.CENTER);
        smssv.add(title);

        JButton okbt = new JButton("OK");
        okbt.setBounds(160, 110, 100, 30);
        okbt.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()== okbt){
                    smssv.dispose();
                }   
            }
        });
        smssv.add(okbt);
        
        JButton smsact = new JButton();
        if(isSMSActivated()){
            smsact.setText("Deactivate");
        }else{
            smsact.setText("Activate");
        }
        smsact.setBounds(270, 110, 100, 30);
        smsact.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()== smsact){
                    if(isSMSActivated()){
                        JOptionPane.showMessageDialog(null,"SMS Service Successfully Deactivated.","Successfully Deactivated",JOptionPane.INFORMATION_MESSAGE);
                        Bank_Client[Client_ID][6]="Blocked";
                        databasefinalizeing();
                        smssv.dispose();
                    }else{
                        JOptionPane.showMessageDialog(null,"SMS Service Successfully Activated.","Successfully Activated",JOptionPane.INFORMATION_MESSAGE);
                        Bank_Client[Client_ID][6]="Active";
                        databasefinalizeing();
                        smssv.dispose();
                    }
                }   
            }
        });
        smssv.add(smsact);

        smssv.setVisible(true);

    }
    public static void ChangePIN(){

        JFrame cnpin = new JFrame();
        cnpin.setSize(500, 350);
        cnpin.setResizable(false);
        cnpin.setTitle("Change PIN Number : Central Bank");
        cnpin.setLayout(null);
        cnpin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        cnpin.setLocationRelativeTo(null);

        JLabel logo=new JLabel(new ImageIcon("aabcr 2.png"));
		logo.setBounds(0,0,500, 70);
        logo.setVerticalAlignment(JLabel.CENTER);
        logo.setHorizontalAlignment(JLabel.CENTER);
		cnpin.add(logo);

        JLabel oldpwtitle = new JLabel();
        oldpwtitle.setBounds(0,80,250,70);
        oldpwtitle.setText("Enter Current PIN Number : ");
        oldpwtitle.setVerticalAlignment(JLabel.CENTER);
        oldpwtitle.setHorizontalAlignment(JLabel.RIGHT);
        oldpwtitle.setFont(new Font("",Font.BOLD,16));
        cnpin.add(oldpwtitle);

        JTextField oldpw = new JTextField();
        oldpw.setBounds(260, 102, 100, 30);
        oldpw.setPreferredSize(new Dimension(100,30));
        oldpw.setHorizontalAlignment(JTextField.CENTER);
        oldpw.setFont(new Font("",Font.BOLD,20));
        cnpin.add(oldpw);

        
        JLabel newpwtitle = new JLabel();
        newpwtitle.setBounds(0,120,250,70);
        newpwtitle.setText("Enter New PIN Number : ");
        newpwtitle.setVerticalAlignment(JLabel.CENTER);
        newpwtitle.setHorizontalAlignment(JLabel.RIGHT);
        newpwtitle.setFont(new Font("",Font.BOLD,16));
        cnpin.add(newpwtitle);

        JTextField newpw = new JTextField();
        newpw.setBounds(260, 142, 100, 30);
        newpw.setPreferredSize(new Dimension(100,30));
        newpw.setHorizontalAlignment(JTextField.CENTER);
        newpw.setFont(new Font("",Font.BOLD,20));
        cnpin.add(newpw);

        
        JLabel renewtitle = new JLabel();
        renewtitle.setBounds(0,160,250,70);
        renewtitle.setText("Retype New PIN Number : ");
        renewtitle.setVerticalAlignment(JLabel.CENTER);
        renewtitle.setHorizontalAlignment(JLabel.RIGHT);
        renewtitle.setFont(new Font("",Font.BOLD,16));
        cnpin.add(renewtitle);

        JTextField renew = new JTextField();
        renew.setBounds(260, 182, 100, 30);
        renew.setPreferredSize(new Dimension(100,30));
        renew.setHorizontalAlignment(JTextField.CENTER);
        renew.setFont(new Font("",Font.BOLD,20));
        cnpin.add(renew);

        JButton cnpinbt = new JButton("Change PIN");
        cnpinbt.setBounds(200, 230, 100, 30);
        cnpinbt.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()== cnpinbt){
                   Oldpw = oldpw.getText();
                   Newpw = newpw.getText();
                   Renewpw = renew.getText();
                    if(Oldpw.equalsIgnoreCase(Bank_Client[Client_ID][4])){
                        if(Newpw.equalsIgnoreCase(Renewpw)){
                            JOptionPane.showMessageDialog(null,"PIN Number Change Successfully.","Successfully PIN Number Changed",JOptionPane.INFORMATION_MESSAGE);
                            Bank_Client[Client_ID][4] = Newpw;
                            databasefinalizeing();
                            cnpin.dispose();
                        }else{
                            JOptionPane.showMessageDialog(null,"Entered PIN Numbers Doesn't Match. Please Check the Entered PIN and Enter Again.","PIN Numbers Not Match",JOptionPane.WARNING_MESSAGE);    
                        }
                    }else{
                    JOptionPane.showMessageDialog(null,"Entered Current PIN Number is Invalid.","Invalid Cuurent PIN Number",JOptionPane.WARNING_MESSAGE);    
                    }
                    }   
                }
        });
        cnpin.add(cnpinbt);

        cnpin.setVisible(true);

    }
    public static void Logout(){

        JFrame logout = new JFrame();
        logout.setSize(400, 200);
        logout.setResizable(false);
        logout.setTitle("Logout : Central Bank");
        logout.setLayout(null);
        logout.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        logout.setLocationRelativeTo(null);

        JLabel title = new JLabel();
        title.setBounds(15,20,400,70);
        title.setText("Are You Sure to Logout From Your Account?");
        title.setFont(new Font("",Font.BOLD,14));
        title.setVerticalAlignment(JLabel.CENTER);
        logout.add(title);

        JButton logoutyes = new JButton("Yes");
        logoutyes.setBounds(160, 110, 100, 30);
        logoutyes.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()== logoutyes){
                        databasefinalizeing();
                        try {
                            login.main(null);
                        } catch (Exception e1) {
                            // TODO Auto-generated catch block
                            e1.printStackTrace();
                        }
                    logout.dispose();
                    Mmenu.dispose();
                }   
            }
        });
        logout.add(logoutyes);

        JButton logoutno = new JButton("No");
        logoutno.setBounds(270, 110, 100, 30);
        logoutno.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()== logoutno){
                    logout.dispose();
                }   
            }
        });
        logout.add(logoutno);

        logout.setVisible(true);
    }
    public static void Exitmsg(){

        JFrame exit = new JFrame();
        exit.setSize(500, 250);
        exit.setTitle("Thank You : Central Bank");
        exit.setResizable(false);
        exit.setLayout(null);
        exit.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        exit.setLocationRelativeTo(null);

        JLabel logo=new JLabel(new ImageIcon("aabcr 2.png"));
		logo.setBounds(0,0,500, 70);
        logo.setVerticalAlignment(JLabel.CENTER);
        logo.setHorizontalAlignment(JLabel.CENTER);
		exit.add(logo);

        JLabel thank = new JLabel();
        thank.setBounds(0,80,500,70);
        thank.setText("Thank you for Banking with Us...");
        thank.setVerticalAlignment(JLabel.CENTER);
        thank.setHorizontalAlignment(JLabel.CENTER);
        thank.setFont(new Font("",Font.BOLD,20));
        exit.add(thank);

        JButton thankok = new JButton("OK");
        thankok.setBounds(200, 150, 100, 30);
        thankok.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()== thankok){
                   exit.dispose();
                   Creditsex();
                   //System.exit(0);
                }   
            }
        });
        exit.add(thankok);

        exit.setVisible(true);

    }
    public static void Credits(){

        JFrame credit = new JFrame();
        credit.setSize(500, 350);
        credit.setResizable(false);
        credit.setTitle("Software Info : Central Bank");
        credit.setLayout(null);
        credit.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        credit.setLocationRelativeTo(null);

        JLabel logo=new JLabel(new ImageIcon("aabcr 2.png"));
		logo.setBounds(0,0,500, 70);
        logo.setVerticalAlignment(JLabel.CENTER);
        logo.setHorizontalAlignment(JLabel.CENTER);
		credit.add(logo);

        JLabel title = new JLabel();
        title.setBounds(0,60,500,70);
        title.setText("ATM System : Central Bank");
        title.setVerticalAlignment(JLabel.CENTER);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setFont(new Font("",Font.BOLD,20));
        credit.add(title);

        JLabel softv = new JLabel();
        softv.setBounds(0,90,250, 70);
        softv.setText("Software Version :");
        softv.setVerticalAlignment(JLabel.CENTER);
        softv.setHorizontalAlignment(JLabel.RIGHT);
        softv.setFont(new Font("",Font.BOLD,18));
        credit.add(softv);

        JLabel swv = new JLabel();
        swv.setBounds(250,90,250, 70);
        swv.setText(" 1.0.1");
        swv.setVerticalAlignment(JLabel.CENTER);
        swv.setFont(new Font("",Font.BOLD,18));
        credit.add(swv);

        JLabel javatv = new JLabel();
        javatv.setBounds(255,110,250, 70);
        String javavtx = System.getProperty("java.version");
        javatv.setText(javavtx);
        javatv.setVerticalAlignment(JLabel.CENTER);
        javatv.setFont(new Font("",Font.BOLD,16));
        credit.add(javatv);

        JLabel jk = new JLabel();
        jk.setBounds(0,110,250, 70);
        jk.setText("Java Version :");
        jk.setVerticalAlignment(JLabel.CENTER);
        jk.setHorizontalAlignment(JLabel.RIGHT);
        jk.setFont(new Font("",Font.BOLD,18));
        credit.add(jk);

        JLabel auth = new JLabel();
        auth.setBounds(0,130,250, 70);
        auth.setText("Developed By :");
        auth.setVerticalAlignment(JLabel.CENTER);
        auth.setHorizontalAlignment(JLabel.RIGHT);
        auth.setFont(new Font("",Font.BOLD,18));
        credit.add(auth);

        JLabel name = new JLabel();
        name.setBounds(250,130,250, 70);
        name.setText(" L C J Samarasekara");
        name.setVerticalAlignment(JLabel.CENTER);
        name.setFont(new Font("",Font.BOLD,18));
        credit.add(name);

        JLabel hndit = new JLabel();
        hndit.setBounds(0,160,500,70);
        hndit.setText("HNDIT21");
        hndit.setVerticalAlignment(JLabel.CENTER);
        hndit.setHorizontalAlignment(JLabel.CENTER);
        hndit.setFont(new Font("",Font.BOLD,18));
        credit.add(hndit);

        JLabel copyright = new JLabel();
        copyright.setBounds(0,180,500,70);
        copyright.setText("All Rights Reserved");
        copyright.setVerticalAlignment(JLabel.CENTER);
        copyright.setHorizontalAlignment(JLabel.CENTER);
        copyright.setFont(new Font("",Font.BOLD,18));
        credit.add(copyright);

        JLabel year = new JLabel();
        year.setBounds(0,200,500,70);
        year.setText("\u00a9 2022");
        year.setVerticalAlignment(JLabel.CENTER);
        year.setHorizontalAlignment(JLabel.CENTER);
        year.setFont(new Font("",Font.BOLD,18));
        credit.add(year);

        JButton crok = new JButton("OK");
        crok.setBounds(200, 270, 100, 30);
        crok.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()== crok){
                   credit.dispose();
                }   
            }
        });
        credit.add(crok);

        credit.setVisible(true);
    }
    public static void Creditsex(){
        
        JFrame credit = new JFrame();
        credit.setSize(500, 350);
        credit.setResizable(false);
        credit.setTitle("Software Info : Central Bank");
        credit.setLayout(null);
        credit.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        credit.setLocationRelativeTo(null);

        JLabel logo=new JLabel(new ImageIcon("aabcr 2.png"));
		logo.setBounds(0,0,500, 70);
        logo.setVerticalAlignment(JLabel.CENTER);
        logo.setHorizontalAlignment(JLabel.CENTER);
		credit.add(logo);

        JLabel title = new JLabel();
        title.setBounds(0,60,500,70);
        title.setText("ATM System : Central Bank");
        title.setVerticalAlignment(JLabel.CENTER);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setFont(new Font("",Font.BOLD,20));
        credit.add(title);

        JLabel softv = new JLabel();
        softv.setBounds(0,90,250, 70);
        softv.setText("Software Version :");
        softv.setVerticalAlignment(JLabel.CENTER);
        softv.setHorizontalAlignment(JLabel.RIGHT);
        softv.setFont(new Font("",Font.BOLD,18));
        credit.add(softv);

        JLabel swv = new JLabel();
        swv.setBounds(250,90,250, 70);
        swv.setText(" 1.0.1");
        swv.setVerticalAlignment(JLabel.CENTER);
        swv.setFont(new Font("",Font.BOLD,18));
        credit.add(swv);

        JLabel javatv = new JLabel();
        javatv.setBounds(255,110,250, 70);
        String javavtx = System.getProperty("java.version");
        javatv.setText(javavtx);
        javatv.setVerticalAlignment(JLabel.CENTER);
        javatv.setFont(new Font("",Font.BOLD,16));
        credit.add(javatv);

        JLabel jk = new JLabel();
        jk.setBounds(0,110,250, 70);
        jk.setText("Java Version :");
        jk.setVerticalAlignment(JLabel.CENTER);
        jk.setHorizontalAlignment(JLabel.RIGHT);
        jk.setFont(new Font("",Font.BOLD,18));
        credit.add(jk);

        JLabel auth = new JLabel();
        auth.setBounds(0,130,250, 70);
        auth.setText("Developed By :");
        auth.setVerticalAlignment(JLabel.CENTER);
        auth.setHorizontalAlignment(JLabel.RIGHT);
        auth.setFont(new Font("",Font.BOLD,18));
        credit.add(auth);

        JLabel name = new JLabel();
        name.setBounds(250,130,250, 70);
        name.setText(" L C J Samarasekara");
        name.setVerticalAlignment(JLabel.CENTER);
        name.setFont(new Font("",Font.BOLD,18));
        credit.add(name);

        JLabel hndit = new JLabel();
        hndit.setBounds(0,160,500,70);
        hndit.setText("HNDIT21");
        hndit.setVerticalAlignment(JLabel.CENTER);
        hndit.setHorizontalAlignment(JLabel.CENTER);
        hndit.setFont(new Font("",Font.BOLD,18));
        credit.add(hndit);

        JLabel copyright = new JLabel();
        copyright.setBounds(0,180,500,70);
        copyright.setText("All Rights Reserved");
        copyright.setVerticalAlignment(JLabel.CENTER);
        copyright.setHorizontalAlignment(JLabel.CENTER);
        copyright.setFont(new Font("",Font.BOLD,18));
        credit.add(copyright);

        JLabel year = new JLabel();
        year.setBounds(0,200,500,70);
        year.setText("\u00a9 2022");
        year.setVerticalAlignment(JLabel.CENTER);
        year.setHorizontalAlignment(JLabel.CENTER);
        year.setFont(new Font("",Font.BOLD,18));
        credit.add(year);

        JButton crok = new JButton("OK");
        crok.setBounds(200, 270, 100, 30);
        crok.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()== crok){
                   credit.dispose();
                   System.exit(0);
                }   
            }
        });
        credit.add(crok);

        credit.setVisible(true);
    }
}