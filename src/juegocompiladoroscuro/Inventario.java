/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegocompiladoroscuro;

/**
 *
 * @author soraya
 */
public class Inventario implements interfazInventario{
    protected Objeto[] inventario;
    protected static int contador;
    
    public Inventario(int tamaño) {
        inventario = new Objeto[tamaño];
        contador = 0;
    }
    
    public void agregarObjeto(Objeto objeto) {
        if (contador < inventario.length) {
            inventario[contador] = objeto;
            System.out.println(objeto.getNombre() + " ha sido añadido al inventario");
            contador++;
        } else {
            System.out.println("El inventario está lleno");
        }
    }
    
    public void usarObjeto(String nombre, Valientes valiente) {
        for (int i = 0; i < contador; i++) {
            if (inventario[i] != null && inventario[i].getNombre().equalsIgnoreCase(nombre)) {
                inventario[i].equiparObjeto(valiente);
                inventario[i] = null;
                return;
            }
        }
        System.out.println("El objeto " + nombre + " no está en el inventario.");
    }
    
    public void mostrarInventario() {
        System.out.println("Inventario:");
        for (int i = 0; i < contador; i++) {
            System.out.println("- " + inventario[i].getNombre());
        }
    }
    
}
