/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import AbstractFactoryBravos.Bravos;
import AbstractFactoryMandalore.Mandalore;
import AbstractFactoryTelekhines.Telekhines;
import java.util.Scanner;

/**
 *
 * @author aacm12
 */
public class FuncionesMenu {

    public static void Inicio() {
        System.out.println("--------------------------------");
        System.out.println("* BIENVENIDOS A ALVARO'S WORLD *");
        System.out.println("--------------------------------");
    }

    public static void ingresoUsuarios() {
        String nombre, nombreEdif;
        int a = 1, opcionRaza, opcionMenuRaza, Jug1 = 0, Jug2 = 0;
        Scanner input = new Scanner(System.in);

        while (a != 3) {
            //Ingreso de datos de usuario
            System.out.println("Nombre de usuario");
            nombre = input.nextLine();

            //Ahora pido el tipo de raza con la que desea jugar
            System.out.println("Facciones:");
            System.out.println("1. Mandalorians\n2. Bravosi\n3. Telkhines");
            opcionRaza = input.nextInt();

            if (opcionRaza == 1) {
                muestraDatosUsuario(nombre, "Mandalorian");

                Mandalore M = new Mandalore();
                input.nextLine();

                System.out.println("Recursos Iniciales:\n"
                        + "Cobre: " + M.getCobre()
                        + "\nPlata: " + M.getPlata()
                        + "\nOro: " + M.getOro());

                if (a == 1) {
                    Jug1 = 3;

                } else {
                    Jug2 = 4;
                }

                a += 1;

            } else if (opcionRaza == 2) {
                muestraDatosUsuario(nombre, "Bravosi");
                Bravos B = new Bravos();
                input.nextLine();
                System.out.println("Recursos Iniciales:\n"
                        + "Cobre: " + B.getCobre()
                        + "\nPlata: " + B.getPlata()
                        + "\nOro: " + B.getOro());
                if (a == 1) {
                    Jug1 = 3;
                } else {
                    Jug2 = 4;
                }

                a += 1;

            } else if (opcionRaza == 3) {
                muestraDatosUsuario(nombre, "Raza Esqueletos");
                Telekhines T = new Telekhines();
                input.nextLine();

                System.out.println("Recursos Iniciales:\n"
                        + "Cobre: " + T.getCobre()
                        + "\nPlata: " + T.getPlata()
                        + "\nOro: " + T.getOro());

                if (a == 1) {
                    Jug1 = 3;
                } else {
                    Jug2 = 4;
                }

                a += 1;
            }

        }
    }

    public static String muestraDatosUsuario(String nombre, String i) {
        System.out.println("Los datos del jugador son los siguientes: ");
        System.out.println("Nombre usuario: " + nombre + "\nRaza: " + i);
        return i;
    }

    public static int fase = 0;

    public static void Fase() {
        System.out.println("*******************************************");
        if (fase < 10) {
            System.out.println("*       Está en la fase " + fase + "                 *");
        } else {
            System.out.println("*       Está en la fase " + fase + "                *");
        }
        System.out.println("*******************************************");
        fase += 1;
    }
}
