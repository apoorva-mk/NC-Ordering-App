import java.awt.*;
import javax.swing.*;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.util.*;
import java.awt.event.*;
import java.lang.*;
import java.awt.Color;

public class user extends JComponent implements ActionListener{
	JButton b;
	JTextField name,number;
	String n,pn;
	JLabel l;
	JFrame f;

	public user(){
		n=null;
		pn=null;
	}

	public void display(){
		f=new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setContentPane(new JLabel(new ImageIcon("junk.jpg")));
		l=new JLabel("WELCOME TO NC ORDERING APP");
		l.setBounds(110,150,250,40);
		l.setFont(new Font("Courier New",Font.BOLD,12));
		name=new JTextField("Enter Name");
		name.setBounds(120,200,200,30);
		number=new JTextField("Enter Phone Number");
		number.setBounds(120,250,200,30);
		b=new JButton("Proceed to Order");
		b.setBounds(120,300,200,30);
		b.addActionListener(this);
		f.add(l);
		f.add(b);
		f.add(name);
		f.add(number);
		f.setSize(450,450);
		f.setLayout(null);
		f.setVisible(true);
		
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b){
			n=name.getText();
			pn=number.getText();
			f.dispose();
			String details[]={n,pn};
			NCapp.main(details);
		}
	}


	public static void main(String[] args) {
		user obj =new user();
		obj.display();
	}
}