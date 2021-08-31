package MyPackage1;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Location2 implements ActionListener {
	
	public JFrame f1 = new JFrame("Location2");
	
	
	public Location2(String citySelected)
	{			
		String areaSelected="";	
		f1.setSize(600, 500);
		
	    JLabel n = new JLabel("City: ");
	    n.setBounds(40, 160, 50, 30);
	    f1.add(n);
		//String c;
	    //String citySelected = (String) ;
	    //System.out.println(citySelected);
	    
	    if(citySelected=="Mumbai")
	    {
	    	String[] mumbai1 = {"Chakala", "Govandi", "Kurla", "Nahur", "Trombay" ,"Vile Parle"};
			JComboBox drop_down2 = new JComboBox(mumbai1);
			//c = "Mumbai";
        	drop_down2.setBounds(180, 160, 200, 30);
            f1.add(drop_down2);
            areaSelected  = (String)drop_down2.getItemAt(drop_down2.getSelectedIndex()) + "";
            
		}
		
	    else if(citySelected=="Chennai")
	    {
	    	String[] chennai1 = {"Adambakkam", "Adyar Chennai", "Alandur", "Egmore", "Chetpet", "Guindy" , "Injambakkam", "Kodungaiyur"};
            JComboBox drop_down2 = new JComboBox(chennai1);
			drop_down2.setBounds(180, 160, 200, 30);
			//c = "Chennai";
            f1.add(drop_down2);
            areaSelected  = (String)drop_down2.getItemAt(drop_down2.getSelectedIndex()) + "";

	    }
	    
	    else if(citySelected=="Bangalore")
	    {
	    	String[] bangalore1 = {"Anekal" ,"Attibele" , "Begur", "Herohalli", "Bommasandra", "Kothnur" , "Maragondahalli"};
        	JComboBox drop_down2 = new JComboBox(bangalore1);
            drop_down2.setBounds(180, 160, 200, 30);
			f1.add(drop_down2);
			//c = "Bangalore";
            areaSelected  = (String)drop_down2.getItemAt(drop_down2.getSelectedIndex()) + "";

	    }
	    
	    else if(citySelected=="Delhi")
	    {
	    	String[] delhi1 = {"Siri Fort" ,"Tughlaqabad", "Mehrauli", "Qila Rai Pithora", "Firozabad" ,"Shergarh"};
        	JComboBox drop_down2 = new JComboBox(delhi1);
            drop_down2.setBounds(180, 160, 200, 30);
			f1.add(drop_down2);
			//c = "Delhi";
            areaSelected  = (String)drop_down2.getItemAt(drop_down2.getSelectedIndex()) + "";
        
	    }
	    
	    else if(citySelected=="Hyderabad")
	    {

        	String[] hyderabad1 = {"Broudha Nagar", "Bowenpally", "ECIL X Roads", "Raidurg", "Miyapur" , "Tirumalagiri", "Risala Bazar", "Moula Ali"};
        	JComboBox drop_down2 = new JComboBox(hyderabad1);
            drop_down2.setBounds(180, 160, 200, 30);
			f1.add(drop_down2);
			//c = "Hyderabad";
            areaSelected  = (String)drop_down2.getItemAt(drop_down2.getSelectedIndex()) + "";

	    }
	    /*JComboBox drop_down2 = new JComboBox();
	    drop_down2.setBounds(180, 160, 200, 30);
	    f.add(drop_down2);*/
	    
	    

	    JButton b1 = new JButton("Ok");
	    b1.setBounds(400, 160, 100, 30);
	    f1.add(b1);
	    
	    JLabel success = new JLabel("");
	    success.setBounds(40,250,400,25);
	    f1.add(success);


	    b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
	            success.setText("Your Location is selected Successfully");
	            
	            String ans = success.getText();
	            if(ans.equals("Your Location is selected Successfully"))
	            {
	            	FrontPage p1 = new FrontPage();
	            	p1.BookingGUI();
	            }
	            
	        }
	    });
	    
	    f1.setLayout(null);
	    f1.setVisible(true);

	
		}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	}
    


