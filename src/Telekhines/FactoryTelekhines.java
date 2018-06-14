/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telekhines;

import AbstracFactory.AbstractFactory;
import AbstractFactoryIbben.Ibb;
import AbstractFactoryMandalore.Mandalore;
import SaberTank.Tank;
import ShadowFiend.Shadow;
import Basilisk.Basilisk;

/**
 *
 * @author Jorge
 */
public class FactoryTelekhines implements AbstractFactory{
    
    @Override
    public Mandalore getMandalore(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Telekhines getTelekhines(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Ibb getIbb(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Basilisk GetBasilisk(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Tank GetTank(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Shadow GetShadowFiend(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
