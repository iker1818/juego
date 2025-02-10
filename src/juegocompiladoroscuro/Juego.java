/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegocompiladoroscuro;

/**
 *
 * @author soraya
 */
public class Juego implements interfazJuego{
    public Juego(){
    }
    
    public void iniciarJuego(){
         Scanner teclado = new Scanner(System.in);
        System.out.println("BIENVENIDO AL JUEGO DEL COPILADOR OSCURO");
         boolean validarSelecionHeroe = true;
         while(validarSelecionHeroe){
            System.out.println("Si quiere jugar la partida con un Valiente ya creado, pulse uno,"
            + " si quiere crear uno nuevo, pulse dos.");
             int selecionHeroe = teclado.nextInt();
             
            switch(selecionHeroe){
                case 1:
                    System.out.println("A continuacion se mostraran los valientes disponibles:");
                    break;
                case 2:
                    System.out.println("Creacion de nuevo valiente");
                    break;  
            }
            Mapa m1 = new Mapa('*',10);
            GestorMonstruos GM = new GestorMonstruos(10,10,10,10,10,10);
            GM.generarMonstruos();
            
            
             
             
         }
        
       
        
        
        
    }
    
}
