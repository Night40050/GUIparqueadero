package parq;
public class salida extends javax.swing.JFrame {
    Vehiculo objVehi;
    public salida(Vehiculo objV) {
        initComponents();
        this.objVehi=objV;
        txtArea.append("\nInformacion:"+"\nPropietario: "+ objV.propietario);
        txtArea.append("\nPlaca del vehiculo: " + objV.placa);
        txtArea.append("\ntipo de auto: "+ objV.calcularTipo());    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtAs = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtHs = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMs = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnRegSal = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        mesS = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txtDs = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblAños = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblMes = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblDias = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblHoras = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblMinutos = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblPago = new javax.swing.JLabel();
        btnGenPag = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Año salida:");

        jLabel5.setText("Hora salida");

        txtHs.setText("24");
        txtHs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtHsMouseClicked(evt);
            }
        });

        jLabel6.setText("Minuto salida");

        txtMs.setText("59");
        txtMs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMsMouseClicked(evt);
            }
        });

        jLabel7.setText(":");

        btnRegSal.setText("Registrar salida");
        btnRegSal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegSalActionPerformed(evt);
            }
        });

        jLabel9.setText("Mes salida:");

        mesS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija.", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre ", "Noviembre", "Diciembre" }));
        mesS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesSActionPerformed(evt);
            }
        });

        jLabel12.setText("Dia salida:");

        jLabel8.setBackground(new java.awt.Color(102, 102, 255));
        jLabel8.setText("Parqueadero.exe");

        jLabel10.setText("Total años:");

        lblAños.setText("...");

        jLabel13.setText("Total mes/es:");

        lblMes.setText("...");

        jLabel15.setText("Total dias:");

        lblDias.setText("...");

        jLabel17.setText("Total horas:");

        lblHoras.setText("...");

        jLabel19.setText("Total minutos:");

        lblMinutos.setText("...");

        jLabel11.setText("Total a Pagar:");

        lblPago.setForeground(new java.awt.Color(255, 0, 51));
        lblPago.setText("...");

        btnGenPag.setText("Generar pago");
        btnGenPag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenPagActionPerformed(evt);
            }
        });

        txtArea.setColumns(20);
        txtArea.setRows(5);
        txtArea.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAs, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel9))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDs, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mesS, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(txtMs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(txtHs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(btnRegSal, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(324, 324, 324)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(btnGenPag, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel10)
                                .addGap(6, 6, 6)
                                .addComponent(lblAños, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblMes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(9, 9, 9)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDias, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblPago, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(mesS, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(txtAs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtHs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(txtDs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnRegSal))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(btnGenPag, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lblAños)
                    .addComponent(jLabel13)
                    .addComponent(lblMes)
                    .addComponent(jLabel15)
                    .addComponent(lblDias)
                    .addComponent(jLabel11)
                    .addComponent(lblPago))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(lblHoras)
                    .addComponent(jLabel19)
                    .addComponent(lblMinutos))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegSalActionPerformed
       int aS =Integer.parseInt(txtAs.getText()); 
       int mesSa= mesS.getSelectedIndex();
       int diaS= txtDs.getColumns();
       int horaS= txtHs.getColumns();
       int minutoS= txtMs.getColumns();
       
       objVehi.registrarSalida(aS, mesSa, diaS, horaS, minutoS);
       //btnRegSal.setEnabled(false);
    }//GEN-LAST:event_btnRegSalActionPerformed

    private void mesSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesSActionPerformed
    }//GEN-LAST:event_mesSActionPerformed
public void precio (Vehiculo objV){
    objV.calcularTiempo();
    objV.calcularValor();
    lblAños.setText(""+objV.totAño);
    lblMes.setText(""+objV.totMes);
    lblDias.setText(""+objV.totDia);
    lblHoras.setText(""+objV.totHor);
    lblMinutos.setText(""+objV.totMin);
    lblPago.setText(""+objV.calcularValor());
}
    private void btnGenPagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenPagActionPerformed
        precio(objVehi);   
    }//GEN-LAST:event_btnGenPagActionPerformed

// interfaz grafica
    private void txtHsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtHsMouseClicked
        txtHs.setText("");
    }//GEN-LAST:event_txtHsMouseClicked
    private void txtMsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMsMouseClicked
        txtMs.setText("");
    }//GEN-LAST:event_txtMsMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenPag;
    private javax.swing.JButton btnRegSal;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAños;
    private javax.swing.JLabel lblDias;
    private javax.swing.JLabel lblHoras;
    private javax.swing.JLabel lblMes;
    private javax.swing.JLabel lblMinutos;
    private javax.swing.JLabel lblPago;
    private javax.swing.JComboBox<String> mesS;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtAs;
    private javax.swing.JTextField txtDs;
    private javax.swing.JTextField txtHs;
    private javax.swing.JTextField txtMs;
    // End of variables declaration//GEN-END:variables
}
