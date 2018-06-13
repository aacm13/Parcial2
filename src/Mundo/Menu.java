/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mundo;
import AbstracFactory.FactoryProducer;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Jorge
 */
public class Menu {
   
    private static Menu menu;
   
    Menu(){}
   
    public static Menu getInstance(){
        if(menu == null){
            menu= new Menu();
        }
        return menu;
    }
   
    public void Inicio(){
        int opc=0;
        boolean b = true;
        Scanner input = new Scanner(System.in);
        System.out.println(" ----------------");
        System.out.println("|   BIENVENIDO   |");
        System.out.println(" ----------------\n");
        System.out.println("1. Iniciar\n2.Salir ");
        while (b){
            opc = input.nextInt();
            switch(opc){
                case 1:
                    Jugador1();
                    Jugador2();
                    b=false;
                    break;
                case 2:
                    System.out.println("Saliendo del juego...");
                    b=false;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }
        }
    }
   //Jugador 1
    public void Jugador1(){
        int opc;
        Scanner input = new Scanner(System.in);
        FactoryProducer raza = new FactoryProducer();
        System.out.println("Jugador 1: ");
        System.out.println("Seleccione la faccion: ");
        System.out.println("1. Mandalorians");//mandalorian warriors
        System.out.println("2. Ibbennesse");//ibbennesse mages
        System.out.println("3. Telekhines");//dog people, greate builders and craftman    
        try{
            boolean b =true;
            while (b){   
                opc = input.nextInt();
                String faccion1;
                switch(opc){
                    case 1:
                        faccion1 = "Mandalorians";
                        System.out.println("Jugador 1 a elegido ");
                        System.out.println("Mandalorian..\n");
                        b = false;
                        break;
                    case 2:
                        faccion1 = "Ibbennesse";
                        System.out.println("Jugador 1 a elegido ");
                        System.out.println("Ibbennesse..\n");
                        b = false;
                        break;
                    case 3:
                        faccion1 = "Telekhines";
                        System.out.println("Jugador 1 a elegido ");
                        System.out.println("Telekhines..\n");
                        b = false;
                        break;            
                    default:
                        System.out.println("Ingrese una opcion valida");
                }
            }
        }catch (InputMismatchException e){
            System.err.println("Ingrese una opcion correcta");
            input.nextLine();
           
        }
    }
    // Jugador 2
    public void Jugador2(){
        int opc;
        Scanner input = new Scanner(System.in);
        FactoryProducer raza = new FactoryProducer();
        System.out.println("Jugador 2: ");
        System.out.println("Seleccione la faccion: ");
        System.out.println("1. Mandalorians");
        System.out.println("2. Ibennesse");
        System.out.println("3. Telekhines");    
        try{
               
            boolean b =true;
            while (b){   
                opc = input.nextInt();
                String faccion2;
                switch(opc){
                    case 1:
                        faccion2 = "Mandalorians";
                        System.out.println("Jugador 2 a elegido ");
                        System.out.println("Mandalorian..\n");
                        b = false;
                        break;
                    case 2:
                        faccion2 = "Ibbennesse";
                        System.out.println("Jugador 2 a elegido ");
                        System.out.println("Ibbennesse..\n");
                        b = false;
                        break;
                    case 3:
                        faccion2 = "Telekhines";
                        System.out.println("Jugador 2 a elegido ");
                        System.out.println("Telekhines..\n");
                        b = false;
                        break;            
                    default:
                        System.out.println("Ingrese una opcion valida");
                }
            }
           
        }catch (InputMismatchException e){
            System.err.println("Ingrese una opcion correcta");
            input.nextLine();
           
        }
    }
}
   
   
   
 
