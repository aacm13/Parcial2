/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MandalorianFactoryEdificaciones;

import AbstractFactoryMandalore.Mandalore;
import Menu.FuncionesMenu;

/**
 *
 * @author aacm12
 */
public class MinaPlata implements EdificacionesMandalorian {

    Mandalore M = new Mandalore();
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
            Temp = M.getPlata();
            if (Temp < M.getMaxP()) {
                System.out.println("Plata: " + M.getPlata());
                Temp += 200;
                if (Temp > M.getMaxP()) {
                    int sobra = Temp - M.getMaxP();
                    Temp = Temp - sobra;
                    System.out.println("COFRE SE A LLENADO");
                }
                M.setPlata(Temp);
                System.out.println("Fase " + FuncionesMenu.fase);
                System.out.println("Nuevo Valor Plata: " + M.getPlata());
            } else {
                System.out.println("Plata: " + M.getPlata());
                System.out.println("COFRE DE Plata LLENO, tendra que gastar Plata antes de poder seguir generando");
            }
        } else {
            System.out.println("La edificación Plata ha sido creada, y podrá usarse hasta la fase " + (Inicial + 3));
        }
    }

}
