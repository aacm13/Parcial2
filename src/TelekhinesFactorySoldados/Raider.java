/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TelekhinesFactorySoldados;

import MandalorianFactorySoldados.*;
import java.util.*;

/**
 *
 * @author aacm12
 */
//
public class Raider implements Guerreros{
    private int Vida = 100-20; //
    private String nombre;
    private Random rand = new Random();

    public Raider() {
    }

    public Raider(String nombre) {
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
    public int vida(int EnemyDamage) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int attack() {
        int damage= 20+20;//
        int prob = rand.nextInt(10);
        if (prob>2){//
            return damage;
        }
        return damage/3;//si fallan entonces solo hacen un tercio del daño
    }

    @Override
    public void damage(int EnemyDamage) {
        this.Vida -= EnemyDamage;
    }
    
}
