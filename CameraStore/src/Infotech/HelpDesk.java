/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Infotech;

/**
 *
 * @author Prajun
 */
public class HelpDesk extends javax.swing.JFrame {

    /**
     * Creates new form HelpDesk
     */
    public HelpDesk() { // help frame-> contains help manual
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

        manualPane = new javax.swing.JPanel();
        helpTitle = new javax.swing.JLabel();
        manualSep = new javax.swing.JSeparator();
        fourthPoint = new javax.swing.JLabel();
        firstPoint = new javax.swing.JLabel();
        secondPoint = new javax.swing.JLabel();
        thirdSub = new javax.swing.JLabel();
        thirdPoint = new javax.swing.JLabel();
        eigthPoint = new javax.swing.JLabel();
        fifthPoint = new javax.swing.JLabel();
        sixthPoint = new javax.swing.JLabel();
        seventPoint = new javax.swing.JLabel();
        ninthPoint = new javax.swing.JLabel();

        setTitle("Help Desk");
        setAlwaysOnTop(true);
        setName("helpFrame"); // NOI18N
        setResizable(false);

        manualPane.setBackground(new java.awt.Color(255, 255, 255));

        helpTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        helpTitle.setText("Help Manual");

        fourthPoint.setText("4. There is an extra button which is 'clear', it clears the data inserted in the text fields.");

        firstPoint.setText(" 1. In the text field of Product ID, valid product ID of the producut is to be entered.");

        secondPoint.setText("2. Only three brand are sold over here, where radio button for the differnt brand can entered to the table.");

        thirdSub.setText("the 'add data' button adds the entered data into the table.");

        thirdPoint.setText("3. The model, specification and price can be entered in the text fields as required and then");

        eigthPoint.setText("8. File menu can be used to import, export or close the program.");

        fifthPoint.setText("5. The users can search the brand detail through a combo box (dropdown menu).");

        sixthPoint.setText("6. The users can also search for the product through entering price to the price range field.");

        seventPoint.setText("7. On the top left corner, file menu and help menu are present.");

        ninthPoint.setText("9. Help menu can be used for the mannual help.");

        javax.swing.GroupLayout manualPaneLayout = new javax.swing.GroupLayout(manualPane);
        manualPane.setLayout(manualPaneLayout);
        manualPaneLayout.setHorizontalGroup(
            manualPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manualPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(manualPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eigthPoint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fifthPoint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sixthPoint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(seventPoint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ninthPoint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(manualPaneLayout.createSequentialGroup()
                        .addComponent(secondPoint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(manualSep)
                    .addComponent(firstPoint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fourthPoint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(thirdPoint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(manualPaneLayout.createSequentialGroup()
                        .addGroup(manualPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(manualPaneLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(thirdSub, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(helpTitle))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        manualPaneLayout.setVerticalGroup(
            manualPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manualPaneLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(helpTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manualSep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(firstPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(secondPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thirdPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(thirdSub, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fourthPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fifthPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(sixthPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seventPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eigthPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ninthPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(manualPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(manualPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(HelpDesk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HelpDesk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HelpDesk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HelpDesk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HelpDesk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel eigthPoint;
    private javax.swing.JLabel fifthPoint;
    private javax.swing.JLabel firstPoint;
    private javax.swing.JLabel fourthPoint;
    private javax.swing.JLabel helpTitle;
    private javax.swing.JPanel manualPane;
    private javax.swing.JSeparator manualSep;
    private javax.swing.JLabel ninthPoint;
    private javax.swing.JLabel secondPoint;
    private javax.swing.JLabel seventPoint;
    private javax.swing.JLabel sixthPoint;
    private javax.swing.JLabel thirdPoint;
    private javax.swing.JLabel thirdSub;
    // End of variables declaration//GEN-END:variables
}
