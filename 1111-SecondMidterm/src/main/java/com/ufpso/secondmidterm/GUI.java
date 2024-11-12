/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ufpso.secondmidterm;

import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anderson
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
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
        _lblSubtitle = new javax.swing.JLabel();
        btnLoadData = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableClients = new javax.swing.JTable();
        btnAddTurn = new javax.swing.JButton();
        btnNextTurn = new javax.swing.JButton();
        btnQueryDistance = new javax.swing.JButton();
        btnDebugQueues = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        _lblTitle.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        _lblTitle.setText("Segundo Parcial");

        _lblSubtitle.setText("Atendiendo clientes");

        btnLoadData.setText("Cargar datos");
        btnLoadData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadDataActionPerformed(evt);
            }
        });

        tableClients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableClients);

        btnAddTurn.setText("Añadir turno");
        btnAddTurn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTurnActionPerformed(evt);
            }
        });

        btnNextTurn.setText("Procesar turno");
        btnNextTurn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextTurnActionPerformed(evt);
            }
        });

        btnQueryDistance.setText("Consultar turnos faltantes");
        btnQueryDistance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQueryDistanceActionPerformed(evt);
            }
        });

        btnDebugQueues.setText("Depurar colas");
        btnDebugQueues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDebugQueuesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAddTurn)
                        .addGap(26, 26, 26)
                        .addComponent(btnNextTurn)
                        .addGap(28, 28, 28)
                        .addComponent(btnQueryDistance)
                        .addGap(27, 27, 27)
                        .addComponent(btnDebugQueues))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(_lblTitle)))
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(_lblSubtitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLoadData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(250, 250, 250))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(_lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_lblSubtitle)
                .addGap(30, 30, 30)
                .addComponent(btnLoadData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddTurn)
                    .addComponent(btnNextTurn)
                    .addComponent(btnQueryDistance)
                    .addComponent(btnDebugQueues))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    ArrayList<Client> clients;

    private void btnLoadDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadDataActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int res = fileChooser.showOpenDialog(this);

        if (res != JFileChooser.APPROVE_OPTION) {
            JOptionPane.showMessageDialog(rootPane, "El usuario canceló la operación.");
            return;
        }

        try {
            clients = Client.loadClientsFromCSV(
                    new String(
                            Files.readString(
                                    fileChooser.getSelectedFile().toPath()))
            );
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, "Error fatal: " + ex.getLocalizedMessage());
            return;
        }

        this.populateTable();
        this.btnLoadData.setEnabled(false);
    }//GEN-LAST:event_btnLoadDataActionPerformed

    Queue priorityQueue = new Queue();
    Queue noPriorityQueue = new Queue();

    private void btnAddTurnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTurnActionPerformed
        String document = JOptionPane.showInputDialog("Número de documento:");

        Client client = this.matchClientByDocument(document);

        if (client == null) {
            noPriorityQueue.add(this.matchUnknownClientByDocument(document));
            return;
        }

        priorityQueue.add(client);
    }//GEN-LAST:event_btnAddTurnActionPerformed

    private Client matchClientByDocument(String document) {
        Client client = null;
        for (Client c : this.clients) {
            if (document.equals(c.document)) {
                client = c;
                break;
            }
        }

        return client;
    }
    private Client matchUnknownClientByDocument(String document) {
        return new Client(document, Client.Type.NATURAL, "Nuevo-" + document, "", "", 0);
    }

    private void btnDebugQueuesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDebugQueuesActionPerformed
        String text = "";

        text += "=== Cola Prioritaria ===\n\n";
        for (Client client : this.priorityQueue.entries()) {
            text += String.format("  - %s (%s)[%s] - %s: %s - $%d\n",
                    client.name,
                    client.email,
                    client.phone,
                    client.type,
                    client.document,
                    client.balance);
        }

        text += "\n=== Cola No Prioritaria ===\n\n";
        for (Client client : this.noPriorityQueue.entries()) {
            text += String.format("  - Documento: %s\n", client.document);
        }

        JOptionPane.showMessageDialog(rootPane, text);
    }//GEN-LAST:event_btnDebugQueuesActionPerformed

    private void btnNextTurnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextTurnActionPerformed
        String text = "";

        Client current = this.priorityQueue.remove();
        if (current == null) {
            text += "No hay turnos prioritarios.\n";
        } else {
            text += String.format("Turno prioritario actual: %s (%s)\n", current.name, current.document);

            Client next = this.priorityQueue.peek();
            if (next != null) {
                text += String.format("Siguiente turno prioritario: %s (%s)\n", next.name, next.document);
            }
        }

        text += "---\n\n";

        current = this.noPriorityQueue.remove();
        if (current == null) {
            text += "No hay turnos no prioritarios.\n";
        } else {
            text += String.format("Turno no prioritario actual: %s\n", current.document);

            Client next = this.noPriorityQueue.peek();
            if (next != null) {
                text += String.format("Siguiente turno no prioritario: %s\n", next.document);
            }
        }

        JOptionPane.showMessageDialog(rootPane, text);
    }//GEN-LAST:event_btnNextTurnActionPerformed

    private void btnQueryDistanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQueryDistanceActionPerformed
        String document = JOptionPane.showInputDialog(rootPane, "Número de documento:");
        
        Client client = this.matchClientByDocument(document);
        if (client != null) {
            int distance = this.priorityQueue.distanceOf(client);
            if (distance >= 0) {
                JOptionPane.showMessageDialog(rootPane, String.format(
                        "El cliente prioritario %s (%s) le faltan %d turnos para pasar.", client.name, client.document, distance));
                return;
            }

            JOptionPane.showMessageDialog(rootPane, String.format(
                    "El cliente %s (%s) no está en alguna cola.", client.name, client.document));
            return;
        }
        
        client = this.matchUnknownClientByDocument(document);
        int distance = this.noPriorityQueue.distanceOf(client);
        if (distance >= 0) {
                JOptionPane.showMessageDialog(rootPane, String.format(
                        "El cliente no prioritario %s le faltan %d turnos para pasar.",client.document, distance));
                return;
            }

            JOptionPane.showMessageDialog(rootPane, String.format(
                    "El cliente %s no está en alguna cola.", client.document));
    }//GEN-LAST:event_btnQueryDistanceActionPerformed

    private void populateTable() {
        Object[] header = new Object[]{"Documento", "Tipo", "Nombre", "Email", "Teléfono", "Saldo"};
        DefaultTableModel model = new DefaultTableModel(header, 0);

        for (int i = 0; i < this.clients.size(); i++) {
            Object[] row = new String[]{
                this.clients.get(i).document,
                this.clients.get(i).type.toString(),
                this.clients.get(i).name,
                this.clients.get(i).email,
                this.clients.get(i).phone,
                Integer.toString(this.clients.get(i).balance)};

            model.addRow(row);
        }

        this.tableClients.setModel(model);
    }

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
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel _lblSubtitle;
    private javax.swing.JLabel _lblTitle;
    private javax.swing.JButton btnAddTurn;
    private javax.swing.JButton btnDebugQueues;
    private javax.swing.JButton btnLoadData;
    private javax.swing.JButton btnNextTurn;
    private javax.swing.JButton btnQueryDistance;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tableClients;
    // End of variables declaration//GEN-END:variables
}
