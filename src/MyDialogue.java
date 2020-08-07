import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyDialogue extends JDialog implements ActionListener {

	Container cp;
	JLabel fn,fs;
	JComboBox fnc;
	JTextField fst;
	JButton apply,close;
	MyNotepad mref;
	
	public MyDialogue(MyNotepad ref,String title, boolean b)
	{
		super(ref, title, b);
		mref=ref;
		cp=getContentPane();
		cp.setLayout(new FlowLayout());
		
		fn= new JLabel("Font Name");
		cp.add(fn);
		
		fnc= new JComboBox();
		fnc.setEditable(true);
		fnc.addItem("Serif");
		fnc.addItem("SansSerif");
		fnc.addItem("Monospaced");
		fnc.addItem("Dialog");
		fnc.addItem("DialogInput");
		fnc.addItem("Arial");
		cp.add(fnc);
		
		fs= new JLabel("Font Size");
		cp.add(fs);
		
		fst= new JTextField(10);
		cp.add(fst);
		
		apply= new JButton("Apply");
		cp.add(apply);
		apply.addActionListener(this);
		
		setSize(500, 300);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==apply)
		{
		// JComboBox source = (JComboBox) e.getSource();
	    String item = fnc.getSelectedItem().toString();
	    int it = Integer.parseInt(fst.getText());
	    mref.ta.setFont(new Font(item, Font.PLAIN, it));
		}
		if(e.getSource()==close)
		{
			int r= JOptionPane.showConfirmDialog(this, "Are you sure you want to quit?", "Quit", JOptionPane.YES_NO_OPTION);
			if(r==JOptionPane.YES_OPTION)
			{
				this.dispose();
			}
		}
		
	}

}
