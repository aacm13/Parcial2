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
public class MandalorianBarracks implements EdificacionesMandalorian {

    private int vida;

    public MandalorianBarracks() {
    }

    public MandalorianBarracks(int vida) {
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
