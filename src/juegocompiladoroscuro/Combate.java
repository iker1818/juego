/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegocompiladoroscuro;

/**
 *
 * @author soraya
 */
public class Combate implements interfazCombate {


    public void iniciarCombate(Valientes valiente, Monstruos monstruo) {
        Random rand = new Random();

        
        double velocidadValiente = valiente.velocidad * (0.75 + (rand.nextDouble() * 0.25)); 

      
        double velocidadMonstruo = monstruo.velocidad * (0.75 + (rand.nextDouble() * 0.25)); 

     
        if (velocidadValiente > velocidadMonstruo) {
            System.out.println("El Valiente ataca primero.");
            do {
                monstruo.atacar(valiente);
                if (valiente.vida > 0) {
                    valiente.atacar(monstruo);
                }

            } while (monstruo.vida > 0 && valiente.vida > 0);
        } else {
            System.out.println("El Monstruo ataca primero.");
            do {
                monstruo.atacar(valiente);
                if (valiente.vida > 0) {
                    valiente.atacar(monstruo);
                }

            } while (monstruo.vida > 0 && valiente.vida > 0);
        }

      
        if (monstruo.vida == 0) {
            System.out.println("VICTORIA");
        } else {
            System.out.println("¡DERROTA!");
        }
    }


    public void Turno(Personaje atacante, Personaje defensor) {
        Random rand = new Random();
        int resultado = rand.nextInt(2); // Genera 0 o 1 

        if (resultado == 0) {
            // Cálculo de daño basado en la fuerza y nivel
            int danio = atacante.getFuerza() * atacante.getNivel();
            defensor.recibirDaño(danio);
            System.out.println("El atacante hizo " + danio + " de daño al defensor.");
        } else {
            System.out.println("El defensor se defendió.");
        }
    }


    public void terminarCombate(Valientes valiente, Monstruos monstruo) {
        // Método para terminar el combate, mostrando un resumen de la batalla
        if (monstruo.vida == 0) {
            System.out.println("El Valiente ha ganado la batalla.");
        } else if (valiente.vida == 0) {
            System.out.println("El Monstruo ha ganado la batalla.");
        }
        System.out.println("Fin del combate.");
    }

    @Override
    public void iniciarCombate(Object valiente, Object monstruo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
/*
}

   

    public void combateTerminado(Valiente Maliente, Monstruo monstruo) {

    }
}
 */
