import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.awt.event.*;
public class NCapp extends JFrame{
	private int y=0;
	private static String[] arr=new String[5];
	private static Integer[] quan=new Integer[5];
	private static Integer[] cost=new Integer[5];
	private int i;
	JFrame frame= new JFrame();
	JButton[] button1 = new JButton[5];
	JButton[] button2 = new JButton[5];
	JLabel[] label=new JLabel[5];
	JLabel[] quantity = new JLabel[5];
	JLabel name =new JLabel();
	JButton proceed =new JButton();
	
	public void Menu()
	{
		
		name.setText("Menu");
		name.setBounds(270,50,100,20);
		proceed.setText("Proceed");
		proceed.setBounds(250,650,100,20);
		for(i=0;i<5;++i)
		{
			
			JLabel cot=new JLabel();
			cot.setBounds(600,100+y,100,100);
			cot.setText("Cost :"+cost[i].toString());
			quantity[i]=new JLabel();
			label[i]=new JLabel();
			button1[i]=new JButton("button1"+i);
			button2[i]=new JButton("button2"+i);
			quantity[i].setBounds(370,100+y,40,40);
			quantity[i].setText(quan[i].toString());
			label[i].setText(arr[i]);
			label[i].setBounds(50,100+y,200,100);
			button1[i].setBounds(300,100+y,50,50);
			button2[i].setBounds(400,100+y,50,50);
			button1[i].setText("+");
			button2[i].setText("-");
			BufferedImage myPicture=null;
			try{
		 	myPicture = ImageIO.read(new File(i+".jpg"));
			
			}
			catch(Exception e)
			{
				System.out.println("Image not found");
			}
			JLabel picLabel = new JLabel(new ImageIcon(myPicture));
			picLabel.setBounds(150,100+y,100,100);
			frame.add(cot);
			frame.add(name);
			frame.add(quantity[i]);
			frame.add(label[i]);
			frame.add(picLabel);
			frame.add(button1[i]);
			frame.add(button2[i]);
			y=y+100;
		}


			button1[0].addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e)
				{
					quan[0]++;
					quantity[0].setText(quan[0].toString());
				}
			});
			button2[0].addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e)
				{
					if(quan[0]>0)
					{
					quan[0]--;
					quantity[0].setText(quan[0].toString());}
				}
			});
				button1[1].addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e)
				{
					quan[1]++;
					quantity[1].setText(quan[1].toString());
				}
			});
			button2[1].addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e)
				{
					if(quan[1]>0)
					{
					quan[1]--;
					quantity[1].setText(quan[1].toString());}
				}
			});

					button1[2].addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e)
				{
					quan[2]++;
					quantity[2].setText(quan[2].toString());
				}
			});
			button2[2].addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e)
				{
					if(quan[2]>0)
					{
					quan[2]--;
					quantity[2].setText(quan[2].toString());}
				}
			});
					button1[3].addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e)
				{
					quan[3]++;
					quantity[3].setText(quan[3].toString());
				}
			});
			button2[3].addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e)
				{
					if(quan[3]>0)
					{
					quan[3]--;
					quantity[3].setText(quan[3].toString());}
				}
			});
					button1[4].addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e)
				{
					quan[4]++;
					quantity[4].setText(quan[4].toString());
				}
			});
			button2[4].addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e)
				{
					if(quan[4]>0)
					{
					quan[4]--;
					quantity[4].setText(quan[4].toString());}
				}
			});

		frame.add(proceed);
		proceed.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e)
				{
					Bill();
				}
			});
		frame.setSize(1000,1000);
		frame.setLayout(null);
		frame.setVisible(true);
	
	}
	JFrame framebill=new JFrame();
	static String custname=null;
	static String custphone=null;
	public void Bill()
	{
		JLabel bill=new JLabel();
		JLabel desc=new JLabel();
		JLabel quant=new JLabel();
		JLabel pp=new JLabel();
		JLabel total=new JLabel();
		
		bill.setBounds(400,50,1000,100);
		bill.setText("Bill"+"    "+custname+"   "+custphone);
		framebill.add(bill);
		int zz=0;
		desc.setBounds(300,100+zz,100,100);
		desc.setText("Food Item");
		quant.setBounds(450,100+zz,100,100);
		quant.setText("Quantity");
		pp.setBounds(650,100+zz,100,100);
		pp.setText("Cost");
		Integer sum=0;
		zz=60;
		for(int j=0;j<5;++j)
		{
			JLabel cc=new JLabel();
			JLabel text =new JLabel();
			JLabel val=new JLabel();
			cc.setBounds(650,100+zz,100,100);
			text.setBounds(300,100+zz,100,100);
			val.setBounds(450,100+zz,100,100);

			if(quan[j]>0)
			{zz=zz+60;
				text.setText(arr[j]);
				val.setText(quan[j].toString());
				framebill.add(text);
				framebill.add(val);
				Integer nn=quan[j]*cost[j];
				cc.setText(nn.toString());
				framebill.add(cc);
				sum=sum+nn;
			}
		}
		total.setText("Total cost = "+sum.toString());
		total.setBounds(450,500,200,200);
		framebill.add(total);
		framebill.add(pp);
		framebill.add(quant);
		framebill.add(desc);
		framebill.setSize(1000,1000);
		framebill.setLayout(null);
		framebill.setVisible(true);
	

	}


	public static void main(String args[])
	{
		custname=args[0];
		custphone=args[1];
		arr[0]="Noodles";
		arr[1]="Paneer Paratha";
		arr[2]="Fried Rice";
		arr[3]="Milkshake";
		arr[4]="Ice Cream";
		for(int i=0;i<5;++i)
			{quan[i]=0;
				cost[i]=40;
			}
		NCapp menu=new NCapp();
		menu.Menu();
	
	}
	

}