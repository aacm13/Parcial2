/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MandalorianFactoryVehiculos;

import AbstractFactoryMandalore.AbstractFactoryMandalorian;
import MandalorianFactoryEdificaciones.EdificacionesMandalorian;
import MandalorianFactorySoldados.Tropas;

/**
 *
 * @author aacm12
 */
public class MandalorianFactoryVehiculos extends AbstractFactoryMandalorian {

    @Override
    public EdificacionesMandalorian getEdificacionMandalorian(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VehiculosMandalorian getVehiculoMandalorian(String tipo) {
        switch (tipo) {
            case "Sabertank":
                return new Sabertank();
            case "Basilisk": //De este solo podrá haber uno en batalla **DEBERÉ HACER TAL VALIDACIÓN
                return new Basilisk();
        }
        return null;
    }

    @Override
    public Tropas getSoldadoMandalorian(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
