/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp04g09;

import java.util.HashSet;
import java.util.Objects;

/**
 *
 * @author maxim
 */
public class Alumno {
    private String nombre;
    private String apellido;
    private int legajo;
    private HashSet materias;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public Alumno() {
        this.materias = new HashSet();
    }
    
    public Alumno(int legajo, String apellido, String nombre) {
        this.materias = new HashSet();
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }

    void AgregarMateria(Materia m){
        materias.add(m);
    }

    int CantidadMaterias(){
        return materias.size();
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.legajo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.legajo, other.legajo)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString(){
        return this.getApellido()+" "+this.getNombre();
    }
}
