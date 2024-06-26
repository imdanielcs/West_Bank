/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.pgy.ui;
import com.pgy.businesslogic.Cliente;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.pgy.dataaccess.Conexion;
import javax.swing.JOptionPane;


/**
 *
 * @author imdan
 */
public class VentanaBuscarCliente extends javax.swing.JFrame {
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
    /**
     * Creates new form VentanaBuscarCliente
     */
    public VentanaBuscarCliente() {
        initComponents();
        this.setSize(600,600);
        this.setTitle("West Bank");
        this.setLocationRelativeTo(null);
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    public VentanaBuscarCliente(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
        initComponents();
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

        lblBuscarClientes = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtRutBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblDomicilio = new javax.swing.JLabel();
        lblApellidoPaterno = new javax.swing.JLabel();
        lblApellidoMaterno = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblComuna = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        txtDv = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblBuscarClientes.setText("Buscar Clientes");

        jLabel1.setText("Ingrese rut del cliente");

        txtRutBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRutBuscarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar ");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        lblDomicilio.setText("Domicilio: ");
        lblDomicilio.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                lblDomicilioInputMethodTextChanged(evt);
            }
        });

        lblApellidoPaterno.setText("Apellido Paterno: ");

        lblApellidoMaterno.setText("Apellido Materno: ");

        lblNombre.setText("Nombre: ");
        lblNombre.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                lblNombreInputMethodTextChanged(evt);
            }
        });

        lblComuna.setText("Comuna: ");
        lblComuna.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                lblComunaInputMethodTextChanged(evt);
            }
        });

        lblTelefono.setText("Teléfono: ");

        jLabel4.setText("Datos Cliente: ");

        jLabel6.setText("Datos Cuenta Cliente");

        lblNumero.setText("Número: ");

        lblTipo.setText("Tipo:");

        lblSaldo.setText("Saldo:");

        jLabel7.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblBuscarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRutBuscar))
                        .addGap(7, 7, 7)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDv, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(lblNombre))
                            .addComponent(jLabel2))
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBuscar)
                        .addGap(31, 31, 31)
                        .addComponent(btnRegresar)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblApellidoPaterno)
                            .addComponent(lblApellidoMaterno)
                            .addComponent(jLabel4))
                        .addGap(35, 35, 35)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTelefono)
                            .addComponent(lblDomicilio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblComuna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumero)
                            .addComponent(lblTipo)
                            .addComponent(lblSaldo))
                        .addContainerGap(120, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(92, 92, 92))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lblBuscarClientes)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRutBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre)
                    .addComponent(lblDomicilio)
                    .addComponent(lblNumero)
                    .addComponent(txtDv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnRegresar)
                    .addComponent(lblApellidoPaterno)
                    .addComponent(lblComuna)
                    .addComponent(lblTipo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidoMaterno)
                    .addComponent(jLabel3)
                    .addComponent(lblTelefono)
                    .addComponent(lblSaldo))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRutBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRutBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRutBuscarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String rut = txtRutBuscar.getText();
//        Cliente clienteEncontrado = buscarCliente(rut);
//        if (clienteEncontrado != null) {
//        lblNombre.setText("Nombre: " + clienteEncontrado.getName());
//        lblApellidoPaterno.setText("Apellido Paterno: " + clienteEncontrado.getApellidoPaterno());
//        lblApellidoMaterno.setText("Apellido Materno: " + clienteEncontrado.getApellidoMaterno());
//        lblDomicilio.setText("Domicilio: " + clienteEncontrado.getDomicilio());
//        lblComuna.setText("Comuna: " + clienteEncontrado.getComuna());
//        lblTelefono.setText("Telefono: " + clienteEncontrado.getTelefono());
//        lblNumero.setText("Número: " + clienteEncontrado.getCuenta().getNumero());
//        lblTipo.setText("Tipo: " + clienteEncontrado.getTipoCuenta());
//        lblSaldo.setText("Saldo: " +clienteEncontrado.getCuenta().getSaldo());
//        } else {
//        System.out.println("Cliente no encontrado");
//        }  
//        // Obtener la conexión a la base de datos
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
                        // Mostrar los datos en la interfaz gráfica
                        lblNombre.setText("Nombre: " + resultSet.getString("nombre"));
                        lblApellidoPaterno.setText("Apellido Paterno: " + resultSet.getString("apellido_paterno"));
                        lblApellidoMaterno.setText("Apellido Materno: " + resultSet.getString("apellido_materno"));
                        lblDomicilio.setText("Domicilio: " + resultSet.getString("domicilio"));
                        lblComuna.setText("Comuna: " + resultSet.getString("comuna"));
                        lblTelefono.setText("Teléfono: " + resultSet.getString("telefono"));
                        lblNumero.setText("Número: " + resultSet.getString("numero"));
                        lblTipo.setText("Tipo: " + resultSet.getString("tipo_cuenta"));
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
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
        VentanaBuscarCliente.this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void lblDomicilioInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_lblDomicilioInputMethodTextChanged
        
    }//GEN-LAST:event_lblDomicilioInputMethodTextChanged

    private void lblNombreInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_lblNombreInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_lblNombreInputMethodTextChanged

    private void lblComunaInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_lblComunaInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_lblComunaInputMethodTextChanged

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
            java.util.logging.Logger.getLogger(VentanaBuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaBuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaBuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaBuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaBuscarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblApellidoMaterno;
    private javax.swing.JLabel lblApellidoPaterno;
    private javax.swing.JLabel lblBuscarClientes;
    private javax.swing.JLabel lblComuna;
    private javax.swing.JLabel lblDomicilio;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JTextField txtDv;
    private javax.swing.JTextField txtRutBuscar;
    // End of variables declaration//GEN-END:variables
}
