/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package juegocompiladoroscuro;

import juegocompiladoroscuro.Objeto;

/**
 *
 * @author soraya
 */
public interface interfazInventario {
 
 public void agregarObjeto(Objeto objeto);
 public void usarObjeto(String nombre, Valientes valiente);
 public void mostrarInventario();

}
