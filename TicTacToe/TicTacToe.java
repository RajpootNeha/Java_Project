import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.GridLayout;

public class TicTacToe extends JFrame{
	JPanel p=new JPanel();
	XOButton buttons[]=new XOButton[9];
	
	public static void main(String args[]){
		new TicTacToe();
	}
	
	public TicTacToe(){
	// here  super is used for title TicTacToe
		super("###TicTacToe###");
		setSize(500,500);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		p.setLayout(new GridLayout(3,3));
		for(int i=0;i<9;i++){
			buttons[i]=new XOButton();
			p.add(buttons[i]);
		}
		//add(p) is used to add button panel
		add(p);
		
		setVisible(true);
		//hide();
	}
}
