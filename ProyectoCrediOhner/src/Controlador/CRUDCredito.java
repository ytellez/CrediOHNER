package Controlador;

import Modelo.Credito;
import java.sql.*;
import javax.swing.JOptionPane;

public class CRUDCredito {

    private final Conexion con = new Conexion();
    private final Connection cn = (Connection) con.conectar();
    
    public void CrearCredito(Credito cr){
       try {
            CallableStatement call = cn.prepareCall("{call CrearCredito(?,?,?,?,?,?,?,?)}");
            call.setString(1, cr.getFecha());
            call.setString(2,cr.getCicloPagos());
            call.setFloat(3,cr.getInteres());
            call.setFloat(4,cr.getMonto());
            call.setInt(5,cr.getEstado());
            call.setString(6, cr.getMoneda());
            call.setInt(7, cr.getCantidadPagos());
            call.setString(8, cr.getCedula());
            call.executeUpdate();
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, e);  
        } 
    }
}

