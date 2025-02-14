/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegocompiladoroscuro;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author soraya
 */
public class Juego implements interfazJuego{
    private Valiente valiente;
    private GestorValientes gestorValientes;
    private GestorMonstruos gestorMonstruos;
    private Mapa mapa;
    private GestorObjeto gestorObjetos;
    private CompiladorOscuro jefeFinal;
    public Juego(){
        gestorValientes = new GestorValientes();
        gestorMonstruos = new GestorMonstruos();
        mapa = new Mapa(10,10);
        gestorObjetos = new GestorObjetos();
      
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
                    gestorValientes.crearValientesIniciales();
                    validarSelecionHeroe = false;
      
                    break;
                case 2:
                    System.out.println("Creacion de nuevo valiente");
                    System.out.println("Introduce el nombre de tu valiente:");
                    String nombre = teclado.nextLine();
                    System.out.println("Tienes 40 puntos a repartir entre las siguientes caracteristicas: Fuerza, Defensa y Velocidad ");
                    int saldo=40;
                    System.out.println("Introduce los puntos que quieres destinar a la fuerza:");
                    int fuerza = teclado.nextInt();
                    saldo = saldo-fuerza;
                    System.out.println("Introduce los puntos que quieres destinar a la defensa:");
                    int defensa = teclado.nextInt();
                    saldo = saldo-defensa;
                    System.out.println("Introduce los puntos que quieres destinar a la habilidad:");
                    int habilidad = teclado.nextInt();
                    saldo = saldo-habilidad;
                    System.out.println("Introduce los puntos que quieres destinar a la velocidad:");
                    int velocidad = teclado.nextInt();
                    saldo = saldo-velocidad;
                    System.out.println("Personaje creado correctamente.");
                    Valiente valiente = new Valiente(100,fuerza, defensa, habilidad, velocidad, Objeto vacio, Escudo vacio, 1 );
                    validarSelecionHeroe = false;
                    break;  
            }   
         }   
        
}
public void MostrarMenu(Mapa m1){
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
                    System.out.println("MAPA:");
                    m1.MostrarMapa();
                    System.out.println("Leyenda del Mapa:");
                    System.out.println("-------------------");
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
