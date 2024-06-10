/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoindividual;

import com.sun.awt.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
import java.io.*;
import java.sql.*;
import java.util.*;
import javax.imageio.*;
import javax.swing.*;

/**
 *
 * @author Hugo
 */
public class RegistrarTrabajador extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarTrabajador
     */
    public RegistrarTrabajador() {
        initComponents();
        ImageIcon imagen = new ImageIcon("src/images/gameverse.png");
        LabelLogo.setIcon(imagen);
        setLocationRelativeTo(null);
        setResizable(false);

        PanelRegistro.setBackground(Color.white);
        RellenarPais.setBackground(Color.white);
        BotonRegistro.setBackground(Color.red);
        BotonVolver.setBackground(Color.white);
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

        RellenarPuesto = new javax.swing.ButtonGroup();
        PanelRegistro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        RellenarApellidos = new javax.swing.JTextField();
        RellenarDNI = new javax.swing.JTextField();
        RellenarTelefono = new javax.swing.JTextField();
        RellenarNombre = new javax.swing.JTextField();
        BotonRegistro = new javax.swing.JButton();
        RellenarPais = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        RellenarCiudad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        LabelLogo = new javax.swing.JLabel();
        BotonVolver = new javax.swing.JButton();
        ButtonAdmin = new javax.swing.JRadioButton();
        ButtonGerente = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        BotonHOME = new javax.swing.JButton();
        LabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1435, 695));

        PanelRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Rellene los datos para registrarse");
        PanelRegistro.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, -1, 52));

        jLabel2.setText("Nombre:");
        PanelRegistro.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, -1, -1));

        jLabel3.setText("Apellidos:");
        PanelRegistro.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, -1, -1));

        jLabel4.setText("DNI:");
        PanelRegistro.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, -1, -1));

        jLabel5.setText("País:");
        PanelRegistro.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 530, -1, -1));
        PanelRegistro.add(RellenarApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, 160, -1));

        RellenarDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RellenarDNIActionPerformed(evt);
            }
        });
        PanelRegistro.add(RellenarDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, 160, -1));

        RellenarTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RellenarTelefonoActionPerformed(evt);
            }
        });
        PanelRegistro.add(RellenarTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 420, 160, -1));

        RellenarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RellenarNombreActionPerformed(evt);
            }
        });
        PanelRegistro.add(RellenarNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 160, -1));

        BotonRegistro.setForeground(java.awt.Color.white);
        BotonRegistro.setText("Registrar");
        BotonRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonRegistroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonRegistroMouseExited(evt);
            }
        });
        BotonRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistroActionPerformed(evt);
            }
        });
        PanelRegistro.add(BotonRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 550, 90, 40));

        RellenarPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "España", "Inglaterra", "Alemania", "Francia" }));
        RellenarPais.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RellenarPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RellenarPaisActionPerformed(evt);
            }
        });
        PanelRegistro.add(RellenarPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 550, 160, 30));

        jLabel7.setText("Puesto:");
        PanelRegistro.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 470, -1, -1));
        PanelRegistro.add(RellenarCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 340, 160, -1));

        jLabel8.setText("Ciudad:");
        PanelRegistro.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 320, -1, -1));
        PanelRegistro.add(LabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 710, 140));

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
        PanelRegistro.add(BotonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 560, 70, 30));

        ButtonAdmin.setBackground(java.awt.Color.white);
        RellenarPuesto.add(ButtonAdmin);
        ButtonAdmin.setText("Administrador");
        PanelRegistro.add(ButtonAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 490, -1, -1));

        ButtonGerente.setBackground(java.awt.Color.white);
        RellenarPuesto.add(ButtonGerente);
        ButtonGerente.setText("Gerente");
        PanelRegistro.add(ButtonGerente, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 490, -1, -1));

        jLabel9.setText("Contacto:");
        PanelRegistro.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 400, 60, -1));

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
        PanelRegistro.add(BotonHOME, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 470, 40, 50));
        PanelRegistro.add(LabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -40, 1450, 740));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RellenarDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RellenarDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RellenarDNIActionPerformed

    private void RellenarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RellenarNombreActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_RellenarNombreActionPerformed

    public static BufferedImage fotoSeleccionada;

    private void BotonRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistroActionPerformed
        // TODO add your handling code here:
        String patronDNI = "\\d{8}[A-HJ-NP-TV-Z]";
        String patronContacto = "\\d+";
        String patronNoNums = "[a-zA-ZáéíóúÁÉÍÓÚñÑüÜ\\s]+";
        Trabajador trabajador = new Trabajador();

        Enumeration<AbstractButton> buttons = RellenarPuesto.getElements();

        Connection cn = conexion.Conexion.conectar();
        // Verificar si el DNI ya existe en la base de datos
        String consul1 = "SELECT DNI FROM clientes WHERE DNI = ?";

        try (PreparedStatement statement = cn.prepareStatement(consul1)) {

            statement.setString(1, RellenarDNI.getText());
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                comprobardni = resultSet.getString(1);
            } else {
                comprobardni = null;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        String consul2 = "SELECT DNI FROM trabajadores WHERE DNI = ?";

        try (PreparedStatement statement2 = cn.prepareStatement(consul2)) {
            statement2.setString(1, RellenarDNI.getText());
            ResultSet resultSet2 = statement2.executeQuery();
            if (resultSet2.next()) {
                comprobardni2 = resultSet2.getString(1);
            } else {
                comprobardni2 = null;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (comprobardni != null && comprobardni.equals(RellenarDNI.getText())) {
            trabajador.comprobarDNI2();
        } else if (comprobardni2 != null && comprobardni2.equals(RellenarDNI.getText())) {
            trabajador.comprobarDNI();
        } else if (RellenarNombre.getText().isEmpty() || RellenarApellidos.getText().isEmpty() || RellenarDNI.getText().isEmpty() || RellenarCiudad.getText().isEmpty() || RellenarTelefono.getText().isEmpty()) {
            trabajador.comprobarCamposVacios();
        } else if (!RellenarDNI.getText().matches(patronDNI)) {
            trabajador.comprobarCampos();
        } else if (!RellenarNombre.getText().matches(patronNoNums)) {
            trabajador.comprobarNombre();
        } else if (!RellenarApellidos.getText().matches(patronNoNums)) {
            trabajador.comprobarApellidos();
        } else if (!RellenarTelefono.getText().matches(patronContacto) || RellenarTelefono.getText().length() != 9) {
            trabajador.comprobarContacto();
        } else if (!RellenarCiudad.getText().matches(patronNoNums)) {
            trabajador.comprobarCiudad();
        } else if (RellenarPuesto.getSelection() == null) {
            trabajador.comprobarPuesto();

        } else {
            nombreTrabajador = RellenarNombre.getText();
            trabajador.setNombre(nombreTrabajador);
            apellidosTrabajador = RellenarApellidos.getText();
            trabajador.setApellidos(apellidosTrabajador);
            trabajador.setDNI(RellenarDNI.getText());
            trabajador.setPais(RellenarPais.getSelectedItem().toString());
            trabajador.setCiudad(RellenarCiudad.getText());
            trabajador.setContacto(RellenarTelefono.getText());

            Enumeration<AbstractButton> buttons2 = RellenarPuesto.getElements();
            String puestoSeleccionado = "";

            while (buttons2.hasMoreElements()) {
                AbstractButton button2 = buttons2.nextElement();
                if (button2.isSelected()) {
                    puestoSeleccionado = button2.getText();
                    break;
                }
            }

            trabajador.setPuesto(puestoSeleccionado);

            nombreCompleto = nombreTrabajador + " " + apellidosTrabajador;

            nIdentificacion = JOptionPane.showInputDialog(null, "Ahora introduzca su Número de Identificación");
            trabajador.setnIdentificacion(nIdentificacion);

            while (trabajador.getnIdentificacion().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No puedes dejar el campo vacío", "Campo vacío", JOptionPane.ERROR_MESSAGE);
                trabajador.setnIdentificacion(JOptionPane.showInputDialog(null, "Introduzca su Número de Identificación de nuevo"));
            }

            trabajador.setContraseña(JOptionPane.showInputDialog(null, "Ahora introduzca una contraseña"));

            while (trabajador.getContraseña().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No puedes dejar el campo vacío", "Campo vacío", JOptionPane.ERROR_MESSAGE);
                trabajador.setContraseña(JOptionPane.showInputDialog(null, "Introduzca una contraseña de nuevo"));
            }

            JOptionPane.showMessageDialog(null, "Por último introduzca una foto");

            JFileChooser fileChooser = new JFileChooser();
            String rutaCarpeta = "src/images/Personas";
            File carpeta = new File(rutaCarpeta);
            fileChooser.setCurrentDirectory(carpeta);
            int result = fileChooser.showOpenDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                File archivoSeleccionado = fileChooser.getSelectedFile();
                urlImagen = archivoSeleccionado.getName();
                try {
                    fotoSeleccionada = ImageIO.read(archivoSeleccionado);
                } catch (IOException e) {
                    System.out.println("Error al cargar la foto: " + e.getMessage());
                }
            }

            JOptionPane.showMessageDialog(null, "Usted ha sido registrado como trabajador, por ello, tiene un 10% de descuento en todos los juegos");
            esTrabajador = true;

            try {

                String consulta = "INSERT INTO trabajadores (Nombre, Apellidos, DNI, Pais, Ciudad, Contacto, URL, Puesto, Contraseña, NIdentificacion) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement sentencia = cn.prepareStatement(consulta, Statement.RETURN_GENERATED_KEYS);

                sentencia.setString(1, trabajador.getNombre());
                sentencia.setString(2, trabajador.getApellidos());
                sentencia.setString(3, trabajador.getDNI());
                sentencia.setString(4, trabajador.getPais());
                sentencia.setString(5, trabajador.getCiudad());
                sentencia.setString(6, trabajador.getContacto());
                sentencia.setString(7, urlImagen);
                sentencia.setString(8, trabajador.getPuesto());
                sentencia.setString(9, trabajador.getContraseña());
                sentencia.setString(10, trabajador.getnIdentificacion());

                int obtenerId = sentencia.executeUpdate();

                if (obtenerId > 0) {
                    ResultSet clavePrimaria = sentencia.getGeneratedKeys();
                    if (clavePrimaria.next()) {
                        ID = clavePrimaria.getInt(1);
                    }
                }

                if (RellenarPuesto.isSelected(ButtonAdmin.getModel())) {
                    button = true;
                } else {
                    button = false;
                }

                Inicio_1 inicio = new Inicio_1();
                bandera = true;
                cn.close();
                this.dispose();

            } catch (SQLException e) {
                e.printStackTrace();

            }
    }//GEN-LAST:event_BotonRegistroActionPerformed
    }
    private void RellenarPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RellenarPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RellenarPaisActionPerformed

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Inicio inicio = new Inicio();
    }//GEN-LAST:event_BotonVolverActionPerformed

    private void RellenarTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RellenarTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RellenarTelefonoActionPerformed

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

    private void BotonRegistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegistroMouseEntered
        // TODO add your handling code here:
        BotonRegistro.setBackground(new Color(255, 102, 102));
    }//GEN-LAST:event_BotonRegistroMouseEntered

    private void BotonRegistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegistroMouseExited
        // TODO add your handling code here:
        BotonRegistro.setBackground(Color.red);
    }//GEN-LAST:event_BotonRegistroMouseExited

    private void BotonVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonVolverMouseEntered
        // TODO add your handling code here:
        BotonVolver.setBackground(new Color(180, 180, 180));
    }//GEN-LAST:event_BotonVolverMouseEntered

    private void BotonVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonVolverMouseExited
        // TODO add your handling code here:
        BotonVolver.setBackground(Color.white);
    }//GEN-LAST:event_BotonVolverMouseExited

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
            java.util.logging.Logger.getLogger(RegistrarTrabajador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarTrabajador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarTrabajador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarTrabajador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarTrabajador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonHOME;
    private javax.swing.JButton BotonRegistro;
    private javax.swing.JButton BotonVolver;
    public static javax.swing.JRadioButton ButtonAdmin;
    public static javax.swing.JRadioButton ButtonGerente;
    private javax.swing.JLabel LabelFondo;
    private javax.swing.JLabel LabelLogo;
    private javax.swing.JPanel PanelRegistro;
    private javax.swing.JTextField RellenarApellidos;
    private javax.swing.JTextField RellenarCiudad;
    private javax.swing.JTextField RellenarDNI;
    public static javax.swing.JTextField RellenarNombre;
    private javax.swing.JComboBox<String> RellenarPais;
    public static javax.swing.ButtonGroup RellenarPuesto;
    private javax.swing.JTextField RellenarTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
public static int ID;
    String urlImagen;
    public static boolean bandera = false;
    public static String nombreTrabajador;
    public static String apellidosTrabajador;
    public static String nombreCompleto;
    public static String nIdentificacion;
    public static boolean esTrabajador = false;
    public static boolean button;
    public static String comprobardni;
    public static String comprobardni2;
}
