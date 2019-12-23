package tateticeleste;

public class Inicio2 extends javax.swing.JFrame {

    public Inicio2(int quienEmpieza, boolean modalidad) {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Ta-te-ti Celeste");
        this.modalidad = modalidad;
        this.quienEmpieza = quienEmpieza;
        
    }
    private int quienEmpieza;
    private boolean modalidad;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        seleccionX = new javax.swing.JToggleButton();
        seleccionO = new javax.swing.JToggleButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Engravers MT", 3, 12)); // NOI18N
        jLabel1.setText("Seleccione Jugador 1");

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        seleccionX.setFont(new java.awt.Font("Engravers MT", 0, 36)); // NOI18N
        seleccionX.setText("x");
        seleccionX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionXActionPerformed(evt);
            }
        });
        jPanel1.add(seleccionX);

        seleccionO.setFont(new java.awt.Font("Engravers MT", 0, 36)); // NOI18N
        seleccionO.setText("o");
        seleccionO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionOActionPerformed(evt);
            }
        });
        jPanel1.add(seleccionO);

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
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(52, Short.MAX_VALUE))
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

    private void seleccionXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionXActionPerformed
        Tateti tateti = new Tateti(0,quienEmpieza,modalidad);
        tateti.setVisible(true);
        this.setVisible(false);
        System.out.println("Opcion X inicializada, empieza "+ quienEmpieza+" ,vsOrdenador?"+modalidad );
    }//GEN-LAST:event_seleccionXActionPerformed

    private void seleccionOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionOActionPerformed
        Tateti tatetiO = new Tateti(1,quienEmpieza,modalidad);
        tatetiO.setVisible(true);
        this.setVisible(false);
        System.out.println("Opcion O inicializada, empieza "+ quienEmpieza+" ,vsOrdenador?"+modalidad );
    }//GEN-LAST:event_seleccionOActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton seleccionO;
    private javax.swing.JToggleButton seleccionX;
    // End of variables declaration//GEN-END:variables
}
