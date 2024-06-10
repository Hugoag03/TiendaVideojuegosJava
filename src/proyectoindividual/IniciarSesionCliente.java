/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoindividual;

import com.sun.awt.*;
import java.awt.*;
import java.awt.geom.*;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Hugo
 */
public class IniciarSesionCliente extends javax.swing.JFrame {

    /**
     * Creates new form IniciarSesion
     */
    public IniciarSesionCliente() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        ImageIcon imagen = new ImageIcon("src/images/gameverse.png");
        LabelLogo.setIcon(imagen);
        PanelIniciarSesion.setBackground(Color.white);
        setIconImage(getIconImage());
       
        ImageIcon icono1 = new ImageIcon("src/images/Nintendo.png");
        int anchoLabel = LabelFondo.getWidth();
        int altoLabel = LabelFondo.getHeight();
        Image imagenRedimensionada1 = icono1.getImage().getScaledInstance(anchoLabel, altoLabel, Image.SCALE_SMOOTH);
        ImageIcon iconoRedimensionado1 = new ImageIcon(imagenRedimensionada1);
        LabelFondo.setIcon(iconoRedimensionado1);
        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 300, 300);
        AWTUtilities.setWindowShape(this, forma);
        
        setVisible(true);
    }

    @Override
    public Image getIconImage() {
        Image miIcono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/icono.png"));
        return miIcono;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelIniciarSesion = new javax.swing.JPanel();
        LabelLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nombreUsu = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BotonIniciarSesion = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        BotonVolver = new javax.swing.JButton();
        contraUsu = new javax.swing.JPasswordField();
        mostrarContraseña = new javax.swing.JButton();
        BotonHOME = new javax.swing.JButton();
        LabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1445, 665));

        PanelIniciarSesion.setPreferredSize(new java.awt.Dimension(1440, 660));
        PanelIniciarSesion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        PanelIniciarSesion.add(LabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 700, 160));

        jLabel1.setText("Usuario:");
        PanelIniciarSesion.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, -1, 30));
        PanelIniciarSesion.add(nombreUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, 470, 30));

        jLabel2.setText("Contraseña:");
        PanelIniciarSesion.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, -1, 30));

        BotonIniciarSesion.setBackground(java.awt.Color.red);
        BotonIniciarSesion.setForeground(java.awt.Color.white);
        BotonIniciarSesion.setText("Iniciar sesión");
        BotonIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonIniciarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonIniciarSesionMouseExited(evt);
            }
        });
        BotonIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIniciarSesionActionPerformed(evt);
            }
        });
        PanelIniciarSesion.add(BotonIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 510, 130, 40));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("Iniciar sesión");
        PanelIniciarSesion.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, -1, -1));

        BotonVolver.setBackground(java.awt.Color.white);
        BotonVolver.setForeground(java.awt.Color.red);
        BotonVolver.setText("Volver");
        BotonVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonVolverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonVolverMouseExited(evt);
            }
        });
        BotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverActionPerformed(evt);
            }
        });
        PanelIniciarSesion.add(BotonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 510, 120, 40));
        PanelIniciarSesion.add(contraUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 440, 400, 30));

        mostrarContraseña.setText("...");
        PanelIniciarSesion.add(mostrarContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 440, 40, 30));

        BotonHOME.setFont(new java.awt.Font("Dialog", 1, 38)); // NOI18N
        BotonHOME.setForeground(java.awt.Color.white);
        BotonHOME.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonHOME.setBorderPainted(false);
        BotonHOME.setContentAreaFilled(false);
        BotonHOME.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonHOME.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonHOMEMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonHOMEMouseExited(evt);
            }
        });
        BotonHOME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonHOMEActionPerformed(evt);
            }
        });
        PanelIniciarSesion.add(BotonHOME, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 450, 40, 50));
        PanelIniciarSesion.add(LabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, 1460, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelIniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 1450, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelIniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIniciarSesionActionPerformed
        // TODO add your handling code here:

        if (nombreUsu.getText().isEmpty() || contraUsu.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debes rellenar ambos valores", "Error", JOptionPane.WARNING_MESSAGE);
        } else if (!nombreUsu.getText().isEmpty() && !contraUsu.getText().isEmpty()) {
            try {
                Connection cn = conexion.Conexion.conectar();
                String sql = "SELECT ID, NombreUsuario, Contraseña FROM clientes WHERE NombreUsuario = ? AND Contraseña = ?";
                PreparedStatement enviarConsultas = cn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

                enviarConsultas.setString(1, nombreUsu.getText());
                enviarConsultas.setString(2, contraUsu.getText());
                ResultSet resultado = enviarConsultas.executeQuery();
                if (resultado.next()) {
                    nombreUsuario = resultado.getString("NombreUsuario");
                    contraseña = resultado.getString("Contraseña");
                    ID = resultado.getInt("ID");
                    RegistrarTrabajador.esTrabajador = false;
                    
                    cogerNombreUsu = true;
                     cn.close();
                    this.dispose();
                    MenuPrincipalCliente menu = new MenuPrincipalCliente();
                } else {
                    JOptionPane.showMessageDialog(null, "Los valores que has introducido no coinciden con los registros", "Error", JOptionPane.WARNING_MESSAGE);
                }
                
                    
            } catch (SQLException e) {
                System.err.println("Error al obtener los datos" + e.getMessage());
            }
        }

    }//GEN-LAST:event_BotonIniciarSesionActionPerformed

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Inicio inicio = new Inicio();
    }//GEN-LAST:event_BotonVolverActionPerformed

    private void BotonHOMEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonHOMEMouseEntered
        // TODO add your handling code here:
        BotonHOME.setOpaque(false);
        BotonHOME.setForeground(Color.red);
        BotonHOME.setText("X");
    }//GEN-LAST:event_BotonHOMEMouseEntered

    private void BotonHOMEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonHOMEMouseExited
        // TODO add your handling code here:
        BotonHOME.setOpaque(false);
        BotonHOME.setContentAreaFilled(false);
        BotonHOME.setText("");
    }//GEN-LAST:event_BotonHOMEMouseExited

    private void BotonHOMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonHOMEActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_BotonHOMEActionPerformed

    private void BotonVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonVolverMouseEntered
        // TODO add your handling code here:
        BotonVolver.setBackground(new Color(180, 180, 180));
    }//GEN-LAST:event_BotonVolverMouseEntered

    private void BotonVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonVolverMouseExited
        // TODO add your handling code here:
        BotonVolver.setBackground(Color.white);
    }//GEN-LAST:event_BotonVolverMouseExited

    private void BotonIniciarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonIniciarSesionMouseEntered
        // TODO add your handling code here:
        BotonIniciarSesion.setBackground(new Color(255, 102, 102));
    }//GEN-LAST:event_BotonIniciarSesionMouseEntered

    private void BotonIniciarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonIniciarSesionMouseExited
        // TODO add your handling code here:
        BotonIniciarSesion.setBackground(Color.red);
    }//GEN-LAST:event_BotonIniciarSesionMouseExited

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
            java.util.logging.Logger.getLogger(IniciarSesionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IniciarSesionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IniciarSesionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IniciarSesionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniciarSesionCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonHOME;
    private javax.swing.JButton BotonIniciarSesion;
    private javax.swing.JButton BotonVolver;
    private javax.swing.JLabel LabelFondo;
    private javax.swing.JLabel LabelLogo;
    private javax.swing.JPanel PanelIniciarSesion;
    private javax.swing.JPasswordField contraUsu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton mostrarContraseña;
    private javax.swing.JTextField nombreUsu;
    // End of variables declaration//GEN-END:variables

    public static String nombreUsuario;
    private String contraseña;
    private JTextField campoTexto;
    private boolean mostrarContraseñas = false;
    public static int ID;
    public static boolean cogerNombreUsu = false;
}
