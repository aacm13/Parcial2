/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlvaroCorpenoWorld;

/**
 *
 * @author aacm12
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import AbstractFactoryBravos.Bravos;
import AbstractFactoryMandalore.Mandalore;
import AbstractFactoryTelekhines.Telekhines;
import BravosiFactoryEdificaciones.BravosiCantina;
import BravosiFactoryEdificaciones.EdificacionesBravosi;
import BravosiFactoryEdificaciones.ShipYard;
import BravosiFactoryEdificaciones.Techistri;
import BravosiFactorySoldados.MilitiaCivil;
import MandalorianFactoryEdificaciones.EdificacionesMandalorian;
import MandalorianFactoryEdificaciones.FabricaBasilisk;
import MandalorianFactoryEdificaciones.FabricaSabertank;
import MandalorianFactoryEdificaciones.MandalorianBarracks;
import MandalorianFactoryEdificaciones.MinaCobre;
import MandalorianFactoryEdificaciones.MinaOro;
import MandalorianFactoryEdificaciones.MinaPlata;
import MandalorianFactorySoldados.NiteOwls;
import static Menu.FuncionesMenu.Fase;
import static Menu.FuncionesMenu.Inicio;
import static Menu.FuncionesMenu.muestraDatosUsuario;
import TelekhinesFactoryEdificaciones.EdificacionesTelekhines;
import TelekhinesFactoryEdificaciones.NidoDragon;
import TelekhinesFactoryEdificaciones.SummoningCircle;
import TelekhinesFactoryEdificaciones.TelekhinesHall;
import TelekhinesFactorySoldados.Raider;
import java.util.Scanner;

/**
 *
 * @author aacm12
 */
public class Menu_1 {

