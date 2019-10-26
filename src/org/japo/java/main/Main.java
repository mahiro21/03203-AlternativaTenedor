/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Mario Merlos Abella <mario.merlos.alum@iescamp.es>
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH);

    public static void main(String[] args) {
        
        //variables
        String comida;
        
        System.out.printf("Alternativa Tenedor%n===================%n");
        System.out.print("Tipo de comida .: ");
        comida = SCN.nextLine();
        
        System.out.println("---");
        //Carne
        if (comida.equals("Carne")) {
            System.out.println("Tenedor con ....: 3 púas");
        }
        //Pescado
        if (comida.equals("Pescado")) {
            System.out.println("Tenedor con ....: 4 púas");
        }
        //Sopa
        if (comida.equals("Sopa")) {
            System.out.println("Tenedor con ....: 0 púas");
        }

    }
}
