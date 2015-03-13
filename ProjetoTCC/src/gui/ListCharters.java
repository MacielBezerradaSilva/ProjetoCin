package gui;

import java.awt.BorderLayout;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;

import table.CharterTableModel;
import controller.CharterControllerImpl;

public class ListCharters extends javax.swing.JPanel  {
		
	private CharterControllerImpl charter;
    private JButton btnNew, btnSave, btnUpdate, btnRemove, btnCancel;
	private CharterTableModel model;
	private static JTable _table;
	
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
	    
	    this.add(_table, BorderLayout.CENTER);
		this.add(btnNew, "gapleft 90");
        this.add(btnCancel);
        this.add(btnSave, "gap unrelated");
        this.add(btnUpdate, "gap unrelated");
        this.add(btnRemove);		
	}
	
	public static void main(String args[]) {
		ListCharters panel = new ListCharters();
		JFrame f = new JFrame();
	    f.getContentPane().add(panel);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	    
	    f.pack();
		f.setVisible(true);	    
	}
}
