package gui;

import java.awt.Component;
import java.awt.GridLayout;
import java.sql.SQLException;
import java.util.List;

import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import management.RequestManager;
import dao.CharterDao;
import dao.ICharterDao;
import entity.Charter;
import entity.Session;
import execution.Util;

/**
 *
 * @author Heitor
 */
public class NewSessionPanel extends JPanel {

    private JTextField testerField, idField, durationField;
    private JComboBox productCombo;
    private DefaultListModel<Charter> charterList;
    private JPanel inputsPanel;
    private CharterPanel charterPanel;
    private static final int INPUTS_ROWS = 0, INPUTS_COLS = 2, INPUTS_H_GAP = 25, INPUTS_v_GAP = 15;
    
    private static final int ROWS = 0, COLS = 2;    
    private RequestManager rm;
    private Session session;
    private JButton startButton;
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

    public NewSessionPanel() {
        testerField = new JTextField();
        idField = new JTextField();
        durationField = new JTextField();
        productCombo = new JComboBox();
        charterList = new DefaultListModel<Charter>();
        inputsPanel = new JPanel(new GridLayout(INPUTS_ROWS, INPUTS_COLS, INPUTS_H_GAP, INPUTS_v_GAP));
        session = new Session(new Charter());
        rm = new RequestManager(new JFrame());
        startButton = new JButton(rm.loadProperty(Util.getLanguage()+"_Start_Session"));
        createLayout();
    }

    private void createLayout() {
        
        inputsPanel.add(new JLabel(rm.loadProperty(Util.getLanguage()+"_Tester")));
        inputsPanel.add(testerField);
        
        inputsPanel.add(new JLabel(rm.loadProperty(Util.getLanguage()+"_ID")));
        inputsPanel.add(idField);
        
        inputsPanel.add(new JLabel(rm.loadProperty(Util.getLanguage()+"_Duration")));
        inputsPanel.add(durationField);
        
        //Depois colocar isso em um XML
        productCombo.addItem("Razr HD");
        productCombo.addItem("Razr Maxx");
        productCombo.addItem("Razr i");
        productCombo.addItem("Moto X");
        
        inputsPanel.add(new JLabel(rm.loadProperty(Util.getLanguage()+"_Product")));
        inputsPanel.add(productCombo);

        //Carregar dinamicamente, depois
        ICharterDao chartersDao = new CharterDao();

        List<Charter> lCharter;
		try {
			lCharter = chartersDao.listCharter();
	        for(Charter i : lCharter){
	            charterList.addElement(i);
	        }			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        
        
        inputsPanel.add(new JLabel(rm.loadProperty(Util.getLanguage()+"_Charter")));
        final JList list = new JList(charterList);
        
        list.setVisibleRowCount(4);
        list.setCellRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                Component renderer = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                if (renderer instanceof JLabel && value instanceof Charter) {
                    ((JLabel) renderer).setText(((Charter) value).getName());
                }
                return renderer;
            }
        });
        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                session.setCharter(((Charter)list.getSelectedValue()));
                charterPanel.setCharter(session.getCharter());
                charterPanel.repaint();
            }
        });
        inputsPanel.add(list);
        inputsPanel.add(startButton);
        
        charterPanel = new CharterPanel(session.getCharter());
        
        this.add(inputsPanel);
        this.add(charterPanel);
    }

    
}
