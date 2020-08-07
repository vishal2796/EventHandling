//my CODE
package changecolor;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Changecolor extends JFrame implements ActionListener, MouseListener, ItemListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Container cp;
	JRadioButton btnRed, btnGreen, btnBlue;
	JComboBox<String> cb;
	
	public Changecolor()
	{
		cp=getContentPane();
		cp.setLayout(new FlowLayout());
		
		
		btnRed= new JRadioButton("Red");
		cp.add(btnRed);
		btnRed.addActionListener(this);
		btnGreen= new JRadioButton("Green");
		cp.add(btnGreen);
		btnGreen.addActionListener(this);
		btnBlue=new JRadioButton("Blue");
		cp.add(btnBlue);
		btnBlue.addActionListener(this);

		cb= new JComboBox<String>();
		cb.addItem("--select--");
		cb.addItem("Black");
		cb.addItem("Orange");
		cb.addItem("Magenta");
		cp.add(cb);
		cb.addMouseListener(this);
		cb.addItemListener(this);
		
		setVisible(true);
		setSize(500,500);
		setTitle("Changing Color");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBackground(Color.LIGHT_GRAY);
		
		
	}
	public static void main(String[] args) {
		Changecolor c= new Changecolor();

	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnRed)
			cp.setBackground(Color.red);
		else if(e.getSource()==btnGreen)
			cp.setBackground(Color.GREEN);
		else if(e.getSource()==btnBlue)
			cp.setBackground(Color.BLUE);
	}
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource()==cb)
		{
			String clr=cb.getSelectedItem().toString();
			if(clr.equals("Black"))
				cp.setBackground(Color.BLACK);
			else if(clr.equals("Orange"))
				cp.setBackground(Color.ORANGE);
			else if(clr.equals("Magenta"))
				cp.setBackground(Color.MAGENTA);
				
		}
		
	}

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseEntered(MouseEvent e) {
		cb.setForeground(Color.CYAN);
		
	}
	public void mouseExited(MouseEvent e) {
		cb.setForeground(Color.LIGHT_GRAY);
		
	}

}
