/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistasTP4;

import java.util.HashSet;
import entidades.Alumno;
import entidades.Materia;
import javax.swing.JOptionPane;

/**
 *
 * @author FRANCISCO
 */
public class Principal extends javax.swing.JFrame {

    private HashSet <Materia> materias = new HashSet<Materia>();
    private  HashSet<Alumno> alumnos= new HashSet<Alumno>();
    public Principal() {
        initComponents();
    }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuMateria = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuAlumno = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuInscribir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 544, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 437, Short.MAX_VALUE)
        );

        jMenuMateria.setText("Cargar");

        jMenuItem1.setText("Materia");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuMateria.add(jMenuItem1);

        jMenuAlumno.setText("Alumno");
        jMenuAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAlumnoActionPerformed(evt);
            }
        });
        jMenuMateria.add(jMenuAlumno);

        jMenuBar1.add(jMenuMateria);

        jMenu2.setText("Gestion");

        jMenuInscribir.setText("Inscribir");
        jMenuInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuInscribirActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuInscribir);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuInscribirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuInscribirActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
     escritorio.removeAll();
     FormMateria formmateria= new FormMateria(this);
     formmateria.setVisible(true);
     escritorio.add(formmateria);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAlumnoActionPerformed
     escritorio.removeAll();
     FormAlumno formAlumno= new FormAlumno(this);
     formAlumno.setVisible(true);
     escritorio.add(formAlumno);
    }//GEN-LAST:event_jMenuAlumnoActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }


 public  void agregarMaterias(Materia m) {
        if(materias.contains(m)){
            JOptionPane.showMessageDialog(null, "La materia ya se encuentra en la lista");
        }else{
        materias.add(m);
         JOptionPane.showMessageDialog(null, "Materia cargado correctamente");
    }
 }
    public void cargarAlumnos(Alumno a){
       if(alumnos.contains(a)){
            JOptionPane.showMessageDialog(null, "El alumno ya se encuentra cargado");
        }else{
        alumnos.add(a);
         JOptionPane.showMessageDialog(null, "Alumno cargado correctamente");
    }

    }

    public void setAlumnos(HashSet<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuAlumno;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuInscribir;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jMenuMateria;
    // End of variables declaration//GEN-END:variables
}
