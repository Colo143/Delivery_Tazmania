/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controlador.control_Usuario;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


public final class vLogin extends javax.swing.JFrame {

    /**
     * Creates new form vLogin
     */
    public vLogin() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jEtiqTitulo_Login = new javax.swing.JLabel();
        jEtiqNom_Login = new javax.swing.JLabel();
        jTextNomUser_Login = new javax.swing.JTextField();
        jEtiqPass_Login = new javax.swing.JLabel();
        jBotonIngreso_Login = new javax.swing.JButton();
        jBotonSalir_Login = new javax.swing.JButton();
        jTextoPass_Login = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("jFLogin"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jEtiqTitulo_Login.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        jEtiqTitulo_Login.setText("Bienvenido!");
        getContentPane().add(jEtiqTitulo_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 200, 40));

        jEtiqNom_Login.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jEtiqNom_Login.setText("Nombre Usuario");
        getContentPane().add(jEtiqNom_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 200, 30));

        jTextNomUser_Login.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jTextNomUser_Login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextNomUser_LoginKeyPressed(evt);
            }
        });
        getContentPane().add(jTextNomUser_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 250, 40));

        jEtiqPass_Login.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jEtiqPass_Login.setText("Contraseña");
        getContentPane().add(jEtiqPass_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 130, 40));

        jBotonIngreso_Login.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jBotonIngreso_Login.setText("Ingresar");
        jBotonIngreso_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonIngreso_LoginActionPerformed(evt);
            }
        });
        jBotonIngreso_Login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBotonIngreso_LoginKeyPressed(evt);
            }
        });
        getContentPane().add(jBotonIngreso_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 100, 40));

        jBotonSalir_Login.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jBotonSalir_Login.setText("Salir");
        jBotonSalir_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonSalir_LoginActionPerformed(evt);
            }
        });
        jBotonSalir_Login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBotonSalir_LoginKeyPressed(evt);
            }
        });
        getContentPane().add(jBotonSalir_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 100, 40));

        jTextoPass_Login.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jTextoPass_Login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextoPass_LoginKeyPressed(evt);
            }
        });
        getContentPane().add(jTextoPass_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 250, 40));

        setSize(new java.awt.Dimension(275, 494));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jBotonIngreso_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonIngreso_LoginActionPerformed
        control_Usuario usuario = new control_Usuario();
        usuario.ExistenciaUsuarios();

        if (jTextNomUser_Login.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un Nombre de Usuario!");
            return;
        }

        if (jTextoPass_Login.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar la Contraseña!");
            return;
        }

        if (usuario.VerificarInicioSesion() == true) {
            this.setVisible(false);
        }else{
            this.setVisible(true);
        }
    }//GEN-LAST:event_jBotonIngreso_LoginActionPerformed

    private void jBotonSalir_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonSalir_LoginActionPerformed
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_jBotonSalir_LoginActionPerformed

    private void jTextNomUser_LoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNomUser_LoginKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextoPass_Login.requestFocus();
        }

    }//GEN-LAST:event_jTextNomUser_LoginKeyPressed

    private void jTextoPass_LoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextoPass_LoginKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jBotonIngreso_Login.requestFocus();
        }

    }//GEN-LAST:event_jTextoPass_LoginKeyPressed

    private void jBotonIngreso_LoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBotonIngreso_LoginKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            control_Usuario usuario = new control_Usuario();
            usuario.ExistenciaUsuarios();

            if (jTextNomUser_Login.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Debes ingresar un Nombre de Usuario!");
                return;
            }

            if (jTextoPass_Login.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Debes ingresar la Contraseña!");
                return;
            }

            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                if (usuario.VerificarInicioSesion() == true) {
                    this.setVisible(false);
                } else {
                    this.setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_jBotonIngreso_LoginKeyPressed

    private void jBotonSalir_LoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBotonSalir_LoginKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.dispose();
            System.exit(0);
        }
    }//GEN-LAST:event_jBotonSalir_LoginKeyPressed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                control_Usuario usuario = new control_Usuario();

                int contar = usuario.ExistenciaUsuarios();
                if (contar == 0) {
                    JOptionPane.showMessageDialog(null, "Hay que crear un Administrador");

                    vGestion_Usuarios usuarios = new vGestion_Usuarios();
                    
                    vLogin login = new vLogin();
                    
                    login.getContentPane().add(usuarios);
                    
                    vGestion_Usuarios.jComboAcceso_Usuario.setEnabled(false);
                    vGestion_Usuarios.jComboEstado_Usuario.setSelectedIndex(1);
                    vGestion_Usuarios.jComboEstado_Usuario.setVisible(false);
                    vGestion_Usuarios.jBotonSalir_Usuario.setVisible(false);
                    
                    new vLogin().setVisible(false);

                } else {
                    new vLogin().setVisible(true);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBotonIngreso_Login;
    private javax.swing.JButton jBotonSalir_Login;
    private javax.swing.JLabel jEtiqNom_Login;
    private javax.swing.JLabel jEtiqPass_Login;
    private javax.swing.JLabel jEtiqTitulo_Login;
    public static javax.swing.JTextField jTextNomUser_Login;
    public static javax.swing.JPasswordField jTextoPass_Login;
    // End of variables declaration//GEN-END:variables
}
