/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegocompiladoroscuro;

/**
 *
 * @author soraya
 */
public class Objeto implements InterfazObjeto{
    protected String nombre;

    public Objeto(String nombre) {
        this.nombre = nombre;
    }
    public abstract void equiparObjeto(Valientes valiente);

    public String getNombre() {
        return nombre;
    }
}
public class Curacion extends Objeto {
    private int curacion;
    
    public Curacion(String nombre, int curacion) {
        super(nombre);
        this.curacion = curacion;
    }
   
    public void equiparObjeto(Valientes valiente) {
        int vida = valiente.getvida();
        vida = vida + curacion;
        valiente.setVida(vida);
        System.out.println(valiente.getNombre() + " ha usado " + nombre + " y ha recuperado " + curacion + " puntos de vida.");
    }
}
public class Espada extends Objeto{
    
    private int aumentoFuerza;

    public Espada(int aumentoFuerza, String nombre) {
        super(nombre);
        this.aumentoFuerza = aumentoFuerza;
    }
    
    public void equiparObjeto(Valientes valiente) {
        valiente.arma(aumentoFuerza);
        System.out.println(valiente.getNombre() + " ha equipado " + nombre + " y ha aumentado su fuerza en " + aumentoFuerza);
    }
}
public class Escudo extends Objeto{

    private int aumentoDefensa;
    
    public Escudo(String nombre, int aumentoDefensa) {
        super(nombre);
        this.aumentoDefensa = aumentoDefensa;
    }
    
    @Override
    public void equiparObjeto(Valientes valiente) {
        valiente.defensa(aumentoDefensa);
        System.out.println(valiente.getNombre() + " ha equipado " + nombre + " y ha aumentado su defensa en " + aumentoDefensa);
    }
}
