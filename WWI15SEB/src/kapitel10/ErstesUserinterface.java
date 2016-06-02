package kapitel10;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class ErstesUserinterface {

	public static void main(String[] args) {
		
		
		JFrame fenster = new JFrame("Erstes Fenster");
		fenster.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		FlowLayout flowLayoutManager = new FlowLayout(FlowLayout.RIGHT);
		fenster.getContentPane().setLayout(flowLayoutManager);
		
		JLabel text = new JLabel("Juhu!");
		JButton button = new JButton("Drück mich!");
		
		
		fenster.getContentPane().add(text);
		fenster.getContentPane().add(button);
		
		//fenster.setBounds(200, 200, 200, 150);
		fenster.pack();
		fenster.setVisible(true);

	}

}
