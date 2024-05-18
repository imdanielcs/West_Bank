
package com.pgy.businesslogic;

public class AccountNumber {
    
    private String tipoCuenta;

    public AccountNumber(int numero, String tipoCuenta) {
        this.numero = numero;
        this.tipoCuenta = tipoCuenta;
        this.saldo = 0;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
    
    private int numero;

    public AccountNumber() {
        
    }

    public AccountNumber(int numero) {
        this.numero = numero;
    }
 
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    public AccountNumber(int numero, int saldo) {
        
        this.numero = numero; 
        this.saldo = 0;
    }
    private int saldo;
    
    public class CuentaAhorro extends AccountNumber {
    
        public CuentaAhorro(int numero, int saldo) {
            super(numero, saldo);
        }
    
    }
    
    public class CuentaCorriente extends AccountNumber {
        
        public CuentaCorriente(int numero, int saldo) {
            super(numero, saldo);
        }
        
    }
    
    @Override
    public String toString() {
        return "Cuenta {" +
                "numero=" + numero +
                ", tipoCuenta='" + tipoCuenta + '\'' +
                '}';}
    
    public void girar (int monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("¡Giro realizado de manera exitosa!");
            System.out.println("Usted tiene un saldo de: " + saldo + " pesos");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
    public void depositar (int monto) {
        if (monto > 0) {
            saldo+=monto;
            System.out.println("¡Depósito realizado de manera exitosa!");
            System.out.println("Usted tiene un saldo actual de " + saldo + " pesos");    
        } else {
            System.out.println("Monto no válido");
        }
    }
}
