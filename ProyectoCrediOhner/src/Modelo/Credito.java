/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class Credito {
    String fecha;
    String cicloPagos;
    float interes;
    float monto;
    int estado;
    String moneda;
    int cantidadPagos;
    String cedula;

    public Credito(String fecha, String cicloPagos, float interes, float monto, int estado, String moneda, int cantidadPagos, String cedula) {
        this.fecha = fecha;
        this.cicloPagos = cicloPagos;
        this.interes = interes;
        this.monto = monto;
        this.estado = estado;
        this.moneda = moneda;
        this.cantidadPagos = cantidadPagos;
        this.cedula = cedula;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCicloPagos() {
        return cicloPagos;
    }

    public void setCicloPagos(String cicloPagos) {
        this.cicloPagos = cicloPagos;
    }

    public float getInteres() {
        return interes;
    }

    public void setInteres(float interes) {
        this.interes = interes;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public int getCantidadPagos() {
        return cantidadPagos;
    }

    public void setCantidadPagos(int cantidadPagos) {
        this.cantidadPagos = cantidadPagos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

   
}
