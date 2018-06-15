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
    private int vida=500;
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
            System.out.println("Plata: " + M.getPlata());
            Temp = M.getPlata();
            Temp += 200;
            M.setPlata(Temp);
            System.out.println("después de "+FuncionesMenu.fase+" fases ahora posee: " + M.getPlata());
        }
        else{
            System.out.println("La edificación Plata ha sido creada, y podrá usarse hasta la fase " + (Inicial+3));   
        }
    }
    
}
