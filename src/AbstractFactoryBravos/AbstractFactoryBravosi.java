/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryBravos;

import BravosiFactoryEdificaciones.EdificacionesBravosi;
import BravosiFactorySoldados.Militia;
import BravosiFactoryVehiculos.VehiculosBravosi;

/**
 *
 * @author aacm12
 */
public abstract class AbstractFactoryBravosi {
    //Esto me va a permitir escoger el tipo de edificación que el usario desea...

    public abstract EdificacionesBravosi getEdificacionBravosi(String tipo);

    public abstract VehiculosBravosi getVehiculoBravosi(String tipo);

    public abstract Militia getSoldadoBravosi(String tipo);

}
