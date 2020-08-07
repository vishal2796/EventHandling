import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Line2D.Float;

public class PaintDemo extends JFrame {
	Container cp;
	
	public PaintDemo()
	{
		cp= getContentPane();
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Paint demo");	
		cp.setBackground(Color.LIGHT_GRAY);
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		//g.setColor(Color.CYAN);
		//g.drawLine(20, 40, 20, 400);
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(4)); // Thickness
		
		g2.setColor(Color.BLUE);
		g2.draw(new Line2D.Float(60,130,60,400));
		
		g2.setColor(Color.BLUE);
		g2.draw(new Line2D.Float(40,180,200,45));
		
		g2.setColor(Color.BLUE);
		g2.draw(new Line2D.Float(200,45,340,140));
		
		g2.setColor(Color.BLUE);
		g2.draw(new Line2D.Float(340,140,380,140));
		g2.setColor(Color.BLUE);
		g2.draw(new Line2D.Float(380,140,380,100));
		g2.setColor(Color.BLUE);
		g2.draw(new Line2D.Float(380,100,420,100));
		g2.setColor(Color.BLUE);
		g2.draw(new Line2D.Float(420,100,420,140));
		g2.setColor(Color.BLUE);
		g2.draw(new Line2D.Float(420,140,450,140));
		
		g.setColor(Color.RED);
		g.fillOval(454, 100, 40, 40);
		g.setColor(Color.RED);
		g.fillOval(480, 100, 40, 40);
		g.setColor(Color.RED);
		g.fillArc(450, 120, 80, 80, 50, 90);
		
		g.setColor(Color.GREEN);
		g.setFont(new Font("Arial",Font.BOLD,18));
		g.drawString("STAY HOME",380,200);
		g.drawString("STAY SAFE",380,220);
		
		Image img= Toolkit.getDefaultToolkit().getImage("familypaint.jpg");
		g.drawImage(img, 80,150, this);
		
		
	}
	public static void main(String[] args) {
		new PaintDemo();
	}

}
