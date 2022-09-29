/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp04g09;

/**
 *
 * @author maxim
 */
public class Materia {
    private int idMateria;
    private String Nombre;
    private int anio;

    public Materia(int idMateria, String Nombre, int anio) {
        this.idMateria = idMateria;
        this.Nombre = Nombre;
        this.anio = anio;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    @Override
    public String toString(){
        return this.getNombre()+" de "+this.getAnio()+" año";
    }
}
