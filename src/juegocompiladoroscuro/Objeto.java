/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegocompiladoroscuro;

/**
 *
 * @author soraya
 */
public class Objeto implements InterfazObjeto{
    protected String nombre;

    public Objeto(String nombre) {
        this.nombre = nombre;
    }
    public abstract void equiparObjeto(Valientes valiente);

    public String getNombre() {
        return nombre;
    }
}
