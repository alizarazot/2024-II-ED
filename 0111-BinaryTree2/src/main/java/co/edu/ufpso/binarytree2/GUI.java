/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.edu.ufpso.binarytree2;

import javax.swing.JOptionPane;

/**
 *
 * @author SCIS-20
 */
public class GUI extends javax.swing.JFrame {
    
    BinaryTree2 tree;
    boolean currentIsMale;

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        
        this.radioMale.setSelected(true);
        this.currentIsMale = true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        _lblTitle = new javax.swing.JLabel();
        btnAddPerson = new javax.swing.JButton();
        btnViewTree = new javax.swing.JButton();
        _sep = new javax.swing.JSeparator();
        fieldName = new javax.swing.JTextField();
        _lblName = new javax.swing.JLabel();
        _lblSex = new javax.swing.JLabel();
        radioMale = new javax.swing.JRadioButton();
        radioFemale = new javax.swing.JRadioButton();
        _lblAge = new javax.swing.JLabel();
        spinnerAge = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        _lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        _lblTitle.setText("BinaryTree2");

        btnAddPerson.setText("Añadir persona");
        btnAddPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPersonActionPerformed(evt);
            }
        });

        btnViewTree.setText("Ver árbol");
        btnViewTree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewTreeActionPerformed(evt);
            }
        });

        fieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNameActionPerformed(evt);
            }
        });

        _lblName.setText("Nombre:");

        _lblSex.setText("Sexo:");

        radioMale.setText("Hombre");
        radioMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMaleActionPerformed(evt);
            }
        });

        radioFemale.setText("Mujer");
        radioFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFemaleActionPerformed(evt);
            }
        });

        _lblAge.setText("Edad:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAddPerson)
                .addGap(125, 125, 125))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(_lblTitle)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(_lblName)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radioMale)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioFemale))
                                    .addComponent(fieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spinnerAge, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(btnViewTree, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(_lblSex)
                            .addComponent(_lblAge)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(_sep, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(_lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_lblName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_lblSex)
                    .addComponent(radioMale)
                    .addComponent(radioFemale))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_lblAge)
                    .addComponent(spinnerAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAddPerson)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(_sep, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnViewTree)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPersonActionPerformed
        BinaryTree2 node = new BinaryTree2((int) this.spinnerAge.getValue(), this.currentIsMale, this.fieldName.getText());
        
        if (node.age >= 18) {
            this.tree.addToLeft(node);
        } else {
            this.tree.addToRight(node);
        }
        
        this.spinnerAge.setValue(0);
        this.fieldName.setText("");
    }//GEN-LAST:event_btnAddPersonActionPerformed

    private void radioMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMaleActionPerformed
        if (this.radioMale.isSelected()) {
            this.currentIsMale = true;
            this.radioFemale.setSelected(false);
        }
    }//GEN-LAST:event_radioMaleActionPerformed

    private void fieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNameActionPerformed

    private void radioFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFemaleActionPerformed
        if (this.radioFemale.isSelected()) {
            this.currentIsMale = false;
            this.radioMale.setSelected(false);
        }
    }//GEN-LAST:event_radioFemaleActionPerformed

    private void btnViewTreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewTreeActionPerformed
        JOptionPane.showMessageDialog(rootPane, this.tree.debug(""));
    }//GEN-LAST:event_btnViewTreeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GUI gui = new GUI();
                gui.tree = new BinaryTree2(0, true, "Root Node");
                gui.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel _lblAge;
    private javax.swing.JLabel _lblName;
    private javax.swing.JLabel _lblSex;
    private javax.swing.JLabel _lblTitle;
    private javax.swing.JSeparator _sep;
    private javax.swing.JButton btnAddPerson;
    private javax.swing.JButton btnViewTree;
    private javax.swing.JTextField fieldName;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JSpinner spinnerAge;
    // End of variables declaration//GEN-END:variables
}
