/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BravosiFactorySoldados;

import AbstractFactoryBravos.AbstractFactoryBravosi;
import BravosiFactoryEdificaciones.EdificacionesBravosi;
import BravosiFactoryVehiculos.VehiculosBravosi;

/**
 *
 * @author aacm12
 */
public class BravosiFactoryMilitia extends AbstractFactoryBravosi {

    @Override
    public EdificacionesBravosi getEdificacionBravosi(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VehiculosBravosi getVehiculoBravosi(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Militia getSoldadoBravosi(String tipo) {
        switch (tipo) {
            case "Raiders":
                return new MilitiaCivil();
            case "WizardSaint": //De este solo podrá haber uno en batalla **DEBERÉ HACER TAL VALIDACIÓN
                return new BountyHunters();
        }
        return null;
    }

}
