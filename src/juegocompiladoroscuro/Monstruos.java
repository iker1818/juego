/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegocompiladoroscuro;

/**
 *
 * @author soraya
 */
public class Monstruos {

    //atributos
    protected int vida;
    protected int fuerza;
    protected int defensa;
    protected int habilidad;
    protected int velocidad;
    protected int nivel;

    //constructor
    public Monstruos(int vida, int fuerza, int defensa, int habilidad, int velocidad, int nivel) {
        this.defensa = defensa;
        this.fuerza = fuerza;
        this.habilidad = habilidad;
        this.velocidad = velocidad;
        this.vida = vida;
    }

    //metodos principales
    public void atacar(Monstruos valiente) {
        //hace daño dependiendo del nivel y fuerza del mosntruo
        int danio = (this.fuerza * this.nivel);
        if (danio > 0) { //si el daño es mas que 0 hace daño
            valiente.recibirDaño(danio);
            System.out.println("El monstruo ha hecho: " + danio + "daño");
        } else {
            System.out.println("0 daño"); //si no decimos que ha pegado 0 de daño
        }

    }

    public void recibirDaño(int danio) {
        this.vida -= danio; //resta el daño a la vida del monstruo
        if (this.vida < 0) { //para que no haya vida negativa
            this.vida = 0;

        }
        System.out.println("El monstruo tiene: " + this.vida);
    }
}
