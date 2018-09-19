import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;//sql package
import java.awt.Color;

class Result extends JFrame{
		private JFrame f1 = new JFrame("Result");

		JLabel l0,l1,l2,l3,l4,l5,l6,l7;
		JTextField t1,t2,t3,t4,total;
		JButton b1;
		Result()
		{
	//f1.setBackground(Color.BLUE);

	
			Font f=new Font("Arial",Font.BOLD,24);

	l0=new JLabel("Result");
	//l0.setBackground(Color.RED);
	l0.setBounds(200,10,100,100);
	l0.setFont(f);//in awt package
	f1.add(l0);
	
	Font f2=new Font("Arial",Font.BOLD,15);
	l1=new JLabel("Subject");
	l1.setBounds(100,90,100,80);
	l1.setFont(f2);
	f1.add(l1);
	
	Font f3=new Font("Arial",Font.BOLD,15);
	//SE(l3)
	l3=new JLabel("SE");
	l3.setBounds(100,140,50,50);
	l3.setFont(f3);
	f1.add(l3);
	
	
	//ADBMS(l4)
	l4=new JLabel("ADBMS");
	l4.setBounds(100,190,50,50);
	l4.setFont(f3);
	f1.add(l4);
	
	
	//JAVA(l5)
	l5=new JLabel("JAVA");
	l5.setBounds(100,240,50,50);
	l5.setFont(f3);
	f1.add(l5);
	
	//DS(l6)
	l6=new JLabel("DS");
	l6.setBounds(100,290,50,50);
	l6.setFont(f3);
	f1.add(l6);
	
	
	
	//Marks(l2)
	l2=new JLabel("Marks");
	l2.setBounds(300,90,100,80);
	l2.setFont(f2);
	f1.add(l2);
	//SE(t1)
	t1=new JTextField();
	t1.setBounds(300,140,50,30);
	f1.add(t1);
	
	//ADBMS(t2)
	t2=new JTextField();
	t2.setBounds(300,190,50,30);
	f1.add(t2);
	
	
	//JAVA(t3)
	t3=new JTextField();
	t3.setBounds(300,240,50,30);
	f1.add(t3);
	
	//DS(t4)
	t4=new JTextField();
	t4.setBounds(300,290,50,30);
	f1.add(t4);
		
		//Button
		b1=new JButton("Result");
		b1.setBounds(150,350,100,50);
		f1.add(b1);
		
		
		
		
		
		
		b1.addActionListener(new ActionListener()
		{
						public void actionPerformed(ActionEvent ae)

			{
					dispose();
						new result1();
			}
		});
		
		
		f1.setLayout(null);
		f1.setVisible(true);
		f1.setSize(500,500);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
		
		public static void main(String args[])
		{
			Result result=new Result();
		}
}
