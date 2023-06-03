/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.CreditoGarantia;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CRUDCreditosGarantias {
    public final Conexion con = new Conexion();
    public final Connection cn = (Connection) con.conectar();
    
    
      public void CrearCreditoGarantia(CreditoGarantia cg){
       try {
            CallableStatement call = cn.prepareCall("{call CrearCreditoGarantia(?)}");
            call.setInt(1,cg.getCodGarantia());
            call.executeUpdate();
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, e);  
        } 
    }
}
