/**
 * 
 */
package table;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

/**
 * @author Maciel B
 *
 */
public class ButtonColumn extends AbstractCellEditor implements TableCellEditor, TableCellRenderer, ActionListener {
	
	JTable table;
	JButton renderButton;
	JButton btEditar;
	String text;
	
	public ButtonColumn(JTable table, int column){
		super();
		this.table = table;
		renderButton = new JButton();
		
		btEditar = new JButton();
		btEditar.setFocusPainted(false);
		btEditar.addActionListener(this);
		
		TableColumnModel columnModel = table.getColumnModel();
		columnModel.getColumn(column).setCellRenderer(this);
		columnModel.getColumn(column).setCellEditor(this);
	}
	
	public Object getCellEditorValue() {
		return text;
	}

	
	public void actionPerformed(ActionEvent e) {
		fireEditingStopped();
		System.out.println(e.getActionCommand()+":"+table.getSelectedRow());
	}

	
	public Component getTableCellRendererComponent(JTable table, Object value,
			boolean isSelected, boolean hasFocus, int row, int column) {
		if(hasFocus){
			renderButton.setForeground(table.getForeground());
			renderButton.setBackground(UIManager.getColor("Button.background"));
		
		}else if(isSelected){
			renderButton.setForeground(table.getSelectionBackground());
			renderButton.setBackground(table.getSelectionBackground());
		}else{
			renderButton.setForeground(table.getForeground());
			renderButton.setBackground(UIManager.getColor("button.background"));
		}
			renderButton.setText((value==null)?"":value.toString());
		return renderButton;
	}

	
	public Component getTableCellEditorComponent(JTable table, Object value,
			boolean isSelected, int row, int column) {
		text = (value==null)?"":value.toString();
		btEditar.setText(text);
		return btEditar;
	}

}
