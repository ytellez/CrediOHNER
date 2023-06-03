/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas.formularios;

import Controlador.CRUDCliente;
import Controlador.CRUDCredito;
import Controlador.CRUDCreditosGarantias;
import Controlador.CRUDGarantia;
import Modelo.Credito;
import Modelo.CreditoGarantia;
import Modelo.Garantia;
import java.awt.HeadlessException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class frmCredito extends javax.swing.JInternalFrame {

    DefaultTableModel modelo;
    String[] titulos = {"Cod Garantía", "Nombre Garantía"};
    String[] datos = new String[2];
    int datoSeleccionado;
    int codCredito;

    public frmCredito() {
        initComponents();
        llenarGarantias();
        modelo = new DefaultTableModel(null, titulos);
        Date fechaActual = new Date();
        jTextFechaActual.setText(new SimpleDateFormat("dd/MM/yyyy").format(fechaActual));
    }

    public void llenarGarantias() {

        CRUDGarantia gr = new CRUDGarantia();
        ArrayList<Garantia> listaGarantias = gr.mostrarDatosCombo();
        jComboGarantias.removeAllItems();
        for (int i = 0; i < listaGarantias.size(); i++) {
            jComboGarantias.addItem(new Garantia(
                    listaGarantias.get(i).getCodGarantia(),
                    listaGarantias.get(i).getNombreGarantia()));
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
        jButtonGuardar = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabelNombres = new javax.swing.JLabel();
        jTextCedula = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jCantidad = new javax.swing.JTextField();
        jTextFechaActual = new javax.swing.JTextField();
        jComboCicloPagos = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jComboGarantias = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableGarantias = new javax.swing.JTable();
        jComboInteres = new javax.swing.JComboBox<>();
        jMonto = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        jComboMoneda = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelCod = new javax.swing.JLabel();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(0, 161, 154));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonGuardar.setBackground(new java.awt.Color(250, 178, 53));
        jButtonGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/iconos/guardar.png"))); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.setBorder(null);
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 120, 40));

        jButtonActualizar.setBackground(new java.awt.Color(250, 178, 53));
        jButtonActualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/iconos/actualizar.png"))); // NOI18N
        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.setBorder(null);
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 120, 40));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 255, 255)), "Datos del Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Light", 1, 14))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNombres.setBackground(new java.awt.Color(0, 0, 0));
        jLabelNombres.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jPanel4.add(jLabelNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 300, 50));

        jTextCedula.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        try {
            jTextCedula.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-######-####U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextCedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextCedula.setToolTipText("");
        jTextCedula.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextCedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextCedulaFocusLost(evt);
            }
        });
        jTextCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextCedulaKeyReleased(evt);
            }
        });
        jPanel4.add(jTextCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 220, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/iconos/busqueda.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 40, 30));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel13.setText("Cédula");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 20));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 620, 90));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 255, 255)), "Datos del Crédito", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Light", 1, 14))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel8.setText("Frecuencia de Pago");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 150, 20));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel7.setText("Monto Otorgado");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 20));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel11.setText("Fecha Desembolso");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel9.setText("Tasa de interés");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 110, -1));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel10.setText("Cantidad de Pagos");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, 20));

        jCantidad.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jPanel5.add(jCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 130, 30));

        jTextFechaActual.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jTextFechaActual.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(jTextFechaActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 120, 30));

        jComboCicloPagos.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jComboCicloPagos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quincenal", "Mensual" }));
        jPanel5.add(jComboCicloPagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 130, 30));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Garantías del Crédito", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Light", 1, 14))); // NOI18N
        jPanel6.setForeground(new java.awt.Color(128, 209, 205));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboGarantias.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jPanel6.add(jComboGarantias, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 180, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/iconos/agregar.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 40, 30));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/iconos/basura.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 40, 30));

        jTableGarantias.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTableGarantias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Cod Garantía", "Nombre Garantía"
            }
        ));
        jTableGarantias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableGarantiasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableGarantias);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 280, 80));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 300, 160));

        jComboInteres.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jComboInteres.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6%", "10%", "15%" }));
        jPanel5.add(jComboInteres, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 120, 30));

        jMonto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####.00"))));
        jMonto.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jMonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jMontoKeyTyped(evt);
            }
        });
        jPanel5.add(jMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 120, 30));

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel14.setText("Moneda");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 150, 20));

        jComboMoneda.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jComboMoneda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C$ - Córdobas", "$ - Dólares" }));
        jPanel5.add(jComboMoneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 130, 30));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 620, 230));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 670, 410));

        jPanel3.setBackground(new java.awt.Color(250, 178, 53));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(7, 81, 74));
        jLabel2.setText("Registrar");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, 60));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 161, 154));
        jLabel3.setText("Nuevo Crédito");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, 60));

        jLabelCod.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabelCod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabelCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 90, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void limpiar() {
        jTextCedula.setText("   -      -     ");
        jMonto.setText("");
        jCantidad.setText("");
    }

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        try {
            if ((jTextCedula.getText().equals("   -      -     "))
                    || (jMonto.getText().equals(""))
                    || (jCantidad.getText().equals(""))) {
                JOptionPane.showMessageDialog(null,
                        "Tiene datos vacíos");
            } else if(jTableGarantias.getRowCount()<0){
                JOptionPane.showMessageDialog(null, "Debe añadir a la tabla al menos una garantía");
            }
            else {
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                Date fecha = formato.parse(jTextFechaActual.getText());
                String cicloPagos = jComboCicloPagos.getSelectedItem().toString();
                float interes = switch (jComboInteres.getSelectedItem().toString()) {
                    case "6%" ->
                        6;
                    case "10" ->
                        10;
                    case "15" ->
                        15;
                    default ->
                        6;
                };
                float monto = Float.parseFloat(jMonto.getText());
                int estado = 1;
                String moneda = switch (jComboMoneda.getSelectedItem().toString()) {
                    case "C$ - Córdobas" ->
                        "Córdobas";
                    case "$ - Dólares" ->
                        "Dólares";
                    default ->
                        "Córdobas";
                };
                int cantidadPagos = Integer.parseInt(jCantidad.getText());
                String cedula = jTextCedula.getText();
               
                Credito cc = new Credito(fecha, cicloPagos, interes, monto, estado,
                        moneda, cantidadPagos, cedula);
                CRUDCredito ccred = new CRUDCredito();
                ccred.CrearCredito(cc);
                
                for (int i = 0; i < modelo.getRowCount(); i++) {
                    int codGarantia = Integer.parseInt(jTableGarantias.getValueAt(i, 0).toString());
                    CreditoGarantia cg = new CreditoGarantia(codGarantia);
                    CRUDCreditosGarantias ccg = new CRUDCreditosGarantias();
                    ccg.CrearCreditoGarantia(cg);
                }
                JOptionPane.showMessageDialog(null, "Datos Guardados correctamente");
            }
        } catch (HeadlessException | NumberFormatException | ParseException e) {
            JOptionPane.showMessageDialog(null, "Erro" + e);

        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed

    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            CRUDGarantia gr = new CRUDGarantia();
            boolean band = true;
            int cod = jComboGarantias.getItemAt(jComboGarantias.getSelectedIndex()).getCodGarantia();
            String nombre = jComboGarantias.getItemAt(jComboGarantias.getSelectedIndex()).getNombreGarantia();
            if (modelo.getRowCount() >= 0) {
                for (int i = 0; i < modelo.getRowCount(); i++) {
                    int dato = Integer.parseInt(jTableGarantias.getValueAt(i, 0).toString());
                    if (cod != dato) {
                    } else {
                        band = false;
                    }
                }
            }
            if (band) {
                datos[0] = String.valueOf(cod);
                datos[1] = nombre;
                modelo.addRow(datos);
                jTableGarantias.setModel(modelo);
            } else {
                JOptionPane.showMessageDialog(null, "Dato ya ha sido agregado");
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (datoSeleccionado >= 0) {
            int fila = jTableGarantias.getSelectedRow();
            modelo.removeRow(fila);
        } else
            JOptionPane.showConfirmDialog(null, "Seleccione el dato a eliminar");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTableGarantiasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableGarantiasMouseClicked
        datoSeleccionado = jTableGarantias.rowAtPoint(evt.getPoint());
    }//GEN-LAST:event_jTableGarantiasMouseClicked

    private void jTextCedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCedulaKeyReleased


    }//GEN-LAST:event_jTextCedulaKeyReleased

    private void jTextCedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextCedulaFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCedulaFocusLost

    private void jMontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMontoKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_jMontoKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CRUDCliente cc = new CRUDCliente();
        jLabelNombres.setText(cc.buscarDatosCliente(jTextCedula.getText()));
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JTextField jCantidad;
    private javax.swing.JComboBox<String> jComboCicloPagos;
    private javax.swing.JComboBox<Garantia> jComboGarantias;
    private javax.swing.JComboBox<String> jComboInteres;
    private javax.swing.JComboBox<String> jComboMoneda;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCod;
    private javax.swing.JLabel jLabelNombres;
    private javax.swing.JFormattedTextField jMonto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableGarantias;
    private javax.swing.JFormattedTextField jTextCedula;
    private javax.swing.JTextField jTextFechaActual;
    // End of variables declaration//GEN-END:variables
}
