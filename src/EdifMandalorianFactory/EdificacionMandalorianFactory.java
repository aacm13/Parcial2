/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdifMandalorianFactory;

import SoldaMandalorianFactory.Soldados;
import VehMandalorianFactory.Vehiculos;
import AbstractFactoryMandalore.AbstractFactoryMandalorian;

/**
 *
 * @author Josué González <00034715@uca.edu.sv>
 */
public class EdificacionMandalorianFactory extends AbstractFactoryMandalorian {
    @Override
    public EdificacionesMandalorian getEdificacionMandalorian(String tipo) {
        switch (tipo) {
            case "Edif recurso Fibra-Seda":
                return new MinaCobre(); //Debo colocar una opción de recolectar recuros...
            case "Edif recurso Plata":
                return new MinaPlata(); //Debo colocar una opción de recolectar recuros...
            case "Edif recurso Roble":
                System.out.println("..SE EJECUTA ESTO SIN PROBLEMAS");
                return new MinaOro(); //generará el recurso automáticamente...
            case "Edif entrenamiento Super Soldado y Milicia": //**** luego deberé amarrar que si creo unos soldados no pueden existir sin esta edif...
                return new EdifEntrenamientoMyEGH();
            case "Edif entrenamiento Águilas Gigantes": //Vehiculo aéreo
                return new FabricaBasilisk();
            case "Edif entrenamiento Jabalíes Enormes": //Vehiculo terrestre
                return new FabricaSabertank();
        }
        return null;
    }

    @Override
    public VehiculosMandalorian getVehiculoMandalorian(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SoldadosMandalorian getSoldadoMandalorian(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
