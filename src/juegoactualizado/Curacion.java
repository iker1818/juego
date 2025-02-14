/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegoactualizado;

/**
 *
 * @author soraya
 */
public class Curacion extends Objeto {
    private int curacion;
    
    public Curacion(String nombre, int curacion) {
        super(nombre);
        this.curacion = curacion;
    }
   
    public void equiparObjeto(Valientes valiente) {
        int vida = valiente.getvida();
        vida = vida + curacion;
        valiente.setVida(vida);
        System.out.println(valiente.getNombre() + " ha usado " + nombre + " y ha recuperado " + curacion + " puntos de vida.");
    }
}
