/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TelekhinesFactoryEdificaciones;

/**
 *
 * @author aacm12
 */
//los Sabertank son una tanketa terrestre contrudia por los Mandalorian con grn capacidad de desrtuccion
public class SummoningCircle implements EdificacionesTelekhines {

    private int vida = 500;

    public SummoningCircle() {
    }

    public SummoningCircle(int vida) {
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void guardar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
