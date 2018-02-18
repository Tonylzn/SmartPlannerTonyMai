/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DataStructures.Course;
import DataStructures.Task;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author zeningluo
 */
public class addTaskPanel extends javax.swing.JPanel {
    // mon 1, tue 2 wed 3 thu 4 fri 5 sat 6 
  
    ArrayList<Integer> days;
    public static final int MaxDaysChosen = 6;
    // low 0; medium 1; high 2;
    private int priority;
    private int dueday;
    
    private Course course;
    /**
     * Creates new form SetTask
     */
    public addTaskPanel(Course course) {
        initComponents();
        days = new ArrayList<Integer>();
        this.course = course;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nameTextfield = new javax.swing.JTextField();
        timeTextfield = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        monRadioButton = new javax.swing.JRadioButton();
        tueRadioButton = new javax.swing.JRadioButton();
        wedRadioButton = new javax.swing.JRadioButton();
        thurRadioButton = new javax.swing.JRadioButton();
        friRadioButton = new javax.swing.JRadioButton();
        satRadioButton = new javax.swing.JRadioButton();
        lowRadioButton = new javax.swing.JRadioButton();
        medRadioButton = new javax.swing.JRadioButton();
        highRadioButton = new javax.swing.JRadioButton();
        CancleBotton = new javax.swing.JButton();
        OkBotton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        mondue = new javax.swing.JRadioButton();
        tuedue = new javax.swing.JRadioButton();
        weddue = new javax.swing.JRadioButton();
        thudue = new javax.swing.JRadioButton();
        fridue = new javax.swing.JRadioButton();

        jLabel1.setText("Task");

        jLabel2.setText("Name");

        jLabel3.setText("Time ");

        jLabel4.setText("Days to work on");

        jLabel5.setText("Priority");

        nameTextfield.setText("                              ");

        timeTextfield.setText("               ");
        timeTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeTextfieldActionPerformed(evt);
            }
        });

        jLabel6.setText("Hr");

        monRadioButton.setText("Mon");
        monRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monRadioButtonActionPerformed(evt);
            }
        });

        tueRadioButton.setText("Tue");
        tueRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tueRadioButtonActionPerformed(evt);
            }
        });

        wedRadioButton.setText("Wed");
        wedRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wedRadioButtonActionPerformed(evt);
            }
        });

        thurRadioButton.setText("Thur");
        thurRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thurRadioButtonActionPerformed(evt);
            }
        });

        friRadioButton.setText("Fri");
        friRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                friRadioButtonActionPerformed(evt);
            }
        });

        satRadioButton.setText("Sat");
        satRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                satRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(lowRadioButton);
        lowRadioButton.setText("Low");
        lowRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lowRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(medRadioButton);
        medRadioButton.setText("Medium");
        medRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(highRadioButton);
        highRadioButton.setText("High");
        highRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                highRadioButtonActionPerformed(evt);
            }
        });

        CancleBotton.setText("Cancle");
        CancleBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancleBottonActionPerformed(evt);
            }
        });

        OkBotton.setText("Ok");
        OkBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkBottonActionPerformed(evt);
            }
        });

        jLabel7.setText("Due Day");

        buttonGroup2.add(mondue);
        mondue.setText("Mon");
        mondue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mondueActionPerformed(evt);
            }
        });

        buttonGroup2.add(tuedue);
        tuedue.setText("Tue");
        tuedue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tuedueActionPerformed(evt);
            }
        });

        buttonGroup2.add(weddue);
        weddue.setText("Wed");
        weddue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weddueActionPerformed(evt);
            }
        });

        buttonGroup2.add(thudue);
        thudue.setText("Thu");
        thudue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thudueActionPerformed(evt);
            }
        });

        buttonGroup2.add(fridue);
        fridue.setText("Fri");
        fridue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fridueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(CancleBotton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(OkBotton)
                .addGap(69, 69, 69))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(timeTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addComponent(nameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(thurRadioButton)
                            .addComponent(monRadioButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tueRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(wedRadioButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(friRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(satRadioButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(medRadioButton)
                                    .addComponent(lowRadioButton)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(tuedue)
                                            .addComponent(highRadioButton))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(weddue)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(thudue))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mondue)))
                        .addGap(3, 3, 3)
                        .addComponent(fridue)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(timeTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(monRadioButton)
                            .addComponent(tueRadioButton)
                            .addComponent(wedRadioButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(thurRadioButton)
                            .addComponent(friRadioButton)
                            .addComponent(satRadioButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(lowRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(medRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(highRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(mondue)
                    .addComponent(tuedue)
                    .addComponent(weddue)
                    .addComponent(thudue)
                    .addComponent(fridue))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancleBotton)
                    .addComponent(OkBotton)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void thurRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thurRadioButtonActionPerformed
        // TODO add your handling code here:
        days.add(4);
    }//GEN-LAST:event_thurRadioButtonActionPerformed

    private void friRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_friRadioButtonActionPerformed
        // TODO add your handling code here:
        days.add(5);
    }//GEN-LAST:event_friRadioButtonActionPerformed

    private void lowRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lowRadioButtonActionPerformed
        // TODO add your handling code here:
        priority = 0;
    }//GEN-LAST:event_lowRadioButtonActionPerformed

    private void medRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medRadioButtonActionPerformed
        // TODO add your handling code here:
        priority = 1;
    }//GEN-LAST:event_medRadioButtonActionPerformed

    private void timeTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeTextfieldActionPerformed

    private void CancleBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancleBottonActionPerformed
        // TODO add your handling code here:
        ((JDialog) this.getTopLevelAncestor()).dispose();
    }//GEN-LAST:event_CancleBottonActionPerformed

    private void OkBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkBottonActionPerformed
        // TODO add your handling code here:\
        try{
            String name = nameTextfield.getText();
            double number = Double.parseDouble(timeTextfield.getText());
            double time = number;
            ArrayList<Integer> workingdays = days;
            course.addTask(new Task(name,workingdays,priority,time,dueday));
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Error trying to add task: " + ex,
                    "Input Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        ((JDialog) this.getTopLevelAncestor()).dispose();
    }//GEN-LAST:event_OkBottonActionPerformed

    private void wedRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wedRadioButtonActionPerformed
        // TODO add your handling code here:
        days.add(3);
        
    }//GEN-LAST:event_wedRadioButtonActionPerformed

    private void monRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monRadioButtonActionPerformed
        // TODO add your handling code here:
        days.add(1);
    }//GEN-LAST:event_monRadioButtonActionPerformed

    private void tueRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tueRadioButtonActionPerformed
        // TODO add your handling code here:
        days.add(2);
    }//GEN-LAST:event_tueRadioButtonActionPerformed

    private void satRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_satRadioButtonActionPerformed
        // TODO add your handling code here:
        days.add(6);
    }//GEN-LAST:event_satRadioButtonActionPerformed

    private void highRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_highRadioButtonActionPerformed
        // TODO add your handling code here:
        priority = 2;
    }//GEN-LAST:event_highRadioButtonActionPerformed

    private void tuedueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tuedueActionPerformed
        // TODO add your handling code here:
        dueday = 2;
    }//GEN-LAST:event_tuedueActionPerformed

    private void mondueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mondueActionPerformed
        // TODO add your handling code here:
        dueday = 1;
    }//GEN-LAST:event_mondueActionPerformed

    private void weddueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weddueActionPerformed
        // TODO add your handling code here:
        dueday = 3;
    }//GEN-LAST:event_weddueActionPerformed

    private void thudueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thudueActionPerformed
        // TODO add your handling code here:
        dueday = 4;
    }//GEN-LAST:event_thudueActionPerformed

    private void fridueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fridueActionPerformed
        // TODO add your handling code here:
        dueday = 5;
    }//GEN-LAST:event_fridueActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancleBotton;
    private javax.swing.JButton OkBotton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton friRadioButton;
    private javax.swing.JRadioButton fridue;
    private javax.swing.JRadioButton highRadioButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton lowRadioButton;
    private javax.swing.JRadioButton medRadioButton;
    private javax.swing.JRadioButton monRadioButton;
    private javax.swing.JRadioButton mondue;
    private javax.swing.JTextField nameTextfield;
    private javax.swing.JRadioButton satRadioButton;
    private javax.swing.JRadioButton thudue;
    private javax.swing.JRadioButton thurRadioButton;
    private javax.swing.JTextField timeTextfield;
    private javax.swing.JRadioButton tueRadioButton;
    private javax.swing.JRadioButton tuedue;
    private javax.swing.JRadioButton wedRadioButton;
    private javax.swing.JRadioButton weddue;
    // End of variables declaration//GEN-END:variables
}
