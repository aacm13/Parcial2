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
public class MinaOro implements EdificacionesMandalorian {
    
    Mandalore M = new Mandalore();
    private int vida=500;
    private int Temp, Inicial;

    public MinaOro() {
        Inicial = FuncionesMenu.fase;
    }

    public MinaOro(int vida) {
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
            Temp = M.getOro();
            if (Temp<M.getMaxO()){
                System.out.println("Oro: " + M.getOro());
                Temp += 100;
                if (Temp>M.getMaxO()){
                    int sobra = Temp-M.getMaxO();
                    Temp = Temp-sobra;
                    System.out.println("COFRE SE A LLENADO");
                }
                M.setOro(Temp);
                System.out.println("Fase "+FuncionesMenu.fase);
                System.out.println("Nuevo Valor Oro: " + M.getOro());
            }else{
                System.out.println("Oro: " + M.getOro());
                System.out.println("COFRE DE ORO LLENO, tendra que gastar Oro antes de poder seguir generando");
            }
        }
        else{
            System.out.println("La edificación Oro ha sido creada, y podrá usarse hasta la fase " + (Inicial+3));   
        }
    }
    
}
