/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstracFactory;

import Mandalorian.FactoryMandalorian;
import Telekhines.FactoryTelekhines;
import Basilisk.FactoryBasilisk;
import SaberTank.FactorySaberTank;
import ShadowFiend.FactoryShadowFiend;
import Ibbennesee.FactoryIbbennesse;

/**
 *
 * @author Jorge
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(Type raza, TypeVehiculo vehi){
        switch (raza){
            case MANDALORIANS: 
                return  new FactoryMandalorian();
            case TELEKHINES:
                return  new FactoryTelekhines();
            case IBBENNESSE:
                return  new FactoryIbbennesse();
            default: 
               switch (vehi){
                    case BASILISK:
                       return new FactoryBasilisk();
                    case SABERTANK:
                       return new FactorySaberTank();
                    case SHADOWFIEND:
                       return new FactoryShadowFiend();
                    default:
                        return null;
                }
        }
    }
    
    
    
}

