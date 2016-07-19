package uebungen.kapitel10.meldeamt.extended;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Vector;

import javax.swing.JFileChooser;
import javax.swing.JRadioButton;
import javax.swing.filechooser.FileFilter;

public class MeldeamtController implements ActionListener, MouseListener {

	private MeldeamtUI ui;
	private TreeSet<Einwohner> liste = new TreeSet<Einwohner>();

	public MeldeamtController(MeldeamtUI ui) {
		this.ui = ui;
	}

	private Einwohner ermittleObjekt(String name, String vorname) {
		Einwohner e = null;

		Iterator<Einwohner> i = liste.iterator();
		while (i.hasNext()) {
			e = i.next();
			if (!(name.equals(e.getName()) && vorname.equals(e.getVorname()))) {
				return e;
			}
		}

		return e;
	}

	public boolean hinzufuegen(String name, String vorname, String gebName,
			String email, String anrede, String familienstand) {
		Einwohner e = new Einwohner(name, vorname, gebName, email, anrede,
				familienstand);
		boolean erg = liste.add(e);
		return erg;
	}

	public boolean anzeigen(String name, String vorname) {

		Einwohner e = ermittleObjekt(name, vorname);

		if (e == null) {
			return false;
		} else {
			System.out.println(e.longDescription());
			return true;
		}
	}

	public boolean suchen(String name, String vorname) {

		Einwohner e = ermittleObjekt(name, vorname);

		if (e == null) {
			return false;
		} else {
			// System.out.println(e);
			return true;
		}
	}

	public boolean loeschen(String name, String vorname) {
		Einwohner e = ermittleObjekt(name, vorname);

		if (e == null) {
			return false;
		} else {
			liste.remove(e);
			return true;
		}
	}

	public void listeAusgeben() {
		if (liste.size() > 0) {

			System.out.println("Einwohner:");

			Iterator<Einwohner> i = liste.iterator();
			while (i.hasNext()) {
				System.out.println(i.next().longDescription());

			}
		} else {
			System.out.println("Die Liste ist leer!");
		}
	}

