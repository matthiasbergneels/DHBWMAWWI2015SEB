package kapitel10;

import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.NumberFormat;
import java.text.ParseException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.JFrame;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.text.MaskFormatter;

public class Logon extends JFrame implements ActionListener{
	
	private final String ACTION_OK = "ACTION_OK";
	private final String ACTION_CANCEL = "ACTION_CANCEL";
	
	
	private JComboBox<String> myComboBox;
	
	public Logon(){
		
		this.setTitle("Logon");
		
		String[] valueHelp = {"FTP", "Telnet", "SMTP", "HTTP"};
		myComboBox = new JComboBox<String>(valueHelp);
		String myText = "Blub!";
		
		ItemListener comboBoxListener = new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				if(e.getStateChange() == ItemEvent.SELECTED){
					// auslesen des selektierten Werts von e.getSource
					Object selectedItemText = ((JComboBox<String>)e.getSource()).getSelectedItem();
					
					
					// String text = (String)myComboBox.getSelectedItem();
					
					System.out.println("Zustand hat sich geändert!" + selectedItemText);
				}
				
			}
		};
		
		ActionListener cancelButtonListner = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
			}
		};
		
		
		
		myComboBox.addItemListener(comboBoxListener);
		myComboBox.addActionListener(this);
		
		// initialize Panels
		JPanel mainPanel = new JPanel(new BorderLayout());
		
		
		
		JPanel southPanel = new JPanel(new FlowLayout());
		JPanel centerPanel = new JPanel(new FlowLayout());
		
		((FlowLayout)centerPanel.getLayout()).setHgap(20);
		((FlowLayout)centerPanel.getLayout()).setVgap(20);
		
		
		JPanel connectionPanel = new JPanel(new GridLayout(0, 2));
		JPanel filePanel = new JPanel(new GridLayout(0, 2));
		
		((GridLayout)connectionPanel.getLayout()).setVgap(15);
		((GridLayout)filePanel.getLayout()).setVgap(15);
		
		JFormattedTextField portField = null;
		try {
			 portField = new JFormattedTextField(new MaskFormatter("#####"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//create & assign elements for connection area
		connectionPanel.add(new JPanel(new FlowLayout()).add(new JLabel("User:")));
		connectionPanel.add(new JPanel(new FlowLayout()).add(new JTextField(5)));
		connectionPanel.add(new JPanel(new FlowLayout()).add(new JLabel("Passwort:")));
		connectionPanel.add(new JPanel(new FlowLayout()).add(new JPasswordField(7)));
		connectionPanel.add(new JPanel(new FlowLayout()).add(new JLabel("Art:")));
		connectionPanel.add(new JPanel(new FlowLayout()).add(myComboBox));
		connectionPanel.add(new JPanel(new FlowLayout()).add(new JLabel("Host:")));
		connectionPanel.add(new JPanel(new FlowLayout()).add(new JTextField(7)));
		connectionPanel.add(new JPanel(new FlowLayout()).add(new JLabel("Port:")));
		connectionPanel.add(new JPanel(new FlowLayout()).add(portField));
		
		
		// create & add Fields for File Area
		filePanel.add(new JPanel(new FlowLayout()).add(new JLabel("Quelle:")));
		filePanel.add(new JPanel(new FlowLayout()).add(new JTextField(10)));
		filePanel.add(new JPanel(new FlowLayout()).add(new JLabel("Ziel:")));
		filePanel.add(new JPanel(new FlowLayout()).add(new JTextField(7)));
		
		// create & assign Buttons
		JButton okButton = new JButton("OK");		
		JButton cancelButton = new JButton("Cancel");
		
		okButton.setActionCommand(ACTION_OK);
		cancelButton.setActionCommand(ACTION_CANCEL);
		
		cancelButton.addActionListener(this);
		okButton.addActionListener(this);
		
		
		southPanel.add(okButton);
		southPanel.add(cancelButton);
		

		// create & assign Borders
		Border etchedBorder = BorderFactory.createEtchedBorder();
		Border connectionBorder = BorderFactory.createTitledBorder(etchedBorder, "Verbindung");
		Border fileBorder = BorderFactory.createTitledBorder(etchedBorder, "Datei");
		Border centerBorder = BorderFactory.createBevelBorder(BevelBorder.LOWERED);
		
		connectionPanel.setBorder(connectionBorder);
		filePanel.setBorder(fileBorder);
		centerPanel.setBorder(centerBorder);
		
		// combine Panels
		centerPanel.add(connectionPanel);
		centerPanel.add(filePanel);
		
		mainPanel.add(centerPanel, BorderLayout.CENTER);
		mainPanel.add(southPanel, BorderLayout.SOUTH);
		
		this.setContentPane(mainPanel);
		
		// set JFrame behavior
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		
	}
	
	public static void main(String[] args){
		new Logon();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equals(ACTION_OK)){
			System.out.println(myComboBox.getSelectedItem());
		}else if(e.getActionCommand().equals(ACTION_CANCEL)){
			System.exit(0);
			
		}
		System.out.println("ActionCommand: " + e.getActionCommand());
		
	}


}