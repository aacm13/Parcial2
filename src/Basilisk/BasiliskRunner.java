/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basilisk;

/**
 *
 * @author Jorge
 */
public class BasiliskRunner {
    private String nombre;
    private int vida;
    private int ataque;
    private int tiempo;

    public BasiliskRunner() {
    }

    public BasiliskRunner(String nombre, int vida, int ataque, int tiempo) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getTiempo() {
        return tiempo;
    }

    public int getVida() {
        return vida;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
