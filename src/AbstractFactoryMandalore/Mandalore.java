/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryMandalore;

import MandalorianFactoryEdificaciones.EdificacionesMandalorian;
import java.util.*;

/**
 *
 * @author aacm12
 */
//Centro de Mando, tierra natal de los guerreros conocidos como los Mandalorians
//Estos viene de una cultura guerrera por lo cual tienen una ventaja en el combate
//      ++Mayor Vida y Mayor Daño causado
//Debido a su cultura guerrera no le ponen mucha atencion a la Arquitectura
//      --1+ turno en tiempo de construccion de edificaciones
public class Mandalore {
    //Recursos Iniciales, tiene una quinta parte del total maximo de la primera base
    private int Cobre;
    private int Plata;
    private int Oro;
    private int maxC;//Max Combre
    private int maxP;//Max Plata
    private int maxO;//Max Oro

    public Mandalore() {
        Cobre = 2000;
        Plata = 1000;
        Oro = 600;
        maxC = 10000;//Max Combre
        maxP = 5000;//Max Plata
        maxO = 3000;//Max Oro
    }
    
    
    private ArrayList<EdificacionesMandalorian> EdificacionesMandalorian = new
         ArrayList<EdificacionesMandalorian>();
    
    
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

    public ArrayList<EdificacionesMandalorian> getEdificacionesMandalorian() {
        return EdificacionesMandalorian;
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

    public void setEdificacionesMandalorian(ArrayList<EdificacionesMandalorian> EdificacionesMandalorian) {
        this.EdificacionesMandalorian = EdificacionesMandalorian;
    }
}
