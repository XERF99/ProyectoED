/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoed1b;

/**
 *
 * @author barragán - rodríguez - guevara
 */
public class NodoPelicula {

    private Peliculas dato;
    private NodoPelicula siguiente;
   
    
    public NodoPelicula() {
    }

    public NodoPelicula(Peliculas dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public Peliculas getDato() {
        return dato;
    }

    public void setDato(Peliculas dato) {
        this.dato = dato;
    }

    public NodoPelicula getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPelicula nodoProximo) {
        this.siguiente = nodoProximo;
    }

}
