/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author ETECIA
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        Quina = new javax.swing.JButton();
        DuplaSena = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        MegaSenna2 = new javax.swing.JButton();
        MegaSenna3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        MegaSenna4 = new javax.swing.JButton();
        MegaSenna5 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        MegaSenna6 = new javax.swing.JButton();
        MegaSenna7 = new javax.swing.JButton();
        TimeMania = new javax.swing.JButton();
        MegaSena = new javax.swing.JButton();
        Lotomania = new javax.swing.JButton();
        Lotofacil = new javax.swing.JButton();
        Sobre = new javax.swing.JButton();
        ResultadoJogo = new javax.swing.JButton();
        Fonte = new javax.swing.JButton();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        jMenuBar1 = new javax.swing.JMenuBar();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jMenuItem2.setText("jMenuItem2");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(230, 238, 238));
        jPanel1.setLayout(null);

        Quina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Quina-Red.png"))); // NOI18N
        Quina.setText("Quina");
        Quina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuinaActionPerformed(evt);
            }
        });
        jPanel1.add(Quina);
        Quina.setBounds(40, 250, 110, 30);

        DuplaSena.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Dupla-Logo-Red.png"))); // NOI18N
        DuplaSena.setText("Dupla-Sena");
        DuplaSena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DuplaSenaActionPerformed(evt);
            }
        });
        jPanel1.add(DuplaSena);
        DuplaSena.setBounds(190, 150, 110, 30);

        jPanel2.setLayout(null);

        MegaSenna2.setText("Lotomania");
        MegaSenna2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MegaSenna2ActionPerformed(evt);
            }
        });
        jPanel2.add(MegaSenna2);
        MegaSenna2.setBounds(50, 150, 110, 40);

        MegaSenna3.setText("Mega-Senna");
        MegaSenna3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MegaSenna3ActionPerformed(evt);
            }
        });
        jPanel2.add(MegaSenna3);
        MegaSenna3.setBounds(50, 90, 110, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 0, 0);

        jPanel3.setLayout(null);

        MegaSenna4.setText("Lotomania");
        MegaSenna4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MegaSenna4ActionPerformed(evt);
            }
        });
        jPanel3.add(MegaSenna4);
        MegaSenna4.setBounds(50, 150, 110, 40);

        MegaSenna5.setText("Mega-Senna");
        MegaSenna5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MegaSenna5ActionPerformed(evt);
            }
        });
        jPanel3.add(MegaSenna5);
        MegaSenna5.setBounds(50, 90, 110, 40);

        jPanel4.setLayout(null);

        MegaSenna6.setText("Lotomania");
        MegaSenna6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MegaSenna6ActionPerformed(evt);
            }
        });
        jPanel4.add(MegaSenna6);
        MegaSenna6.setBounds(50, 150, 110, 40);

        MegaSenna7.setText("Mega-Senna");
        MegaSenna7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MegaSenna7ActionPerformed(evt);
            }
        });
        jPanel4.add(MegaSenna7);
        MegaSenna7.setBounds(50, 90, 110, 40);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(0, 0, 0, 0);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 0, 0);

        TimeMania.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/TimeMania-Red.png"))); // NOI18N
        TimeMania.setText("TimeMania");
        TimeMania.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimeManiaActionPerformed(evt);
            }
        });
        jPanel1.add(TimeMania);
        TimeMania.setBounds(190, 250, 110, 30);

        MegaSena.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/MegaSena-Red.png"))); // NOI18N
        MegaSena.setText("Mega-Sena");
        MegaSena.setBorderPainted(false);
        MegaSena.setContentAreaFilled(false);
        MegaSena.setFocusPainted(false);
        MegaSena.setFocusable(false);
        MegaSena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MegaSenaActionPerformed(evt);
            }
        });
        jPanel1.add(MegaSena);
        MegaSena.setBounds(40, 150, 110, 30);

        Lotomania.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Lotomania-Red.png"))); // NOI18N
        Lotomania.setText("Lotomania");
        Lotomania.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LotomaniaActionPerformed(evt);
            }
        });
        jPanel1.add(Lotomania);
        Lotomania.setBounds(40, 200, 110, 30);

        Lotofacil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/LotoFacial-Red.png"))); // NOI18N
        Lotofacil.setText("Lotofacil");
        Lotofacil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LotofacilActionPerformed(evt);
            }
        });
        jPanel1.add(Lotofacil);
        Lotofacil.setBounds(190, 200, 110, 30);

        Sobre.setText("Sobre");
        Sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SobreActionPerformed(evt);
            }
        });
        jPanel1.add(Sobre);
        Sobre.setBounds(240, 10, 90, 23);

        ResultadoJogo.setText("Resultados");
        ResultadoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultadoJogoActionPerformed(evt);
            }
        });
        jPanel1.add(ResultadoJogo);
        ResultadoJogo.setBounds(20, 10, 90, 23);

        Fonte.setText("Fonte");
        Fonte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FonteActionPerformed(evt);
            }
        });
        jPanel1.add(Fonte);
        Fonte.setBounds(130, 10, 90, 23);

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Multi-Logo.png"))); // NOI18N

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel1.add(panelImage1);
        panelImage1.setBounds(110, 50, 120, 60);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(366, 338));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void QuinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuinaActionPerformed

    private void DuplaSenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DuplaSenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DuplaSenaActionPerformed

    private void MegaSenna2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MegaSenna2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MegaSenna2ActionPerformed

    private void MegaSenna3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MegaSenna3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MegaSenna3ActionPerformed

    private void MegaSenna4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MegaSenna4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MegaSenna4ActionPerformed

    private void MegaSenna5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MegaSenna5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MegaSenna5ActionPerformed

    private void MegaSenna6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MegaSenna6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MegaSenna6ActionPerformed

    private void MegaSenna7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MegaSenna7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MegaSenna7ActionPerformed

    private void TimeManiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimeManiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TimeManiaActionPerformed

    private void MegaSenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MegaSenaActionPerformed
         new SorteMega().setVisible(true);  
         
    }//GEN-LAST:event_MegaSenaActionPerformed

    private void LotomaniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LotomaniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LotomaniaActionPerformed

    private void LotofacilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LotofacilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LotofacilActionPerformed

    private void SobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SobreActionPerformed
         new Sobre_View().setVisible(true);
    }//GEN-LAST:event_SobreActionPerformed

    private void ResultadoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultadoJogoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResultadoJogoActionPerformed

    private void FonteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FonteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FonteActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DuplaSena;
    private javax.swing.JButton Fonte;
    private javax.swing.JButton Lotofacil;
    private javax.swing.JButton Lotomania;
    private javax.swing.JButton MegaSena;
    private javax.swing.JButton MegaSenna2;
    private javax.swing.JButton MegaSenna3;
    private javax.swing.JButton MegaSenna4;
    private javax.swing.JButton MegaSenna5;
    private javax.swing.JButton MegaSenna6;
    private javax.swing.JButton MegaSenna7;
    private javax.swing.JButton Quina;
    private javax.swing.JButton ResultadoJogo;
    private javax.swing.JButton Sobre;
    private javax.swing.JButton TimeMania;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    // End of variables declaration//GEN-END:variables
}
