/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegocompiladoroscuro;

/**
 *
 * @author soraya
 */
public class Valientes implements interfazPersonaje, interfazValiente{
    
    //Atributos
    protected int vida;
    protected int fuerza;
    protected int defensa;
    protected int habilidad;
    protected int velocidad;
    protected Objeto arma;
    protected Objeto escudo;
    protected int nivel;
    
    //Constructor
    public Valientes(int vida, int fuerza, int defensa, int habilidad, int velocidad, Objeto arma, Objeto escudo, int nivel) {
        this.vida = vida;
        this.fuerza = fuerza;
        this.defensa = defensa;
        this.habilidad = habilidad;
        this.velocidad = velocidad;
        this.arma = arma;
        this.escudo = escudo;
        this.nivel = nivel;
    }
    
    //Métodos
    //Calcula y aplica el daño al enemigo
    @Override
    public void atacar(Monstruo enemigo) {      
        int danio = (this.fuerza * this.nivel);
        if (danio > 0) {
            Monstruo.recibirDaño(danio);
            System.out.println("El monstruo ha hecho: " + danio + " daño");
        } else {
            System.out.println("0 daño");
        }
    }
    
    //Restar vida al valiende al recibir daño
    @Override
    public void recibirDaño(int cantidad){
        this.vida -= cantidad;
        if (this.vida < 0) 
            this.vida = 0; //En caso de vida negtiva se establece a 0       
        System.out.println("El valiente tiene: " + this.vida + " de vida.");
    }
    
    //Ejecuta un ataque especial según la clase del valiente
    @Override
    public void usarHhabilidadEspecial(Monstruo enemigo){
        int danio = (this.fuerza * this.nivel);
        if (danio > 0) {
            Monstruo.recibirDaño(danio);
            System.out.println("El monstruo ha hecho: " + danio + " daño");
        } else {
            System.out.println("0 daño");
        }
    }

    //Mejora atributos del valiente tras ganar experiencia
    @Override
    public void subirNivel(){
        nivel++;
        //Sube los puntos necesarios de cada atributo (en caso de límite se establece al máximo)
        vida = (vida + 10 > 100) ? 100 : vida + 10; 
        fuerza = (fuerza >= 20) ? 20 : ++fuerza;
        defensa = (defensa >= 20) ? 20 : ++defensa;
        habilidad = (habilidad >= 20) ? 20 : ++habilidad;
        velocidad = (velocidad >= 20) ? 20 : ++velocidad;
    }
}
