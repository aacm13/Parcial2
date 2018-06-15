/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryTelekhines;

import TelekhinesFactoryEdificaciones.EdificacionesTelekhines;
import java.util.*;
/**
 *
 * @author aacm12
 */
//Centro de Mando, esta es una raza de humanoides con aparience perruna los cuales
//an llegado a reconicimiento legendario ya que es dicho que sus ancestros forjaron 
//el Tridente del dios Poseidon, lastimosamente han perdido prestigio debido a ser desterrados
//por la practica de magia negra. No son grandes guerreros, pero nunca encontraras mejores contructores
//y herreros
//      ++Mayor Daño causado y -1 turno en todas sus contruciones
//      --Menor vida y Menor recoleccion de recursos(debido a destierro) 30 - recursos
public class Telekhines {
    //Recursos Iniciales, tiene una quinta parte del total maximo de la primera base
    private int Cobre = 2000;
    private int Plata = 1000;
    private int Oro = 600;
    private int maxC = 10000;//Max Combre
    private int maxP = 5000;//Max Plata
    private int maxO = 3000;//Max Oro
    
    private ArrayList<EdificacionesTelekhines> EdificacionesTelekhines = new
         ArrayList<EdificacionesTelekhines>();
    
    //getter y setter

    public int getCobre() {
        return Cobre;
    }

    public int getPlata() {
        return Plata;
    }

    public int getOro() {
        return Oro;
    }

    public int getMaxC() {
        return maxC;
    }

    public int getMaxP() {
        return maxP;
    }

    public int getMaxO() {
        return maxO;
    }

    public ArrayList<EdificacionesTelekhines> getEdificacionesTelekhines() {
        return EdificacionesTelekhines;
    }

    public void setCobre(int Cobre) {
        this.Cobre = Cobre;
    }

    public void setPlata(int Plata) {
        this.Plata = Plata;
    }

    public void setOro(int Oro) {
        this.Oro = Oro;
    }

    public void setMaxC(int maxC) {
        this.maxC = maxC;
    }

    public void setMaxP(int maxP) {
        this.maxP = maxP;
    }

    public void setMaxO(int maxO) {
        this.maxO = maxO;
    }

    public void setEdificacionesTelekhines(ArrayList<EdificacionesTelekhines> EdificacionesTelekhines) {
        this.EdificacionesTelekhines = EdificacionesTelekhines;
    }
}
