/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MandalorianFactoryEdificaciones;

/**
 *
 * @author aacm12
 */
//los Basilisk son una nave aerea contrudia por los Mandalorian
public class FabricaBasilisk implements EdificacionesMandalorian {

    private int vida;

    public FabricaBasilisk() {
    }

    public FabricaBasilisk(int vida) {
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

    }

}
