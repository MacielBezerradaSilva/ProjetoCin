/**
 * 
 */
package Thread;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * @author Maciel B
 *
 */
public class ObjectCleanerThread extends Thread{
	
	private List<Object> objectList;
	
	public ObjectCleanerThread(){
		objectList = new ArrayList<Object>();
	}
	
	public void addObject(Object o){
		this.objectList.add(o);
	}
	
	@Override
	public void run(){
		cycle();
	}
	public void cycle(){
		while(true){
			try{
				Thread.sleep(5000);	
			}catch(InterruptedException ex){
				Logger.getLogger(ObjectCleanerThread.class.getName()).log(Level.SEVERE,null, ex);
			}
		}
	}

}
