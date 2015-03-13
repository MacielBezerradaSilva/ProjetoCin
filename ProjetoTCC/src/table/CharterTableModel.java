package table;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import entity.Charter;

/**
 * 
 * @author Flavio Santos
 *
 */
public class CharterTableModel extends AbstractTableModel {
	
	private static final int ID = 0;
	private static final int NAME = 1;
	private static final int OBJECTIVE = 2;
	private static final int MAX_TIME = 3;
	private static final int MIN_TIME = 4;

	private String[] colunas = new String[]{"Id", "Nome", "Objetivo", "Tempo Minímo", "Tempo Máximo"};
	
	private List<Charter> valores;
	
	public CharterTableModel(List<Charter> valores) {
		this.valores = valores;
	}
	
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return colunas.length;
	}

	public int getRowCount() {
		// TODO Auto-generated method stub
		return valores.size();
	}

	public Object getValueAt(int row, int col) {
		// TODO Auto-generated method stub
		Charter charter = valores.get(row);
		switch(col) {
			case ID:
				return charter.getId();
			case NAME:
				return charter.getName();
			case OBJECTIVE:
				return charter.getObjective();
			case MAX_TIME:
				return charter.getMaxTime();
			case MIN_TIME:
				return charter.getMinTime();
			default:
				return null;
		}
	}
	
	@Override
	public String getColumnName(int col) {
		return colunas[col];
	}
	
	@Override
    public boolean isCellEditable(int row, int col) {
        return false;
    }	
	
	public Charter get(int row) {
		return valores.get(row);
	}

}
