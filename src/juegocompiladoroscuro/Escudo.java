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
public class Escudo extends Objeto{

    private int aumentoDefensa;
    
    public Escudo(String nombre, int aumentoDefensa) {
        super(nombre);
        this.aumentoDefensa = aumentoDefensa;
    }

    public void equiparObjeto(Valientes valiente) {
        valiente.defensa(aumentoDefensa);
        System.out.println(valiente.getNombre() + " ha equipado " + nombre + " y ha aumentado su defensa en " + aumentoDefensa);
    }
}
