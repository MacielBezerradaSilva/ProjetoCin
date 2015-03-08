/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.JPanel;

/**
 *
 * @author rparaujo
 */
public class ImagePanel extends JPanel {

    private Image image;

    public ImagePanel(Image image) {
        this.image = image;
    }

    public Image getBackgroundImage() {
        return this.image;
    }

    public void setBackgroundImage(Image image) {
        this.image = image;
    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(image, 0, 0, getWidth(), getHeight(), null);        
    }
}