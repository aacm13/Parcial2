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
public class MinaCobre implements EdificacionesTelekhines {

    Telekhines T = new Telekhines();
    private int vida = 500;
    private int Temp, Inicial;

    public MinaCobre() {
        Inicial = FuncionesMenu.fase;
    }

    public MinaCobre(int vida) {
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
            Temp = T.getCobre();
            if (Temp < T.getMaxC()) {
                System.out.println("Cobre: " + T.getCobre());
                Temp += (400 * 0.7);
                if (Temp > T.getMaxC()) {
                    int sobra = Temp - T.getMaxC();
                    Temp = Temp - sobra;
                    System.out.println("COFRE SE A LLENADO");
                }
                T.setCobre(Temp);
                System.out.println("Fase " + FuncionesMenu.fase);
                System.out.println("Nuevo Valor Cobre: " + T.getCobre());
            } else {
                System.out.println("Cobre: " + T.getCobre());
                System.out.println("COFRE DE Cobre LLENO, tendra que gastar Cobre antes de poder seguir generando");
            }
        } else {
            System.out.println("La edificación Cobre ha sido creada, y podrá usarse hasta la fase " + (Inicial + 3));
        }
    }

    @Override
    public void guardar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
