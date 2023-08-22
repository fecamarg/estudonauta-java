/**
 *
 * @author felipe.godoy
 */
package classes;

public class telaTriangulo extends javax.swing.JFrame {

    public telaTriangulo() {
        initComponents();
        painelResposta.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sliderA = new javax.swing.JSlider();
        sliderB = new javax.swing.JSlider();
        sliderC = new javax.swing.JSlider();
        lblA = new javax.swing.JLabel();
        lblB = new javax.swing.JLabel();
        lblC = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnVerificar = new javax.swing.JButton();
        painelResposta = new javax.swing.JPanel();
        lblStatus = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("A");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("B");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("C");

        sliderA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sliderA.setMaximum(20);
        sliderA.setValue(0);
        sliderA.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderAStateChanged(evt);
            }
        });

        sliderB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sliderB.setMaximum(20);
        sliderB.setValue(0);
        sliderB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderBStateChanged(evt);
            }
        });

        sliderC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sliderC.setMaximum(20);
        sliderC.setValue(0);
        sliderC.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderCStateChanged(evt);
            }
        });

        lblA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblA.setText("0");

        lblB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblB.setText("0");

        lblC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblC.setText("0");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/triangulo.png"))); // NOI18N

        btnVerificar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        lblStatus.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(51, 102, 255));
        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatus.setText("Forma ou não?");

        lblTipo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTipo.setForeground(new java.awt.Color(255, 102, 102));
        lblTipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTipo.setText("Tipo de Triângulo?");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tipos-de-triangulos-quanto-aos-lados.png"))); // NOI18N

        javax.swing.GroupLayout painelRespostaLayout = new javax.swing.GroupLayout(painelResposta);
        painelResposta.setLayout(painelRespostaLayout);
        painelRespostaLayout.setHorizontalGroup(
            painelRespostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelRespostaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(painelRespostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTipo, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelRespostaLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(24, 24, 24)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        painelRespostaLayout.setVerticalGroup(
            painelRespostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelRespostaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblStatus)
                .addGap(18, 18, 18)
                .addComponent(lblTipo)
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(sliderC, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(sliderB, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(sliderA, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblB)
                            .addComponent(lblA)
                            .addComponent(lblC)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(btnVerificar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(11, 11, 11))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(painelResposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel1)
                                            .addComponent(sliderA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(sliderB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblB)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(sliderC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblC)))
                            .addComponent(lblA))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVerificar)))
                .addGap(18, 18, 18)
                .addComponent(painelResposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        int a = sliderA.getValue();
        int b = sliderB.getValue();
        int c = sliderC.getValue();

        if (a < b + c && b < a + c && c < a + b) {
            lblStatus.setText("Formam um Triângulo");
            if (a == b && b == c) {
                lblTipo.setText("Equilátero");
            } else if (a != b && b != c && a != c) {
                lblTipo.setText("Escaleno");
            } else {
                lblTipo.setText("Isósceles");
            }
        } else {
            lblStatus.setText("Não formam um Triângulo");
            lblTipo.setText("-----");
        }
        painelResposta.setVisible(true);
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void sliderAStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderAStateChanged
        lblA.setText(Integer.toString(sliderA.getValue()));
    }//GEN-LAST:event_sliderAStateChanged

    private void sliderBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderBStateChanged
        lblB.setText(Integer.toString(sliderB.getValue()));
    }//GEN-LAST:event_sliderBStateChanged

    private void sliderCStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderCStateChanged
        lblC.setText(Integer.toString(sliderC.getValue()));
    }//GEN-LAST:event_sliderCStateChanged

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaTriangulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblB;
    private javax.swing.JLabel lblC;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JPanel painelResposta;
    private javax.swing.JSlider sliderA;
    private javax.swing.JSlider sliderB;
    private javax.swing.JSlider sliderC;
    // End of variables declaration//GEN-END:variables
}
