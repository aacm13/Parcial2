/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdifMandalorianFactory;

/**
 *
 * @author aacm12
 */
public class MinaPlata implements EdificacionesMandalorian {
    
    private int vida;

    public MinaPlata() {
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
    public int GenerarRecurso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
