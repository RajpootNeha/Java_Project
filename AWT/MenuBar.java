import javax.swing.*;
class MenuBar
{
	JMenu file,edit,view,insert;
	JMenuItem i1,i2,i3,i4;
	JMenuItem e1,e2,e3,e4;
	JMenuItem v1,v2,v3,v4;
	JMenuItem n1,n2,n3,n4;
	
	//constructor
	MenuBar()
	{
		JFrame f=new JFrame("MenuBar");
		
		JMenuBar mb=new JMenuBar();
		file=new JMenu("File");
		edit=new JMenu("Edit");
		view=new JMenu("View");
		insert=new JMenu("Insert");
		
		i1=new JMenuItem("New");
		i2=new JMenuItem("Open");
		i3=new JMenuItem("Save");
		i4=new JMenuItem("Save As");
		
		
		e1=new JMenuItem("Undo");
		e2=new JMenuItem("Redo");
		e3=new JMenuItem("Repeat");
		e4=new JMenuItem("Copy");
		
		
		v1=new JMenuItem("Normal");
		v2=new JMenuItem("Web");
		v3=new JMenuItem("Toolbar layout");
		v4=new JMenuItem("ToolBars");
		
		
		n1=new JMenuItem("Page Break");
		n2=new JMenuItem("Menual break");
		n3=new JMenuItem("Image");
		n4=new JMenuItem("Media");
		
		file.add(i1);
		file.add(i2);
		file.add(i3);
		file.add(i4);
		
		
		
		edit.add(e1);
		edit.add(e2);
		edit.add(e3);
		edit.add(e4);
		
		
		view.add(v1);
		view.add(v2);
		view.add(v3);
		view.add(v4);
		
		
		insert.add(n1);
		insert.add(n2);
		insert.add(n3);
		insert.add(n4);
		
		
		mb.add(file);
		mb.add(edit);
		mb.add(view);
		mb.add(insert);
		
		
		
		f.setJMenuBar(mb);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[])
	{
	new MenuBar();
	}
}
