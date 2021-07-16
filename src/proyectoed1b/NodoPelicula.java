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
    private NodoPelicula nodoProximo;
    private NodoPelicula nodoAnterior;

    public NodoPelicula() {
    }

    public NodoPelicula(Peliculas dato, NodoPelicula nodoProximo, NodoPelicula nodoAnterior) {
        this.dato = dato;
        this.nodoProximo = nodoProximo;
        this.nodoAnterior = nodoAnterior;
    }

    public Peliculas getDato() {
        return dato;
    }

    public void setDato(Peliculas dato) {
        this.dato = dato;
    }

    public NodoPelicula getNodoProximo() {
        return nodoProximo;
    }

    public void setNodoProximo(NodoPelicula nodoProximo) {
        this.nodoProximo = nodoProximo;
    }

    public NodoPelicula getNodoAnterior() {
        return nodoAnterior;
    }

    public void setNodoAnterior(NodoPelicula nodoAnterior) {
        this.nodoAnterior = nodoAnterior;
    }

}
