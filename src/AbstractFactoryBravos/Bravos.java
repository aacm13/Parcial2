/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryBravos;

import BravosiFactoryEdificaciones.EdificacionesBravosi;
import java.util.ArrayList;

/**
 *
 * @author aacm12
 */
//Centro de Mando, Isla natal de las personas conocidas como los Bravosi
//En tiempo recientes ellos an empezado una era de expancion en la cual han conquistado
//naciones vecinas, pero al final del dia ellos no son guerreros pero comerciante
//      --No tienen desventajas ni ventajas
//      ++Generar mayor cantidad de recursos por turno
public class Bravos {

    //Recursos Iniciales, tiene una quinta parte del total maximo de la primera base
    private int Cobre = 2000;
    private int Plata = 1000;
    private int Oro = 600;
    private int maxC = 10000;//Max Combre
    private int maxP = 5000;//Max Plata
    private int maxO = 3000;//Max Oro

    private ArrayList<EdificacionesBravosi> EdificacionesBravosi = new ArrayList<EdificacionesBravosi>();
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

    public ArrayList<EdificacionesBravosi> getEdificacionesBravosi() {
        return EdificacionesBravosi;
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

    public void setEdificacionesBravosi(ArrayList<EdificacionesBravosi> EdificacionesBravosi) {
        this.EdificacionesBravosi = EdificacionesBravosi;
    }
}
