/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package Vistas.Menu;

import Controlador.Conexion;
import Vistas.formularios.frmCliente;
import Vistas.formularios.frmCredito;
import Vistas.formularios.frmGarantias;
import Vistas.formularios.frmGestionarClientes;
import Vistas.formularios.frmGestionarGarantias;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



/**
 *
 * @author Usuario
 */
public class MDIMenu extends javax.swing.JFrame {

    FondoPanel fondo = new FondoPanel();

    public MDIMenu() {
        initComponents();

        this.setExtendedState(MDIMenu.MAXIMIZED_BOTH);
        this.setTitle("Sistema de Creditos Crediohner");
        this.setLayout(null);

        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        jdpane.setBounds(0, 0, ancho, (alto));

        //this.setContentPane(fondo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpane = new javax.swing.JDesktopPane();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jdpane.setBackground(getBackground());

        jToolBar1.setBackground(new java.awt.Color(250, 178, 53));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        jButton1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/iconos/clienteGrande.png"))); // NOI18N
        jButton1.setText("Clientes");
        jButton1.setToolTipText("Nuevo Cliente");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setPreferredSize(new java.awt.Dimension(90, 92));
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/iconos/creditoGrande.png"))); // NOI18N
        jButton2.setText("Créditos");
        jButton2.setToolTipText("Nuevo Crédito");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setPreferredSize(new java.awt.Dimension(90, 92));
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        jButton3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/iconos/AbonoGrande.png"))); // NOI18N
        jButton3.setText("Abonar");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setMinimumSize(new java.awt.Dimension(90, 92));
        jButton3.setPreferredSize(new java.awt.Dimension(100, 92));
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton3);

        jButton4.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/iconos/ReportesGrandes_1.png"))); // NOI18N
        jButton4.setText("Reportes");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setPreferredSize(new java.awt.Dimension(90, 92));
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton4);

        jButton5.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/iconos/garantia grande.png"))); // NOI18N
        jButton5.setText("Garantías");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton5);

        jdpane.setLayer(jToolBar1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdpaneLayout = new javax.swing.GroupLayout(jdpane);
        jdpane.setLayout(jdpaneLayout);
        jdpaneLayout.setHorizontalGroup(
            jdpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE)
        );
        jdpaneLayout.setVerticalGroup(
            jdpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpaneLayout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 379, Short.MAX_VALUE))
        );

        getContentPane().add(jdpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        fileMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/iconos/catalogo.png"))); // NOI18N
        fileMenu.setMnemonic('f');
        fileMenu.setText("Catálogos");
        fileMenu.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        fileMenu.setMaximumSize(new java.awt.Dimension(160, 32767));
        fileMenu.setPreferredSize(new java.awt.Dimension(130, 31));

        openMenuItem.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        openMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/iconos/nuevoClientePequeño.png"))); // NOI18N
        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Clientes");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);

        saveMenuItem.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        saveMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/iconos/usuarioPequeño.png"))); // NOI18N
        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Usuarios");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        saveAsMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/iconos/garantiaPequeño.png"))); // NOI18N
        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Garantías");
        saveAsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveAsMenuItem);

        menuBar.add(fileMenu);

        editMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/iconos/OperacionesPequeño.png"))); // NOI18N
        editMenu.setMnemonic('e');
        editMenu.setText("Operaciones");
        editMenu.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        editMenu.setMaximumSize(new java.awt.Dimension(160, 32767));
        editMenu.setPreferredSize(new java.awt.Dimension(130, 31));

        cutMenuItem.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        cutMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/iconos/prestamoPequeño.png"))); // NOI18N
        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Préstamos");
        cutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(cutMenuItem);

        menuBar.add(editMenu);

        helpMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/iconos/ReportesPequeños.png"))); // NOI18N
        helpMenu.setMnemonic('h');
        helpMenu.setText("Reportes");
        helpMenu.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        helpMenu.setMaximumSize(new java.awt.Dimension(160, 32767));
        helpMenu.setMinimumSize(new java.awt.Dimension(130, 31));

        contentMenuItem.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Plan de Pago");
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("Préstamos Activos");
        helpMenu.add(aboutMenuItem);

        jMenuItem1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jMenuItem1.setText("Clientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        helpMenu.add(jMenuItem1);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        frmCliente cliente = new frmCliente();
        int x = (jdpane.getWidth() / 2) - cliente.getWidth() / 2;
        int y = ((jdpane.getHeight() / 2) - cliente.getHeight() / 2) - 10;
        cliente.setLocation(x, y);
        jdpane.add(cliente);
        frmCliente.jButtonActualizar.setVisible(false);
        cliente.show();
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        frmGestionarClientes cliente = new frmGestionarClientes();
        int x = (jdpane.getWidth() / 2) - cliente.getWidth() / 2;
        int y = (jdpane.getHeight() / 2) - cliente.getHeight() / 2;
        cliente.setLocation(x, y);
        jdpane.add(cliente);
        cliente.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cutMenuItemActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveMenuItemActionPerformed

    private void saveAsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsMenuItemActionPerformed
        frmGarantias cliente = new frmGarantias();
        int x = (jdpane.getWidth() / 2) - cliente.getWidth() / 2;
        int y = ((jdpane.getHeight() / 2) - cliente.getHeight() / 2) - 10;
        cliente.setLocation(x, y);
        jdpane.add(cliente);
        frmGarantias.jButtonActualizar.setVisible(false);
        cliente.show();

    }//GEN-LAST:event_saveAsMenuItemActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        frmGestionarGarantias obj = new frmGestionarGarantias();
        int x = (jdpane.getWidth() / 2) - obj.getWidth() / 2;
        int y = ((jdpane.getHeight() / 2) - obj.getHeight() / 2) - 10;
        obj.setLocation(x, y);
        jdpane.add(obj);
        obj.show();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        frmCredito obj = new frmCredito();
        int x = (jdpane.getWidth() / 2) - obj.getWidth() / 2;
        int y = ((jdpane.getHeight() / 2) - obj.getHeight() / 2) - 10;
        obj.setLocation(x, y);
        jdpane.add(obj);
        obj.show();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(MDIMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDIMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDIMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDIMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MDIMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JToolBar jToolBar1;
    public static javax.swing.JDesktopPane jdpane;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/Vistas/iconos/fondo.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);

        }
    }
}
