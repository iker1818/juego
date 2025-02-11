/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegocompiladoroscuro;

/**
 *
 * @author soraya
 */
public class CompiladorOscuro implements interfazCompiladorOscuro{
    protected int vida;
    protected int Fuerza;
    protected int Defensa;
    protected int Habilidad;
    protected int Velocidad;

    public JuegoCompiladorOscuro() {
        this.vida = 150;
        this.Fuerza = 0;
        this.Defensa = 0;
        this.Habilidad = 0;
        this.Velocidad = 0;
    }

    public void aumentarEstadisticas() {
        int cantidad = GestorMonstruos.getContador();
        int aumento = cantidad * 3;
        this.Fuerza = aumento;
        this.Defensa = aumento;
        this.Habilidad = aumento;
        this.Velocidad = aumento;
    }
}
