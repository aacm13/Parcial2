/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryMandalore;

import EdifMandalorianFactory.EdificacionMandalorianFactory;
import SoldaMandalorianFactory.SoldadosMandalorianFactory;
import VehMandalorianFactory.VehiculoMandalorianFactory;
/**
 *
 * @author aacm12
 */
public class FactoryProducerMandalorians {
    public static AbstractFactoryMandalorian getFactoryMandalorian(String tipo){
        switch(tipo) {
            case "Edificaciones":
                return new EdificacionMandalorianFactory(); //retornará el valor seleccionado de la edificación pedida...
            case "Vehiculos":
                return null;
            case "Soldados":
                return new SoldadoMandalorianFactory(); //retornará una nueva opcion de qué tipo de soldado utilizar.
            
        }
        return null;
        
    }
}
