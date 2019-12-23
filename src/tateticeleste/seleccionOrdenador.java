package tateticeleste;

public class seleccionOrdenador extends javax.swing.JFrame {

    
    int quienEmpieza;

    public seleccionOrdenador() {
      

        initComponents();
        setLocationRelativeTo(null);
        setTitle("Ta-te-ti Celeste");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnEmpiezaJugador = new javax.swing.JToggleButton();
        btnEmpiezaOrdenador = new javax.swing.JToggleButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Engravers MT", 3, 12)); // NOI18N
        jLabel1.setText("Quien empieza?");

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        btnEmpiezaJugador.setFont(new java.awt.Font("Engravers MT", 0, 24)); // NOI18N
        btnEmpiezaJugador.setText("Jugador");
        btnEmpiezaJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpiezaJugadorActionPerformed(evt);
            }
        });
        jPanel1.add(btnEmpiezaJugador);

        btnEmpiezaOrdenador.setFont(new java.awt.Font("Engravers MT", 0, 24)); // NOI18N
        btnEmpiezaOrdenador.setText("Ordenador");
        btnEmpiezaOrdenador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpiezaOrdenadorActionPerformed(evt);
            }
        });
        jPanel1.add(btnEmpiezaOrdenador);

        btnExit.setText("Salir");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExit)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmpiezaJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpiezaJugadorActionPerformed
        quienEmpieza = 1;
        Inicio2 inicio2 = new Inicio2(quienEmpieza, true);
        inicio2.setVisible(true);
        this.setVisible(false);
        System.out.println("Empieza  Jugador");
    }//GEN-LAST:event_btnEmpiezaJugadorActionPerformed

    private void btnEmpiezaOrdenadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpiezaOrdenadorActionPerformed
        quienEmpieza = 2;
        Inicio2 inicio2 = new Inicio2(quienEmpieza, true);
        inicio2.setVisible(true);
        this.setVisible(false);
        System.out.println("Empieza Ordenador");
    }//GEN-LAST:event_btnEmpiezaOrdenadorActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnEmpiezaJugador;
    private javax.swing.JToggleButton btnEmpiezaOrdenador;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
