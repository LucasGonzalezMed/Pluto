/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pluto;

import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class Panelmenu extends javax.swing.JFrame {

    /**
     * Creates new form Panelmenu
     */
    public Panelmenu() {
        initComponents();
    }
        public JPanel getFondo() {
          return bg;
        }

       private void Cambiarcontent (JPanel p){
       p.setSize(1276, 645);
       p.setLocation(0, 0);
       bg.removeAll();
       bg.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
       bg.revalidate();
       bg.repaint();
       }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        txtcrearalerta = new javax.swing.JLabel();
        txtseccionlearn = new javax.swing.JLabel();
        txtagregarjuego = new javax.swing.JLabel();
        agregarjuegobtm = new javax.swing.JButton();
        alertapng = new javax.swing.JLabel();
        persentadapng = new javax.swing.JLabel();
        alarmasbtm = new javax.swing.JButton();
        estudiayaprende = new javax.swing.JLabel();
        alertapersonalizada = new javax.swing.JLabel();
        bienvenidotxt = new javax.swing.JLabel();
        LbUsuario = new javax.swing.JLabel();
        seccionlearnbtm = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(0, 0, 0));

        txtcrearalerta.setForeground(new java.awt.Color(204, 204, 204));
        txtcrearalerta.setText("Crea tus propias alertas para no olvidar de realizar tus daily tasks");

        txtseccionlearn.setForeground(new java.awt.Color(204, 204, 204));
        txtseccionlearn.setText("Te enseñamos a invertir");

        txtagregarjuego.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        txtagregarjuego.setForeground(new java.awt.Color(204, 204, 204));
        txtagregarjuego.setText("Administra todas tus inversiones en Juegos NFTs");

        agregarjuegobtm.setBackground(new java.awt.Color(247, 147, 50));
        agregarjuegobtm.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        agregarjuegobtm.setForeground(new java.awt.Color(0, 0, 0));
        agregarjuegobtm.setText("Agregar Juego");
        agregarjuegobtm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarjuegobtmActionPerformed(evt);
            }
        });

        alertapng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pluto/images/campana notificacion chiquita.png"))); // NOI18N

        persentadapng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pluto/images/chabonsentadochiquito2.png"))); // NOI18N

        alarmasbtm.setBackground(new java.awt.Color(247, 147, 50));
        alarmasbtm.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        alarmasbtm.setForeground(new java.awt.Color(0, 0, 0));
        alarmasbtm.setText("Crear Alerta");
        alarmasbtm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alarmasbtmActionPerformed(evt);
            }
        });

        estudiayaprende.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        estudiayaprende.setForeground(new java.awt.Color(204, 204, 204));
        estudiayaprende.setText("ESTUDIA Y APRENDE");

        alertapersonalizada.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        alertapersonalizada.setForeground(new java.awt.Color(204, 204, 204));
        alertapersonalizada.setText("ALETAS PERSONALIZADAS");

        bienvenidotxt.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        bienvenidotxt.setForeground(new java.awt.Color(247, 147, 50));
        bienvenidotxt.setText("¡BIENVENID@!");

        LbUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LbUsuario.setForeground(new java.awt.Color(204, 204, 204));
        LbUsuario.setText("-");

        seccionlearnbtm.setBackground(new java.awt.Color(247, 147, 50));
        seccionlearnbtm.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        seccionlearnbtm.setForeground(new java.awt.Color(0, 0, 0));
        seccionlearnbtm.setText("Seccion Learn");
        seccionlearnbtm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seccionlearnbtmActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(37, 36, 36));
        jSeparator2.setForeground(new java.awt.Color(37, 36, 36));

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(estudiayaprende)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 385, Short.MAX_VALUE)
                .addComponent(alertapersonalizada)
                .addGap(186, 186, 186))
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2)
                .addContainerGap())
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtseccionlearn)
                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(seccionlearnbtm)
                        .addComponent(persentadapng)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(alertapng)
                            .addComponent(alarmasbtm))
                        .addGap(264, 264, 264))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addComponent(txtcrearalerta)
                        .addGap(141, 141, 141))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addComponent(txtagregarjuego)
                        .addGap(425, 425, 425))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addComponent(bienvenidotxt)
                        .addGap(559, 559, 559))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addComponent(LbUsuario)
                        .addGap(629, 629, 629))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addComponent(agregarjuegobtm, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(555, 555, 555))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(bienvenidotxt)
                .addGap(18, 18, 18)
                .addComponent(LbUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtagregarjuego)
                .addGap(18, 18, 18)
                .addComponent(agregarjuegobtm, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estudiayaprende)
                    .addComponent(alertapersonalizada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtseccionlearn)
                    .addComponent(txtcrearalerta))
                .addGap(9, 9, 9)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(alertapng)
                    .addComponent(persentadapng))
                .addGap(43, 43, 43)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alarmasbtm)
                    .addComponent(seccionlearnbtm))
                .addContainerGap(152, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1276, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 657, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarjuegobtmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarjuegobtmActionPerformed
        Agregarjuego b = new Agregarjuego();
        Cambiarcontent(b.getFondo());
    }//GEN-LAST:event_agregarjuegobtmActionPerformed

    private void seccionlearnbtmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seccionlearnbtmActionPerformed
        seccionlearn l = new seccionlearn();
        Cambiarcontent(l.getFondo());
    }//GEN-LAST:event_seccionlearnbtmActionPerformed

    private void alarmasbtmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alarmasbtmActionPerformed
        Alertajf alerta1 = new Alertajf();
        Cambiarcontent(alerta1.getFondo());
    }//GEN-LAST:event_alarmasbtmActionPerformed

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
            java.util.logging.Logger.getLogger(Panelmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panelmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panelmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panelmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panelmenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel LbUsuario;
    private javax.swing.JButton agregarjuegobtm;
    private javax.swing.JButton alarmasbtm;
    private javax.swing.JLabel alertapersonalizada;
    private javax.swing.JLabel alertapng;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel bienvenidotxt;
    private javax.swing.JLabel estudiayaprende;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel persentadapng;
    private javax.swing.JButton seccionlearnbtm;
    private javax.swing.JLabel txtagregarjuego;
    private javax.swing.JLabel txtcrearalerta;
    private javax.swing.JLabel txtseccionlearn;
    // End of variables declaration//GEN-END:variables
}
