/**
 * 
 */
package gui;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.apache.poi.hssf.record.chart.ChartRecord;

import management.RequestManager;
import model.Charter;

/**
 * @author Maciel B
 *
 */
public class CharterPanel extends JPanel{
	
	Charter charter;
	private JLabel charterNameId;
	private JLabel charterObj;
	private JLabel charterRequirements;
	private JLabel charterSetup;
	private JLabel charterNotes;
	private JLabel charterKeyAreas;
	private JLabel charterIssues;
	private JLabel charterImpNotes;
	private JLabel charterMax;
	private JLabel charterMin;
	private final RequestManager rm;
	private static final int CHARTER_ROWS = 0, CHARTER_COLS = 2, CHARTER_H_GAP = 25, CHARTER_V_GAP = 15;
	
	public CharterPanel(){
		this(new Charter());
	}
	public CharterPanel(Charter newCharter){
		super(new GridLayout(CHARTER_ROWS,CHARTER_COLS,CHARTER_H_GAP,CHARTER_V_GAP));
		this.charter = new Charter();
		rm = new RequestManager(new JFrame());
	}
	
	public void setCharter(Charter newCharter){
		charter = newCharter;
		
		String tmp;
		if(charter.getName().length()>30){
			tmp = charter.getName().substring(0,30)+"...";
		}else{
			tmp = charter.getName();
		}
		
		charterNameId.setText(charter.getEtId()+" - "+tmp);
		charterObj.setText(charter.getObjective());
		charterRequirements.setText(charter.getRequirements());
		charterSetup.setText(charter.getSetup());
		charterNotes.setText(charter.getNotes());
		charterKeyAreas.setText(charter.getKeyAreas());
		charterIssues.setText(charter.getIssuesToBeAware());
		charterImpNotes.setText(charter.getImportantNotes());
		charterMax.setText(charter.getMaxTime()+"");
		charterMin.setText(charter.getMinTime()+"");
	}
	private void createCharterPanel(){
		
		charterNameId = new JLabel(charter.getEtId()+" - "+charter.getName());
		charterObj = new JLabel(charter.getObjective());
		charterRequirements = new JLabel(charter.getRequirements());
		charterSetup = new JLabel(charter.getSetup());
		charterNotes = new JLabel(charter.getNotes());
		charterKeyAreas = new JLabel(charter.getKeyAreas());
		charterIssues = new JLabel(charter.getIssuesToBeAware());
		charterImpNotes = new JLabel(charter.getImportantNotes());
		charterMax = new JLabel(charter.getMaxTime()+"");
		charterMin = new JLabel(charter.getMinTime()+"");
	}

}
