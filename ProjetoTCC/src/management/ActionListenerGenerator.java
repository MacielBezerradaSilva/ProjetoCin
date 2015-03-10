/**
 * 
 */
package management;

import gui.EntryPoint;
import gui.ListCharters;
import gui.NewCharterPanelForm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

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
			public void actionPerformed(ActionEvent e) {
				
			}
		};
		return actionListener;
	}
	
	public ActionListener generateExitListener(){
		ActionListener actionListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		};
		return actionListener;
	}
	
	public ListSelectionListener generateListSelectionListener(JList list, int index){
		ListSelectionListener listSelectionListener = new ListSelectionListener() {	
			public void valueChanged(ListSelectionEvent e) {
				
			}
		};
		return listSelectionListener;
	}

    public ActionListener generateNewCharterListener(final EntryPoint frame) {
        return new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.switchToPanel(new NewCharterPanelForm());
            }
        };
    }
    
    public ActionListener generateListCharterListener(final EntryPoint frame) {
        return new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.switchToPanel(new ListCharters());
            }
        };
    }    

}
