package kapitel10;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class BorderLayoutExample extends JFrame {

	
	public BorderLayoutExample() {
		super("BorderLayout Beispiel");
		
		this.setLayout(new BorderLayout());
		
		JButton northButton = new JButton("Norden");
		JButton southButton = new JButton("Süden");
		JButton eastButton = new JButton("Osten");
		JButton westButton = new JButton("Westen");
		JButton centerButton = new JButton("Mitte");
		
		JPanel northPanel = new JPanel(new FlowLayout());
		northPanel.add(northButton);
		JPanel centerPanel = new JPanel(new FlowLayout());
		centerPanel.add(centerButton);
		
		
		this.add(northPanel, BorderLayout.NORTH);
		this.add(southButton, BorderLayout.SOUTH);
		this.add(eastButton, BorderLayout.EAST);
		this.add(westButton, BorderLayout.WEST);
		this.add(centerPanel, BorderLayout.CENTER);
		
		
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new BorderLayoutExample();

	}

}
