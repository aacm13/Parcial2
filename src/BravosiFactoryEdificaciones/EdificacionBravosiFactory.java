/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BravosiFactoryEdificaciones;

import AbstractFactoryBravos.AbstractFactoryBravosi;
import BravosiFactorySoldados.Militia;
import BravosiFactoryVehiculos.VehiculosBravosi;

/**
 *
 * @author aacm12
 */
public class EdificacionBravosiFactory extends AbstractFactoryBravosi {

    @Override
    public EdificacionesBravosi getEdificacionBravosi(String tipo) {
        switch (tipo) {
            case "Edif recurso Cobre":
                return new MinaCobre(); //Debo colocar una opción de recolectar recuros...
            case "Edif recurso Plata":
                return new MinaPlata(); //Debo colocar una opción de recolectar recuros...
            case "Edif recurso Oro":
                return new MinaOro(); //generará el recurso automáticamente...
            case "Edif entrenamiento Bounty Hunters y Militia Civil":
                return new BravosiCantina();
            case "Edif entrenamiento Destroyer": //Vehiculo aéreo
                return new Techistri();
            case "Edif entrenamiento F22_Raptor": //Vehiculo terrestre
                return new ShipYard();
        }
        return null;
    }

    @Override
    public VehiculosBravosi getVehiculoBravosi(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Militia getSoldadoBravosi(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
