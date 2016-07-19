package uebungen.kapitel10.meldeamt.extended;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

public class MeldeamtUI extends JFrame {

	public static final String ACTION_ADD = "BTN_ADD";
	public static final String ACTION_SHOW = "BTN_SHOW";
	public static final String ACTION_SEARCH = "BTN_SEARCH";
	public static final String ACTION_DELETE = "BTN_DELETE";
	public static final String ACTION_SHOWLIST = "BTN_SHOWLIST";
	public static final String ACTION_CLOSE = "BTN_CLOSE";
	
	public static final String ACTION_LOAD = "BTN_LOAD";
	public static final String ACTION_SAVE = "BTN_SAVE";
	
	public static final String ACTION_MARITAL_STATUS = "MARITAL_STATUS";
	
	private JLabel lblNotifications;
	private JComboBox cbbTitle;
	private JTextField tfName;
	private JTextField tfVorname;
	private JTextField tfGebName;
	private JTextField tfEmail;
	private ButtonGroup maritalGroup;
	
	private String currentMaritalStatus = Einwohner.FAMILIENSTAND_VERHEIRATET;
	
	private MeldeamtController controller;
	private JList list;
	private JRadioButton rbtL;
	private JRadioButton rbtVH;
	private JRadioButton rbtVW;
	private JRadioButton rbtG;
	
