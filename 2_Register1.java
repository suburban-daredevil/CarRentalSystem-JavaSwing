package MyPackage1;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

public class Register1 extends GUImain {
	
	public Register1()
	{
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setSize(500, 500);
		frame.setMinimumSize(new Dimension(300,300));
		frame.setMaximumSize(new Dimension(600,600));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(panel);
		
		panel.setLayout(null);
		
		fname = new JLabel("First Name");
		fname.setBounds(10,20,80,25);
		panel.add(fname);
		
		fnameText = new JTextField();
		fnameText.setBounds(100,20,165,25);
		panel.add(fnameText);
		
		lname = new JLabel("Last Name");
		lname.setBounds(10,50,80,25);
		panel.add(lname);
		
		lnameText = new JTextField();
		lnameText.setBounds(100,50,165,25);
		panel.add(lnameText);
		
		radioLabel = new JLabel("Gender");
		radioLabel.setBounds(10,80,80,25);
		panel.add(radioLabel);
		
		
		radioButton1 = new JRadioButton();
		radioButton1.setBounds(100,80,20,20);
		panel.add(radioButton1);
		
		rbLabel1 = new JLabel("Male");
		rbLabel1.setBounds(120,80,80,25);
		panel.add(rbLabel1);
		
		radioButton2 = new JRadioButton("Female");
		radioButton2.setBounds(150,80,20,20);
		panel.add(radioButton2);
		
		rbLabel2 = new JLabel("Female");
		rbLabel2.setBounds(170,80,80,25);
		panel.add(rbLabel2);		
		
		radioButton3 = new JRadioButton("Others");
		radioButton3.setBounds(220,80,20,20);
		panel.add(radioButton3);
		
		rbLabel3 = new JLabel("Others");
		rbLabel3.setBounds(240,80,80,25);
		panel.add(rbLabel3);
		
		ButtonGroup group = new ButtonGroup();
		group.add(radioButton1);
		group.add(radioButton2);
		group.add(radioButton3);
				
		
		dateLabel = new JLabel("DOB");
		dateLabel.setBounds(10,110,80,25);
		panel.add(dateLabel);
        
		 
		UtilDateModel model = new UtilDateModel();
		Properties p = new Properties();
		p.put("text.today", "Today");
		p.put("text.month", "Month");
		p.put("text.year", "Year");
		JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
		datePicker.setBounds(100,110,200,200);
		panel.add(datePicker);
		
		addressLabel = new JLabel("Address");
		addressLabel.setBounds(10,150,80,20);
		panel.add(addressLabel);
		
		addressText = new JTextField();
		addressText.setBounds(100,150,165,50);
		panel.add(addressText);
		
		phoneLabel = new JLabel("Phone");
		phoneLabel.setBounds(10,210,80,20);
		panel.add(phoneLabel);
		
		phoneText = new JTextField();
		phoneText.setBounds(100,210,165,25);
		panel.add(phoneText);
		
		emailLabel = new JLabel("Email");
		emailLabel.setBounds(10,240,80,25);
		panel.add(emailLabel);
		
		emailText = new JTextField();
		emailText.setBounds(100,240,165,25);
		panel.add(emailText);
		
		
		userNameLabel = new JLabel("Username");
		userNameLabel.setBounds(10,270,80,25);
		panel.add(userNameLabel);
		
		userNameText = new JTextField();
		userNameText.setBounds(100,270,165,25);
		panel.add(userNameText);
		
		
		pwdLabel = new JLabel("Password1");
		pwdLabel.setBounds(10,300,80,20);
		panel.add(pwdLabel);
		
		pwdText = new JPasswordField();
		pwdText.setBounds(100,300,165,25);
		panel.add(pwdText);
		
		
		pwdLabel1 = new JLabel("Password2");
		pwdLabel1.setBounds(10,330,80,20);
		panel.add(pwdLabel1);
		
		
		pwdText1 = new JPasswordField();
		pwdText1.setBounds(100,330,165,25);
		panel.add(pwdText1);	
		
		
		submit = new JButton("Submit");
		submit.setBounds(10,360,80,25);
		panel.add(submit);
		submit.addActionListener(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e) {
						
						String fname = fnameText.getText();
						String lname = lnameText.getText();
						String date = datePicker.getJFormattedTextField().getText();
						String phone = phoneText.getText();
						String address = addressText.getText();
						String email = emailText.getText();
						String username = userNameText.getText();
						String pwd = pwdText.getText();
						String pwd1 = pwdText1.getText();
						
						
						if(fname.equals("")||lname.equals("")||date.equals("")||address.equals("")||email.equals("")||username.equals("")||pwd.equals("")||pwd1.equals(""))
						{
							result.setText("All details required");
							return;
						}
						int x=0;
						
						
						if(phone.length()==10)
						{
							for(int i=0;i<phone.length();i++)
							{
								if(!Character.isDigit(phone.charAt(i)))
								{
									x=1;
									break;
								}
							}
							if(x==1)
							{
								result.setText("Invalid Phone");
								return;
							}
						}
						else
						{
							result.setText("Invalid Phone");
							return;						
						}
						
						int t1=0,t2=0;
						for(int i=0;i<email.length();i++)
						{
							if(email.charAt(i)=='@')
							{
								t1=1;
							}
							else if(email.charAt(i)=='.')
							{
								t2=1;
							}
						}
						if(t1==0||t2==0||email.charAt(0)=='@'||email.charAt(0)=='.')
						{
							result.setText("Invalid email");
							return;
						}
						
						if(!pwd.equals(pwd1))
						{
							result.setText("Passwords do not match");
							return;
						}
						
						result.setText("Registration Successful");	
						if(result.getText().equals("Registration Successful"))
						{
							LocationRunner l1 = new LocationRunner();
						}
											
					}
				});
		
		result = new JLabel("");
		result.setBounds(10,400,200,20);
		panel.add(result);
				 
		
		
		
		
		frame.setVisible(true);
	}


}
