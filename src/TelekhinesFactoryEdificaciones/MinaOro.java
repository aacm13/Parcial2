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
public class MinaOro implements EdificacionesTelekhines {
    Telekhines T = new Telekhines();
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
            Temp = T.getOro();
            if (Temp<T.getMaxO()){
                System.out.println("Oro: " + T.getOro());
                Temp += (100*0.7);
                if (Temp>T.getMaxO()){
                    int sobra = Temp-T.getMaxO();
                    Temp = Temp-sobra;
                    System.out.println("COFRE SE A LLENADO");
                }
                T.setOro(Temp);
                System.out.println("Fase "+FuncionesMenu.fase);
                System.out.println("Nuevo Valor Oro: " + T.getOro());
            }else{
                System.out.println("Oro: " + T.getOro());
                System.out.println("COFRE DE ORO LLENO, tendra que gastar Oro antes de poder seguir generando");
            }
        }
        else{
            System.out.println("La edificación Oro ha sido creada, y podrá usarse hasta la fase " + (Inicial+3));   
        }
    }
    
    @Override
    public void guardar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
