/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp04g09;

import java.util.Iterator;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author PUESTO-A1
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public frmPrincipal() {
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

        dpEscritorio = new javax.swing.JDesktopPane();
        mnbOpciones = new javax.swing.JMenuBar();
        mnuAgenda = new javax.swing.JMenu();
        mniAlumnos = new javax.swing.JMenuItem();
        mniMaterias = new javax.swing.JMenuItem();
        mniInscripciones = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dpEscritorio.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout dpEscritorioLayout = new javax.swing.GroupLayout(dpEscritorio);
        dpEscritorio.setLayout(dpEscritorioLayout);
        dpEscritorioLayout.setHorizontalGroup(
            dpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        dpEscritorioLayout.setVerticalGroup(
            dpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );

        mnuAgenda.setText("Gestion");

        mniAlumnos.setText("Alumnos");
        mniAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAlumnosActionPerformed(evt);
            }
        });
        mnuAgenda.add(mniAlumnos);

        mniMaterias.setText("Materias");
        mniMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniMateriasActionPerformed(evt);
            }
        });
        mnuAgenda.add(mniMaterias);

        mniInscripciones.setText("Inscripciones");
        mniInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniInscripcionesActionPerformed(evt);
            }
        });
        mnuAgenda.add(mniInscripciones);

        mnbOpciones.add(mnuAgenda);

        setJMenuBar(mnbOpciones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpEscritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniMateriasActionPerformed
        dpEscritorio.removeAll();
        dpEscritorio.repaint();
        friCrearMateria formCrearMateria = new friCrearMateria();
        formCrearMateria.setVisible(true);
        dpEscritorio.add(formCrearMateria);
        dpEscritorio.moveToFront(formCrearMateria);
    }//GEN-LAST:event_mniMateriasActionPerformed

    private void mniAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAlumnosActionPerformed
        dpEscritorio.removeAll();
        dpEscritorio.repaint();
        friCrearAlumno formCrearAlumno = new friCrearAlumno();
        formCrearAlumno.setVisible(true);
        dpEscritorio.add(formCrearAlumno);
        dpEscritorio.moveToFront(formCrearAlumno);
    }//GEN-LAST:event_mniAlumnosActionPerformed

    private void mniInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniInscripcionesActionPerformed
        dpEscritorio.removeAll();
        dpEscritorio.repaint();
        friCrearInscripcion formCrearInscripcion = new friCrearInscripcion();
        formCrearInscripcion.setVisible(true);
        dpEscritorio.add(formCrearInscripcion);
        dpEscritorio.moveToFront(formCrearInscripcion);
    }//GEN-LAST:event_mniInscripcionesActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpEscritorio;
    private javax.swing.JMenuBar mnbOpciones;
    private javax.swing.JMenuItem mniAlumnos;
    private javax.swing.JMenuItem mniInscripciones;
    private javax.swing.JMenuItem mniMaterias;
    private javax.swing.JMenu mnuAgenda;
    // End of variables declaration//GEN-END:variables
}
