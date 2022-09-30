/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp04g09;

import java.util.HashSet;

/**
 *
 * @author ALBERTO
 */
public class Colegio {

    private static HashSet<Alumno> alumnos = new HashSet();
    private static HashSet<Materia> materias = new HashSet();

    public static HashSet<Alumno> getAlumnos() {
        return alumnos;
    }

    public static HashSet<Materia> getMaterias() {
        return materias;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        Alumno a1 = null, a2 = null;
        Materia m1 = null, m2 = null, m3 = null;
        alumnos.add(new Alumno(1001, "Lopez", "Martin"));
        alumnos.add(new Alumno(1002, "Martinez", "Brenda"));
        materias.add(new Materia(1,"Ingles I", 1));
        materias.add(new Materia(2,"Matematicas", 1));
        materias.add(new Materia(3,"Laboratorio I", 1));
        
        frmPrincipal framePrincipal = new frmPrincipal();
        framePrincipal.setLocationRelativeTo(null);
        framePrincipal.setVisible(true);
    }
}
