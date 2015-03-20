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
import javax.swing.table.TableColumnModel;

import table.ButtonColumn;
import table.CharterTableModel;
import controller.CharterControllerImpl;

public class ListCharters extends javax.swing.JPanel  {
		
	private CharterControllerImpl charter;
    private JButton btnEditar, btnRemove;
	private CharterTableModel model, model1;
	private static JTable _table;
	private static JPanel panelButtons;
	private static TableColumnModel columnModel;
	private ButtonColumn btColumn;
	
	public ListCharters(){		
        ClassLoader loader = getClass().getClassLoader();
        btnRemove = new JButton(new ImageIcon(loader.getResource("img/trash.png")));
        btnEditar = new JButton(new ImageIcon(loader.getResource("img/edit.png")));
	    charter = new CharterControllerImpl();
	    
	    try {
	    	//passando a lista pelo construtor
			model = new CharterTableModel(charter.listarCharter());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    //setando no table os valores do model
	    _table = new JTable(model);
	    //btColumn = new ButtonColumn(_table,4);
	 
	    
	    //panelButtons = new JPanel();
       // panelButtons.setBorder(BorderFactory.createLoweredBevelBorder());
	    
	    this.add(_table, BorderLayout.EAST);
        this.setBounds(5, 50, 100, 100);
        this.setBorder(BorderFactory.createTitledBorder("Lista de Charters"));
       
		//panelButtons.add(btnEditar, "gap unrelated");
		//panelButtons.add(btnRemove);
		//panelButtons.setBounds(5, 105, 480, 40);
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
