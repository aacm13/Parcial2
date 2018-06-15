/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TelekhinesFactorySoldados;

import AbstractFactoryTelekhines.AbstractFactoryTelekhines;
import TelekhinesFactoryEdificaciones.EdificacionesTelekhines;
import TelekhinesFactoryVehiculos.VehiculosTelekhines;



/**
 *
 * @author aacm12
 */
public class TelekhinesFactoryGuerreros extends AbstractFactoryTelekhines{

    @Override
    public EdificacionesTelekhines getEdificacionTelekhines(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VehiculosTelekhines getVehiculoTelekhines(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Guerreros getSoldadoTelekhines(String tipo) {
        switch(tipo){
            case "Raiders":
                return new Raider();
            case "WizardSaint": //De este solo podrá haber uno en batalla **DEBERÉ HACER TAL VALIDACIÓN
                return new WizardSaint();
        }
        return null;
    }

    

    
    
}
