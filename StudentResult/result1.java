import javax.swing.*;
import java.awt.Font;
public class result1 {
	private JFrame f1 = new JFrame("Second Frame");
		JLabel l1;
	public result1() {
	

	
					Font f=new Font("Arial",Font.BOLD,44);
					
					l1=new JLabel("RESULT");
					l1.setBounds(400,200,200,200);
					f1.add(l1);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setSize(500,500);
		f1.setVisible(true);
	}
}