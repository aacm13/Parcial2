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
public class MinaCobre implements EdificacionesBravosi {
    Bravos B = new Bravos();
    private int vida=500;
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
            Temp = B.getCobre();
            if (Temp<B.getMaxC()){
                System.out.println("Cobre: " + B.getCobre());
                Temp += 400;
                if (Temp>B.getMaxC()){
                    int sobra = Temp-B.getMaxC();
                    Temp = Temp-sobra;
                    System.out.println("COFRE SE A LLENADO");
                }
                B.setCobre(Temp);
                System.out.println("Fase "+FuncionesMenu.fase);
                System.out.println("Nuevo Valor Cobre: " + B.getCobre());
            }else{
                System.out.println("Cobre: " + B.getOro());
                System.out.println("COFRE DE Cobre LLENO, tendra que gastar Cobre antes de poder seguir generando");
            }
        }
        else{
            System.out.println("La edificación Oro ha sido creada, y podrá usarse hasta la fase " + (Inicial+3));   
        }
    }
    
}
