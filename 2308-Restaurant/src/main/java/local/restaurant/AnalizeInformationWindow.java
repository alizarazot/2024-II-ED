/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package local.restaurant;

/**
 *
 * @author SCIS2-24
 */
public class AnalizeInformationWindow extends javax.swing.JFrame {

    Menu menu;

    /**
     * Creates new form AnalizeInformationWindow
     */
    public AnalizeInformationWindow(Menu menu) {
        initComponents();
        this.menu = menu;
        comboBoxPlate.setModel(new javax.swing.DefaultComboBoxModel<>(menu.plates));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        comboBoxPlate = new javax.swing.JComboBox<>();
        btnCalculateStats = new javax.swing.JButton();
        lblStats = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Analizar información");

        comboBoxPlate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{}));

        btnCalculateStats.setText("Calcular estadísticas");
        btnCalculateStats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateStatsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStats)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(comboBoxPlate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(btnCalculateStats)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxPlate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalculateStats))
                .addGap(18, 18, 18)
                .addComponent(lblStats)
                .addContainerGap(219, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalculateStatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateStatsActionPerformed
        int plateID = comboBoxPlate.getSelectedIndex();
        String plateName = menu.plates[plateID];

        String text = String.format("""
                                    Cantidad ventas en la semana para %s: %d
                                    Día de la semana con más ventas para %s: %s
                                    Día de la semana con menos ventas para %s: %s
                                    
                                    Día de la semana con más ventas: %s
                                    Día de la semana con menos ventas: %s
                                    Promedio de ventas por día: %.2f
                                    Promedio de ventas en la semana: %.2f
                                    Total de ventas en la semana: %d""",
                plateName, menu.getTotalSalesPlateWeek(plateID),
                plateName, Menu.DAYS[menu.getDayMoreSalesPlate(plateID)],
                plateName, Menu.DAYS[menu.getDayLessSalesPlate(plateID)],
                Menu.DAYS[menu.getDayMostSales()],
                Menu.DAYS[menu.getDayLessSales()],
                menu.getAverageSalesDay(),
                menu.getAverageSalesPlate(),
                menu.getTotalSales()
        );

        // Keep newlines.
        lblStats.setText("<html>" + text.replaceAll("\n", "<br/>") + "</html>");
    }//GEN-LAST:event_btnCalculateStatsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(Menu menu) {
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
            java.util.logging.Logger.getLogger(AnalizeInformationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnalizeInformationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnalizeInformationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnalizeInformationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnalizeInformationWindow(menu).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculateStats;
    private javax.swing.JComboBox<String> comboBoxPlate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblStats;
    // End of variables declaration//GEN-END:variables
}
