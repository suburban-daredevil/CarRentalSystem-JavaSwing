package MyPackage1;


import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;


public class LocationRunner implements ActionListener {
	public String location;
	public static JComboBox drop_down1;
	public static JButton b;
	public JFrame f = new JFrame("Location");
	
	    public LocationRunner()
	    {
	    	
	    	f.setSize(600, 500);
	    	
	    	//final String input1 = new String();

	        
	        JLabel cities = new JLabel("Select Your City: ");
	        cities.setBounds(40, 100, 200, 30);
	        f.add(cities);
	        
	        String city[] = {"Mumbai", "Chennai", "Bangalore", "Delhi", "Hyderabad"};
	        drop_down1 = new JComboBox(city);    
	        drop_down1.setBounds(180, 100, 200, 30);
	        f.add(drop_down1);
	        
	        
	        b = new JButton("Ok");
	        b.setBounds(400, 100, 100, 30);
	        f.add(b);     
	        
	        b.addActionListener(new ActionListener() {	        	

				@Override
				public void actionPerformed(ActionEvent e) {
					
					
					
					Location2 l2 = new Location2((String)drop_down1.getItemAt(drop_down1.getSelectedIndex()));
				}
	        
	        });
	        
	        
	        
	        
	       
	       
	        
	       
	        
	       
	        
	       
	        f.setLayout(null);
	        f.setVisible(true);

	        

	    }

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
}
	
		
        

        
    


 