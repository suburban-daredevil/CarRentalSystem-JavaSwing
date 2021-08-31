package MyPackage1;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login1 extends GUImain {

	
	public Login1()
	{
		JFrame frame = new JFrame("Login Portal");
		JPanel panel = new JPanel();
		frame.setSize(350, 200);		
		frame.setMinimumSize(new Dimension(300,200));
		frame.setMaximumSize(new Dimension(500,500));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(panel);
		
		panel.setLayout(null);
		
		userLabel = new JLabel("User");
		userLabel.setBounds(10,20,80,25);
		panel.add(userLabel);
		
		userText = new JTextField();		
		userText.setBounds(100,20,165,25);
		panel.add(userText);
		
		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10,50,80,25);
		panel.add(passwordLabel);
		
		passwordText = new JPasswordField();
		passwordText.setBounds(100,50,165,25);
		panel.add(passwordText);
		
		
		button = new JButton("Login");
		button.setBounds(10,80,80,25);
		panel.add(button);
		button.addActionListener(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						String user = userText.getText();
						String password = passwordText.getText();
						
						if(user.equals("")||password.equals(""))
						{
							success.setText("All Credentials Required");
							return;
						}
						try
						{
							if(userNameText.getText().equals("")||pwdText1.getText().equals(""))
							{
								success.setText("User Not Registered Still");
								return;
							}
						}
						catch(NullPointerException n)
						{
							success.setText("User not registered");
							return;
						}
						if(user.equals(userNameText.getText()) && password.equals(pwdText1.getText()))
						{
							success.setText("Login Successful");
						}
						else
						{
							success.setText("Invalid Username or Password");
							return;
						}
						
						String ans="";
						ans=success.getText();
						if(ans.equals("Login Successful"))
						{
							LocationRunner lr1 = new LocationRunner();
						}
					}
				}
				);
		
		success = new JLabel("");
		success.setBounds(10,110,300,25);
		panel.add(success);
		
		
		
		
		frame.setVisible(true);

	}

}
