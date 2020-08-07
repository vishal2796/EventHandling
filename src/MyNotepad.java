
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.*;

public class MyNotepad extends JFrame implements ActionListener {
	Container cp;
	JTextArea ta;
	JMenuBar mb;
	JMenu file, edit, format ,change,help;
	JMenuItem New, open,save,exit,cut,copy,paste,bgcolor,font,forcolor, aboutus;
	JToolBar jtb;
	JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7;
	
	public MyNotepad()
	{
		cp=getContentPane();
		cp.setLayout(new BorderLayout());
		
		mb= new JMenuBar();
		setJMenuBar(mb);
		
		ta= new JTextArea();
		cp.add(ta);
		
		//File menu
		file= new JMenu("File");
		mb.add(file);
		
		//menu items
		New= new JMenuItem("New");
		file.add(New);
		New.addActionListener(this);
		
		open= new JMenuItem("Open");
		file.add(open);
		open.addActionListener(this);
		
		save= new JMenuItem("Save");
		file.add(save);
		save.addActionListener(this);
		
		exit=new JMenuItem("Exit");
		file.add(exit);
		exit.addActionListener(this);
		
		//Edit Menu
		edit= new JMenu("Edit");
		mb.add(edit);
		
		//menu items
		cut= new JMenuItem("Cut");
		edit.add(cut);
		cut.addActionListener(this);
		
		copy= new JMenuItem("Copy");
		edit.add(copy);
		copy.addActionListener(this);
		
		paste= new JMenuItem("Paste");
		edit.add(paste);
		paste.addActionListener(this);
		
		//Format Menu
		format= new JMenu("Format");
		mb.add(format);
		
		//sub-menu
		
		change= new JMenu("Change");
		format.add(change);
		
		//menu items
		bgcolor= new JMenuItem("BG Color");
		change.add(bgcolor);
		bgcolor.addActionListener(this);
		
		forcolor= new JMenuItem("FG Color");
		change.add(forcolor);
		forcolor.addActionListener(this);
		
		font= new JMenuItem("Font");
		change.add(font);
		font.addActionListener(this);
		
		//Help menu
		help= new JMenu("Help");
		mb.add(help);
		//menu item
		aboutus= new JMenuItem("About Us");
		help.add(aboutus);
		aboutus.addActionListener(this);
		
		// ToolBar
		btn1= new JButton(new ImageIcon("new.jpg"));
		btn1.addActionListener(this);
		btn2= new JButton(new ImageIcon("openfile.jpg"));
		btn2.addActionListener(this);
		btn3= new JButton(new ImageIcon("savefile.jpg"));
		btn3.addActionListener(this);
		btn4= new JButton(new ImageIcon("cut.jpg"));
		btn4.addActionListener(this);
		btn5= new JButton(new ImageIcon("copy.jpg"));
		btn5.addActionListener(this);
		btn6= new JButton(new ImageIcon("paste.jpg"));
		btn6.addActionListener(this);
		btn7= new JButton(new ImageIcon("exit.jpg"));
		btn7.addActionListener(this);
		
		jtb= new JToolBar();
		jtb.setFloatable(true);
		jtb.add(btn1);
		jtb.add(btn2);
		jtb.add(btn3);
		jtb.add(btn4);
		jtb.add(btn5);
		jtb.add(btn6);
		jtb.add(btn7);
		
		
		cp.add(jtb, "North");
		
		setVisible(true);
		setSize(500,500);
		setTitle("My Notepad");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new MyNotepad();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==New)
		{
			ta.setText("");
		}
		if(e.getSource()==exit)
		{
			int r= JOptionPane.showConfirmDialog(this, "Are you sure you want to quit?", "Quit", JOptionPane.YES_NO_OPTION);
			if(r==JOptionPane.YES_OPTION)
			{
				this.dispose();
			}
		}
		if(e.getSource()==open)
		{
			showOpenFileDialog();
		}	
		if(e.getSource()==save)
		{
			showSaveFileDialog();
		}	
		if(e.getSource()==cut)
		{
			ta.cut();
		}
		if(e.getSource()==copy)
		{
			ta.copy();
		}
		if(e.getSource()==paste)
		{
			ta.paste();
		}
		if(e.getSource()==bgcolor)
		{
			Color c= JColorChooser.showDialog(this, "Choose color", Color.blue);
			cp.setBackground(c);
		}
		if(e.getSource()==forcolor)
		{
			Color c= JColorChooser.showDialog(this, "Choose color", Color.blue);
			cp.setForeground(c);
		}
		if(e.getSource()==font)
		{
			MyDialogue d= new MyDialogue(this, "Choose font", false);
		}
		if(e.getSource()==aboutus)
		{
			AboutDialog ad= new AboutDialog(this, "About Us", false); 
		}
		if(e.getSource()==btn1)
		{
			ta.setText("");
		}
		if(e.getSource()== btn2)
		{
			showOpenFileDialog();
		}
		if(e.getSource()== btn3)
		{
			showSaveFileDialog();
		}
		if(e.getSource()== btn4)
		{
			ta.cut();
		}
		if(e.getSource()== btn5)
		{
			ta.copy();
		}
		if(e.getSource()== btn6)
		{
			ta.paste();;
		}
		if(e.getSource()== btn7)
		{
			int r= JOptionPane.showConfirmDialog(this, "You want to Quit?", "QUIT", JOptionPane.YES_NO_OPTION);
			if(r==JOptionPane.YES_OPTION)
				this.dispose();
		}
		
		
	}
	private void showSaveFileDialog() {
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("Specify a file to save");

		int userSelection = fileChooser.showSaveDialog(this);
		if (userSelection == JFileChooser.APPROVE_OPTION) {
			File fileToSave = fileChooser.getSelectedFile();
			System.out.println("Save as file: " + fileToSave.getAbsolutePath());
		}
	}
	private void showOpenFileDialog() {
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("Specify a file to open");

		int userSelection = fileChooser.showOpenDialog(this);
		if (userSelection == JFileChooser.APPROVE_OPTION) {
			File fileToOpen = fileChooser.getSelectedFile();
			System.out.println("Selected file: " + fileToOpen.getAbsolutePath());
		}
	}
	
}
