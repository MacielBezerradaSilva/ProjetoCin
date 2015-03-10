package gui;

import controller.CharterControllerImpl;
import controller.ICharterController;
import execution.Util;

import java.io.IOException;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import management.RequestManager;
import model.Charter;

/**
 *
 * @author Flavio Santos
 */
public class NewCharterPanelForm extends javax.swing.JPanel {

    /**
     * Creates new form NewCharterPanelForm
     */
    public NewCharterPanelForm() {
        initComponents();
        rm = new RequestManager(new JFrame());
        charter = new Charter();
        controller = new CharterControllerImpl();
        manuallyIntComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newCharter = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        nameLabel = new javax.swing.JLabel();
        reqLabel = new javax.swing.JLabel();
        minLabel = new javax.swing.JLabel();
        maxLabel = new javax.swing.JLabel();
        chaObjLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        requirements = new javax.swing.JTextArea();
        name = new javax.swing.JTextField();
        minTime = new javax.swing.JTextField();
        maxTime = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        objective = new javax.swing.JTextArea();
        setupLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        setup = new javax.swing.JTextArea();
        notesLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        notes = new javax.swing.JTextArea();
        keyAreasLabel = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        keyAreas = new javax.swing.JTextArea();
        issAwareLabel = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        issuesToBeAware = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        importantNotes = new javax.swing.JTextArea();
        impNotesLabel = new javax.swing.JLabel();
        save = new javax.swing.JButton();

        newCharter.setText("New Charter");

        nameLabel.setText("Name");

        reqLabel.setText("Requirements");

        minLabel.setText("Minimum duration");

        maxLabel.setText("Maximum duration");

        chaObjLabel.setText("Charter objective");

        requirements.setColumns(20);
        requirements.setRows(5);
        jScrollPane1.setViewportView(requirements);

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        minTime.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                minTimeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                minTimeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                minTimeKeyTyped(evt);
            }
        });

        maxTime.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                maxTimeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                maxTimeKeyTyped(evt);
            }
        });

        objective.setColumns(20);
        objective.setRows(5);
        jScrollPane2.setViewportView(objective);

        setupLabel.setText("Setup");

        setup.setColumns(20);
        setup.setRows(5);
        jScrollPane3.setViewportView(setup);

        notesLabel.setText("Notes");

        notes.setColumns(20);
        notes.setRows(5);
        jScrollPane4.setViewportView(notes);

        keyAreasLabel.setText("Key areas of concentration");

        keyAreas.setColumns(20);
        keyAreas.setRows(5);
        jScrollPane5.setViewportView(keyAreas);

        issAwareLabel.setText("Issues to be aware of");

        issuesToBeAware.setColumns(20);
        issuesToBeAware.setRows(5);
        jScrollPane6.setViewportView(issuesToBeAware);

        importantNotes.setColumns(20);
        importantNotes.setRows(5);
        jScrollPane7.setViewportView(importantNotes);

        impNotesLabel.setText("Important execution notes");

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(minLabel)
                                    .addComponent(maxLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(minTime, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                                    .addComponent(maxTime)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(nameLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(reqLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(chaObjLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane4)
                            .addComponent(jScrollPane5)
                            .addComponent(setupLabel)
                            .addComponent(notesLabel)
                            .addComponent(keyAreasLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(issAwareLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(impNotesLabel)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(newCharter)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(598, 598, 598)
                        .addComponent(save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newCharter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setupLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(reqLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(notesLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minLabel)
                    .addComponent(minTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(keyAreasLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(maxTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maxLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chaObjLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(issAwareLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(impNotesLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(save)
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        charter.setName(name.getText());
        charter.setRequirements(requirements.getText());
        try{
            charter.setMinTime(Integer.parseInt(minTime.getText()));
        }catch(NumberFormatException e){
            charter.setMinTime(0);
        }
        try{
            charter.setMaxTime(Integer.parseInt(maxTime.getText()));
        }catch(NumberFormatException e){
            charter.setMaxTime(0);
        }

        charter.setObjective(objective.getText());
        charter.setSetup(setup.getText());
        charter.setImportantNotes(importantNotes.getText());
        charter.setIssuesToBeAware(issuesToBeAware.getText());
        charter.setKeyAreas(keyAreas.getText());
        charter.setNotes(notes.getText());
        try {
            controller.createCharter(charter);
            JOptionPane.showMessageDialog(null, rm.loadProperty(Util.getLanguage() + "_Charter_saved"));
        } catch (SQLException ex) {
            ex.printStackTrace();
            String msg = rm.loadProperty(Util.getLanguage() + "_Error_save_charter");
            String title = rm.loadProperty(Util.getLanguage() + "_Error_save_charter_title");
            JOptionPane.showMessageDialog(null, msg, title, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_saveActionPerformed

    private void minTimeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_minTimeKeyPressed
    }//GEN-LAST:event_minTimeKeyPressed

    private void minTimeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_minTimeKeyTyped
        Util.removeInvalidChars(minTime);
    }//GEN-LAST:event_minTimeKeyTyped

    private void minTimeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_minTimeKeyReleased
        Util.removeInvalidChars(minTime);
    }//GEN-LAST:event_minTimeKeyReleased

    private void maxTimeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_maxTimeKeyTyped
        Util.removeInvalidChars(maxTime);
    }//GEN-LAST:event_maxTimeKeyTyped

    private void maxTimeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_maxTimeKeyReleased
        Util.removeInvalidChars(maxTime);
    }//GEN-LAST:event_maxTimeKeyReleased
    private Charter charter;
    private ICharterController controller;
    private RequestManager rm;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel chaObjLabel;
    private javax.swing.JLabel impNotesLabel;
    private javax.swing.JTextArea importantNotes;
    private javax.swing.JLabel issAwareLabel;
    private javax.swing.JTextArea issuesToBeAware;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea keyAreas;
    private javax.swing.JLabel keyAreasLabel;
    private javax.swing.JLabel maxLabel;
    private javax.swing.JTextField maxTime;
    private javax.swing.JLabel minLabel;
    private javax.swing.JTextField minTime;
    private javax.swing.JTextField name;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel newCharter;
    private javax.swing.JTextArea notes;
    private javax.swing.JLabel notesLabel;
    private javax.swing.JTextArea objective;
    private javax.swing.JLabel reqLabel;
    private javax.swing.JTextArea requirements;
    private javax.swing.JButton save;
    private javax.swing.JTextArea setup;
    private javax.swing.JLabel setupLabel;
    // End of variables declaration//GEN-END:variables

    private void manuallyIntComponents() {
        save.setText(rm.loadProperty(Util.getLanguage() + "_Save_charter"));
        nameLabel.setText(rm.loadProperty(Util.getLanguage() + "_Charter_name"));
        reqLabel.setText(rm.loadProperty(Util.getLanguage() + "_Charter_requirements"));
        minLabel.setText(rm.loadProperty(Util.getLanguage() + "_Charter_min_time"));
        maxLabel.setText(rm.loadProperty(Util.getLanguage() + "_Charter_max_time"));
        chaObjLabel.setText(rm.loadProperty(Util.getLanguage() + "_Charter_objective"));
        setupLabel.setText(rm.loadProperty(Util.getLanguage() + "_Charter_setup"));
        notesLabel.setText(rm.loadProperty(Util.getLanguage() + "_Charter_notes"));
        keyAreasLabel.setText(rm.loadProperty(Util.getLanguage() + "_Charter_key_areas"));
        issAwareLabel.setText(rm.loadProperty(Util.getLanguage() + "_Charter_issues_to_be_aware"));
        impNotesLabel.setText(rm.loadProperty(Util.getLanguage() + "_Charter_important_notes"));
    }

    public static void main(String[] args) {
        NewCharterPanelForm panel = new NewCharterPanelForm();
        JFrame f = new JFrame();
        f.getContentPane().add(panel);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);
    }
}
