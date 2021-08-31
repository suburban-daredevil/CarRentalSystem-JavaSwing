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
import java.awt.Font;

public class GUImain implements ActionListener {
	
	protected static JLabel userLabel;
	protected static JTextField userText;
	protected static JLabel passwordLabel;
	protected static JPasswordField passwordText;
	protected static JButton button;
	protected static JLabel success;
	protected static JLabel fname;
	protected static JTextField fnameText;
	protected static JLabel lname;
	protected static JTextField lnameText;
	protected static JLabel radioLabel;
	protected static JRadioButton radioButton1;
	protected static JLabel rbLabel1;
	protected static JLabel rbLabel2;
	protected static JLabel rbLabel3;
	protected static JRadioButton radioButton2;
	protected static JRadioButton radioButton3;
	protected static JLabel dateLabel;
	protected static UtilDateModel model;
	protected static JDatePanelImpl datePanel;
	protected static JDatePickerImpl datePicker;
	protected static JLabel addressLabel;
	protected static JTextField addressText;
	protected static JLabel phoneLabel;
	protected static JTextField phoneText;
	protected static JLabel emailLabel;
	protected static JTextField emailText;
	protected static JLabel userNameLabel;
	protected static JTextField userNameText;
	protected static JLabel pwdLabel;
	protected static JPasswordField pwdText;
	protected static JLabel pwdLabel1;
	protected static JPasswordField pwdText1;
	protected static JLabel result;
	protected static JButton submit;
	protected static JButton button1;
	protected static JButton button2;
	

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Main GUI");
		JPanel panel = new JPanel();
		frame.setSize(500, 500);
		frame.setMinimumSize(new Dimension(300,300));
		frame.setMaximumSize(new Dimension(600,600));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(panel);
		
		panel.setLayout(null);
		
		button1 = new JButton("Login");
		button1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		button1.setBounds(95,169,131,66);
		panel.add(button1);
		button1.addActionListener(new ActionListener()
				{

					public void actionPerformed(ActionEvent arg0) {
							
						Login1 l1 = new Login1();
					}
			
				});
		
		button2 = new JButton("Register");
		button2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		button2.setBounds(261,169,123,66);
		panel.add(button2);
		button2.addActionListener(new ActionListener()
				{

					public void actionPerformed(ActionEvent e){
							
						Register1 r1 = new Register1();
					}
				});
		
		frame.setVisible(true);
		
		
}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}

