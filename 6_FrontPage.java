package MyPackage1;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Properties;


import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JSpinner;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;





public class FrontPage implements ActionListener{
    
	protected static JFrame frame;
	protected static JLabel result;
	protected static JTextField email;
	protected static JTextField mobno;
	protected static JTextField licenseno;
	protected static UtilDateModel model1;
	protected static UtilDateModel model2;
	protected static JDatePanelImpl datePanel1;
	protected static JDatePanelImpl datePanel2;
	protected static JDatePickerImpl deldatePicker;
	protected static JDatePickerImpl retdatePicker;
	protected static JSpinner timeSpinner1;
	protected static JSpinner timeSpinner2;
	protected static JButton carselect;    
    protected static JLabel ratedisp;
    static int carprice;
    
	public void BookingGUI()
	{
		
		
		frame = new JFrame("Booking Portal");
		JPanel panel = new JPanel();
		frame.setSize(1200, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Enter your Booking details here :");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblNewLabel_5.setBounds(66, 22, 507, 33);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel = new JLabel("E-mail id :");
		lblNewLabel.setBounds(86, 81, 114, 20);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		panel.add(lblNewLabel);
		
		email = new JTextField();
		email.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		email.setBounds(355, 71, 218, 33);
		panel.add(email);
		email.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Phone No. :");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_1.setBounds(86, 138, 115, 33);
		panel.add(lblNewLabel_1);
		
		mobno = new JTextField();
		mobno.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		mobno.setBounds(355, 138, 218, 29);
		panel.add(mobno);
		mobno.setColumns(10);
		
		
		JLabel lblNewLabel_3 = new JLabel("Delivery Location :");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_3.setBounds(86, 314, 181, 33);
		panel.add(lblNewLabel_3);
		

		JTextArea address = new JTextArea();
		address.setBounds(355, 321, 218, 72);
		panel.add(address);
		
		JLabel lblNewLabel_4 = new JLabel("Car Type :");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_4.setBounds(86, 193, 181, 33);
		panel.add(lblNewLabel_4);
		
		JComboBox cartype = new JComboBox();
		cartype.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		cartype.setModel(new DefaultComboBoxModel(new String[] {"Sedan", "SUV", "Hatchback", "Coupe", "Limousine", "Convertibles", "Micro", "Supercars"}));
		cartype.setSelectedIndex(2);
		cartype.setBounds(355, 193, 209, 30);
		panel.add(cartype);
		
		ratedisp = new JLabel("");
        ratedisp.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        ratedisp.setBounds(805, 200, 193, 26);
        panel.add(ratedisp);
        
        
        carselect = new JButton("OK");
		carselect.setFont(new Font("Times New Roman", Font.BOLD, 22));
		carselect.setBounds(604, 201, 81, 23);
		panel.add(carselect);
		carselect.addActionListener(
				new ActionListener()
				{
				 public void actionPerformed(ActionEvent e)
				 {
					 String ctype = ((String)cartype.getItemAt(cartype.getSelectedIndex()));
					
					 if(ctype=="Sedan")
					 {
						    ratedisp.setText("");
						    ratedisp.setText("Sedan - 15/hr");
						    carprice = 15;
						    return;
							
					 }
					 
					 else if(ctype=="SUV")
					 {
						 ratedisp.setText("");
						 ratedisp.setText("SUV - 20/hr");
						 carprice = 20;
						 return;
					 }
					 
					 else if(ctype=="Hatchback")
					 {
						 ratedisp.setText("");
						 ratedisp.setText("Hatchback - 12/hr");
						 carprice = 12;
						 return;
					 }
					 
					 else if(ctype=="Coupe")
					 {
						 ratedisp.setText("");
						 ratedisp.setText("Coupe - 24/hr");
						 carprice = 24;
						 return;
					 }
					 
					 else if(ctype=="Limousine")
					 {
						 ratedisp.setText("");
						 ratedisp.setText("Limousine - 40/hr");
						 carprice = 40;
						 return;
					 }
					 
					 else if(ctype=="Convertibles")
					 {
						 ratedisp.setText("");
						 ratedisp.setText("Convertibles - 55/hr");
						 carprice = 55;
						 return;
					 }
					 
					 else if(ctype=="Micro")
					 {
						 ratedisp.setText("");
						 ratedisp.setText("Micro - 10/hr");
						 carprice = 10;
						 return;
					 }
					 
					 else
					 {
						 ratedisp.setText("");
						 ratedisp.setText("Supercars - 89/hr");
						 carprice = 89;
						 return;
					 }
				 }
				
				});            
               

        
        
        
        
        
        
		
	
		JLabel lblNewLabel_6 = new JLabel("License No :");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_6.setBounds(86, 258, 159, 20);
		panel.add(lblNewLabel_6);
		
		
		licenseno = new JTextField();
		licenseno.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		licenseno.setBounds(355, 252, 209, 29);
		panel.add(licenseno);
		licenseno.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Delivery Date :");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_7.setBounds(86, 421, 168, 29);
		panel.add(lblNewLabel_7);
		
		model1 = new UtilDateModel();
		Properties p1 = new Properties();
		p1.put("text.today", "Today");
		p1.put("text.month", "Month");
		p1.put("text.year", "Year");
		datePanel1 = new JDatePanelImpl(model1, p1);
		deldatePicker = new JDatePickerImpl(datePanel1, new DateLabelFormatter());
		deldatePicker.setBounds(355, 433, 209, 29);
		panel.add(deldatePicker);
		
		JLabel lblNewLabel_8 = new JLabel("Delivery Time : ");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_8.setBounds(86, 504, 168, 20);
		panel.add(lblNewLabel_8);
		
		timeSpinner1 = new JSpinner( new SpinnerDateModel() );
		timeSpinner1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		JSpinner.DateEditor timeEditor1 = new JSpinner.DateEditor(timeSpinner1, "HH:mm:ss");
		timeSpinner1.setEditor(timeEditor1);
		timeSpinner1.setValue(new Date()); 
		timeSpinner1.setBounds(355, 494, 209, 33);
		panel.add(timeSpinner1);
		
		JLabel lblNewLabel_9 = new JLabel("Return Date :");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_9.setBounds(86, 565, 159, 20);
		panel.add(lblNewLabel_9);
		
		model2 = new UtilDateModel();
		Properties p2 = new Properties();
		p2.put("text.today", "Today");
		p2.put("text.month", "Month");
		p2.put("text.year", "Year");
		datePanel2 = new JDatePanelImpl(model2, p2);
		retdatePicker = new JDatePickerImpl(datePanel2, new DateLabelFormatter());
		retdatePicker.setBounds(355, 556, 209, 29);
		panel.add(retdatePicker);
		
		
		
		
		
		JLabel lblNewLabel_10 = new JLabel("Return Time :");
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_10.setBounds(86, 626, 146, 20);
		panel.add(lblNewLabel_10);
		
		timeSpinner2 = new JSpinner( new SpinnerDateModel() );
		timeSpinner2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		JSpinner.DateEditor timeEditor2 = new JSpinner.DateEditor(timeSpinner2, "HH:mm:ss");
		timeSpinner2.setEditor(timeEditor2);
		timeSpinner2.setValue(new Date()); 
		timeSpinner2.setBounds(355, 616, 209, 33);
		panel.add(timeSpinner2);
		
		JButton Buttonbookcar = new JButton("Book Car");
		Buttonbookcar.setForeground(Color.BLACK);
		Buttonbookcar.setFont(new Font("Times New Roman", Font.BOLD, 22));
		Buttonbookcar.setBounds(239, 734, 151, 35);
		panel.add(Buttonbookcar);
		Buttonbookcar.addActionListener(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e) {
						
						String emailid = email.getText();
						String deliaddress = address.getText();
						String deldate = deldatePicker.getJFormattedTextField().getText();
						String retdate = retdatePicker.getJFormattedTextField().getText();
						String mobileno = mobno.getText();
						String licensenum = licenseno.getText();
						
						
						
						if(emailid.equals("")||deliaddress.equals("")||deldate.equals("")||mobileno.equals("")||licensenum.equals("")||retdate.equals(""))
						{
							result.setText("Form incomplete");
							return;
						}
						int x=0;
						
						
						if(mobileno.length()==10)
						{
							for(int i=0;i<mobileno.length();i++)
							{
								if(!Character.isDigit(mobileno.charAt(i)))
								{
									x=1;
									break;
								}
							}
							if(x==1)
							{
								result.setText("Invalid Mobile No");
								return;
							}
						}
						else
						{
							result.setText("Invalid Mobile No");
							return;						
						}
						
						int t1=0,t2=0;
						for(int i=0;i<emailid.length();i++)
						{
							if(emailid.charAt(i)=='@')
							{
								t1=1;
							}
							else if(emailid.charAt(i)=='.')
							{
								t2=1;
							}
						}
						if(t1==0||t2==0||emailid.charAt(0)=='@'||emailid.charAt(0)=='.')
						{
							result.setText("Invalid email");
							return;
						}
						
						if(licensenum.length()!=12)
						{
							result.setText("Invalid License No");
							return;
						}
						 //new OptionPaneExample();
						
						result.setText("Your car has been booked :)");
						BillingRunner b1 = new BillingRunner();	
						
					}
				});
		
		result = new JLabel("");
		result.setBounds(230,680,400,20);
		result.setFont(new Font("Times New Roman", Font.BOLD, 22));
		panel.add(result);
		
				 
		
		
		
		
		frame.setVisible(true);
	}

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
			
			
			FrontPage p1 = new FrontPage();
			p1.BookingGUI();
			
			
			
		
		}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}


/*class OptionPaneExample{  
JFrame f;  
OptionPaneExample(){  
    f=new JFrame();  
    JOptionPane.showMessageDialog(f,"Your car has been booked :)");  
    BillingRunner b1 = new BillingRunner();
} }*/ 

