/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryBravos;

import EdifBravosiFactory.EdificacionBravosiFactory;
import SoldaBravosiFactory.SoldadosBravosiFactory;
import VehBravosiFactory.VehiculoBravosiFactory;
/**
 *
 * @author aacm12
 */
public class FactoryProducerBravosi {
    public static AbstractFactoryBravosi getFactoryBravosi(String tipo){
        switch(tipo) {
            case "Edificaciones":
                return new EdificacionBravosiFactory(); //retornará el valor seleccionado de la edificación pedida...
            case "Vehiculos":
                return null;
            case "Soldados":
                return new SoldadoBravosiFactory(); //retornará una nueva opcion de qué tipo de soldado utilizar.
            
        }
        return null;
        
    }
}
