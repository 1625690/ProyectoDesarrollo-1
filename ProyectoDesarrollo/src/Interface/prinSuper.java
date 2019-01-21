/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author melissa
 */
public class prinSuper extends javax.swing.JFrame {
    
    //la variable botonAceptar indica el uso que se le da al botón de la izquierda para cada boton principal
    //1:Agregar, 2:Modificar, 3:Consultar, 4:Despedir, 0:nada
    private int botonAceptar = 0; 
    
    public prinSuper() {
        initComponents();
        
        //Fecha
        Date fechaSist = new Date(); 
        SimpleDateFormat formato = new SimpleDateFormat("dd-MMM-yyyy");
        fecha.setText(formato.format(fechaSist));
        
        //Hora
        Timer tiempo = new Timer(100, new prinSuper.hora());
        tiempo.start();
        
        cambiarVisibilidadCampos(false);
        bAceptar.setVisible(false);
        labEmple.setVisible(false);
        comboxEmple.setVisible(false);
       }

    class hora implements ActionListener{
    
        public void actionPerformed(ActionEvent e){
        
        Date fechaHora = new Date();
        String pmAm = "hh:mm:ss a";
        SimpleDateFormat format = new SimpleDateFormat(pmAm);
        Calendar hoy = Calendar.getInstance();
        hora.setText(String.format(format.format(fechaHora), hoy));
      
        }
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
        jPanel2 = new javax.swing.JPanel();
        iconUsu = new javax.swing.JLabel();
        labLogo = new javax.swing.JLabel();
        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        bAgregar = new javax.swing.JButton();
        bModf = new javax.swing.JButton();
        bConsul = new javax.swing.JButton();
        bDespedir = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        labNombreUsu = new javax.swing.JLabel();
        labCedula = new javax.swing.JLabel();
        labCargo = new javax.swing.JLabel();
        labCorreo = new javax.swing.JLabel();
        labCuentaBan = new javax.swing.JLabel();
        labGenero = new javax.swing.JLabel();
        labDir = new javax.swing.JLabel();
        labTel = new javax.swing.JLabel();
        labSal = new javax.swing.JLabel();
        labSede = new javax.swing.JLabel();
        labFechaNac = new javax.swing.JLabel();
        tNombreUsu = new javax.swing.JTextField();
        tCedula = new javax.swing.JTextField();
        tCorreo = new javax.swing.JTextField();
        tCuentaBan = new javax.swing.JTextField();
        tDir = new javax.swing.JTextField();
        labNombre = new javax.swing.JLabel();
        tNombre = new javax.swing.JTextField();
        comboxGenero = new javax.swing.JComboBox<>();
        tTel = new javax.swing.JTextField();
        tSal = new javax.swing.JTextField();
        comboxSedes = new javax.swing.JComboBox<>();
        comboxDia = new javax.swing.JComboBox<>();
        comboxMes = new javax.swing.JComboBox<>();
        comboxAno = new javax.swing.JComboBox<>();
        comboxCargo = new javax.swing.JComboBox<>();
        bAceptar = new javax.swing.JButton();
        labEmple = new javax.swing.JLabel();
        comboxEmple = new javax.swing.JComboBox<>();
        labContra = new javax.swing.JLabel();
        tContra = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        fechaYhora = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        hora = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new java.awt.BorderLayout());

        iconUsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ICO menuSuper.png"))); // NOI18N

        labLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N
        labLogo.setName(""); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(labLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 337, Short.MAX_VALUE)
                .addComponent(iconUsu)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iconUsu)
                    .addComponent(labLogo))
                .addGap(18, 18, 18))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        bAgregar.setForeground(new java.awt.Color(51, 51, 51));
        bAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ICO addUser.png"))); // NOI18N
        bAgregar.setText("Agregar");
        bAgregar.setBorderPainted(false);
        bAgregar.setContentAreaFilled(false);
        bAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bAgregarMouseClicked(evt);
            }
        });

        bModf.setForeground(new java.awt.Color(51, 51, 51));
        bModf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ICO modifyUser.png"))); // NOI18N
        bModf.setText("Modificar");
        bModf.setBorderPainted(false);
        bModf.setContentAreaFilled(false);
        bModf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bModfMouseClicked(evt);
            }
        });

        bConsul.setForeground(new java.awt.Color(51, 51, 51));
        bConsul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ICO searchUser.png"))); // NOI18N
        bConsul.setText("Consultar");
        bConsul.setBorderPainted(false);
        bConsul.setContentAreaFilled(false);
        bConsul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bConsulMouseClicked(evt);
            }
        });

        bDespedir.setForeground(new java.awt.Color(51, 51, 51));
        bDespedir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ICO searchUser.png"))); // NOI18N
        bDespedir.setText("Despedir");
        bDespedir.setBorderPainted(false);
        bDespedir.setContentAreaFilled(false);
        bDespedir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bDespedirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bModf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bConsul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bDespedir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(bAgregar)
                .addGap(18, 18, 18)
                .addComponent(bModf)
                .addGap(18, 18, 18)
                .addComponent(bConsul)
                .addGap(18, 18, 18)
                .addComponent(bDespedir)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        jSplitPane2.setLeftComponent(jPanel3);

        labNombreUsu.setText("Nombre de usuario:");

        labCedula.setText("Cedula:");

        labCargo.setText("Cargo:");

        labCorreo.setText("Correo:");

        labCuentaBan.setText("Cuenta Bancaria:");

        labGenero.setText("Genero:");

        labDir.setText("Dirección:");

        labTel.setText("Telefono:");

        labSal.setText("Salario:");

        labSede.setText("Sede:");

        labFechaNac.setText("Fecha de nacimiento:");

        tNombreUsu.setToolTipText("");

        tCedula.setToolTipText("");

        tCorreo.setToolTipText("");

        tCuentaBan.setToolTipText("");

        tDir.setToolTipText("");

        labNombre.setText("Nombre:");
        labNombre.setToolTipText("");

        tNombre.setToolTipText("");

        comboxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

        tTel.setToolTipText("");

        tSal.setToolTipText("");

        comboxSedes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin sede" }));

        comboxDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        comboxMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic" }));

        comboxAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944" }));

        comboxCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gerente" }));
        comboxCargo.setEnabled(false);

        bAceptar.setText("Agregar");

        labEmple.setText("Empleado");

        comboxEmple.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No seleccionado" }));

        labContra.setText("Contraseña:");

        tContra.setToolTipText("");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labDir)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(labFechaNac)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboxMes, 0, 54, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboxAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(labNombreUsu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labCedula)
                                        .addComponent(labCargo)
                                        .addComponent(labCorreo)
                                        .addComponent(labCuentaBan)
                                        .addComponent(labGenero)
                                        .addComponent(labNombre)
                                        .addComponent(labTel)
                                        .addComponent(labSal)
                                        .addComponent(labSede)
                                        .addComponent(labEmple, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(labContra))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tDir)
                                    .addComponent(tNombreUsu)
                                    .addComponent(tCedula)
                                    .addComponent(tCorreo)
                                    .addComponent(tCuentaBan)
                                    .addComponent(tNombre)
                                    .addComponent(comboxGenero, 0, 152, Short.MAX_VALUE)
                                    .addComponent(tTel)
                                    .addComponent(tSal)
                                    .addComponent(comboxSedes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboxCargo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboxEmple, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tContra)))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(bAceptar)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labEmple)
                    .addComponent(comboxEmple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labNombreUsu)
                    .addComponent(tNombreUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labContra)
                    .addComponent(tContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labNombre)
                    .addComponent(tNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labCedula)
                    .addComponent(tCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labCargo)
                    .addComponent(comboxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labCorreo)
                    .addComponent(tCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tCuentaBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labCuentaBan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labGenero)
                    .addComponent(comboxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labDir)
                    .addComponent(tDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labTel)
                    .addComponent(tTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labSal, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tSal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labSede)
                    .addComponent(comboxSedes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labFechaNac)
                    .addComponent(comboxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboxAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bAceptar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane2.setRightComponent(jPanel4);

        jPanel1.add(jSplitPane2, java.awt.BorderLayout.CENTER);

        fechaYhora.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        fechaYhora.setText("Fecha  y hora:");

        fecha.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        fecha.setText("dd-mm-yyyy");

        hora.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        hora.setText("hh:mm:ss");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(fechaYhora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hora)
                .addGap(0, 334, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fecha)
                    .addComponent(fechaYhora)
                    .addComponent(hora))
                .addGap(0, 1, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 485, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bAgregarMouseClicked
        cambiarVisibilidadCamposmodf(false);
        cambiarVisibilidadCampos(true);
        
        botonAceptar = 1;
        bAceptar.setText("Agregar");
        bAceptar.setVisible(true);
        bAceptar.setEnabled(true);

    }//GEN-LAST:event_bAgregarMouseClicked

    private void bModfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bModfMouseClicked
        cambiarVisibilidadCampos(true);
        cambiarVisibilidadCamposmodf(true);
        
        botonAceptar = 2;
        bAceptar.setText("Modificar");
        bAceptar.setVisible(true);              
        bAceptar.setEnabled(false);
        
        comboxEmple.setSelectedIndex(0);
    }//GEN-LAST:event_bModfMouseClicked

    private void bConsulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bConsulMouseClicked
        cambiarVisibilidadCamposmodf(false);
        cambiarVisibilidadCampos(false);
        
        botonAceptar = 3;
        bAceptar.setText("Consultar");
        bAceptar.setVisible(true);
        bAceptar.setEnabled(false);
        
        comboxEmple.setSelectedIndex(0);
    }//GEN-LAST:event_bConsulMouseClicked

    private void bDespedirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bDespedirMouseClicked
        cambiarVisibilidadCamposmodf(false);
        cambiarVisibilidadCampos(false);
        
        botonAceptar = 4;
        bAceptar.setText("Despedir");
        bAceptar.setVisible(true);
        bAceptar.setEnabled(false);
        
        comboxEmple.setSelectedIndex(0);
    }//GEN-LAST:event_bDespedirMouseClicked

    
    //Quita los campos usados en la función agregar, consultar y despedir (ej:nombre,cedula,genero,cargo)
    //varControl: true para indicar que sea visible los campos de agregar, false para los de consultar y despedir
    public void cambiarVisibilidadCampos(boolean varControl){
        labContra.setVisible(false);
        tContra.setVisible(false);
        
        labEmple.setVisible(!varControl);
        comboxEmple.setVisible(!varControl);
        
        labNombreUsu.setVisible(varControl);
        labNombre.setVisible(varControl);
        labCedula.setVisible(varControl);
        labCargo.setVisible(varControl);
        labCorreo.setVisible(varControl);
        labCuentaBan.setVisible(varControl);
        labGenero.setVisible(varControl);
        labDir.setVisible(varControl);
        labTel.setVisible(varControl);
        labSal.setVisible(varControl);
        labSede.setVisible(varControl);
        labFechaNac.setVisible(varControl);
        
        comboxCargo.setVisible(varControl);
        comboxCargo.setSelectedIndex(0);
        comboxGenero.setVisible(varControl);
        comboxGenero.setSelectedIndex(0);
        comboxSedes.setVisible(varControl);
        comboxSedes.setSelectedIndex(0);
        comboxDia.setVisible(varControl);
        comboxDia.setSelectedIndex(0);
        comboxMes.setVisible(varControl);
        comboxMes.setSelectedIndex(0);
        comboxAno.setVisible(varControl);
        comboxAno.setSelectedIndex(0);
        
        tNombreUsu.setVisible(varControl);
        tNombreUsu.setText("");
        tNombre.setVisible(varControl);
        tNombre.setText("");
        tCedula.setVisible(varControl);
        tCedula.setText("");
        tCorreo.setVisible(varControl);
        tCorreo.setText("");
        tCuentaBan.setVisible(varControl);
        tCuentaBan.setText("");
        tDir.setVisible(varControl);
        tDir.setText("");
        tTel.setVisible(varControl);
        tTel.setText("");
        tSal.setVisible(varControl);
        tSal.setText("");
    }
    
    //Quita los campos usados en la función consultar y despedir (ej:empleado)
    //varControl: true para indicar que sea visible, false para lo opuesto
    public void cambiarVisibilidadCamposmodf(boolean varControl){           
        labEmple.setVisible(varControl);
        comboxEmple.setVisible(varControl);
        
        comboxCargo.setEnabled(!varControl);
        comboxGenero.setEnabled(!varControl);
        comboxSedes.setEnabled(!varControl);
        comboxDia.setEnabled(!varControl);
        comboxMes.setEnabled(!varControl);
        comboxAno.setEnabled(!varControl);      
        
        labContra.setVisible(varControl);
        tContra.setVisible(varControl);
        tContra.setEnabled(!varControl);
        tContra.setText("");
        
        tNombreUsu.setEnabled(!varControl);
        tNombreUsu.setText("");
        tNombre.setEnabled(!varControl);
        tNombre.setText("");
        tCedula.setEnabled(!varControl);
        tCedula.setText("");
        tCorreo.setEnabled(!varControl);
        tCorreo.setText("");
        tCuentaBan.setEnabled(!varControl);
        tCuentaBan.setText("");
        tDir.setEnabled(!varControl);
        tDir.setText("");
        tTel.setEnabled(!varControl);
        tTel.setText("");
        tSal.setEnabled(!varControl);
        tSal.setText("");
    }
    
    public static void main(String args[]) {            
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prinSuper().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bAgregar;
    private javax.swing.JButton bConsul;
    private javax.swing.JButton bDespedir;
    private javax.swing.JButton bModf;
    private javax.swing.JComboBox<String> comboxAno;
    private javax.swing.JComboBox<String> comboxCargo;
    private javax.swing.JComboBox<String> comboxDia;
    private javax.swing.JComboBox<String> comboxEmple;
    private javax.swing.JComboBox<String> comboxGenero;
    private javax.swing.JComboBox<String> comboxMes;
    private javax.swing.JComboBox<String> comboxSedes;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel fechaYhora;
    private javax.swing.JLabel hora;
    private javax.swing.JLabel iconUsu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JLabel labCargo;
    private javax.swing.JLabel labCedula;
    private javax.swing.JLabel labContra;
    private javax.swing.JLabel labCorreo;
    private javax.swing.JLabel labCuentaBan;
    private javax.swing.JLabel labDir;
    private javax.swing.JLabel labEmple;
    private javax.swing.JLabel labFechaNac;
    private javax.swing.JLabel labGenero;
    private javax.swing.JLabel labLogo;
    private javax.swing.JLabel labNombre;
    private javax.swing.JLabel labNombreUsu;
    private javax.swing.JLabel labSal;
    private javax.swing.JLabel labSede;
    private javax.swing.JLabel labTel;
    private javax.swing.JTextField tCedula;
    private javax.swing.JTextField tContra;
    private javax.swing.JTextField tCorreo;
    private javax.swing.JTextField tCuentaBan;
    private javax.swing.JTextField tDir;
    private javax.swing.JTextField tNombre;
    private javax.swing.JTextField tNombreUsu;
    private javax.swing.JTextField tSal;
    private javax.swing.JTextField tTel;
    // End of variables declaration//GEN-END:variables
}
