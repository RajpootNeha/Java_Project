import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;//sql package

class Login extends JFrame //implements ActionListener
{
	JLabel l1,l2,l3;
	JTextField t1;
	JPasswordField t2;
	JButton b1;
	Login()
	{
		Font f=new Font("Arial",Font.BOLD,24);
		l1=new JLabel("Login Page");
		l1.setFont(f);//in awt package
		l2=new JLabel("UserName");
		l3=new JLabel("Password");
		l1.setBounds(70,40,200,40);
		l2.setBounds(70,100,100,20);
		l3.setBounds(70,190,100,20);
		add(l1);
		add(l2);
		add(l3);
		
		
		
		//Adding JTextField
		
		t1=new JTextField();
		t1.setBounds(70,120,200,30);
		add(t1);
		
		//Adding JPasswordField
		t2=new JPasswordField();
		t2.setBounds(70,210,200,30);
		add(t2);
		
		
		
		
		//Adding JButton
		
		b1=new JButton("Login");
		b1.setBounds(170,270,100,30);
		add(b1);
		
		//ActionListener
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				
				
				try
				{
					//Class.forName("");this is optional
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","1234");
					/*open sql command line
					Type:connect username(of database)/password(of database)
					it display:connected
					*/
					String sql="select * from stu where username='"+t1.getText()+"' and password='"+t2.getText()+"'";
					PreparedStatement ps=conn.prepareStatement(sql);
					ResultSet rs=ps.executeQuery();
					
					if(rs.next())
					{
						JOptionPane.showMessageDialog(null,"login successfully");
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Invalid username and password");
						
					}
					
				}catch(Exception e)
				{
					System.out.println(e);
				}
				//System.out.println(t1.getText());
				//System.out.println(t2.getText());
			}
		});
		
		setLayout(null);
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String args[])
	{
			Login login=new Login();
	}
}