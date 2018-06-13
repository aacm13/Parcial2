/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificaciones;

/**
 *
 * @author Jorge
 */
public class Coins implements Edificaciones {

    int lp, damage, coins;
    @Override
    public void DesplegarEdificacion(int lp, int damage) {
        this.lp = lp;
        this.damage = damage;
    }

    @Override
    public int getLp() {
        return lp;
    }

    @Override
    public void setLp(int lp) {
        this.lp = lp;
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public int Coins() {
        return 0;
    }
    
}
