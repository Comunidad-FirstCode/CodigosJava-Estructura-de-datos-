/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fes.Aragon.inicio;
import Fes.Aragon.colecciones.ListaEnteros;
/**
 *
 * @author Enoc
 */
public class Inicio {
    public static void main(String[] args) {
        ListaEnteros lista = new ListaEnteros();
        for (int i = 0; i < 11; i++) {
            lista.agregarCabeza(i);
        }
        lista.imprimir();
    }
}
