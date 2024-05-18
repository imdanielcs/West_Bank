/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.pgy.ui;
import com.pgy.businesslogic.Cliente;
import com.pgy.dataaccess.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author imdan
 */


public class VentanaDepositar extends javax.swing.JFrame {
    public ArrayList<Cliente> clientes; 
    public Cliente buscarCliente(String rut) {
        for (Cliente cliente : clientes) {
            if (cliente.getRut().equals(rut)) {
                System.out.println("Cliente encontrado");
                return cliente; 
            }
        }
        System.out.println("Cliente no encontrado");
        return null; 
       
    }
    
    public int depositar (int monto, int saldo) {
        if (monto > 0) {
            saldo+=monto;
            System.out.println("¡Depósito realizado de manera exitosa!");
            System.out.println("Usted tiene un saldo actual de " + saldo + " pesos"); 
            return saldo;
        } else {
            System.out.println("Monto no válido");
        }
        return 0;
    }
    
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    /**
     * Creates new form VentanaBuscar
     */
    public VentanaDepositar() {
        initComponents();
        this.setSize(600,600);
        this.setTitle("West Bank");
        this.setLocationRelativeTo(null);
    }
    public VentanaDepositar(ArrayList<Cliente> clientes) {
        initComponents();
        this.setClientes(clientes);
        this.setSize(600,600);
        this.setTitle("West Bank");
        this.setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtRutBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lblTipo = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        btnDepositar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtDv = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Buscar Cliente");

        jLabel2.setText("Ingrese rut del cliente:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblTipo.setText("Tipo de cuenta:");

        lblSaldo.setText("Saldo:");

        jLabel5.setText("Ingrese el monto que desea depositar");

        btnDepositar.setText("Depositar");
        btnDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositarActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jLabel3.setText("-");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDepositar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                    .addComponent(txtMonto)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lblTipo)
                            .addComponent(lblSaldo)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtRutBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDv, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRutBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtDv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSaldo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDepositar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegresar)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String rut = txtRutBuscar.getText();
        Connection conexion = Conexion.obtenerConexion();
        if (conexion == null) {
            JOptionPane.showMessageDialog(this, "Error al conectar con la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            // Consulta SQL para obtener los datos del cliente por su rut
            String consulta = "SELECT * FROM cliente WHERE rut = ?";
            try (PreparedStatement preparedStatement = conexion.prepareStatement(consulta)) {
                preparedStatement.setString(1, rut);

                // Ejecutar la consulta
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    // Verificar si se encontró un cliente
                    if (resultSet.next()) {
                        lblTipo.setText("Tipo de cuenta: " + resultSet.getString("tipo_cuenta"));
                        lblSaldo.setText("Saldo: " + resultSet.getString("saldo"));
                    } else {
                        JOptionPane.showMessageDialog(this, "Cliente no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al ejecutar la consulta.", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            // Cerrar la conexión
            Conexion.cerrarConexion(conexion);
        }
//        Cliente clienteEncontrado = buscarCliente(rut);
//        if (clienteEncontrado != null) {
//            lblTipo.setText("Tipo: " + clienteEncontrado.getTipoCuenta());
//            lblSaldo.setText("Saldo: " +clienteEncontrado.getCuenta().getSaldo());
//        }   else {
//        System.out.println("Cliente no encontrado");
//        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarActionPerformed
        String rut = txtRutBuscar.getText();
        String montoTexto = txtMonto.getText();
    
    // Validar que el monto sea un número válido
    if (!esNumeroValido(montoTexto)) {
        JOptionPane.showMessageDialog(this, "Ingrese un monto válido.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    int monto = Integer.parseInt(montoTexto);
    
    // Obtener conexión a la base de datos
    Connection conexion = Conexion.obtenerConexion();
    
    if (conexion == null) {
        JOptionPane.showMessageDialog(this, "Error al conectar con la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        // Consulta SQL para obtener el saldo actual del cliente
        String consultaSaldo = "SELECT saldo FROM cliente WHERE rut = ?";
        try (PreparedStatement preparedStatementSaldo = conexion.prepareStatement(consultaSaldo)) {
            preparedStatementSaldo.setString(1, rut);

            // Ejecutar la consulta para obtener el saldo actual
            try (ResultSet resultSetSaldo = preparedStatementSaldo.executeQuery()) {
                // Verificar si se encontró un cliente
                if (resultSetSaldo.next()) {
                    // Obtener el saldo actual
                    int saldoActual = resultSetSaldo.getInt("saldo");

                    // Calcular el nuevo saldo después del depósito
                    int nuevoSaldo = saldoActual + monto;

                    // Consulta SQL para actualizar el saldo del cliente
                    String consultaActualizarSaldo = "UPDATE cliente SET saldo = ? WHERE rut = ?";
                    try (PreparedStatement preparedStatementActualizarSaldo = conexion.prepareStatement(consultaActualizarSaldo)) {
                        preparedStatementActualizarSaldo.setInt(1, nuevoSaldo);
                        preparedStatementActualizarSaldo.setString(2, rut);

                        
                        int filasAfectadas = preparedStatementActualizarSaldo.executeUpdate();

                       
                        if (filasAfectadas > 0) {
                            JOptionPane.showMessageDialog(this, "Depósito realizado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(this, "No se pudo realizar el depósito. Cliente no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Cliente no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al ejecutar la consulta.", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
        // Cerrar la conexión
        Conexion.cerrarConexion(conexion);
        }
    }

    
        private boolean esNumeroValido(String cadena) {
    try {
        Integer.parseInt(cadena);
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
//        Cliente clienteEncontrado = buscarCliente(rut);
//        String montoTexto = txtMonto.getText();
//    
//        if (clienteEncontrado != null) {
//            try {
//                int monto = Integer.parseInt(montoTexto);
//                
//                int saldoActual = clienteEncontrado.getCuenta().getSaldo();
//            
//                
//                int nuevoSaldo = depositar(monto, saldoActual);
//            
//                
//                clienteEncontrado.getCuenta().setSaldo(nuevoSaldo);
//            
//                
//                System.out.println("Cliente actualizado: " + clienteEncontrado);
//                JOptionPane.showMessageDialog(this, "Depósito realizado con éxito. Nuevo saldo: " + nuevoSaldo + " pesos", "Depósito", JOptionPane.INFORMATION_MESSAGE);
//            } catch (NumberFormatException e) {
//                System.out.println("Error: Ingresa un número entero válido");
//        }
//    }
//        
    }//GEN-LAST:event_btnDepositarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
        VentanaDepositar.this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaDepositar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaDepositar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaDepositar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaDepositar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaDepositar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnDepositar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JTextField txtDv;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtRutBuscar;
    // End of variables declaration//GEN-END:variables
}