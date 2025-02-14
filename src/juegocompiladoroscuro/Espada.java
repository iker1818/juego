/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegocompiladoroscuro;

import juegoactualizado.Valientes;

/**
 *
 * @author soraya
 */
public class Espada extends Objeto{
    
    private int aumentoFuerza;

    public Espada(int aumentoFuerza, String nombre) {
        super(nombre);
        this.aumentoFuerza = aumentoFuerza;
    }
    
    public void equiparObjeto(Valientes valiente) {
        valiente.arma(aumentoFuerza);
        System.out.println(valiente.getNombre() + " ha equipado " + nombre + " y ha aumentado su fuerza en " + aumentoFuerza);
    }
}
