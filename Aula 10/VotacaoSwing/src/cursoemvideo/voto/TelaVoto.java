/**
 *
 * @author felipe.godoy
 */

package cursoemvideo.voto;

import java.time.LocalDate;

public class TelaVoto extends javax.swing.JFrame {

    public TelaVoto() {
        initComponents();
        painelResultado.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtAno = new javax.swing.JTextField();
        btnVoto = new javax.swing.JButton();
        painelResultado = new javax.swing.JPanel();
        lbl_Idade = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Ano Nascimento:");

        txtAno.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnoActionPerformed(evt);
            }
        });

        btnVoto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVoto.setText("Posso Votar?");
        btnVoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVotoActionPerformed(evt);
            }
        });

        lbl_Idade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_Idade.setText("Idade");

        lblResultado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblResultado.setText("Resultado");

        javax.swing.GroupLayout painelResultadoLayout = new javax.swing.GroupLayout(painelResultado);
        painelResultado.setLayout(painelResultadoLayout);
        painelResultadoLayout.setHorizontalGroup(
            painelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelResultadoLayout.createSequentialGroup()
                .addGroup(painelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelResultadoLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(lbl_Idade))
                    .addGroup(painelResultadoLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(lblResultado)))
                .addContainerGap(239, Short.MAX_VALUE))
        );
        painelResultadoLayout.setVerticalGroup(
            painelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelResultadoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lbl_Idade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(lblResultado)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(painelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(btnVoto)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(btnVoto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(painelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVotoActionPerformed
        if (!txtAno.getText().isEmpty()) {
            int ano_nasc = Integer.parseInt(txtAno.getText());
            int anoAtual = LocalDate.now().getYear();
            int idade = anoAtual - ano_nasc;

            if (idade < 16) {
                lblResultado.setText("E você ainda não vota!");
            } else {
                if ((idade >= 16 && idade < 18) || (idade > 70)) {
                    lblResultado.setText("E o seu voto é opcional!");
                } else {
                    lblResultado.setText("E o seu voto é obrigatório!");
                }
            }
            lbl_Idade.setText("Você tem " + Integer.toString(idade) + " anos.");
            painelResultado.setVisible(true);
        } else {
            // Caso o campo esteja vazio, exibir uma mensagem de erro
            lblResultado.setText("Por favor, insira o ano de nascimento!");
            lbl_Idade.setText("");
            painelResultado.setVisible(true);
        }
    }//GEN-LAST:event_btnVotoActionPerformed

    private void txtAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVoto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lbl_Idade;
    private javax.swing.JPanel painelResultado;
    private javax.swing.JTextField txtAno;
    // End of variables declaration//GEN-END:variables
}
