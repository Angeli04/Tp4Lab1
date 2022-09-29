/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp04g09;

import java.util.HashSet;
import java.util.Scanner;

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
        
        /*
        Scanner sc = new Scanner(System.in);
        Alumno a1 = null, a2 = null;
        Materia m1 = null, m2 = null, m3 = null;
        int opcion;
        boolean exit = false;
        
        do {
            System.out.println("1. Crear Alumnos");
            System.out.println("2. Crear Materias");
            System.out.println("3. Inscripción");
            System.out.println("9. Listar Inscripciones");
            System.out.println("0. Salir");
            System.out.println("Elija opción:");
            opcion = sc.nextInt();
            switch(opcion) {
                case 1:
                    a1 = new Alumno(1001, "Lopez", "Martin");
                    a2 = new Alumno(1002, "Martinez", "Brenda");
                    break;
                case 2:
                    m1 = new Materia(1,"Ingles I", 1);
                    m2 = new Materia(2,"Matematicas", 1);
                    m3 = new Materia(3,"Laboratorio I", 1);
                    break;
                case 3:
                    a1.AgregarMateria(m1);
                    a1.AgregarMateria(m2);
                    a1.AgregarMateria(m3);
                    a2.AgregarMateria(m1);
                    a2.AgregarMateria(m2);
                    a2.AgregarMateria(m3);
                    a2.AgregarMateria(m3); //Vuelve a inscribir en Laboratorio I
                    break;
                case 9:
                    System.out.println(a1.getApellido()+" "+a1.getNombre() +" inscripto en "+a1.CantidadMaterias() +" materias");
                    System.out.println(a2.getApellido()+" "+a2.getNombre() +" inscripto en "+a2.CantidadMaterias() +" materias");
                    break;
                case 0:
                    exit = true;
                    break;
            }

        } while (!exit);        
        */
    }
    
}
