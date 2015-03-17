package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;

import table.CharterTableModel;
import controller.CharterControllerImpl;

public class ListCharters extends javax.swing.JPanel  {
		
	private CharterControllerImpl charter;
    private JButton btnNew, btnSave, btnUpdate, btnRemove, btnCancel;
	private CharterTableModel model;
	private static JTable _table;
	private static JPanel panelButtons;
	
	public ListCharters(){		
        ClassLoader loader = getClass().getClassLoader();
        btnNew = new JButton(new ImageIcon(loader.getResource("img/new.png")));
        btnSave = new JButton(new ImageIcon(loader.getResource("img/save.png")));
        btnCancel = new JButton(new ImageIcon(loader.getResource("img/cancel.png")));
        btnRemove = new JButton(new ImageIcon(loader.getResource("img/trash.png")));
        btnUpdate = new JButton(new ImageIcon(loader.getResource("img/edit.png")));
		
	    charter = new CharterControllerImpl();
		try {
			model = new CharterTableModel(charter.listarCharter());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    _table = new JTable(model);	    
	    
	    panelButtons = new JPanel();
        panelButtons.setBorder(BorderFactory.createEtchedBorder());
	    
	    this.add(_table, BorderLayout.CENTER);
        this.setBounds(5, 150, 480, 240);
        this.setBorder(BorderFactory.createTitledBorder("Lista de Charters"));
        
		panelButtons.add(btnNew, "gapleft 90");
		panelButtons.add(btnCancel);
		panelButtons.add(btnSave, "gap unrelated");
		panelButtons.add(btnUpdate, "gap unrelated");
		panelButtons.add(btnRemove);
		panelButtons.setBounds(5, 105, 480, 40);
	}
	
	public static void main(String args[]) {
		ListCharters panel = new ListCharters();
		JFrame f = new JFrame();
	    f.add(panelButtons);
	    f.add(panel);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	    
	    f.pack();
	    f.setMinimumSize(new Dimension(500,420));
		f.setVisible(true);	    
	}
}
