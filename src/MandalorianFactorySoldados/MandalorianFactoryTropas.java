/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MandalorianFactorySoldados;

import AbstractFactoryMandalore.AbstractFactoryMandalorian;
import MandalorianFactoryEdificaciones.EdificacionesMandalorian;
import MandalorianFactoryVehiculos.VehiculosMandalorian;

/**
 *
 * @author aacm12
 */
public class MandalorianFactoryTropas extends AbstractFactoryMandalorian{

    @Override
    public EdificacionesMandalorian getEdificacionMandalorian(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VehiculosMandalorian getVehiculoMandalorian(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Tropas getSoldadoMandalorian(String tipo) {
         switch(tipo){
            case "NiteOwels":
                return new NiteOwls();
            case "SuperCommando": //De este solo podrá haber uno en batalla **DEBERÉ HACER TAL VALIDACIÓN
                return new SuperCommando();
        }
        return null;
    }
    
}
