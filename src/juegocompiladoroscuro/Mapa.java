/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegocompiladoroscuro;

/**
 *
 * @author soraya
 */
public class Mapa extends Casillas implements interfazMapa{

    Casilla [][] Mapa;
    Casilla casilla;
    
    
    public Mapa(int x, int y){
        this.Mapa = new Casilla[x][y];
        inicializarMapa();
    }
    public void inicializarMapa(){
        for (int i = 0; i < Mapa.length; i++) {
            for (int j = 0; j < Mapa[i].length; j++) {
                Mapa[i][j] = new Casilla(null,false,null);
            }
        }
    }
    
    public void generarMapa(){
        Random random = new Random();
        for (int i = 0; i < Mapa.length; i++) {
            for (int j = 0; j < Mapa[i].length; j++) {
                int chance = random.nextInt(100); 

                if (chance < 20) { 
                    Mapa[i][j].setPersonaje(new Monstruos());
                } else if (chance < 40) { 
                    Mapa[i][j].setObjeto(new Objeto());
                }
            }
        }
    }
    public void mostrarMapa(){
        for (int i = 0; i < Mapa.length; i++) {
            for (int j = 0; j < Mapa[i].length; j++) {
                Casilla casilla = Mapa[i][j];
                if (casilla.getPersonaje() instanceof Monstruos) {
                    System.out.print("M ");
                } else if (casilla.getObjeto() instanceof Objeto) {
                    System.out.print("O ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    public class Casilla {
    boolean visitado;
    Personaje personaje;
    Monstruos monstruo;
    Objeto objeto;
    int contador;
    
 
    
    public Casilla(Objeto objeto, boolean visitado, Personaje personaje){
        this.objeto = objeto;
        this.visitado = visitado;
        this.personaje = personaje;
    }
    public Objeto getObjeto() {
        return objeto;
    }

    public void setObjeto(Objeto objeto) {
        this.objeto = objeto;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    public Monstruos getMonstruo() {
        return Monstruos;
    }

    public void setMonstruo(Monstruos monstruo) {
        this.Monstruos = Monstruos;
    }
}
    
    


}
