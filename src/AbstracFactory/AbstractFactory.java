/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstracFactory;

import AbstractFactoryIbben.Ibb;
import AbstractFactoryMandalore.Mandalore;
import Telekhines.Telekhines;
import SaberTank.Tank;
import ShadowFiend.Shadow;
import Basilisk.Basilisk;

/**
 *
 * @author Jorge
 */
public interface AbstractFactory {
    //Creacion de Razas
    Mandalore getMandalore(String type);
    Telekhines getTelekhines(String type);
    Ibb getIbb(String type);
    // Vehiculos
    Basilisk GetBasilisk(String type);
    Tank GetTank(String type);
    Shadow GetShadowFiend(String type);
    //Edificaciones
    
}
