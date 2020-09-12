package com.company;

import java.util.Random;

public class Participante {
    String nombre;
    String apellido;
    int numeroAleatorio;


    public Participante(String nombre,String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroAleatorio = 1 + new Random().nextInt(6);
    }
}