	private void switchGebNameState(String maritalState) {

		if (maritalState.equals(Einwohner.FAMILIENSTAND_LEDIG)) {
			ui.getTfGebName().setText("");
			ui.getTfGebName().setEditable(false);
		} else {
			ui.getTfGebName().setEditable(true);
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();

		if (action.equals(ui.ACTION_MARITAL_STATUS)) {
			JRadioButton btn = (JRadioButton) e.getSource();

			ui.setCurrentMaritalStatus(btn.getText());

			if (btn.isSelected()) {
				switchGebNameState(btn.getText());
			}

		} else if (action.equals(ui.ACTION_ADD)) {

			boolean erg = this.hinzufuegen(ui.getTfName().getText(), ui
					.getTfVorname().getText(), ui.getTfGebName().getText(), ui
					.getTfEmail().getText(), ui.getCbbTitle().getSelectedItem()
					.toString(), ui.getCurrentMaritalStatus());

			if (erg) {
				ui.setNotification("Einwohner " + ui.getTfName().getText()
						+ " erfolgreich hinzugefügt!");
			} else {
				ui.setNotification("Einwohner " + ui.getTfName().getText()
						+ " NICHT erfolgreich hinzugefügt!");
			}
		} else if (action.equals(ui.ACTION_SHOW)) {
			boolean erg = this.anzeigen(ui.getTfName().getText(), ui
					.getTfVorname().getText());
			if (erg) {
				ui.setNotification("Einwohner " + ui.getTfName().getText()
						+ " angezeigt!");
			} else {
				ui.setNotification("Einwohner " + ui.getTfName().getText()
						+ " NICHT angezeigt!");
			}
		} else if (action.equals(ui.ACTION_SEARCH)) {
			boolean erg = this.suchen(ui.getTfName().getText(), ui
					.getTfVorname().getText());
			if (erg) {
				ui.setNotification("Einwohner " + ui.getTfName().getText()
						+ " gefunden!");
			} else {
				ui.setNotification("Einwohner " + ui.getTfName().getText()
						+ " NICHT gefunden!");
			}
		} else if (action.equals(ui.ACTION_DELETE)) {
			boolean erg = this.loeschen(ui.getTfName().getText(), ui
					.getTfVorname().getText());
			if (erg) {
				clearTextFields();
				ui.setNotification("Einwohner " + ui.getTfName().getText()
						+ " gelöscht!");
			} else {
				ui.setNotification("Einwohner " + ui.getTfName().getText()
						+ " NICHT gefunden!");
			}
		} else if (action.equals(ui.ACTION_SHOWLIST)) {
			this.listeAusgeben();
		} else if (action.equals(ui.ACTION_LOAD)) {

			loadFile();

		} else if (action.equals(ui.ACTION_SAVE)) {

			saveFile();

		} else if (action.equals(ui.ACTION_CLOSE)) {

			System.exit(0);

		}
		

		setEinwohnerList();

	}
	
	protected void clearTextFields(){
		ui.getTfName().setText(null);
		ui.getTfVorname().setText(null);
		ui.getTfEmail().setText(null);
		ui.getTfGebName().setText(null);
	}

	protected Vector getList() {
		return new Vector(liste);

	}

	protected void setEinwohnerList() {
		ui.getList().setListData(getList());
	}

	private void showOnUI(Einwohner e) {
		if (e != null) {
			ui.getTfName().setText(e.getName());
			ui.getTfVorname().setText(e.getVorname());
			ui.getTfGebName().setText(e.getGebName());
			ui.getTfEmail().setText(e.getEmail());
			ui.getCbbTitle().setSelectedItem(e.getAnrede());

			if (e.getFamilienstand().equals(ui.getRbtG().getText())) {
				ui.getRbtG().setSelected(true);
				switchGebNameState(ui.getRbtG().getText());
			} else if (e.getFamilienstand().equals(ui.getRbtL().getText())) {
				ui.getRbtL().setSelected(true);
				switchGebNameState(ui.getRbtL().getText());
			} else if (e.getFamilienstand().equals(ui.getRbtVH().getText())) {
				ui.getRbtVH().setSelected(true);
				switchGebNameState(ui.getRbtVH().getText());
			} else if (e.getFamilienstand().equals(ui.getRbtVW().getText())) {
				ui.getRbtVW().setSelected(true);
				switchGebNameState(ui.getRbtVW().getText());
			}

		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {

		if (e.getSource() == ui.getList()) {
			if (e.getClickCount() == 2) {
				showOnUI((Einwohner) ui.getList().getSelectedValue());
			}

		}

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	// File Handling
	
	private FileFilter ffMUB = new FileFilter() {
		
		private final String EXT = "mub";
		
		@Override
		public String getDescription() {

			return "Dateien mit der Endung ." + EXT;
		}

		@Override
		public boolean accept(File f) {
			if (f.isDirectory()) {
				return true;
			}

			String ext = null;
			String s = f.getName();
			int i = s.lastIndexOf('.');

			if (i > 0 && i < s.length() - 1) {
				ext = s.substring(i + 1).toLowerCase();
			}
			if (ext != null) {
				if (ext.equals(EXT)) {
					return true;
				} else {
					return false;
				}
			}

			return false;
		}
	};

	private void loadFile() {
		JFileChooser fc = new JFileChooser();
		
		fc.setApproveButtonText("Laden");
		fc.setDialogTitle("Daten laden");

		fc.setFileFilter(ffMUB);

		int returnVal = fc.showOpenDialog(ui);

		if (returnVal == JFileChooser.APPROVE_OPTION) {
			try {
				FileReader fr = new FileReader(fc.getSelectedFile());
				
				BufferedReader br = new BufferedReader(fr);
				
				String line = null;				
				liste.clear();

				while((line = br.readLine()) != null){
						String[] attributes = line.split(",");
						if(attributes.length == 6){
							
							liste.add(new Einwohner(attributes[0], 
													attributes[1], 
													attributes[2], 
													attributes[5], 
													attributes[3], 
													attributes[4]));
						}
				}

				br.close();
				fr.close();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}
	
	private void saveFile() {
		JFileChooser fc = new JFileChooser();

		fc.setApproveButtonText("Speichern");
		fc.setDialogTitle("Daten speichern");
		
		fc.setFileFilter(ffMUB);

		int returnVal = fc.showOpenDialog(ui);

		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File mFile = fc.getSelectedFile();
			if(mFile.exists()){
				mFile.delete();
			}
			
			String saveData = "";
			
			
			Iterator<Einwohner> i = liste.iterator();
			while(i.hasNext()){
				Einwohner e = i.next();
				
				saveData = saveData + e.getName() + "," +
						e.getVorname() + "," +
						e.getGebName() + "," +
						e.getAnrede() + "," +
						e.getFamilienstand() + "," +
						e.getEmail() + "\n";
			}
			
			if(saveData.length() > 0){
			try {
				FileWriter fr = new FileWriter(mFile);

				fr.write(saveData, 0, saveData.length());
				
				fr.flush();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			
			
		}
	}

}