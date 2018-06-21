/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TelekhinesFactoryEdificaciones;

import AbstractFactoryTelekhines.AbstractFactoryTelekhines;
import TelekhinesFactorySoldados.Guerreros;
import TelekhinesFactoryVehiculos.VehiculosTelekhines;

/**
 *
 * @author aacm12
 */
public class EdificacionTelekhinesFactory extends AbstractFactoryTelekhines {

    @Override
    public EdificacionesTelekhines getEdificacionTelekhines(String tipo) {
        switch (tipo) {
            case "Edif recurso Cobre":
                return new MinaCobre(); //Debo colocar una opción de recolectar recuros...
            case "Edif recurso Plata":
                return new MinaPlata(); //Debo colocar una opción de recolectar recuros...
            case "Edif recurso Oro":
                return new MinaOro(); //generará el recurso automáticamente...
            case "Edif entrenamiento Wizard Saints y Raiders": //**** luego deberé amarrar que si creo unos soldados no pueden existir sin esta edif...
                return new TelekhinesHall();
            case "Edif entrenamiento Dragon": //Vehiculo aéreo
                return new NidoDragon();
            case "Edif entrenamiento ShadowFiend": //Vehiculo terrestre
                return new SummoningCircle();
        }
        return null;
    }

    @Override
    public VehiculosTelekhines getVehiculoTelekhines(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Guerreros getSoldadoTelekhines(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
