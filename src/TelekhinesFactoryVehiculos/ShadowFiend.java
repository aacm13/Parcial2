/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TelekhinesFactoryVehiculos;

import java.util.Random;

/**
 *
 * @author acm12
 */
public class ShadowFiend implements VehiculosTelekhines {

    private int Vida = 300 - 20; //toda tropa Telekhines tiene -20 de vida
    private String nombre;
    private Random rand = new Random();

    public ShadowFiend() {
    }

    public ShadowFiend(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return Vida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVida(int Vida) {
        this.Vida = Vida;
    }

    @Override
    public int attack() {
        int damage = 60 + 20;//todas las tropas Telekhines hacen +20 puntos de daño
        int prob = rand.nextInt(10);
        if (prob > 4) {//por el hecho que muy buenas armas tienen acceptable probabilidad de hacer daño
            return damage;
        }
        return damage / 3;//si fallan entonces solo hacen un tercio del daño
    }

    @Override
    public int vida(int EnemyDamage) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void damage(int EnemyDamage) {
        this.Vida -= EnemyDamage;
    }

}
