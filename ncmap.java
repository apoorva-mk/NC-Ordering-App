import javax.swing.*; 
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.event.*;   
import java.awt.Color;
import java.awt.Font; 
import java.util.Date;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
import java.text.SimpleDateFormat; 

 
class map
{ 
 
    	public void showmap() 
	{  
		JFrame f=new JFrame("Button Example");
	  	JLabel map=new JLabel();
		JButton nc6=new JButton("GB NC");  
		nc6.setBounds(50,30,95,30);
		nc6.setBackground(Color.black);
		nc6.setForeground(Color.white); 
	 
		JButton nc7=new JButton("7th Block NC");  
		nc7.setBounds(200,100,95,30); 
		nc7.setBackground(Color.black);
		nc7.setForeground(Color.white);
	 
		JButton nc5=new JButton("5th Block NC");  
		nc5.setBounds(350,300,95,30);
		nc5.setBackground(Color.black);
		nc5.setForeground(Color.white);  

		JButton nc3=new JButton("3rd Block NC");  
		nc3.setBounds(50,500,95,30); 
		nc3.setBackground(Color.black);
		nc3.setForeground(Color.white); 

		JButton nc1=new JButton("1st Block NC");  
		nc1.setBounds(65,250,95,30);
		nc1.setBackground(Color.black);
		nc1.setForeground(Color.white); 
	 
		final JLabel heading=new JLabel();  
    		heading.setBounds(0,0, 600,20);
		heading.setOpaque(true);
		heading.setBackground(Color.white);
		heading.setFont(new Font("Courier New", Font.BOLD, 20));
		heading.setText("    Click on the desired Night Canteen from the Map");

		final JTextField tf=new JTextField();  
    		tf.setBounds(500,20,100,20); 
 
		tf.setEditable(false); 

		f.add(nc6);
		f.add(nc7);
		f.add(nc5);
		f.add(nc3);
		f.add(nc1); 
		f.add(tf); 
		f.add(heading);
		try
		{
			BufferedImage myPicture = ImageIO.read(new File("map3.jpg"));
			JLabel picLabel = new JLabel(new ImageIcon(myPicture));
			f.add(picLabel);
			picLabel.setBounds(0,0,600,600);
		}
		catch(Exception e)
		{}

		nc6.addActionListener(new ActionListener(){  
		public void actionPerformed(ActionEvent e){  
           	tf.setText("GB");
		f.dispose();
		user.main(new String[0]);
  
        	}  
    		});


		nc1.addActionListener(new ActionListener(){  
		public void actionPerformed(ActionEvent e){  
           	tf.setText("NC1");
		f.dispose();
		user.main(new String[0]);
  
        	}  
    		});

		nc3.addActionListener(new ActionListener(){  
		public void actionPerformed(ActionEvent e){  
           	tf.setText("NC3");
		f.dispose();
		user.main(new String[0]);
  
        	}  
    		});

		nc5.addActionListener(new ActionListener(){  
		public void actionPerformed(ActionEvent e){  
           	tf.setText("NC5");
		f.dispose();
		user.main(new String[0]);
  
        	}  
    		});  
		
		nc7.addActionListener(new ActionListener(){  
		public void actionPerformed(ActionEvent e){  
           	tf.setText("NC7");
  		f.dispose();
		user.main(new String[0]);
        	}  
    		});
		
	
		f.setSize(600,600);  
		f.setLayout(null);  
        	f.setVisible(true);

		while(true)
		{
			String timeStamp = new SimpleDateFormat("HH.mm.ss").format(new Date());
			tf.setText(timeStamp);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{}
		}
		   
    	}  
}  


public class ncmap
{
	public static void main(String args[])
	{
		map Display= new map();
		Display.showmap();
	}
}



