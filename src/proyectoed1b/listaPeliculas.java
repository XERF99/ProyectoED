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
public class listaPeliculas {

    Peliculas Pelicula[] = new Peliculas[10];

    public void matrizPeliculas(Peliculas pelicula) {

        this.Pelicula[0] = new Peliculas(1, "Hachiko", 2009, 5, "Drama", "Disponible");
        this.Pelicula[1] = new Peliculas(2, "The Avengers", 2012, 4, "Acción", "Disponible");
        this.Pelicula[2] = new Peliculas(3, "Black Widow", 2021, 4, "Acción", "Disponible");
        this.Pelicula[3] = new Peliculas(4, "Que paso ayer", 2009, 4, "Comedia", "Disponible");
        this.Pelicula[4] = new Peliculas(5, "La Purga: Infinita", 2021, 3, "Terror", "Disponible");
        this.Pelicula[5] = new Peliculas(6, "Plup Fiction", 1994, 5, "Comedia", "Disponible");
        this.Pelicula[6] = new Peliculas(7, "Sin City", 2005, 3, "Acción", "Disponible");
        this.Pelicula[7] = new Peliculas(8, "El Exorcista", 1973, 3, "Terror", "Disponible");
        this.Pelicula[8] = new Peliculas(9, "Batman: El Caballero de la noche", 2008, 4, "Acción", "Disponible");
        this.Pelicula[9] = new Peliculas(10, "Interestelar", 2014, 3, "Ciencia Ficción", "Disponible");
    }
    
    private NodoPelicula cabecera; //este es el nodo cabecera

    public listaPeliculas() {
        this.cabecera = null;
    }

    public void setCabecera(NodoPelicula primero) {
        this.cabecera = primero;
    }

    public NodoPelicula getCabecera() {
        return cabecera;
    }

    public listaPeliculas insertarCabeza(int entrada) {
        NodoPelicula nuevo;
        nuevo = new NodoPelicula();
        nuevo.setNodoProximo(cabecera);
        if (this.cabecera != null) {
            this.cabecera.setNodoAnterior(nuevo);
        }
        cabecera = nuevo;
        return this;
    }

    public void visualizasLista() {
        NodoPelicula n;
        int k = 0;
        n = cabecera;
        while (n != null) {
            System.out.println(n.getDato() + "");
            n = n.getNodoProximo();
            k++;
            System.out.print((k % 15 != 0 ? "" : "\n"));
        }
        System.out.println();
    }

    public void eliminar(Peliculas id) {

        NodoPelicula actual = this.cabecera;
        boolean encontrado = false;
        while (actual != null && !encontrado) {
            encontrado = (actual.getDato().equals(id));
            if (encontrado) {
                actual.getNodoProximo();
            }
        }
        if (actual != null) {
            if (actual == this.cabecera) {
                this.cabecera = actual.getNodoProximo();
                if (actual.getNodoProximo() != null) {
                    actual.getNodoProximo().setNodoAnterior(null);
                } else if (actual.getNodoProximo() != null) {
                    actual.getNodoAnterior().setNodoProximo(actual.getNodoProximo());
                    actual.getNodoProximo().setNodoAnterior(actual.getNodoAnterior());
                } else {
                    actual.getNodoAnterior().setNodoProximo(null);
                    actual = null;
                }
            }
        }
    }
}
