/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegocompiladoroscuro;

/**
 *
 * @author soraya
 */
public class GestorValientes implements interfazGestorValientes{

    protected Valiente[] valientes;
    protected int contador = 0;

    //Constructor
    public GestorValientes() {
        valientes = new Valiente[5];
    }
    
    //Crea un valiente de cada tipo, los atributos iniciales suman un total de 40 puntos
    @Override
    public void crearValientesIniciales(){
        Valiente guerrero = new Juego(60, 15, 12, 5, 8, arma, escudo, 1);
        valientes[contador] = guerrero;
        System.out.println("---------Guerrero--------\nNivel: " + valientes[contador].nivel + "\nVida: " + valientes[contador].vida + "\nFuerza: " + valientes[contador].fuerza + "\nDefensa: " + valientes[contador].defensa + "\nHabilidad: " + valientes[contador].habilidad + "\nVelocidad: " + valientes[contador].velocidad + "\nObjetos: ");
        contador++;
        
        Valiente paladin = new Juego(60, 12, 15, 5, 8, arma, escudo, 1);
        valientes[contador] = paladin;
        System.out.println("---------Paladin--------\nNivel: " + valientes[contador].nivel + "\nVida: " + valientes[contador].vida + "\nFuerza: " + valientes[contador].fuerza + "\nDefensa: " + valientes[contador].defensa + "\nHabilidad: " + valientes[contador].habilidad + "\nVelocidad: " + valientes[contador].velocidad + "\nObjetos: ");
        contador++;
        
        Valiente mago = new Juego(40, 9, 5, 15, 11, arma, escudo, 1);
        valientes[contador] = mago;
        System.out.println("---------Mago--------\nNivel: " + valientes[contador].nivel + "\nVida: " + valientes[contador].vida + "\nFuerza: " + valientes[contador].fuerza + "\nDefensa: " + valientes[contador].defensa + "\nHabilidad: " + valientes[contador].habilidad + "\nVelocidad: " + valientes[contador].velocidad + "\nObjetos: ");
        contador++;
        
        Valiente picaro = new Juego(40, 6, 7, 12, 15, arma, escudo, 1);
        valientes[contador] = picaro;
        System.out.println("---------Picaro--------\nNivel: " + valientes[contador].nivel + "\nVida: " + valientes[contador].vida + "\nFuerza: " + valientes[contador].fuerza + "\nDefensa: " + valientes[contador].defensa + "\nHabilidad: " + valientes[contador].habilidad + "\nVelocidad: " + valientes[contador].velocidad + "\nObjetos: ");
        contador++;
    }
}
