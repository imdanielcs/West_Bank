
package com.pgy.businesslogic;

import com.pgy.businesslogic.AccountNumber;

public class Cliente {
    
    private String rut;

    public Cliente(String rut) {
        this.rut = rut;
    }

    public String getRut() {
        return rut;
    }

    @Override
    public String toString() {
        return "Cliente{" + "rut=" + rut + '}';
    }

    public void setRut(String rut) {
        this.rut = rut;
    }
//    private String rut;
//    private String name;
//
//    public String getRut() {
//        return rut;
//    }
//
//    public void setRut(String rut) {
//        this.rut = rut;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getApellidoPaterno() {
//        return apellidoPaterno;
//    }
//
//    public void setApellidoPaterno(String apellidoPaterno) {
//        this.apellidoPaterno = apellidoPaterno;
//    }
//
//    public String getApellidoMaterno() {
//        return apellidoMaterno;
//    }
//
//    public void setApellidoMaterno(String apellidoMaterno) {
//        this.apellidoMaterno = apellidoMaterno;
//    }
//
//    public String getDomicilio() {
//        return domicilio;
//    }
//
//    public void setDomicilio(String domicilio) {
//        this.domicilio = domicilio;
//    }
//
//    public String getComuna() {
//        return comuna;
//    }
//
//    public void setComuna(String comuna) {
//        this.comuna = comuna;
//    }
//
//    public int getTelefono() {
//        return telefono;
//    }
//
//    public void setTelefono(int telefono) {
//        this.telefono = telefono;
//    }
//
//    public AccountNumber getCuenta() {
//        return cuenta;
//    }
//
//    public void setCuenta(AccountNumber cuenta) {
//        this.cuenta = cuenta;
//    }
//
//    public Cliente (int rut, 
//            String name, 
//            String apellidoPaterno, 
//            String apellidoMaterno, 
//            String domicilio, 
//            String comuna, 
//            String telefono, 
//            AccountNumber cuenta) { 
//        
//    }
//    
//    public String getTipoCuenta() {
//        return cuenta.getTipoCuenta();
//    }
//
//    public void setTipoCuenta(String tipoCuenta) {
//        cuenta.setTipoCuenta(tipoCuenta);
//    }
//
//    public Cliente(String rut, String name, String apellidoPaterno, String apellidoMaterno, String domicilio, String comuna, int telefono, AccountNumber cuenta) {
//        this.rut = rut;
//        this.name = name;
//        this.apellidoPaterno = apellidoPaterno;
//        this.apellidoMaterno = apellidoMaterno;
//        this.domicilio = domicilio;
//        this.comuna = comuna;
//        this.telefono = telefono;
//        this.cuenta = cuenta;
//    }
//    
//    public Cliente() {
//        this.rut = rut;
//        this.name = name;
//        this.apellidoPaterno = apellidoPaterno;
//        this.apellidoMaterno = apellidoMaterno;
//        this.domicilio = domicilio;
//        this.comuna = comuna;
//        this.telefono = telefono;
//        this.cuenta = cuenta;
//    }
//    @Override
//    public String toString() {
//    return "Cliente{" +
//            "rut='" + rut + '\'' +
//            ", nombre='" + name + '\'' +
//            ", apellidoPaterno='" + apellidoPaterno + '\'' +
//            ", apellidoMaterno='" + apellidoMaterno + '\'' +
//            ", telefono=" + telefono +
//            ", domicilio='" + domicilio + '\'' +
//            ", comuna='" + comuna + '\'' +
//            ", cuenta=" + cuenta +
//            '}';
//       }
//    private String apellidoPaterno;
//    private String apellidoMaterno;
//    private String domicilio;
//    private String comuna;
//    private int telefono;
//    private AccountNumber cuenta;
}