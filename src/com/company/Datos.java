package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Datos {
    Estudiante estudiante;
    Docente docente;

    public void ejecutar(){
        pedirDatos();
        validarGanador();
    }

    public void pedirDatos(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("*-----------------------*");
        System.out.println("| ¡ COMIENZA EL JUEGO ! |");
        System.out.println("*-----------------------*");
        System.out.println("Ingresar el nombre del estudiante: ");
        String nombreEstudiante = teclado.nextLine();

        System.out.println("Ingresar el apellido estudiante: ");
        String apellidoEstudiante = teclado.nextLine();

        estudiante = new Estudiante(nombreEstudiante,apellidoEstudiante, preguntarGrado());

        System.out.println("\n" + "----------------------------- \n");

        System.out.println("Ingresar el nombre del docente: ");
        String nombreDocente = teclado.nextLine();

        System.out.println("Ingresar el apellido docente: ");
        String apellidoDocente = teclado.nextLine();

        System.out.println("Ingrese la asignatura del docente: ");
        String asignatura = teclado.nextLine();

        docente = new Docente(nombreDocente,apellidoDocente,asignatura);
    }

    public String preguntarGrado(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el grado del estudiante [número]°[letra]");
        String grado = teclado.nextLine();
        try{
            String[] grupos = {"A", "B", "C", "D"};
            int cursor = Arrays.asList(grupos).indexOf(grado.split("°")[1].toUpperCase());

            if(cursor == -1){
                System.out.println("\n"+"*................................................................*");
                System.out.println("* Grado incorrecto.Por favor ingresar letra de grado entre A y D *");
                System.out.println("*................................................................*" + "\n");
                preguntarGrado();
            }

            if (Integer.parseInt(grado.split("°")[0]) >= 1 && Integer.parseInt(grado.split("°")[0]) <= 11) {
            }else {
                System.out.println("\n" + "*........................................................*");
                System.out.println("* Grado incorrecto.Por favor ingresar grado entre 1 y 11 *");
                System.out.println("*........................................................*" + "\n");
                preguntarGrado();
            }
        }catch(IndexOutOfBoundsException | NullPointerException | NumberFormatException ex){
            System.out.println("\n" + "*...............................................................*");
            System.out.println("* Catch: Grado incorrecto.Por favor ingresar grado entre 1 y 11 * ");
            System.out.println("*...............................................................*" + "\n");
            preguntarGrado();
        }
        return grado;
    }

    public void validarGanador() {
        if (estudiante.getNumero() > docente.getNumero()) {
            System.out.println("\n"+"*-----------------------*");
            System.out.println("| ¡ GANADOR ESTUDIANTE! |");
            System.out.println("*-----------------------*" + "\n");
            System.out.println(estudiante.toString());
        } else if (estudiante.getNumero() == docente.getNumero()) {
            estudiante = new Estudiante(estudiante.nombre, estudiante.apellido, estudiante.grupo);
            docente = new Docente(docente.nombre, docente.apellido, docente.asignatura);
            validarGanador();
        } else {
            System.out.println("\n"+"*---------------------*");
            System.out.println("| ¡ GANADOR DOCENTE ! |");
            System.out.println("*---------------------*" + "\n");
            System.out.println(docente.toString());
        }
    }
}