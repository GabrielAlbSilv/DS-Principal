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
public class principal_gui extends javax.swing.JFrame {

    /**
     * Creates new form principal_gui
     */
    public principal_gui() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        EMAIL = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        endereco = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        telefone = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        convi = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        beber = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        comida = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        valorfim = new javax.swing.JTextPane();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setText("Switchif Buffet");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(240, 30, 160, 50);

        jLabel1.setText("Nome:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 180, 50, 14);

        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });
        jPanel1.add(nome);
        nome.setBounds(50, 180, 140, 20);

        jLabel3.setText("E mail");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 220, 40, 14);

        EMAIL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EMAILActionPerformed(evt);
            }
        });
        jPanel1.add(EMAIL);
        EMAIL.setBounds(50, 220, 140, 20);

        jLabel4.setText("Endereço");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(230, 220, 70, 14);

        endereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoActionPerformed(evt);
            }
        });
        jPanel1.add(endereco);
        endereco.setBounds(280, 220, 130, 20);

        jLabel5.setText("Telefone");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(230, 180, 50, 14);

        telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneActionPerformed(evt);
            }
        });
        jPanel1.add(telefone);
        telefone.setBounds(280, 180, 130, 20);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(0, 270, 660, 10);

        jLabel6.setText("Nº Convidados");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 340, 90, 14);

        convi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conviActionPerformed(evt);
            }
        });
        jPanel1.add(convi);
        convi.setBounds(100, 340, 100, 20);

        jLabel7.setText("Bebida:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 380, 70, 14);

        beber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beberActionPerformed(evt);
            }
        });
        jPanel1.add(beber);
        beber.setBounds(100, 380, 100, 20);

        jLabel8.setText("Comida");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 420, 70, 14);

        comida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comidaActionPerformed(evt);
            }
        });
        jPanel1.add(comida);
        comida.setBounds(100, 420, 100, 20);

        jLabel9.setText("Valor:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(490, 410, 40, 14);

        jScrollPane1.setViewportView(valorfim);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(530, 390, 70, 50);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Orçamento");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 290, 100, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Cadastro");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 130, 70, 20);

        jLabel12.setText("(R$2,00 por cabeça)");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(210, 340, 120, 14);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(676, 538));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comidaActionPerformed

    private void beberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_beberActionPerformed

    private void conviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conviActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conviActionPerformed

    private void telefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoneActionPerformed

    private void enderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecoActionPerformed

    private void EMAILActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EMAILActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EMAILActionPerformed

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

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
            java.util.logging.Logger.getLogger(principal_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal_gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EMAIL;
    private javax.swing.JTextField beber;
    private javax.swing.JTextField comida;
    private javax.swing.JTextField convi;
    private javax.swing.JTextField endereco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField telefone;
    private javax.swing.JTextPane valorfim;
    // End of variables declaration//GEN-END:variables
}
