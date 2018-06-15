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
                //System.out.println("Esto mandará a llamar la factory de esta raza y blabla");
                Mandalore M = new Mandalore();
                input.nextLine(); //Soluciona el problema de limpiar el buffer
                //Dispongo tando de \n (salto de línea) como de la creación de tabs \t ...
                System.out.println("Recursos Iniciales:\n" +
                        "Cobre: " + M.getCobre() +
                        "\nPlata: " + M.getMaxP() +
                        "\nOro: " + M.getOro());

                if (a == 1) {
                    //Jug1 = 3; de momento no voy a ocupar esto, pero sí mandaré según turno a llamar la función del turno que recibirá como parámetro la instanciación de razas...
                    //**** de esta manera:
                    InstanciacionEdificacionesSegunRazaJ1(opcionRaza);
                } else {
                    //Jug2 = 4;
                    //InstanciacionEdificacionesSegunRazaJ2();
                    
                }
                //Ejecuto la función del contador de a para pedir un último usuario...
                a += 1;

            } else if (opcionRaza == 2) {
                muestraDatosUsuario(nombre, "Bravosi");
                //System.out.println("Esto mandará a llamar la factory de esta raza para proporcionar las opciones que desea ejecutar");
                Bravos B = new Bravos();
                input.nextLine(); //Soluciona el problema de limpiar el buffer
                //Dispongo tando de \n (salto de línea) como de la creación de tabs \t ...
                System.out.println("Recursos Iniciales:\n" +
                        "Cobre: " + B.getCobre() +
                        "\nPlata: " + B.getMaxP() +
                        "\nOro: " + B.getOro());
                if (a == 1) {
                    Jug1 = 3;
                } else {
                    Jug2 = 4;
                }
                //Ejecuto la función del contador de a para pedir un último usuario...
                a += 1;

            } else if (opcionRaza == 3) {
                muestraDatosUsuario(nombre, "Raza Esqueletos");
                //System.out.println("Esto mandará a llamar la factory de esta raza y blabla x 3");
                Telekhines T = new Telekhines();
                input.nextLine(); //Soluciona el problema de limpiar el buffer
                //Dispongo tando de \n (salto de línea) como de la creación de tabs \t ...
                System.out.println("Recursos Iniciales:\n" +
                        "Cobre: " + T.getCobre() +
                        "\nPlata: " + T.getMaxP() +
                        "\nOro: " + T.getOro());
                //Líneas para los turnos...
                if (a == 1) {
                    Jug1 = 3;
                } else {
                    Jug2 = 4;
                }
                //Ejecuto la función del contador de a para pedir un último usuario...
                a += 1;
            }

        }
    }
    
    public static String muestraDatosUsuario(String nombre, String i) {
        System.out.println("Los datos del jugador son los siguientes: ");
        System.out.println("Nombre usuario: " + nombre + " y su raza escogida es: " + i);
        return i;
    }

    public static void InstanciacionEdificacionesSegunRazaJ1(int i) {

    }

    public static void InstanciacionEdificacionesSegunRazaJ2() {
        int opcionSubMenuTurnos, opcionEdif, opcionAtaque;
        Scanner TJ = new Scanner(System.in);
        System.out.println("1. Crear edificaciones\n2. Atacar [Sub menú si desea hacerlo con un Super Soldado o milicia normal]");
                opcionSubMenuTurnos = TJ.nextInt();
                switch (opcionSubMenuTurnos) {
                    case 1:
                        System.out.println("Crea edificaciones");
                        System.out.println("Seleccione qué edificación desea crear:\n1. Edificación para recurso 1\n2. Edificación para recurso 2\n3. Edificación para recurso 3\n4. Edificación para entrenar soldados y escuadrones\n5. Edificación para construir Vehículos tipo 1\n6. Edificación para construir Vehículos tipo 2");
                        opcionEdif = TJ.nextInt();
                        switch(opcionEdif){
                            case 1:
                                System.out.println("Instancio y creo el objeto 1 según raza, lo agrego al arreglo..."); //Con o sin break, regreso al menú principal...
                                break;
                            case 2:
                                System.out.println("Instancio y creo el objeto 2 según raza, lo agrego al arreglo..."); //Con o sin break, regreso al menú principal...
                                break;
                            case 3:
                                System.out.println("Instancio y creo el objeto 3 según raza, lo agrego al arreglo..."); //Con o sin break, regreso al menú principal...
                                break;
                            case 4:
                                System.out.println("Instancio y creo el objeto 4 según raza, lo agrego al arreglo..."); //Con o sin break, regreso al menú principal...
                                break;
                            case 5:
                                System.out.println("Instancio y creo el objeto 5 según raza, lo agrego al arreglo..."); //Con o sin break, regreso al menú principal...
                                break;
                            case 6:
                                System.out.println("Instancio y creo el objeto 6 según raza, lo agrego al arreglo..."); //Con o sin break, regreso al menú principal...
                                break;                               
                            default:
                                System.out.println("Ingrese una opción válida");
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("Por favor, seleccione con qué desea atacar: ");
                        System.out.println("1. Milia + talRaza\n2. Super Soldado + segunRaza\n3. Vehículo Terrestre + segúnRaza\n4. Vehículo Aéreo + según raza");
                        opcionAtaque = TJ.nextInt();
                        switch(opcionAtaque){
                            case 1:
                                System.out.println("Ataco a la milica de tal raza N");
                                break;
                            case 2:
                                System.out.println("Atacó al super soldado de tal raza N");
                                break;
                            case 3:
                                System.out.println("Atacó a tal vehículo de la raza");
                                break;
                            case 4:
                                System.out.println("Atacó a tal vehículo aéreo...");
                                break;
                            default:
                                System.out.println("Escoja una opción válida");
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("Se sale del buckle y que me tire al segund sub while");
                        break;
                    default:
                        System.out.println("Escoja opción válida");
                        break;
                }

    }
    
    public static int fase=0;
    
    public static void Fase(){
        System.out.println("*******************************************");
        if (fase<10){
            System.out.println("*       Está en la fase " + fase+"                 *");
        }else{
            System.out.println("*       Está en la fase " + fase+"                *");
        }
        System.out.println("*******************************************");
        fase += 1;
    }
}
