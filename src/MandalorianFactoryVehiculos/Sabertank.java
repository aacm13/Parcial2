/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MandalorianFactoryVehiculos;

import java.util.Random;

/**
 *
 * @author acm12
 */
public class Sabertank implements VehiculosMandalorian {
    private int Vida = 300+20; //toda tropa Mandalorian tiene +20 de vida
    private String nombre;
    private Random rand = new Random();

    public Sabertank() {
    }

    public Sabertank(String nombre) {
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
        int damage= 60+15;//todas las tropas Mandalorian hacen +15 puntos de daño
        int prob = rand.nextInt(10);
        if (prob>2){//por el hecho que son grandes guerreros tienen bastante probabilidad de hacer daño
            return damage;
        }
        return damage/3;//si fallan entonces solo hacen un tercio del daño
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
