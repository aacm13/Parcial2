/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mandalorian;

import AbstracFactory.AbstractFactory;
import Ibbennesee.Ibb;
import Telekhines.Telekhines;
import SaberTank.Tank;
import ShadowFiend.Shadow;
import Basilisk.Basilisk;

/**
 *
 * @author Jorge
 */
public class FactoryMandalorian implements AbstractFactory{

    @Override
    public Mandalore getMandalore(String type) {
        switch (type){
            case "Tropas":
                return new Tropas();
            case "":
        }
        return null;
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
