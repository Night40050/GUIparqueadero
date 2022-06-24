package parq;
import java.awt.Color;
import java.util.ArrayList;
public class entrada extends javax.swing.JFrame {
    Vehiculo objVeh;
    
    //creo dos listas para el array
    ArrayList nombres= new ArrayList();
    ArrayList idplaca= new ArrayList();
    ArrayList tipoAuto=new ArrayList();
    //instancia la clase hereda
    Hereda hrd= new Hereda(nombres, idplaca, tipoAuto);
    // fin instancia :)
    
    public entrada() {
        initComponents();
        txtAreaDatos.setLineWrap(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        txtPropietario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtAe = new javax.swing.JTextField();
        cmbTipo = new javax.swing.JComboBox<>();
        btnRegistrar = new javax.swing.JButton();
        btnRegistrarE = new javax.swing.JButton();
        btnSal = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtHe = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMe = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbMes = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtDe = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDatos = new javax.swing.JTextArea();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setText("Propietario:");

        txtPropietario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPropietarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPropietarioFocusLost(evt);
            }
        });

        jLabel2.setText("Placa:");

        txtPlaca.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPlacaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPlacaFocusLost(evt);
            }
        });

        jLabel3.setText("Tipo:");

        jLabel4.setText("Año Entrada:");

        txtAe.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAeFocusLost(evt);
            }
        });

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bicicleta", "Motocicleta", "Automovil" }));
        cmbTipo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbTipoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbTipoFocusLost(evt);
            }
        });

        btnRegistrar.setText("Registrar Vehiculo");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnRegistrarE.setText("Registrar Entrada");
        btnRegistrarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEActionPerformed(evt);
            }
        });

        btnSal.setText("Salida");
        btnSal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalActionPerformed(evt);
            }
        });

        jLabel5.setText("Hora entrada ");

        txtHe.setText("24");
        txtHe.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHeFocusLost(evt);
            }
        });
        txtHe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtHeMouseClicked(evt);
            }
        });

        jLabel6.setText("Minuto entrada");

        txtMe.setText("59");
        txtMe.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMeFocusLost(evt);
            }
        });
        txtMe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMeMouseClicked(evt);
            }
        });

        jLabel7.setText(":");

        jLabel8.setText("Mes entrada:");

        cmbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija.", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre ", "Noviembre", "Diciembre" }));

        jLabel9.setText("Dia entrada:");

        txtDe.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDeFocusLost(evt);
            }
        });

        jLabel10.setText("Parqueadero.exe");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtAreaDatos.setColumns(20);
        txtAreaDatos.setRows(5);
        txtAreaDatos.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtAreaDatos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(313, 313, 313)
                .addComponent(btnSal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(txtHe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(txtMe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAe, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addGap(3, 3, 3)
                                .addComponent(cmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtPlaca)
                                        .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtPropietario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDe, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnRegistrar)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRegistrarE)
                        .addGap(56, 56, 56))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(cmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(btnRegistrarE, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnSal)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String prop = txtPropietario.getText();
        String placa = txtPlaca.getText();
        int tipo = cmbTipo.getSelectedIndex();
    //guardo en el array list
        hrd.IngresarNombre(this.txtPropietario.getText());
        hrd.IngresarIdPlaca(this.txtPlaca.getText());
        hrd.IngresarTipoAuto(tipo);
    // fin enviar datos al list
        objVeh = new Vehiculo(placa, prop, tipo) {
            @Override
            public void IngresarNombre(String nombres) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            @Override
            public void IngresarIdPlaca(String idplaca) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            @Override
            public void IngresarTipoAuto(int tipoAuto) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            @Override
            public String BuscarNombre(String nombres) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            @Override
            public String BuscarIdPlaca(String idplaca) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            @Override
            public int BuscarTipoAuto(int tipoAuto) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        //btnRegistrar.setEnabled(false);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnRegistrarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEActionPerformed
        int ae =Integer.parseInt(txtAe.getText()); 
        int mesE =cmbMes.getSelectedIndex();
        int diaE= txtDe.getColumns();
        int horaE= txtHe.getColumns();
        int minutoE= txtMe.getColumns();
        objVeh.registrarEntrada(ae, mesE, diaE, horaE, minutoE);
    }//GEN-LAST:event_btnRegistrarEActionPerformed

    private void btnSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalActionPerformed
        salida VntSalida = new salida(objVeh);
        VntSalida.setVisible(true); 
    }//GEN-LAST:event_btnSalActionPerformed

//Interfaz grafica
    private void txtHeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtHeMouseClicked
        txtHe.setText("");
    }//GEN-LAST:event_txtHeMouseClicked
    private void txtMeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMeMouseClicked
        txtMe.setText("");
    }//GEN-LAST:event_txtMeMouseClicked
    private void txtPropietarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPropietarioFocusGained
        txtPropietario.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_txtPropietarioFocusGained
    private void txtPropietarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPropietarioFocusLost
        txtPropietario.setBackground(Color.WHITE);
    }//GEN-LAST:event_txtPropietarioFocusLost
    private void txtPlacaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPlacaFocusGained
        txtPlaca.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_txtPlacaFocusGained
    private void txtPlacaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPlacaFocusLost
        txtPlaca.setBackground(Color.WHITE);
    }//GEN-LAST:event_txtPlacaFocusLost
    private void cmbTipoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbTipoFocusGained
        cmbTipo.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_cmbTipoFocusGained
    private void cmbTipoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbTipoFocusLost
        cmbTipo.setBackground(Color.WHITE);
    }//GEN-LAST:event_cmbTipoFocusLost
    private void txtAeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAeFocusGained
        txtAe.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_txtAeFocusGained
    private void txtAeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAeFocusLost
        txtAe.setBackground(Color.WHITE);
    }//GEN-LAST:event_txtAeFocusLost
    private void txtDeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDeFocusGained
        txtDe.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_txtDeFocusGained
    private void txtDeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDeFocusLost
        txtDe.setBackground(Color.WHITE);
    }//GEN-LAST:event_txtDeFocusLost
    private void txtHeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHeFocusGained
        txtHe.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_txtHeFocusGained
    private void txtHeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHeFocusLost
        txtHe.setBackground(Color.WHITE);
    }//GEN-LAST:event_txtHeFocusLost
    private void txtMeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMeFocusLost
        txtMe.setBackground(Color.WHITE);
    }//GEN-LAST:event_txtMeFocusLost
    private void txtMeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMeFocusGained
        txtMe.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_txtMeFocusGained
// boton buscar...
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Integer tipo= cmbTipo.getSelectedIndex();
        txtAreaDatos.append("\nInformacion:"+"\nPropietario: "+ hrd.BuscarNombre(this.txtPropietario.getText()));
        txtAreaDatos.append("\nPlaca del vehiculo: "+hrd.BuscarIdPlaca(this.txtPlaca.getText()));
        txtAreaDatos.append("\ntipo de auto: "+String.valueOf(hrd.BuscarTipoAuto(tipo)));
    }//GEN-LAST:event_btnBuscarActionPerformed
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegistrarE;
    private javax.swing.JButton btnSal;
    private javax.swing.JComboBox<String> cmbMes;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAe;
    private javax.swing.JTextArea txtAreaDatos;
    private javax.swing.JTextField txtDe;
    private javax.swing.JTextField txtHe;
    private javax.swing.JTextField txtMe;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtPropietario;
    // End of variables declaration//GEN-END:variables
}
