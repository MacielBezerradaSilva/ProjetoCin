package gui;

import java.awt.BorderLayout;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.Charter;
import controller.CharterControllerImpl;

public class ListCharters extends javax.swing.JPanel  {
	
	static String[] columnNames = {"charterId","name","objective","maxTime","minTime"};
	
	public ListCharters(){
		
	}
	
	public static void main(String arg[]) {

		ListCharters panel = new ListCharters();

		DefaultTableModel model = new DefaultTableModel();
		JFrame f = new JFrame();
		model.setColumnIdentifiers(columnNames);
		
	    final JTable table = new JTable(model);
//	    f.getContentPane().add(panel);
	    f.getContentPane().add(new JScrollPane(table), BorderLayout.CENTER);
	    
	    CharterControllerImpl charter = new CharterControllerImpl();
	    
	    List<Charter> listCharter = null;
		try {
			listCharter = charter.listarCharter();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(Charter cht : listCharter)
		{
			model.addRow(new Object[]
								{
								 cht.getId(),
								 cht.getName(),
								 cht.getObjective(),
								 cht.getMaxTime(),
								 cht.getMinTime()
								});
		}
	    f.pack();

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
