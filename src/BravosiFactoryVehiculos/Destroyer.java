/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BravosiFactoryVehiculos;


import java.util.Random;

/**
 *
 * @author acm12
 */
public class Destroyer implements VehiculosBravosi {
    private int Vida = 300;
    private String nombre;
    private Random rand = new Random();

    public Destroyer() {
    }

    public Destroyer(String nombre) {
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
        int damage= 60;
        int prob = rand.nextInt(10);
        if (prob>3){
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
