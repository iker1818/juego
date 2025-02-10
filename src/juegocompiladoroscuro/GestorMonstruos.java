/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegocompiladoroscuro;

/**
 *
 * @author soraya
 */
public class GestorMonstruos extends Monstruos {

    protected Monstruos[] monstruos;
    protected int contadorMonstruos;

    //constructor
    public GestorMonstruos(int vida, int fuerza, int defensa, int habilidad, int velocidad, int nivel) {
        super(vida, fuerza, defensa, habilidad, velocidad, nivel);
        monstruos = new Monstruos[10]; //la capacidad del array es de 10
        this.contadorMonstruos = 0; //de momento no hay monstruos
    }

    //metodos principales
    public void generarMonstruos() {
        //crear monstruos
        Monstruos Tiefling = new Monstruos(10, 20, 5, 7, 8, 4);
        Monstruos Orco = new Monstruos(10, 20, 5, 7, 8, 4);
        Monstruos OsoLechuza = new Monstruos(10, 20, 5, 7, 8, 4);
        Monstruos Liche = new Monstruos(10, 20, 5, 7, 8, 4);
        Monstruos Kobold = new Monstruos(10, 20, 5, 7, 8, 4);
        //almacenar monstruos en el array
        monstruos[contadorMonstruos++] = Tiefling;
        monstruos[contadorMonstruos++] = Orco;
        monstruos[contadorMonstruos++] = OsoLechuza;
        monstruos[contadorMonstruos++] = Liche;
        monstruos[contadorMonstruos++] = Kobold;

    }

    public void eliminarMonstruos() {

    }
}
