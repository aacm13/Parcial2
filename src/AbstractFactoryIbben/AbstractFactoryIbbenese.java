/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryIbben;

import EdifIbbeneseFactory.EdificacionesIbbenese;
import SoldaIbbeneseFactory.SoldadosIbbenese;
import VehIbbeneseFactory.VehiculosIbbenese;

/**
 *
 * @author aacm12
 */
public abstract class AbstractFactoryIbbenese {
    //Esto me va a permitir escoger el tipo de edificación que el usario desea...

    public abstract EdificacionesMandalorian getEdificacionIbbenese(String tipo);

    public abstract VehiculosMandalorian getVehiculoIbbenese(String tipo);

    public abstract SoldadosMandalorian getSoldadoIbbenese(String tipo);

}
