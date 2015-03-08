/**
 * 
 */
package management;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;

/**
 * @author Maciel B
 *
 */
//classe responsável pela leitura do arquivo language properties 
public class RequestManager {
	
	private JFrame frame;
	//objeto do tipo properties para aquivo config
	private Properties properties = new Properties();
	//String responsável por apontar para o language.properties
	private String propertiesPath = "../configuration/language.properties";
	
	public RequestManager(JFrame frame){
		this.frame = frame;
	}
	
	public String loadProperty(String property){
		String result = "";
		
		try {
			//realizando a leitura do arquivo properties linguage
			properties.load(this.getClass().getResourceAsStream(propertiesPath));
			result = properties.getProperty(property);
		} catch (Exception ex) {
			Logger.getLogger(RequestManager.class.getName()).log(Level.SEVERE,null,ex);
		}
		return result;
	}

}
