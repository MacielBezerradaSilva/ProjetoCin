/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package execution;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

import ConexaoBD.Conexao;

/**
 *
 * @author Flavio Santos
 */
public class Main {

    public static void main(String[] args) {

    	Conexao con = new Conexao();
    	con.conectar();
//        try {
//            
//            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//            
//        } catch (Exception e) {
//            try {
//                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//            } catch (ClassNotFoundException ex) {
//                Logger.getLogger(EntryPoint.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (InstantiationException ex) {
//                Logger.getLogger(EntryPoint.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (IllegalAccessException ex) {
//                Logger.getLogger(EntryPoint.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (UnsupportedLookAndFeelException ex) {
//                Logger.getLogger(EntryPoint.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//        
//        EntryPoint ep = new EntryPoint();
//        ep.initialize();
        
    }
    
    public void openBrowser(String hyperlink) {
        
        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            try {
                Desktop desktop = Desktop.getDesktop();
                URI url = new URI(hyperlink);
                desktop.browse(url);
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}