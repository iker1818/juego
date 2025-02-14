/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegocompiladoroscuro;

/**
 *
 * @author soraya
 */
public class Monstruos extends Personaje {

 

    //constructor
    public Monstruos(int vida, int fuerza, int defensa, int habilidad, int velocidad, int nivel) {
       super(vida, fuerza, defensa, habilidad, velocidad, nivel);
    }

    //para atacar
    public void atacar(Valientes valiente) {
        int danio = this.fuerza * this.nivel; //el daño sera en funccion del nivel por la fuerzza
        if (danio > 0) {  //si metes mas de 0 daño
            valiente.recibirDaño(danio);  //el valiente recibe daño
            System.out.println("El monstruo ha hecho " + danio + " de daño.");
        } else {
            System.out.println("El monstruo ha hecho 0 de daño."); //y si no metes daño pues es 0
        }
    }

    //para recibir daño
    public void recibirDaño(int danio) {
        this.vida -= danio; //restas a la vida el daño
        if (this.vida < 0) {  //para que si la vida es numero negtivo sea 0 igualmente la vida
            this.vida = 0;
        }
        System.out.println("El monstruo tiene " + this.vida + " de vida restante.");  //la vida q nos queda
    }

    //geters
    public int getVida() {
        return vida;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getNivel() {
        return nivel;
    }

    public int getVelocidad() {
        return velocidad;
    }
}
