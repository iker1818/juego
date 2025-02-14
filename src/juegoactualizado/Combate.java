/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegocompiladoroscuro;

import java.util.Random;

/**
 *
 * @author soraya
 */


public class Combate implements interfazCombate {
    
    @Override
    public void iniciarCombate(Valientes valiente, Monstruos monstruo) {
        Random rand = new Random();
        
        double velocidadValiente = valiente.velocidad * (0.75 + (rand.nextDouble() * 0.25));
        double velocidadMonstruo = monstruo.getVelocidad() * (0.75 + (rand.nextDouble() * 0.25));
        
        if (velocidadValiente > velocidadMonstruo) {
            System.out.println("El Valiente ataca primero.");
        } else {
            System.out.println("El Monstruo ataca primero.");
        }
        
        while (valiente.vida > 0 && monstruo.getVida() > 0) {
            if (velocidadValiente > velocidadMonstruo) {
                valiente.atacar(monstruo);
                if (monstruo.getVida() > 0) {
                    monstruo.atacar(valiente);
                }
            } else {
                monstruo.atacar(valiente);
                if (valiente.vida > 0) {
                    valiente.atacar(monstruo);
                }
            }
        }

        terminarCombate(valiente, monstruo);
    }

    @Override
    public void turno(Valientes atacante, Monstruos defensor) {
        Random rand = new Random();
        int resultado = rand.nextInt(2); 

        if (resultado == 0) {
            int danio = atacante.fuerza * atacante.nivel;
            defensor.recibirDaño(danio);
            System.out.println("El atacante hizo " + danio + " de daño al defensor.");
        } else {
            System.out.println("El defensor se defendió.");
        }
    }

    @Override
    public void terminarCombate(Valientes valiente, Monstruos monstruo) {
        System.out.println("Fin del combate.");
        System.out.println("Estado final del Valiente: Vida = " + valiente.vida);
        System.out.println("Estado final del Monstruo: Vida = " + monstruo.getVida());

        if (valiente.vida > 0) {
            System.out.println("¡El Valiente ha ganado la batalla y sube de nivel!");
            valiente.;
        } else {
            System.out.println("¡El Monstruo ha ganado la batalla!");
        }
    }
}
