/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fes.Aragon.colecciones;

/**
 *
 * @author Enoc
 */
public class Nodo {
    
    private int dato;
    private Nodo siguiente;
    public Nodo(int dato){
        this(dato,null);
    }
    public Nodo(int dato, Nodo siguiente){
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

  
    
}
