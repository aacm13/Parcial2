/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryTelekhines;

import TelekhinesFactoryEdificaciones.EdificacionTelekhinesFactory;
import TelekhinesFactorySoldados.TelekhinesFactoryGuerreros;
import TelekhinesFactoryVehiculos.TelekhinesFactoryVehiculos;

/**
 *
 * @author aacm12
 */
public class FactoryProducerTelekhines {
    public static AbstractFactoryTelekhines getFactoryTelekhines(String tipo){
        switch(tipo) {
            case "Edificaciones":
                return new EdificacionTelekhinesFactory(); //retornará el valor seleccionado de la edificación pedida...
            case "Vehiculos":
                return new TelekhinesFactoryVehiculos();
            case "Soldados":
                return new TelekhinesFactoryGuerreros(); //retornará una nueva opcion de qué tipo de soldado utilizar.
            
        }
        return null;
        
    }
}
