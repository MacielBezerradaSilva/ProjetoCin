/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package execution;

import javax.swing.JTextField;

import factory.XMLFileManagerFactory;

/**
 *
 * @author heitor
 */
public class Util {

    private Util() {
    }

    public static void removeInvalidChars(JTextField tf) {
        boolean stop = false;
        String str = tf.getText();
        do {
            try {
                Integer.parseInt(str);
                stop = true;
            } catch (NumberFormatException ex) {
                if (str.length() == 0) {
                    str = "";
                    stop = true;
                } else {
                    str = str.substring(0, str.length() - 1);
                }
            }
        } while (!stop);
        tf.setText(str);
    }
    
    public static String getLanguage() {
    	String language;
		XMLFileManagerFactory xMLFileManagerFactory = XMLFileManagerFactory.getInstance();
		language = xMLFileManagerFactory.readLanguage();
    	
        return language;
    }

}
