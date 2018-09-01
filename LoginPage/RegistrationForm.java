import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;//sql package

class RegistrationForm extends JFrame //implements ActionListener
{
	JLabel l1,l2,l3,l4;
	JTextField t1,t3;
	JPasswordField t2;
	JButton b1;
	RegistrationForm()
	{
		Font f=new Font("Arial",Font.BOLD,24);
		l1=new JLabel("SIGN UP");
		l1.setFont(f);//in awt package
		l2=new JLabel("UserName");
		l3=new JLabel("Password");
		l4=new JLabel("Email i'd");
		l1.setBounds(70,40,200,40);
		l2.setBounds(70,100,100,20);
		l4.setBounds(70,200,100,20);
		l3.setBounds(70,300,100,20);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		
		
		

		
		//Adding JTextField
		
		t1=new JTextField();
		t1.setBounds(70,120,200,30);
		//t1.setPlaceholder("Enter your name");
		add(t1);
		
		
		//Adding JEmailId
		t3=new JTextField();
		t3.setBounds(70,230,200,30);
		add(t3);
		
		
		//Adding JPasswordField
		t2=new JPasswordField();
		t2.setBounds(70,330,200,30);
		add(t2);
		
		
		
		
		//Adding JButton
		
		b1=new JButton("SIGN UP");
		b1.setBounds(170,400,100,30);
		add(b1);
		
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				dispose();
				new SecondFame();
			}
		});
		
		setLayout(null);
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	
	
	
	
	public static void main(String args[])
	{
			RegistrationForm login=new RegistrationForm();
	}
}
