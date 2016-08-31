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
public class ListaEnteros {
    private  Nodo cabeza, cola;
    
    public ListaEnteros() {
        cabeza =cola= null;
    }
    public boolean esVacia() {
        return cabeza == null;
    }
    public void agregarCabeza(int dato) {
        cabeza = new Nodo (dato,cabeza);
        if (cola ==null) {
            cola = cabeza;
        }
        
    }
    public void agregarCola(int dato) {
        if (!esVacia()) {
            cola.setSiguiente(new Nodo(dato));
            cola =cola.getSiguiente();
            
        }
        else {
            cola = cabeza= new Nodo(dato);
        }
}
    public int eliminarDeCabeza(){
        int dato = cabeza.getDato();
        if(cabeza == cola){
         cabeza=cola=null;
        }
        else{
            cabeza= cabeza.getSiguiente();
        }
    return dato;
    }
     public int eliminarDeCola(){
        int dato = cabeza.getDato();
        if(cabeza == cola){
         cabeza=cola=null;
        }
        else{
            Nodo temp;
            for(temp=cabeza; temp.getSiguiente()!=cola;temp.getSiguiente());
            cola = temp;
            cola.setSiguiente(null);
        }
    return dato;
     }
 public void imprimir(){
     for(Nodo temp = cabeza; temp != null; temp = temp.getSiguiente()){
         System.out.println(temp.getDato()+"");
     }
 }
}

