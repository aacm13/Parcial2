/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryMandalore;

import EdifMandalorianFactory.EdificacionesMandalorian;
import SoldaMandalorianFactory.SoldadosMandalorian;
import VehMandalorianFactory.VehiculosMandalorian;

/**
 *
 * @author aacm12
 */
public abstract class AbstractFactoryMandalorian {
    //Esto me va a permitir escoger el tipo de edificación que el usario desea...

    public abstract EdificacionesMandalorian getEdificacionMandalorian(String tipo);

    public abstract VehiculosMandalorian getVehiculoMandalorian(String tipo);

    public abstract SoldadosMandalorian getSoldadoMandalorian(String tipo);

}