	public MeldeamtUI(String title){
		super(title);
		
		this.setLayout(new BorderLayout());
		
	// init Controller
		controller = new MeldeamtController(this);
		
	// Action Listener - RadioButtonGroup Familienstand
		ActionListener rbgMaritalStatus = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JRadioButton btn = (JRadioButton)arg0.getSource();
				
				currentMaritalStatus = btn.getText();
				
				if(btn.isSelected()){
					if(btn.getText().equals(Einwohner.FAMILIENSTAND_LEDIG)){
						tfGebName.setText("");
						tfGebName.setEditable(false);
					}else{
						tfGebName.setEditable(true);
					}
					
				}
				
			}
		};
		
		
	// Panels im BorderLayout
		JPanel northPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel southPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel centerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel eastPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		
		
	// "Eingedrückter" Centerbereich
		Border loweredBevelBorder = BorderFactory.createBevelBorder(BevelBorder.LOWERED);
		centerPanel.setBorder(loweredBevelBorder);
		
		this.add(northPanel, BorderLayout.NORTH);
		this.add(southPanel, BorderLayout.SOUTH);
		this.add(centerPanel, BorderLayout.CENTER);
		this.add(eastPanel, BorderLayout.EAST);
		
		
	// North Panel - Leiste für Meldungen
		lblNotifications = new JLabel("");
		northPanel.add(lblNotifications);
		
		
	// Center Panel - Eingabebereich
		Border etchedBorder = BorderFactory.createEtchedBorder();
		
		// Kontaktdaten
		JPanel contactDataPanel = new JPanel(new GridLayout(0, 2));
		Border contactEtchedBorder = BorderFactory.createTitledBorder(etchedBorder, "Kontaktdaten");
		contactDataPanel.setBorder(contactEtchedBorder);
		centerPanel.add(contactDataPanel);
		
		Object[] titleValues = {Einwohner.ANREDE_FRAU, Einwohner.ANREDE_HERR};
		
		cbbTitle = new JComboBox(titleValues);
		tfName = new JTextField(20); tfName.setText("Mustermann");
		tfVorname = new JTextField(20); tfVorname.setText("Mimi");
		tfGebName = new JTextField(20); tfGebName.setText("Musterfrau");
		tfEmail = new JTextField(20); tfEmail.setText("mimi.mustermann@email.de");
		
		contactDataPanel.add(new JLabel("Anrede:"));
		contactDataPanel.add(cbbTitle);
		contactDataPanel.add(new JLabel("Name:"));
		contactDataPanel.add(tfName);
		contactDataPanel.add(new JLabel("Vorname:"));
		contactDataPanel.add(tfVorname);
		contactDataPanel.add(new JLabel("Geburtsname:"));
		contactDataPanel.add(tfGebName);
		contactDataPanel.add(new JLabel("E-Mail:"));
		contactDataPanel.add(tfEmail);
		
		
		
		// Familienstand
		JPanel maritalStatusPanel = new JPanel(new GridLayout(0, 1));
		Border maritalEtchedBorder = BorderFactory.createTitledBorder(etchedBorder, "Familienstand");
		maritalStatusPanel.setBorder(maritalEtchedBorder);
		centerPanel.add(maritalStatusPanel);
		
		maritalGroup = new ButtonGroup();
		
		rbtL = new JRadioButton(Einwohner.FAMILIENSTAND_LEDIG);
		rbtVH = new JRadioButton(Einwohner.FAMILIENSTAND_VERHEIRATET);
		rbtVW = new JRadioButton(Einwohner.FAMILIENSTAND_VERWITWET);
		rbtG = new JRadioButton(Einwohner.FAMILIENSTAND_GESCHIEDEN);
		
		rbtVH.setSelected(true);
		
		maritalGroup.add(rbtL); rbtL.addActionListener(rbgMaritalStatus); rbtL.setActionCommand(ACTION_MARITAL_STATUS);
		maritalGroup.add(rbtVH); rbtVH.addActionListener(rbgMaritalStatus); rbtVH.setActionCommand(ACTION_MARITAL_STATUS);
		maritalGroup.add(rbtVW); rbtVW.addActionListener(rbgMaritalStatus); rbtVW.setActionCommand(ACTION_MARITAL_STATUS);
		maritalGroup.add(rbtG); rbtG.addActionListener(rbgMaritalStatus); rbtG.setActionCommand(ACTION_MARITAL_STATUS);
		
		maritalStatusPanel.add(rbtL);
		maritalStatusPanel.add(rbtVH);
		maritalStatusPanel.add(rbtVW);
		maritalStatusPanel.add(rbtG);
		
		
		
		
		
	// South Panel - Leiste für Buttons
		
		JButton btnAdd = new JButton("Hinzufügen");
		btnAdd.setActionCommand(ACTION_ADD);
		btnAdd.addActionListener(controller);
		
		JButton btnShow = new JButton("Anzeigen");
		btnShow.setActionCommand(ACTION_SHOW);
		btnShow.addActionListener(controller);
		
		JButton btnSearch = new JButton("Suchen");
		btnSearch.setActionCommand(ACTION_SEARCH);
		btnSearch.addActionListener(controller);
		
		JButton btnDelete = new JButton("Löschen");
		btnDelete.setActionCommand(ACTION_DELETE);
		btnDelete.addActionListener(controller);
		
		JButton btnShowList = new JButton("Liste Anzeigen");
		btnShowList.setActionCommand(ACTION_SHOWLIST);
		btnShowList.addActionListener(controller);
		
		southPanel.add(btnAdd);
		//southPanel.add(btnShow);
		//southPanel.add(btnSearch);
		southPanel.add(btnDelete);
		//southPanel.add(btnShowList);
		
		
		
		// East Panel - Leiste für Buttons
		
		list = new JList();
		list.addMouseListener(controller);
		controller.setEinwohnerList();
		
		
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setLayoutOrientation(JList.VERTICAL);
		list.setVisibleRowCount(-1);

		JScrollPane listScroller = new JScrollPane(list);
		listScroller.setPreferredSize(new Dimension(250, 150));
		
		eastPanel.add(listScroller);
		
		
		
	// JMenu - Datei Menü zum laden und speichern
		JMenuBar mBar = new JMenuBar();
		JMenu menuFile = new JMenu("Datei");
		
		mBar.add(menuFile);
		
		JMenuItem itemLoad = new JMenuItem("Laden"); itemLoad.setActionCommand(ACTION_LOAD); itemLoad.addActionListener(controller);
		JMenuItem itemSave = new JMenuItem("Speichern"); itemSave.setActionCommand(ACTION_SAVE); itemSave.addActionListener(controller);
		JMenuItem itemClose = new JMenuItem("Schließen"); itemClose.setActionCommand(ACTION_CLOSE); itemClose.addActionListener(controller);
		
		menuFile.add(itemLoad);
		menuFile.add(itemSave);
		menuFile.addSeparator();
		menuFile.add(itemClose);
		
		this.setJMenuBar(mBar);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.pack();
	}
	
	
	
	/**
	 * @return the rbtL
	 */
	protected JRadioButton getRbtL() {
		return rbtL;
	}



	/**
	 * @param rbtL the rbtL to set
	 */
	protected void setRbtL(JRadioButton rbtL) {
		this.rbtL = rbtL;
	}



	/**
	 * @return the rbtVH
	 */
	protected JRadioButton getRbtVH() {
		return rbtVH;
	}



	/**
	 * @param rbtVH the rbtVH to set
	 */
	protected void setRbtVH(JRadioButton rbtVH) {
		this.rbtVH = rbtVH;
	}



	/**
	 * @return the rbtVW
	 */
	protected JRadioButton getRbtVW() {
		return rbtVW;
	}



	/**
	 * @param rbtVW the rbtVW to set
	 */
	protected void setRbtVW(JRadioButton rbtVW) {
		this.rbtVW = rbtVW;
	}



	/**
	 * @return the rbtG
	 */
	protected JRadioButton getRbtG() {
		return rbtG;
	}



	/**
	 * @param rbtG the rbtG to set
	 */
	protected void setRbtG(JRadioButton rbtG) {
		this.rbtG = rbtG;
	}



	protected void setNotification(String text){
		lblNotifications.setText(text);
		this.pack();
		
	}
	
	
	

	/**
	 * @return the list
	 */
	protected JList getList() {
		return list;
	}


	/**
	 * @return the lblNotifications
	 */
	protected JLabel getLblNotifications() {
		return lblNotifications;
	}

	/**
	 * @param lblNotifications the lblNotifications to set
	 */
	protected void setLblNotifications(JLabel lblNotifications) {
		this.lblNotifications = lblNotifications;
	}

	/**
	 * @return the cbbTitle
	 */
	protected JComboBox getCbbTitle() {
		return cbbTitle;
	}

	/**
	 * @param cbbTitle the cbbTitle to set
	 */
	protected void setCbbTitle(JComboBox cbbTitle) {
		this.cbbTitle = cbbTitle;
	}

	/**
	 * @return the tfName
	 */
	protected JTextField getTfName() {
		return tfName;
	}

	/**
	 * @param tfName the tfName to set
	 */
	protected void setTfName(JTextField tfName) {
		this.tfName = tfName;
	}

	/**
	 * @return the tfVorname
	 */
	protected JTextField getTfVorname() {
		return tfVorname;
	}

	/**
	 * @param tfVorname the tfVorname to set
	 */
	protected void setTfVorname(JTextField tfVorname) {
		this.tfVorname = tfVorname;
	}

	/**
	 * @return the tfGebName
	 */
	protected JTextField getTfGebName() {
		return tfGebName;
	}

	/**
	 * @param tfGebName the tfGebName to set
	 */
	protected void setTfGebName(JTextField tfGebName) {
		this.tfGebName = tfGebName;
	}

	/**
	 * @return the tfEmail
	 */
	protected JTextField getTfEmail() {
		return tfEmail;
	}

	/**
	 * @param tfEmail the tfEmail to set
	 */
	protected void setTfEmail(JTextField tfEmail) {
		this.tfEmail = tfEmail;
	}

	/**
	 * @return the maritalGroup
	 */
	protected ButtonGroup getMaritalGroup() {
		return maritalGroup;
	}

	/**
	 * @param maritalGroup the maritalGroup to set
	 */
	protected void setMaritalGroup(ButtonGroup maritalGroup) {
		this.maritalGroup = maritalGroup;
	}

	/**
	 * @return the currentMaritalStatus
	 */
	protected String getCurrentMaritalStatus() {
		return currentMaritalStatus;
	}

	/**
	 * @param currentMaritalStatus the currentMaritalStatus to set
	 */
	protected void setCurrentMaritalStatus(String currentMaritalStatus) {
		this.currentMaritalStatus = currentMaritalStatus;
	}

	/**
	 * @return the controller
	 */
	protected MeldeamtController getController() {
		return controller;
	}

	/**
	 * @param controller the controller to set
	 */
	protected void setController(MeldeamtController controller) {
		this.controller = controller;
	}
	

}