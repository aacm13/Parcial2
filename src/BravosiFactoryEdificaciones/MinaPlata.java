/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BravosiFactoryEdificaciones;

import AbstractFactoryBravos.Bravos;
import Menu.FuncionesMenu;





/**
 *
 * @author aacm12
 */
public class MinaPlata implements EdificacionesBravosi {
    Bravos B = new Bravos();
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
            Temp = B.getPlata();
            if (Temp<B.getMaxP()){
                System.out.println("Plata: " + B.getPlata());
                Temp += 200;
                if (Temp>B.getMaxP()){
                    int sobra = Temp-B.getMaxP();
                    Temp = Temp-sobra;
                    System.out.println("COFRE SE A LLENADO");
                }
                B.setPlata(Temp);
                System.out.println("Fase "+FuncionesMenu.fase);
                System.out.println("Nuevo Valor Plata: " + B.getPlata());
            }else{
                System.out.println("Plata: " + B.getPlata());
                System.out.println("COFRE DE Plata LLENO, tendra que gastar Plata antes de poder seguir generando");
            }
        }
        else{
            System.out.println("La edificación Plata ha sido creada, y podrá usarse hasta la fase " + (Inicial+3));   
        }
    }
    
}
