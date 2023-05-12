/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Daniel Paredes
 */
public class Aula {

    Estudiante[] estudiante = new Estudiante[10];
    Asistencia asistencia;
    
    public Estudiante[] getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante[] estudiante) {
        this.estudiante = estudiante;
    }

    public Asistencia getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(Asistencia asistencia) {
        this.asistencia = asistencia;
    }

}
