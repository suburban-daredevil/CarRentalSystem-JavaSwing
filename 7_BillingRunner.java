package MyPackage1;

import java.awt.Dimension;
import java.awt.Font;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

public class BillingRunner extends FrontPage
{
	public BillingRunner()
	{
		String deliveryDate1 = (String)deldatePicker.getJFormattedTextField().getText();
		Date deliveryTime1 =  (Date)timeSpinner1.getValue();
		String returnDate1 = (String)retdatePicker.getJFormattedTextField().getText();
		Date returnTime1 = (Date)timeSpinner2.getValue();
		
		/*System.out.println("Delivery date : "+deliveryDate1);
		System.out.println("Delivery Time : "+deliveryTime1);
		System.out.println("Return Date : "+returnDate1);
		System.out.println("Return Time : "+returnTime1);*/
		
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		String delTime = format.format(deliveryTime1);
		String retTime = format.format(returnTime1);
		
		String temp = "yyyy-MM-dd HH:mm:ss";
		
		SimpleDateFormat sdf = new SimpleDateFormat(temp);
		long diff = 0;
		TimeUnit timeUnit=TimeUnit.SECONDS;
		
		try
		{
			Date d1 = sdf.parse(deliveryDate1+" "+delTime);
			Date d2 = sdf.parse(returnDate1+" "+retTime);
			
			//System.out.println(d1);
			//System.out.println(d2);
			
			diff = d2.getTime() - d1.getTime();
			timeUnit.convert(diff,TimeUnit.HOURS);
			
			//System.out.println(timeUnit);
			
			//System.out.println("\n"+d1.getTime());
			//System.out.println(d2.getTime());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		int diffHours = (int)(diff/(60*60*1000));
		int amt = (int) (diffHours*carprice);
		String amount = String.valueOf(amt);
		
		long diff1=0;
		TimeUnit t1 = TimeUnit.SECONDS;
		try
		{
			Date d1 = sdf.parse(returnDate1+" "+retTime);
			Date d2 = new Date();
			
			if(d2.getTime()>d1.getTime())
			{
				diff1 = d2.getTime() - d1.getTime();
				t1.convert(diff1, TimeUnit.HOURS);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		int diffHours1 = (int)(diff1/(60*60*1000));
		int amt1 = (int) (diffHours1*carprice);
		String amount1 = String.valueOf(amt1);
		
		int totalAmount = amt+amt1;
		double taxPayable = totalAmount*(0.28);
		String taxPayable1 = String.valueOf(String.format("%.2f",taxPayable));
		
		double finalTotal = totalAmount+taxPayable;
		String finalTotal1 = String.valueOf(String.format("%.2f",finalTotal));
		
		//System.out.println(amount);
		
		//System.out.println("Diff hrs : "+diffHours);
		
		/*System.out.println(deliveryTime1 + " "+returnTime1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		
		String x = sdf1.format(deliveryTime1);
		String y = sdf1.format(returnTime1);
		
		long diff=0;
		
		try
		{
			Date d1 = sdf1.parse(x);
			Date d2 = sdf1.parse(y);	
			
			System.out.println(d1);
			System.out.println(d2);
			
			diff = Math.abs(d2.getTime() - d1.getTime());
		}
		
		catch (ParseException e) { 
            e.printStackTrace(); 
        }
		//System.out.println("Difference : "+diff);
		
		int diffHours = (int)(diff/1000*60*60);
		
		
		/*long diff = returnTime1.getTime() - deliveryTime1.getTime();
		int diffHours = (int)(diff/60*60*1000);*/
		
		/*System.out.println("Diff hrs : "+diffHours);
		
		*/
		
		
		
		
		JFrame frame = new JFrame("Billing");
		JPanel panel = new JPanel();
		frame.setSize(800, 800);		
		frame.setMinimumSize(new Dimension(300,200));
		frame.setMaximumSize(new Dimension(500,500));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(panel);
		
		panel.setLayout(null);
		
		JLabel startDate = new JLabel("Start date : ");
		startDate.setFont(new Font("Times New Roman", Font.BOLD, 22));
		startDate.setBounds(10,20,150,25);
		panel.add(startDate);
		
		JLabel startDateLabel = new JLabel(deliveryDate1);
		startDateLabel.setBounds(200,20,150,25);
		startDateLabel.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		panel.add(startDateLabel);
		
		/*UtilDateModel model = new UtilDateModel();
		Properties p = new Properties();
		p.put("text.today", "Today");
		p.put("text.month", "Month");
		p.put("text.year", "Year");
		JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
		datePicker.setBounds(100,20,165,25);
		panel.add(datePicker);*/
		
		JLabel startTime = new JLabel("Start Time : ");
		startTime.setFont(new Font("Times New Roman", Font.BOLD, 22));
		startTime.setBounds(10,60,150,25);
		panel.add(startTime);	
		
		JLabel startTimeLabel = new JLabel(delTime);
		startTimeLabel.setBounds(200,60,150,25);
		startTimeLabel.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		panel.add(startTimeLabel);
		
		
		/*
		JSpinner timeSpinner = new JSpinner( new SpinnerDateModel() );
		JSpinner.DateEditor timeEditor = new JSpinner.DateEditor(timeSpinner, "HH:mm:ss");
		timeSpinner.setEditor(timeEditor);
		timeSpinner.setValue(new Date()); 
		timeSpinner.setBounds(100,60,165,25);
		panel.add(timeSpinner);
		*/
		
		JLabel returnDate = new JLabel("Return date : ");
		returnDate.setFont(new Font("Times New Roman", Font.BOLD, 22));
		returnDate.setBounds(10,100,150,25);
		panel.add(returnDate);
		
		JLabel returnDateLabel = new JLabel(returnDate1);
		returnDateLabel.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		returnDateLabel.setBounds(200,100,150,25);
		panel.add(returnDateLabel);
		
		JLabel returnTime = new JLabel("Return Time : ");
		returnTime.setFont(new Font("Times New Roman", Font.BOLD, 22));
		returnTime.setBounds(10,140,150,25);
		panel.add(returnTime);
		
		JLabel returnTimeLabel = new JLabel(retTime);
		returnTimeLabel.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		returnTimeLabel.setBounds(200,140,150,25);
		panel.add(returnTimeLabel);
		
		JLabel actualBill = new JLabel("Actual Bill : ");
		actualBill.setFont(new Font("Times New Roman", Font.BOLD, 22));
		actualBill.setBounds(10,180,150,25);
		panel.add(actualBill);
		
		JLabel actualBillLabel = new JLabel("Rs. "+amount);
		actualBillLabel.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		actualBillLabel.setBounds(200,180,150,25);
		panel.add(actualBillLabel);
		
		JLabel addCharges = new JLabel("Addln Charges : ");
		addCharges.setFont(new Font("Times New Roman", Font.BOLD, 22));
		addCharges.setBounds(10,220,167,25);
		panel.add(addCharges);
		
		JLabel addChargesLabel = new JLabel("Rs. "+amount1);
		addChargesLabel.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		addChargesLabel.setBounds(200,220,150,25);
		panel.add(addChargesLabel);
		
		JLabel tax = new JLabel("Tax : ");
		tax.setFont(new Font("Times New Roman", Font.BOLD, 22));
		tax.setBounds(10,260,150,25);
		panel.add(tax);
		
		JLabel taxLabel = new JLabel("Rs. "+taxPayable1);
		taxLabel.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		taxLabel.setBounds(200,260,150,25);
		panel.add(taxLabel);
		
		JLabel total = new JLabel("Total : ");
		total.setFont(new Font("Times New Roman", Font.BOLD, 22));
		total.setBounds(10,300,150,25);
		panel.add(total);
		
		JLabel totalLabel = new JLabel("Rs. "+finalTotal1);
		totalLabel.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		totalLabel.setBounds(200,300,150,25);
		panel.add(totalLabel);
		
		JLabel thankYou = new JLabel("Thank you for using our Services");
		thankYou.setFont(new Font("Times New Roman", Font.BOLD, 22));
		thankYou.setBounds(143,350,357,50);
		panel.add(thankYou);
		
		/*UtilDateModel model1 = new UtilDateModel();
		Properties p1 = new Properties();
		p.put("text.today", "Today");
		p.put("text.month", "Month");
		p.put("text.year", "Year");
		JDatePanelImpl datePanel1 = new JDatePanelImpl(model, p);
		JDatePickerImpl datePicker1 = new JDatePickerImpl(datePanel, new DateLabelFormatter());
		datePicker.setBounds(100,100,165,25);
		panel.add(datePicker);*/
		
		/*JTextField startText = new JTextField();
		startText.setBounds(100,20,165,25);
		panel.add(startText);*/
		
		/**/
		
		/*UtilDateModel model = new UtilDateModel();
		Properties p = new Properties();
		p.put("text.today", "Today");
		p.put("text.month", "Month");
		p.put("text.year", "Year");
		JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
		datePicker.setBounds(100,20,200,25);
		panel.add(datePicker);*/
		
		
		
		
		
		frame.setVisible(true);
		
	}
	
}
/*public class BillingRunner {

	public static void main(String[] args) {
		
		Billing b1 = new Billing();		
		
	}

}*/
