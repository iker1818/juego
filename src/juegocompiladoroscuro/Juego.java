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
public void MostrarMenu(){
        Scanner teclado = new Scanner(System.in);
        boolean validarMenu = true;
        while(validarMenu){
        System.out.println("MENU:");
        System.out.println("1) Mostrar valiente");
        System.out.println("2) Equipar Objeto");
        System.out.println("3) Mostrar Mapa");
        System.out.println("4) Moverse");
        System.out.println("5) Salir juego");
        int menu = teclado.nextInt();
        switch(menu){
                case 1:
                    System.out.println("Mostrando Valiente");
                    break;
                case 2:
                    System.out.println("Equipando objeto");
                    break;
                case 3:
                    m1.MostrarMapa();
                    System.out.println("Leyenda del Mapa:");
                    System.out.println("* = Casilla vacia");
                    System.out.println("M = Mounstruo en la casilla");
                    System.out.println("O = Objeto en la casilla");
                    break;
                case 4:
                     System.out.println("Personaje en movimiento");
                     break;
                case 5:
                    System.out.println("SALIENDO DEL JUEGO...");
                    validarMenu = false;
                    break;      
            }
        }
         
    }
