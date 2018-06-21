/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryTelekhines;

import TelekhinesFactoryEdificaciones.EdificacionesTelekhines;
import TelekhinesFactorySoldados.Guerreros;
import TelekhinesFactoryVehiculos.VehiculosTelekhines;

/**
 *
 * @author aacm12
 */
public abstract class AbstractFactoryTelekhines {
    //Esto me va a permitir escoger el tipo de edificación que el usario desea...

    public abstract EdificacionesTelekhines getEdificacionTelekhines(String tipo);

    public abstract VehiculosTelekhines getVehiculoTelekhines(String tipo);

    public abstract Guerreros getSoldadoTelekhines(String tipo);

}
