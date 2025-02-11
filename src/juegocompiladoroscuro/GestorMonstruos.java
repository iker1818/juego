/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegocompiladoroscuro;

/**
 *
 * @author soraya
 */
public class GestorMonstruos implements interfazGestorMonstruo {

    protected Monstruos[] monstruos;
    protected static int contador = 0;

    //constructor
    public GestorMonstruos() {
        monstruos = new Monstruos[10]; //la capacidad del array es de 10
    }

    //metodos principales
    public void generarMonstruo(int nivel) {
       
        //crear monstruos
        Monstruos monstruo = new Monstruos(nivel * 10, nivel, nivel, nivel, nivel, nivel);
        monstruos[contador] = monstruo;
        contador++;
        System.out.println("Monstruo Nivel; " + nivel);

    }

    public void eliminarMonstruo(Monstruos monstruo) {
        if (monstruo.vida <= 0) {
            System.out.println("Monstruo eliminado");
            monstruos[contador] = monstruo;
            contador--;

        }
    }

    public Monstruos[] getMonstruos() {
        return monstruos;
    }

    public void setMonstruos(Monstruos[] monstruos) {
        this.monstruos = monstruos;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
}
