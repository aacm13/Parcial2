/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TelekhinesFactoryEdificaciones;

import AbstractFactoryTelekhines.Telekhines;
import Menu.FuncionesMenu;

/**
 *
 * @author aacm12
 */
public class MinaPlata implements EdificacionesTelekhines {

    Telekhines T = new Telekhines();
    private int vida = 500;
    private int Temp, Inicial;

    public MinaPlata() {
        Inicial = FuncionesMenu.fase;
    }

    public MinaPlata(int vida) {
        this.vida = vida;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public void GenerarRecurso() {
        if (FuncionesMenu.fase > (Inicial + 2)) {
            Temp = T.getPlata();
            if (Temp < T.getMaxP()) {
                System.out.println("Plata: " + T.getPlata());
                Temp += (200 * 0.7);
                if (Temp > T.getMaxP()) {
                    int sobra = Temp - T.getMaxP();
                    Temp = Temp - sobra;
                    System.out.println("COFRE SE A LLENADO");
                }
                T.setPlata(Temp);
                System.out.println("Fase " + FuncionesMenu.fase);
                System.out.println("Nuevo Valor Plata: " + T.getPlata());
            } else {
                System.out.println("Plata: " + T.getPlata());
                System.out.println("COFRE DE Plata LLENO, tendra que gastar Plata antes de poder seguir generando");
            }
        } else {
            System.out.println("La edificación Plata ha sido creada, y podrá usarse hasta la fase " + (Inicial + 3));
        }
    }

    @Override
    public void guardar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
