package com.company;

public class Docente extends Participante {
    String asignatura;
    int numero;


    public Docente(String nombre, String apellido, String asignatura) {
        super(nombre, apellido);
        this.asignatura = asignatura;
        //this.numero = numAleatorio();
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return
                " Nombre: " + nombre + "," +
                " Apellido: " + apellido + "," +
                " Asignatura: " + asignatura + "," +
                " Numero aleatorio: " + numero;
    }
}