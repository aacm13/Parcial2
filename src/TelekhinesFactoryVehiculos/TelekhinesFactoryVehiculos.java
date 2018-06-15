/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TelekhinesFactoryVehiculos;

import AbstractFactoryTelekhines.AbstractFactoryTelekhines;
import TelekhinesFactoryEdificaciones.EdificacionesTelekhines;
import TelekhinesFactorySoldados.Guerreros;


/**
 *
 * @author aacm12
 */
public class TelekhinesFactoryVehiculos extends AbstractFactoryTelekhines {

    @Override
    public EdificacionesTelekhines getEdificacionTelekhines(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VehiculosTelekhines getVehiculoTelekhines(String tipo) {
        switch(tipo){
            case "ShadowFiend":
                return new ShadowFiend() ;
            case "Dragon": //De este solo podrá haber uno en batalla **DEBERÉ HACER TAL VALIDACIÓN
                return new Dragon();
        }
        return null;
    }

    @Override
    public Guerreros getSoldadoTelekhines(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
