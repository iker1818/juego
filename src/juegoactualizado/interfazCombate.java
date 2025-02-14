/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package juegocompiladoroscuro;

/**
 *
 * @author soraya
 */
public interface interfazCombate {
 
 public void  iniciarCombate(Valientes valiente ,Monstruos monstruo);
 public void turno(Personaje atacante, Personaje defensor);
 public void terminarCombate(Valientes valiente ,Monstruos monstruo);

}
