import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AboutDialog extends JDialog implements ActionListener{

	Container cp;
	JLabel l1,l2;
	JButton close;
	MyNotepad mref;
	
	public AboutDialog(MyNotepad ref, String title, boolean b)
	{
		super(ref, title,b);
		mref= ref;
		cp=getContentPane();
		cp.setLayout(new FlowLayout());
		l1=new JLabel(new ImageIcon("aboutus.jpg"));
		cp.add(l1);
		
		l2= new JLabel("This application is developed by: Vishal Singh");
		cp.add(l2);
		
		close= new JButton("Close");
		cp.add(close);
		close.addActionListener(this);	
		
		setVisible(true);
		setSize(500,500);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==close)
		{
			int r= JOptionPane.showConfirmDialog(this, "Do you really want to Quit?","QUIT", JOptionPane.YES_NO_OPTION);
			if(r==JOptionPane.YES_OPTION)
			{
				this.dispose();
			}
		}
	}
}
