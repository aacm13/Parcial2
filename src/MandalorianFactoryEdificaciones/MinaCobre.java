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
public class MinaCobre implements EdificacionesMandalorian {
    
    private int vida;

    public MinaCobre() {
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
