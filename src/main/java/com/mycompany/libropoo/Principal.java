package com.mycompany.libropoo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el título del libro:");
        String titulo = scanner.nextLine();

        System.out.println("Ingrese el autor del libro:");
        String autor = scanner.nextLine();

        System.out.println("Ingrese el genero del libro: ");
        String genero = scanner.nextLine();

        System.out.println("Ingrese el año de publicación del libro:");
        int anoPublicacion = scanner.nextInt();

        Libro libro = new Libro(titulo, autor, genero, anoPublicacion);

        libro.marcarLeido();

        System.out.println("Los datos del libro son:");
        System.out.println(libro.mostrarInformacion());

        if (libro.estaLeido()) {
            System.out.println("El libro ya ha sido leído.");
        } else {
            System.out.println("El libro aún no ha sido leído.");
        }

        if (libro.esAntiguo()) {
            System.out.println("El libro es antiguo.");
        } else {
            System.out.println("El libro es nuevo.");
        }
        scanner.close();
    }
}
