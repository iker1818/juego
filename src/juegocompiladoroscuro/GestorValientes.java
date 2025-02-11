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

    protected Valientes[] valientes;
    protected int contador = 0;

    //Constructor
    public GestorValientes() {
        valientes = new Valientes[5];
    }
    
    //Crea un valiente de cada tipo, los atributos iniciales suman un total de 40 puntos
    @Override
    public void crearValientesIniciales(){
        Valientes guerrero = new Valientes(60, 15, 12, 5, 8, null, null, 1);
        valientes[contador] = guerrero;
        System.out.println("---------Guerrero--------\nNivel: " + valientes[contador].nivel + "\nVida: " + valientes[contador].vida + "\nFuerza: " + valientes[contador].fuerza + "\nDefensa: " + valientes[contador].defensa + "\nHabilidad: " + valientes[contador].habilidad + "\nVelocidad: " + valientes[contador].velocidad + "\nObjetos: ");
        contador++;
        
        Valientes paladin = new Valientes(60, 12, 15, 5, 8, null, null, 1);
        valientes[contador] = paladin;
        System.out.println("---------Paladin--------\nNivel: " + valientes[contador].nivel + "\nVida: " + valientes[contador].vida + "\nFuerza: " + valientes[contador].fuerza + "\nDefensa: " + valientes[contador].defensa + "\nHabilidad: " + valientes[contador].habilidad + "\nVelocidad: " + valientes[contador].velocidad + "\nObjetos: ");
        contador++;
        
        Valientes mago = new Valientes(40, 9, 5, 15, 11, null, null, 1);
        valientes[contador] = mago;
        System.out.println("---------Mago--------\nNivel: " + valientes[contador].nivel + "\nVida: " + valientes[contador].vida + "\nFuerza: " + valientes[contador].fuerza + "\nDefensa: " + valientes[contador].defensa + "\nHabilidad: " + valientes[contador].habilidad + "\nVelocidad: " + valientes[contador].velocidad + "\nObjetos: ");
        contador++;
        
        Valientes picaro = new Valientes(40, 6, 7, 12, 15, null, null, 1);
        valientes[contador] = picaro;
        System.out.println("---------Picaro--------\nNivel: " + valientes[contador].nivel + "\nVida: " + valientes[contador].vida + "\nFuerza: " + valientes[contador].fuerza + "\nDefensa: " + valientes[contador].defensa + "\nHabilidad: " + valientes[contador].habilidad + "\nVelocidad: " + valientes[contador].velocidad + "\nObjetos: ");
        contador++;
    }
}
