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

    //atributos
    //arrays de monstruos
    protected Monstruos[] monstruos;
    protected int cantidadMonstruos; //constructor

    public GestorMonstruos() {
        monstruos = new Monstruos[10]; //habra 10 monstruos
        cantidadMonstruos = 0; //constructor iniciado a 0
    }

    //para generar monstruos
    public void generarMonstruo(int nivel) {
        //si el contador es meenor a la cantidad del array podremos añadir monstruos
        if (cantidadMonstruos < monstruos.length) {
            //nuevo monstruo que cada vez que gane aumenta el nivel, lo va multiplicando *10
            Monstruos monstruo = new Monstruos(nivel * 10, nivel, nivel, nivel, nivel, nivel);
            monstruos[cantidadMonstruos++] = monstruo; //se va añadiendo monstruos al contador
            System.out.println("Monstruo Nivel " + nivel);
        } else {
            System.out.println("No se pueden generar más monstruos."); //en caso de q mos pasemos
        }
    }

    
    //eliminamos monstruos cada vez q mueran
    @Override
    public void eliminarMonstruo(Monstruos monstruo) {
        //si la vida del monstruo es igual o menor d 0 se eliminara
        if (monstruo.getVida() <= 0) {
            for (int i = 0; i < cantidadMonstruos; i++) {
                if (monstruos[i] == monstruo) {
                    System.out.println("Monstruo eliminado.");
                    monstruos[i] = monstruos[cantidadMonstruos - 1]; // Reemplaza con el último
                    monstruos[cantidadMonstruos - 1] = null; // Limpia el último
                    cantidadMonstruos--;
                    break; //salimos
                }
            }
        }
    }
}
