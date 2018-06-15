/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BravosiFactoryVehiculos;

import AbstractFactoryBravos.AbstractFactoryBravosi;
import BravosiFactoryEdificaciones.EdificacionesBravosi;
import BravosiFactorySoldados.Militia;




/**
 *
 * @author aacm12
 */
public class BravosiFactoryVehiculos extends AbstractFactoryBravosi {

    @Override
    public EdificacionesBravosi getEdificacionBravosi(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VehiculosBravosi getVehiculoBravosi(String tipo) {
        switch(tipo){
            case "ShadowFiend":
                return new Destroyer() ;
            case "Dragon": //De este solo podrá haber uno en batalla **DEBERÉ HACER TAL VALIDACIÓN
                return new F22_Raptor();
        }
        return null;
    }

    @Override
    public Militia getSoldadoBravosi(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
