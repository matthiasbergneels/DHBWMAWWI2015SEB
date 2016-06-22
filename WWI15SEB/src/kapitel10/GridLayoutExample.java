package kapitel10;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class GridLayoutExample extends JFrame {

	public GridLayoutExample(){
		super("GridLayout Example");
		
		// rows = 0 ==> Flexible Anzahl Zeilen
		this.setLayout(new GridLayout(0, 3));
		
		JPanel panel1 = new JPanel(new FlowLayout());
		panel1.add(new JButton("Button 1"));
		
		this.add(panel1);
		this.add(new JButton("Button 2"));
		this.add(new JButton("Button 3"));
		this.add(new JButton("Button 4"));
		this.add(new JButton("Button 5"));
		this.add(new JButton("Button 6"));
		this.add(new JButton("Button 7"));
		
		
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		GridLayoutExample frame = new GridLayoutExample();

	}

}
