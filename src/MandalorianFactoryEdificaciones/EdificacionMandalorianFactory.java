/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MandalorianFactoryEdificaciones;

import AbstractFactoryMandalore.AbstractFactoryMandalorian;
import MandalorianFactorySoldados.Tropas;
import MandalorianFactoryVehiculos.VehiculosMandalorian;

/**
 *
 * @author Josué González <00034715@uca.edu.sv>
 */
public class EdificacionMandalorianFactory extends AbstractFactoryMandalorian {
    @Override
    public EdificacionesMandalorian getEdificacionMandalorian(String tipo) {
        switch (tipo) {
            case "Edif recurso Cobre":
                return new MinaCobre(); //Debo colocar una opción de recolectar recuros...
            case "Edif recurso Plata":
                return new MinaPlata(); //Debo colocar una opción de recolectar recuros...
            case "Edif recurso Oro":
                System.out.println("..SE EJECUTA ESTO SIN PROBLEMAS");
                return new MinaOro(); //generará el recurso automáticamente...
            case "Edif entrenamiento Super Soldado y Milicia": //**** luego deberé amarrar que si creo unos soldados no pueden existir sin esta edif...
                return new MandalorianBarracks();
            case "Edif entrenamiento Basilisk": //Vehiculo aéreo
                return new FabricaBasilisk();
            case "Edif entrenamiento SaberTank": //Vehiculo terrestre
                return new FabricaSabertank();
        }
        return null;
    }

    @Override
    public VehiculosMandalorian getVehiculoMandalorian(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Tropas getSoldadoMandalorian(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
