/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoindividual;

import com.sun.awt.*;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

/**
 *
 * @author Hugo
 */
public class DatosCompra extends javax.swing.JFrame {

    /**
     * Creates new form DetallesCompra
     */
    public DatosCompra() {
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        PanelInicio.setBackground(Color.white);
        ImageIcon imagen = new ImageIcon("src/images/gameverse.png");
        LabelLogo.setIcon(imagen);
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

        PanelInicio = new javax.swing.JPanel();
        BotonHOME = new javax.swing.JButton();
        LabelLogo = new javax.swing.JLabel();
        jTextArea1 = new javax.swing.JTextArea();
        BotonSalir = new javax.swing.JButton();
        BotonVolverComprar = new javax.swing.JButton();
        LabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1470, 680));

        PanelInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        PanelInicio.add(BotonHOME, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 460, 40, 50));
        PanelInicio.add(LabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 790, 160));

        jTextArea1.setBackground(java.awt.Color.white);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jTextArea1.setForeground(java.awt.Color.black);
        jTextArea1.setRows(5);
        jTextArea1.setText("\n      Usted '" + FinalizarCompra.nombreComprador + " " + FinalizarCompra.apellidosComprador + "' con DNI '" + FinalizarCompra.dniComprador + "'\n                y con cuenta bancaria '" + FinalizarCompra.cuentaComprador.substring(0, 6) + "...'" + "\n    ha realizado la compra del juego '" + Resultados.nombreJuego + "'\n      con fecha '" + FinalizarCompra.fecha + "' por el precio de '" + Resultados.precioJuego + "'.");
        jTextArea1.setAutoscrolls(false);
        jTextArea1.setBorder(new javax.swing.border.MatteBorder(null));
        jTextArea1.setDisabledTextColor(java.awt.Color.red);
        jTextArea1.setEnabled(false);
        jTextArea1.setFocusable(false);
        jTextArea1.setSelectedTextColor(java.awt.Color.red);
        jTextArea1.setSelectionColor(java.awt.Color.white);
        PanelInicio.add(jTextArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 620, 200));

        BotonSalir.setBackground(java.awt.Color.white);
        BotonSalir.setForeground(java.awt.Color.red);
        BotonSalir.setText("Salir");
        BotonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonSalirMouseExited(evt);
            }
        });
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });
        PanelInicio.add(BotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 520, 100, 40));

        BotonVolverComprar.setBackground(java.awt.Color.red);
        BotonVolverComprar.setForeground(java.awt.Color.white);
        BotonVolverComprar.setText("Volver a comprar");
        BotonVolverComprar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonVolverComprarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonVolverComprarMouseExited(evt);
            }
        });
        BotonVolverComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverComprarActionPerformed(evt);
            }
        });
        PanelInicio.add(BotonVolverComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 520, 140, 40));
        PanelInicio.add(LabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -40, 1490, 730));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        // TODO add your handling code here:
        String[] opciones = {"1 estrella", "2 estrellas", "3 estrellas", "4 estrellas", "5 estrellas"};
        int puntuacion = JOptionPane.showOptionDialog(null, "Puntúa de 1 a 5 según como te haya parecido la compra", "Puntúanos", JOptionPane.INFORMATION_MESSAGE, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
       
        if (puntuacion == 0 || puntuacion == 1) {
            JOptionPane.showMessageDialog(null, "Intentaremos mejorar para la próxima, gracias");
             this.dispose();
        } else if (puntuacion == 2) {
            JOptionPane.showMessageDialog(null, "Gracias por su respuesta");
             this.dispose();
        } else if (puntuacion == 3 || puntuacion == 4 || puntuacion == 5){
            JOptionPane.showMessageDialog(null, "Nos alegramos de que haya sido de su agrado, muchas gracias");
             this.dispose();
        }else{
            
        }
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void BotonVolverComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverComprarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Filtros filtro = new Filtros();

    }//GEN-LAST:event_BotonVolverComprarActionPerformed

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

    private void BotonSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSalirMouseEntered
        // TODO add your handling code here:
        BotonSalir.setBackground(new Color(180, 180, 180));
    }//GEN-LAST:event_BotonSalirMouseEntered

    private void BotonSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSalirMouseExited
        // TODO add your handling code here:
        BotonSalir.setBackground(Color.red);
    }//GEN-LAST:event_BotonSalirMouseExited

    private void BotonVolverComprarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonVolverComprarMouseEntered
        // TODO add your handling code here:
        BotonVolverComprar.setBackground(new Color(255, 102, 102));
    }//GEN-LAST:event_BotonVolverComprarMouseEntered

    private void BotonVolverComprarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonVolverComprarMouseExited
        // TODO add your handling code here:
        BotonVolverComprar.setBackground(Color.white);
    }//GEN-LAST:event_BotonVolverComprarMouseExited

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
            java.util.logging.Logger.getLogger(DatosCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatosCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatosCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatosCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatosCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonHOME;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JButton BotonVolverComprar;
    private javax.swing.JLabel LabelFondo;
    private javax.swing.JLabel LabelLogo;
    private javax.swing.JPanel PanelInicio;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
