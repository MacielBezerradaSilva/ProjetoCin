/**
 * 
 */
package management;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import gui.EntryPoint;

/**
 * @author Maciel B
 *
 */
public class ActionListenerGenerator {
	
	private EntryPoint entryPoint;
	
	public ActionListenerGenerator(EntryPoint entryPoint){
		this.entryPoint = entryPoint;
	}
	
	public ActionListener generateNewSessionBySpreadSheetListener(){
		ActionListener actionListener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				entryPoint.res
				
			}
		};
		return actionListener;
	}
	
	public ActionListener generateExitListener(){
		ActionListener actionListener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		};
		return actionListener;
	}
	
	public ListSelectionListener generateListSelectionListener(JList list, int index){
		ListSelectionListener listSelectionListener = new ListSelectionListener() {	
			@Override
			public void valueChanged(ListSelectionEvent e) {
				
				
			}
		};
		return listSelectionListener;
	}

}
