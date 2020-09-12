package com.company;

public class Estudiante extends Participante {
    String grupo;
    int numero;

    public Estudiante(String nombre, String apellido,String grupo) {
        super(nombre, apellido);
        //this.numero = numAleatorio();
        this.grupo = grupo;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return
                "Nombre: " + nombre  + "," +
                " Apellido: " + apellido + "," +
                " Grupo: " + grupo + "," +
                " Numero Aleatorio: " + numero;
    }
}