    public static void main(String[] args) {
        // Bases Centrales
        Mandalore M = new Mandalore();
        Bravos B = new Bravos();
        Telekhines T = new Telekhines();
        MilitiaCivil MGH = new MilitiaCivil();
        NiteOwls MO = new NiteOwls();
        Raider MEs = new Raider();

        String nombre, nombreJ1 = null, nombreJ2 = null;
        int OSMT, OE, OA, a = 1, OpcR, OpcRJ1 = 0, OpcRJ2 = 0, Mejora;
        Scanner input = new Scanner(System.in);

        Inicio();
        while (a != 3) {
            //Ingreso de datos de usuario (uno y dos)
            System.out.println("Ingrese nombre de usuario");
            nombre = input.nextLine();
            //Ahora pido el tipo de raza con la que desea jugar
            System.out.println("A continuación, escoja la raza que desea...\n de momento solo puede escoger la raza humanos guerreros");
            System.out.println("1. Mandalorian\n2. Bravosi\n3. Telkhines");
            OpcR = input.nextInt();
            switch (OpcR) {
                case 1:
                    muestraDatosUsuario(nombre, "Mandalorian");
                    
                    Mandalore InicioM = new Mandalore();
                    input.nextLine(); 
                    System.out.println("Recursos Iniciales:\n"
                            + "Cobre: " + InicioM.getCobre()
                            + "\nPlata: " + InicioM.getPlata()
                            + "\nOro: " + InicioM.getOro());
                    if (a == 1) {
                        
                        OpcRJ1 = OpcR;
                        nombreJ1 = nombre;
                    } else {
                        
                        OpcRJ2 = OpcR;
                        nombreJ2 = nombre;
                    }   
                    a += 1;
                    break;
                case 2:
                    muestraDatosUsuario(nombre, "Bravosi");
                    Bravos InicioB = new Bravos();
                    input.nextLine();
                    System.out.println("Recursos Iniciales:\n"
                            + "Cobre: " + InicioB.getCobre()
                            + "\nPlata: " + InicioB.getPlata()
                            + "\nOro: " + InicioB.getOro());
                    if (a == 1) {
                        OpcRJ1 = OpcR;
                        nombreJ1 = nombre;
                    } else {
                        OpcRJ2 = OpcR;
                        nombreJ2 = nombre;
                    }   //Ejecuto la función del contador de a para pedir un último usuario...
                    a += 1;
                    break;
                case 3:
                    muestraDatosUsuario(nombre, "Telekhines");
                    Telekhines InicioT = new Telekhines();
                    input.nextLine(); //Soluciona el problema de limpiar el buffer
                    System.out.println("Recursos Iniciales:\n"
                            + "Cobre: " + InicioT.getCobre()
                            + "\nPlata: " + InicioT.getPlata()
                            + "\nOro: " + InicioT.getOro());
                    if (a == 1) {
                        OpcRJ1 = OpcR;
                        nombreJ1 = nombre;
                    } else {
                        OpcRJ2 = OpcR;
                        nombreJ2 = nombre;
                    }
                    a += 1;
                    break;
                default:
                    break;
            }
        }
        int J = 1;
        boolean Bandera = true;

        do {
            while (Bandera) {
                OSMT = 99;//numero random para entrar al while
                String name = "";
                if (J == 1) {
                    name = nombreJ1;
                } else if (J == 2) {
                    name = nombreJ2;
                }
                while (OSMT != 5) {
                    System.out.println("-----------------------------------------------");
                    System.out.println("TURNO JUGADOR 1: " + nombreJ1);
                    System.out.println("Ingrese la opción a ejecutar:");
                    System.out.println("1. Crear edificaciones"
                            + "\n2. Entrenar Soldados"
                            + "\n3. Atacar"
                            + "\n4. Mejorar Centro de Mando"
                            + "\n5. Pasar Turno");
                    System.out.println("-----------------------------------------------");

                    OSMT = input.nextInt();
                    if (OpcRJ1 == 1) {
                        switch (OSMT) {
                            case 1:
                                System.out.println("Crea edificaciones");
                                System.out.println("Seleccione qué edificación desea crear:"
                                        + "\n1. Mina de Oro"
                                        + "\n2. Mina de Cobre"
                                        + "\n3. Mina de Plata"
                                        + "\n4. Cuartel de NiteOwls y SuperCommando's"
                                        + "\n5. Fabrica de Basilisk"
                                        + "\n6. Fabrica de SaberTank");
                                OE = input.nextInt();
                                switch (OE) {
                                    case 1:
                                        if (M.getCobre() >= 500 && M.getPlata() >= 100) {
                                            EdificacionesMandalorian Oro = new MinaOro();
                                            System.out.println("Valores de fondos ANTES de Compra:");
                                            System.out.println("ORO:" + M.getOro());
                                            System.out.println("COBRE:" + M.getCobre());
                                            System.out.println("PLATA:" + M.getPlata());
                                            int TempC = M.getCobre();
                                            int Cobre = TempC - 500;
                                            int TempP = M.getPlata();
                                            int Plata = TempP - 100;
                                            M.getEdificacionesMandalorian().add(Oro);
                                            System.out.println(M.getEdificacionesMandalorian().size());
                                            M.setCobre(Cobre);
                                            M.setPlata(Plata);
                                            System.out.println("nuevos valores de fondos");
                                            System.out.println("ORO:" + M.getOro());
                                            System.out.println("COBRE:" + M.getCobre());
                                            System.out.println("PLATA:" + M.getPlata());
                                        } else {
                                            System.out.println("No tiene suficientes fondos");
                                        }
                                        break;
                                    case 2:

                                        if (M.getOro() >= 75 && M.getPlata() >= 100) {
                                            EdificacionesMandalorian Cobre = new MinaCobre();
                                            System.out.println("Valores de fondos ANTES de Compra:");
                                            System.out.println("ORO:" + M.getOro());
                                            System.out.println("COBRE:" + M.getCobre());
                                            System.out.println("PLATA:" + M.getPlata());
                                            int TempO = M.getOro();
                                            int Oro = TempO - 75;
                                            int TempP = M.getPlata();
                                            int Plata = TempP - 100;
                                            M.getEdificacionesMandalorian().add(Cobre);
                                            System.out.println(M.getEdificacionesMandalorian().size());
                                            M.setOro(Oro);
                                            M.setPlata(Plata);
                                            System.out.println("nuevos valores de fondos");
                                            System.out.println("ORO:" + M.getOro());
                                            System.out.println("COBRE:" + M.getCobre());
                                            System.out.println("PLATA:" + M.getPlata());
                                        } else {
                                            System.out.println("No tiene suficientes fondos...");
                                        }
                                        break;
                                    case 3:

                                        if (M.getOro() >= 75 && M.getCobre() >= 500) {
                                            EdificacionesMandalorian Plata = new MinaPlata();
                                            System.out.println("Valores de fondos ANTES de Compra:");
                                            System.out.println("ORO:" + M.getOro());
                                            System.out.println("COBRE:" + M.getCobre());
                                            System.out.println("PLATA:" + M.getPlata());
                                            int TempO = M.getOro();
                                            int Oro = TempO - 75;
                                            int TempC = M.getCobre();
                                            int Cobre = TempC - 100;
                                            M.getEdificacionesMandalorian().add(Plata);
                                            System.out.println(M.getEdificacionesMandalorian().size());
                                            M.setCobre(Cobre);
                                            M.setOro(Oro);
                                            System.out.println("nuevos valores de fondos");
                                            System.out.println("ORO:" + M.getOro());
                                            System.out.println("COBRE:" + M.getCobre());
                                            System.out.println("PLATA:" + M.getPlata());
                                        } else {
                                            System.out.println("No tines suficientes fondos...");
                                        }
                                        break;
                                    case 4:

                                        if (M.getCobre() >= 500 && M.getOro() >= 1500 && M.getPlata() >= 750) {
                                            EdificacionesMandalorian EMO = new MandalorianBarracks();
                                            System.out.println("Valores de fondos ANTES de Compra:");
                                            System.out.println("ORO:" + M.getOro());
                                            System.out.println("COBRE:" + M.getCobre());
                                            System.out.println("PLATA:" + M.getPlata());
                                            int TempC = M.getCobre();
                                            int Cobre = TempC - 500;
                                            int TempP = M.getPlata();
                                            int Plata = TempP - 1500;
                                            int TempO = M.getOro();
                                            int Oro = TempO - 750;
                                            M.getEdificacionesMandalorian().add(EMO);
                                            System.out.println(M.getEdificacionesMandalorian().size());
                                            M.setOro(Oro);
                                            M.setCobre(Cobre);
                                            M.setPlata(Plata);
                                            System.out.println("nuevos valores de fondos");
                                            System.out.println("ORO:" + M.getOro());
                                            System.out.println("COBRE:" + M.getCobre());
                                            System.out.println("PLATA:" + M.getPlata());
                                        } else {
                                            System.out.println("No tines suficientes fondos...");
                                        }

                                        break;
                                    case 5:

                                        if (M.getCobre() >= 400 && M.getPlata() >= 2150 && M.getOro() >= 1500) {
                                            EdificacionesMandalorian LOB = new FabricaBasilisk();
                                            System.out.println("Valores de fondos ANTES de Compra:");
                                            System.out.println("ORO:" + M.getOro());
                                            System.out.println("COBRE:" + M.getCobre());
                                            System.out.println("PLATA:" + M.getPlata());
                                            int TempC = M.getCobre();
                                            int Cobre = TempC - 400;
                                            int TempP = M.getPlata();
                                            int Plata = TempP - 2150;
                                            int TempO = M.getOro();
                                            int Oro = TempO - 1500;
                                            M.getEdificacionesMandalorian().add(LOB);
                                            System.out.println(M.getEdificacionesMandalorian().size());
                                            M.setOro(Oro);
                                            M.setCobre(Cobre);
                                            M.setPlata(Plata);
                                            System.out.println("nuevos valores de fondos");
                                            System.out.println("ORO:" + M.getOro());
                                            System.out.println("COBRE:" + M.getCobre());
                                            System.out.println("PLATA:" + M.getPlata());
                                        } else {
                                            System.out.println("No tiene suficientes fundos");
                                        }

                                        break;
                                    case 6:
                                        if (M.getCobre() >= 300 && M.getPlata() >= 2050 && M.getOro() >= 1000) {
                                            EdificacionesMandalorian LOB = new FabricaSabertank();
                                            System.out.println("Valores de fondos ANTES de Compra:");
                                            System.out.println("ORO:" + M.getOro());
                                            System.out.println("COBRE:" + M.getCobre());
                                            System.out.println("PLATA:" + M.getPlata());
                                            int TempC = M.getCobre();
                                            int Cobre = TempC - 400;
                                            int TempP = M.getPlata();
                                            int Plata = TempP - 2150;
                                            int TempO = M.getOro();
                                            int Oro = TempO - 1500;
                                            M.getEdificacionesMandalorian().add(LOB);
                                            System.out.println(M.getEdificacionesMandalorian().size());
                                            M.setOro(Oro);
                                            M.setCobre(Cobre);
                                            M.setPlata(Plata);
                                            System.out.println("nuevos valores de fondos");
                                            System.out.println("ORO:" + M.getOro());
                                            System.out.println("COBRE:" + M.getCobre());
                                            System.out.println("PLATA:" + M.getPlata());
                                        } else {
                                            System.out.println("No tiene suficientes fundos");
                                        }
                                        break;
                                    default:
                                        System.out.println("Ingrese una opción válida");
                                        break;
                                }
                                break;
                            case 2:
                                System.out.println("Por favor, seleccione con qué desea entrenar: ");
                                System.out.println("1. Milia + talRaza"
                                        + "\n2. Super Soldado"
                                        + "\n3. Vehículo Terrestre"
                                        + "\n4. Vehículo Aéreo");
                                OA = input.nextInt();
                                switch (OA) {
                                    case 1:
                                        System.out.println("Ataco a la militia");
                                        break;
                                    case 2:
                                        System.out.println("Atacó a super soldado");
                                        break;
                                    case 3:
                                        System.out.println("Atacó a vehículo");
                                        break;
                                    case 4:
                                        System.out.println("Atacó a vehículo aéreo");
                                        break;
                                    default:
                                        System.out.println("Escoja una opción válida");
                                        break;
                                }

                                break;
                            case 3:
                                System.out.println("Atacar\nSeleccione a quién desea atacar...");
                                MGH.damage(MO.attack());
                                System.out.println(MGH.getVida());
                                break;
                            case 4:
                                System.out.println("Verificar cantidad de recursos y mejorar el CENTRO DE MANDO");
                                break;
                            case 5:
                                System.out.println("Pasar de turno....");
                                break;
                            default:
                                System.out.println("Escoja opción válida");
                                break;
                        }
                        for (int i = 0; i < M.getEdificacionesMandalorian().size(); i++) {
                            M.getEdificacionesMandalorian().get(i).GenerarRecurso();
                        }
                    } else if (OpcRJ1 == 2) {
                        switch (OSMT) {
                            case 1:
                                System.out.println("Crea edificaciones");
                                System.out.println("Seleccione qué edificación desea crear:"
                                        + "\n1. Edificación para Cobre"
                                        + "\n2. Edificación para Plata"
                                        + "\n3. Edificación para Oro"
                                        + "\n4. Edificación entrenamiento Bounty Hunters y Militia Civil"
                                        + "\n5. Edificación para entrenar entrenamiento Destroyer"
                                        + "\n6. Edificación para entrenar F22_Raptor");
                                OE = input.nextInt();
                                switch (OE) {
                                    case 1:
                                        if (B.getCobre() >= 500 && B.getPlata() >= 100) {
                                            EdificacionesBravosi Oro = (EdificacionesBravosi) new MinaOro();
                                            System.out.println("Valores de fondos ANTES de Compra:");
                                            System.out.println("ORO:" + B.getOro());
                                            System.out.println("COBRE:" + B.getCobre());
                                            System.out.println("PLATA:" + B.getPlata());
                                            int TempC = B.getCobre();
                                            int Cobre = TempC - 500;
                                            int TempP = B.getPlata();
                                            int Plata = TempP - 100;
                                            B.getEdificacionesBravosi().add(Oro);
                                            System.out.println(B.getEdificacionesBravosi().size());
                                            B.setCobre(Cobre);
                                            B.setPlata(Plata);
                                            System.out.println("nuevos valores de fondos");
                                            System.out.println("ORO:" + B.getOro());
                                            System.out.println("COBRE:" + B.getCobre());
                                            System.out.println("PLATA:" + B.getPlata());
                                        } else {
                                            System.out.println("No tiene suficientes fondos");
                                        }
                                        break;
                                    case 2:

                                        if (B.getOro() >= 75 && B.getPlata() >= 100) {
                                            EdificacionesBravosi Cobre = (EdificacionesBravosi) new MinaCobre();
                                            System.out.println("Valores de fondos ANTES de Compra:");
                                            System.out.println("ORO:" + B.getOro());
                                            System.out.println("COBRE:" + B.getCobre());
                                            System.out.println("PLATA:" + B.getPlata());
                                            int TempO = B.getOro();
                                            int Oro = TempO - 75;
                                            int TempP = B.getPlata();
                                            int Plata = TempP - 100;
                                            B.getEdificacionesBravosi().add(Cobre);
                                            System.out.println(B.getEdificacionesBravosi().size());
                                            B.setOro(Oro);
                                            B.setPlata(Plata);
                                            System.out.println("nuevos valores de fondos");
                                            System.out.println("ORO:" + B.getOro());
                                            System.out.println("COBRE:" + B.getCobre());
                                            System.out.println("PLATA:" + B.getPlata());
                                        } else {
                                            System.out.println("No tiene suficientes fondos...");
                                        }
                                        break;
                                    case 3:

                                        if (B.getOro() >= 75 && B.getCobre() >= 500) {
                                            EdificacionesBravosi Plata = (EdificacionesBravosi) new MinaPlata();
                                            System.out.println("Valores de fondos ANTES de Compra:");
                                            System.out.println("ORO:" + B.getOro());
                                            System.out.println("COBRE:" + B.getCobre());
                                            System.out.println("PLATA:" + B.getPlata());
                                            int TempO = B.getOro();
                                            int Oro = TempO - 75;
                                            int TempC = B.getCobre();
                                            int Cobre = TempC - 100;
                                            B.getEdificacionesBravosi().add(Plata);
                                            System.out.println(B.getEdificacionesBravosi().size());
                                            B.setCobre(Cobre);
                                            B.setOro(Oro);
                                            System.out.println("nuevos valores de fondos");
                                            System.out.println("ORO:" + B.getOro());
                                            System.out.println("COBRE:" + B.getCobre());
                                            System.out.println("PLATA:" + B.getPlata());
                                        } else {
                                            System.out.println("No tines suficientes fondos...");
                                        }
                                        break;
                                    case 4:

                                        if (B.getCobre() >= 500 && B.getOro() >= 1500 && B.getPlata() >= 750) {
                                            EdificacionesBravosi EMO = new BravosiCantina();
                                            System.out.println("Valores de fondos ANTES de Compra:");
                                            System.out.println("ORO:" + B.getOro());
                                            System.out.println("COBRE:" + B.getCobre());
                                            System.out.println("PLATA:" + B.getPlata());
                                            int TempC = B.getCobre();
                                            int Cobre = TempC - 500;
                                            int TempP = B.getPlata();
                                            int Plata = TempP - 1500;
                                            int TempO = B.getOro();
                                            int Oro = TempO - 750;
                                            B.getEdificacionesBravosi().add(EMO);
                                            System.out.println(B.getEdificacionesBravosi().size());
                                            B.setOro(Oro);
                                            B.setCobre(Cobre);
                                            B.setPlata(Plata);
                                            System.out.println("nuevos valores de fondos");
                                            System.out.println("ORO:" + B.getOro());
                                            System.out.println("COBRE:" + B.getCobre());
                                            System.out.println("PLATA:" + B.getPlata());
                                        } else {
                                            System.out.println("No tines suficientes fondos...");
                                        }

                                        break;
                                    case 5:

                                        if (B.getCobre() >= 400 && B.getPlata() >= 2150 && B.getOro() >= 1500) {
                                            EdificacionesBravosi LOB = new ShipYard();
                                            System.out.println("Valores de fondos ANTES de Compra:");
                                            System.out.println("ORO:" + B.getOro());
                                            System.out.println("COBRE:" + B.getCobre());
                                            System.out.println("PLATA:" + B.getPlata());
                                            int TempC = B.getCobre();
                                            int Cobre = TempC - 400;
                                            int TempP = B.getPlata();
                                            int Plata = TempP - 2150;
                                            int TempO = B.getOro();
                                            int Oro = TempO - 1500;
                                            B.getEdificacionesBravosi().add(LOB);
                                            System.out.println(B.getEdificacionesBravosi().size());
                                            B.setOro(Oro);
                                            B.setCobre(Cobre);
                                            B.setPlata(Plata);
                                            System.out.println("nuevos valores de fondos");
                                            System.out.println("ORO:" + B.getOro());
                                            System.out.println("COBRE:" + B.getCobre());
                                            System.out.println("PLATA:" + B.getPlata());
                                        } else {
                                            System.out.println("No tiene suficientes fundos");
                                        }

                                        break;
                                    case 6:
                                        if (B.getCobre() >= 300 && B.getPlata() >= 2050 && B.getOro() >= 1000) {
                                            EdificacionesBravosi LOB = new Techistri();
                                            System.out.println("Valores de fondos ANTES de Compra:");
                                            System.out.println("ORO:" + B.getOro());
                                            System.out.println("COBRE:" + B.getCobre());
                                            System.out.println("PLATA:" + B.getPlata());
                                            int TempC = M.getCobre();
                                            int Cobre = TempC - 400;
                                            int TempP = M.getPlata();
                                            int Plata = TempP - 2150;
                                            int TempO = M.getOro();
                                            int Oro = TempO - 1500;
                                            B.getEdificacionesBravosi().add(LOB);
                                            System.out.println(B.getEdificacionesBravosi().size());
                                            B.setOro(Oro);
                                            B.setCobre(Cobre);
                                            B.setPlata(Plata);
                                            System.out.println("nuevos valores de fondos");
                                            System.out.println("ORO:" + B.getOro());
                                            System.out.println("COBRE:" + B.getCobre());
                                            System.out.println("PLATA:" + B.getPlata());
                                        } else {
                                            System.out.println("No tiene suficientes fundos");
                                        }
                                        break;
                                    default:
                                        System.out.println("Ingrese una opción válida");
                                        break;
                                }
                                break;
                            case 2:
                                System.out.println("Por favor, seleccione con qué desea entrenar: ");
                                System.out.println("1. Milia + talRaza"
                                        + "\n2. Super Soldado"
                                        + "\n3. Vehículo Terrestre"
                                        + "\n4. Vehículo Aéreo");
                                OA = input.nextInt();
                                switch (OA) {
                                    case 1:
                                        System.out.println("Ataco a la militia");
                                        break;
                                    case 2:
                                        System.out.println("Atacó a super soldado");
                                        break;
                                    case 3:
                                        System.out.println("Atacó a vehículo");
                                        break;
                                    case 4:
                                        System.out.println("Atacó a vehículo aéreo");
                                        break;
                                    default:
                                        System.out.println("Escoja una opción válida");
                                        break;
                                }
                                break;
                            case 3:
                                System.out.println("Atacar\nSeleccione a quién desea atacar..."); //Puedo poner afuera de todo esto el muestreo de los recursos actuales...
                                MO.damage(MGH.attack());
                                System.out.println(MO.getVida());
                                break;
                            case 4:
                                System.out.println("Verificar cantidad de recursos y mejorar el CENTRO DE MANDO");
                                System.out.println("1. Verificar cantidad de recursos y edificaciones creadas\n2. Mejorar el centro de mando");
                                Mejora = input.nextInt();
                                switch (Mejora) {
                                    case 1:
                                        System.out.println("nada");
                                    case 2:
                                        System.out.println("centro de mando...");
                                }
                                break;
                            case 5:
                                System.out.println("Pasar de turno....");
                                break;
                            default:
                                System.out.println("Escoja opción válida");
                                break;
                        }
                        //Acá puedo mostrar el arreglo de prueba de edificaciones:
                        for (int i = 0; i < B.getEdificacionesBravosi().size(); i++) {
                            B.getEdificacionesBravosi().get(i).GenerarRecurso();
                        }

                    } else if (OpcRJ1 == 3) {
                        switch (OSMT) {
                            case 1:
                                System.out.println("Crea edificaciones");
                                System.out.println("Seleccione qué edificación desea crear:"
                                        + "\n1. Edificación para Cobre"
                                        + "\n2. Edificación para Plata"
                                        + "\n3. Edificación para Oro"
                                        + "\n4. Edificación entrenamiento WizardSaint y Raiders"
                                        + "\n5. Edificación para entrenar entrenamiento Dragon"
                                        + "\n6. Edificación para entrenar ShadowFiend");
                                OE = input.nextInt();
                                switch (OE) {
                                    case 1:
                                        if (T.getCobre() >= 500 && T.getPlata() >= 100) {
                                            EdificacionesTelekhines Oro = (EdificacionesTelekhines) new MinaOro();
                                            System.out.println("Valores de fondos ANTES de Compra:");
                                            System.out.println("ORO:" + T.getOro());
                                            System.out.println("COBRE:" + T.getCobre());
                                            System.out.println("PLATA:" + T.getPlata());
                                            int TempC = T.getCobre();
                                            int Cobre = TempC - 500;
                                            int TempP = T.getPlata();
                                            int Plata = TempP - 100;
                                            T.getEdificacionesTelekhines().add(Oro);
                                            System.out.println(T.getEdificacionesTelekhines().size());
                                            T.setCobre(Cobre);
                                            T.setPlata(Plata);
                                            System.out.println("nuevos valores de fondos");
                                            System.out.println("ORO:" + T.getOro());
                                            System.out.println("COBRE:" + T.getCobre());
                                            System.out.println("PLATA:" + T.getPlata());
                                        } else {
                                            System.out.println("No tiene suficientes fondos");
                                        }
                                        break;
                                    case 2:

                                        if (B.getOro() >= 75 && B.getPlata() >= 100) {
                                            EdificacionesTelekhines Cobre = (EdificacionesTelekhines) new MinaCobre();
                                            System.out.println("Valores de fondos ANTES de Compra:");
                                            System.out.println("ORO:" + T.getOro());
                                            System.out.println("COBRE:" + T.getCobre());
                                            System.out.println("PLATA:" + T.getPlata());
                                            int TempO = T.getOro();
                                            int Oro = TempO - 75;
                                            int TempP = T.getPlata();
                                            int Plata = TempP - 100;
                                            T.getEdificacionesTelekhines().add(Cobre);
                                            System.out.println(T.getEdificacionesTelekhines().size());
                                            T.setOro(Oro);
                                            T.setPlata(Plata);
                                            System.out.println("nuevos valores de fondos");
                                            System.out.println("ORO:" + T.getOro());
                                            System.out.println("COBRE:" + T.getCobre());
                                            System.out.println("PLATA:" + T.getPlata());
                                        } else {
                                            System.out.println("No tiene suficientes fondos...");
                                        }
                                        break;
                                    case 3:

                                        if (T.getOro() >= 75 && T.getCobre() >= 500) {
                                            EdificacionesTelekhines Plata = (EdificacionesTelekhines) new MinaPlata();
                                            System.out.println("Valores de fondos ANTES de Compra:");
                                            System.out.println("ORO:" + T.getOro());
                                            System.out.println("COBRE:" + T.getCobre());
                                            System.out.println("PLATA:" + T.getPlata());
                                            int TemoO = T.getOro();
                                            int Oro = TemoO - 75;
                                            int TempC = T.getCobre();
                                            int Cobre = TempC - 100;
                                            T.getEdificacionesTelekhines().add(Plata);
                                            System.out.println(T.getEdificacionesTelekhines().size());
                                            B.setCobre(Cobre);
                                            B.setOro(Oro);
                                            System.out.println("nuevos valores de fondos");
                                            System.out.println("ORO:" + T.getOro());
                                            System.out.println("COBRE:" + T.getCobre());
                                            System.out.println("PLATA:" + T.getPlata());
                                        } else {
                                            System.out.println("No tines suficientes fondos...");
                                        }
                                        break;
                                    case 4:

                                        if (B.getCobre() >= 1000 && B.getOro() >= 500 && B.getPlata() >= 750) {
                                            EdificacionesTelekhines EMO = new TelekhinesHall();
                                            System.out.println("Valores de fondos ANTES de Compra:");
                                            System.out.println("ORO:" + T.getOro());
                                            System.out.println("COBRE:" + T.getCobre());
                                            System.out.println("PLATA:" + T.getPlata());
                                            int TempC = B.getCobre();
                                            int Cobre = TempC - 500;
                                            int TempP = B.getPlata();
                                            int Plata = TempP - 1500;
                                            int TempO = B.getOro();
                                            int Oro = TempO - 750;
                                            T.getEdificacionesTelekhines().add(EMO);
                                            System.out.println(T.getEdificacionesTelekhines().size());
                                            T.setOro(Oro);
                                            T.setCobre(Cobre);
                                            T.setPlata(Plata);
                                            System.out.println("nuevos valores de fondos");
                                            System.out.println("ORO:" + T.getOro());
                                            System.out.println("COBRE:" + T.getCobre());
                                            System.out.println("PLATA:" + T.getPlata());
                                        } else {
                                            System.out.println("No tines suficientes fondos...");
                                        }

                                        break;
                                    case 5:

                                        if (T.getCobre() >= 1400 && T.getPlata() >= 750 && T.getOro() >= 200) {
                                            EdificacionesTelekhines X = new NidoDragon();
                                            System.out.println("Valores de fondos ANTES de Compra:");
                                            System.out.println("ORO:" + T.getOro());
                                            System.out.println("COBRE:" + T.getCobre());
                                            System.out.println("PLATA:" + T.getPlata());
                                            int TempC = T.getCobre();
                                            int Cobre = TempC - 400;
                                            int TempP = T.getPlata();
                                            int Plata = TempP - 2150;
                                            int TempO = T.getOro();
                                            int Oro = TempO - 1500;
                                            T.getEdificacionesTelekhines().add(X);
                                            System.out.println(T.getEdificacionesTelekhines().size());
                                            T.setOro(Oro);
                                            T.setCobre(Cobre);
                                            T.setPlata(Plata);
                                            System.out.println("nuevos valores de fondos");
                                            System.out.println("ORO:" + T.getOro());
                                            System.out.println("COBRE:" + T.getCobre());
                                            System.out.println("PLATA:" + T.getPlata());
                                        } else {
                                            System.out.println("No tiene suficientes fundos");
                                        }

                                        break;
                                    case 6:
                                        if (T.getCobre() >= 1000 && T.getPlata() >= 2050 && T.getOro() >= 9000) {
                                            EdificacionesTelekhines LOB = new SummoningCircle();
                                            System.out.println("Valores de fondos ANTES de Compra:");
                                            System.out.println("ORO:" + T.getOro());
                                            System.out.println("COBRE:" + T.getCobre());
                                            System.out.println("PLATA:" + T.getPlata());
                                            int TempC = T.getCobre();
                                            int Cobre = TempC - 400;
                                            int TempP = T.getPlata();
                                            int Plata = TempP - 2150;
                                            int TempO = T.getOro();
                                            int Oro = TempO - 1500;
                                            T.getEdificacionesTelekhines().add(LOB);
                                            System.out.println(T.getEdificacionesTelekhines().size());
                                            T.setOro(Oro);
                                            T.setCobre(Cobre);
                                            T.setPlata(Plata);
                                            System.out.println("nuevos valores de fondos");
                                            System.out.println("ORO:" + T.getOro());
                                            System.out.println("COBRE:" + T.getCobre());
                                            System.out.println("PLATA:" + T.getPlata());
                                        } else {
                                            System.out.println("No tiene suficientes fundos");
                                        }
                                        break;
                                    default:
                                        System.out.println("Ingrese una opción válida");
                                        break;
                                }
                                break;
                            case 2:
                                System.out.println("Por favor, seleccione con qué desea entrenar: ");
                                System.out.println("1. Milia + talRaza"
                                        + "\n2. Super Soldado"
                                        + "\n3. Vehículo Terrestre"
                                        + "\n4. Vehículo Aéreo");
                                OA = input.nextInt();
                                switch (OA) {
                                    case 1:
                                        System.out.println("Ataco a la militia");
                                        break;
                                    case 2:
                                        System.out.println("Atacó a super soldado");
                                        break;
                                    case 3:
                                        System.out.println("Atacó a vehículo");
                                        break;
                                    case 4:
                                        System.out.println("Atacó a vehículo aéreo");
                                        break;
                                    default:
                                        System.out.println("Escoja una opción válida");
                                        break;
                                }
                                break;
                            case 3:
                                System.out.println("Atacar\nSeleccione a quién desea atacar..."); //Puedo poner afuera de todo esto el muestreo de los recursos actuales...
                                MO.damage(MGH.attack());
                                System.out.println(MO.getVida());
                                break;
                            case 4:
                                System.out.println("Verificar cantidad de recursos y mejorar el CENTRO DE MANDO");
                                System.out.println("1. Verificar cantidad de recursos y edificaciones creadas\n2. Mejorar el centro de mando");
                                Mejora = input.nextInt();
                                switch (Mejora) {
                                    case 1:
                                        System.out.println("Seleccionó ver todos sus recursos y edif... + soldados+++ y ver la vida de los mismos...");
                                    case 2:
                                        System.out.println("Seleccionó mejorar centro de mando...");
                                }
                                break;
                            case 5:
                                System.out.println("Pasar de turno....");
                                break;
                            default:
                                System.out.println("Escoja opción válida");
                                break;
                        }
                        for (int i = 0; i < T.getEdificacionesTelekhines().size(); i++) {
                            T.getEdificacionesTelekhines().get(i).GenerarRecurso();
                        }
                    } else {
                        System.out.println("Escoja una opción válida...");
                    }

                }

                if (J == 1) {
                    J++;
                } else if (J == 2) {
                    J--;
                }
                Fase();
            }
        } while (MGH.getVida() > 0 || MO.getVida() > 0 || MEs.getVida() > 0);

    }

}
