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

    private NodoPelicula inicio; // este es el nodo inicial
    private NodoPelicula fin;
   // private NodoPelicula cabecera; //este es el nodo cabecera

    public listaPeliculas(NodoPelicula inicio, NodoPelicula fin) {
        this.inicio = inicio;
        this.fin = fin;
    }

    public listaPeliculas() {
    }
    
    

    Peliculas Pelicula[] = new Peliculas[10];

    String Peli[][] = new String[25][6];

    public void llenarMatriz() {

        this.Peli[0][0] = "1";
        this.Peli[0][1] = "Hachico";
        this.Peli[0][2] = "2009";
        this.Peli[0][3] = "5";
        this.Peli[0][4] = "Drama";
        this.Peli[0][5] = "Disponible";

        this.Peli[1][0] = "2";
        this.Peli[1][1] = "The Avengers";
        this.Peli[1][2] = "2012";
        this.Peli[1][3] = "4";
        this.Peli[1][4] = "Acción";
        this.Peli[1][5] = "Disponible";
        
        this.Peli[2][0] = "3";
        this.Peli[2][1] = "Back Widow";
        this.Peli[2][2] = "2021";
        this.Peli[2][3] = "4";
        this.Peli[2][4] = "Acción";
        this.Peli[2][5] = "Disponible";
        
        this.Peli[3][0] = "4";
        this.Peli[3][1] = "Que paso ayer";
        this.Peli[3][2] = "2009";
        this.Peli[3][3] = "4";
        this.Peli[3][4] = "Comedia";
        this.Peli[3][5] = "Disponible";
        
        this.Peli[4][0] = "5";
        this.Peli[4][1] = "La purga";
        this.Peli[4][2] = "2021";
        this.Peli[4][3] = "3";
        this.Peli[4][4] = "Terror";
        this.Peli[4][5] = "Disponible";
        
        this.Peli[5][0] = "5";
        this.Peli[5][1] = "La purga";
        this.Peli[5][2] = "2021";
        this.Peli[5][3] = "3";
        this.Peli[5][4] = "Terror";
        this.Peli[5][5] = "Disponible";
            
        this.Peli[6][0] = "7";
        this.Peli[6][1] = "Sin City";
        this.Peli[6][2] = "2005";
        this.Peli[6][3] = "4";
        this.Peli[6][4] = "Acción";
        this.Peli[6][5] = "Disponible";
        
        this.Peli[7][0] = "8";
        this.Peli[7][1] = "El Exorcista";
        this.Peli[7][2] = "1973";
        this.Peli[7][3] = "3";
        this.Peli[7][4] = "Terror";
        this.Peli[7][5] = "Disponible";
        
        this.Peli[8][0] = "9";
        this.Peli[8][1] = "Batman: El Caballero de la noche";
        this.Peli[8][2] = "2008";
        this.Peli[8][3] = "4";
        this.Peli[8][4] = "Acción";
        this.Peli[8][5] = "Disponible";
        
        this.Peli[9][0] = "9";
        this.Peli[9][1] = "Interestelar";
        this.Peli[9][2] = "2014";
        this.Peli[9][3] = "3";
        this.Peli[9][4] = "Ciencia Ficción";
        this.Peli[9][5] = "Disponible";        
    }
    
    public void InicializarLista() {

        Peliculas P1 = new Peliculas();

        NodoPelicula n1 = new NodoPelicula();

        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 6; j++) {
                if (j == 0) {
                    P1.setId(Integer.parseInt(Peli[i][j]));
                } else if (j == 1) {
                    P1.setNombre(Peli[i][j]);
                } else if (j == 2) {
                    P1.setAño(Integer.parseInt(Peli[i][j]));
                } else if (j == 3) {
                    P1.setCalificacion(Integer.parseInt(Peli[i][j]));
                } else if (j == 4) {
                    P1.setGenero(Peli[i][j]);
                } else {
                    P1.setEstado(Peli[i][j]);
                }
            }
            if (i == 0) {
                n1 = new NodoPelicula(P1);
                this.inicio = n1;
            }
            n1 = new NodoPelicula(P1);
        }
    }

    /* public listaPeliculas insertarCabeza(int entrada) {
        NodoPelicula nuevo;
        nuevo = new NodoPelicula();
        nuevo.setNodoProximo(cabecera);
        if (this.cabecera != null) {
            this.cabecera.setNodoAnterior(nuevo);
        }
        cabecera = nuevo;
        return this;
    }*/
    
     public boolean estaVacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }
    
    //  Metodo para insertar al final de la lista Peliculas
    public void insertarFinal(Peliculas pelicula) {
        NodoPelicula aux;
        if (!estaVacia()) {
            aux = fin.getSiguiente();
            aux = new NodoPelicula(pelicula);
        }else{
            inicio = fin = new NodoPelicula();
        }
    }

    /*public void visualizasLista() {
        NodoPelicula n;
        int k = 0;
        n = cabecera;
        while (n != null) {
            System.out.println(n.getDato() + "");
            n = n.getSiguiente();
            k++;
            System.out.print((k % 15 != 0 ? "" : "\n"));
        }
        System.out.println();
    }*/

    //Metodo para eliminar un nodo en especifico
    public void eliminarNodoEspecifico(Peliculas elementoEliminar) {
        if (!estaVacia()) {
            if (inicio == fin && elementoEliminar == inicio.getDato()) {
                inicio = fin = null;
            } else if (elementoEliminar == inicio.getDato()) {
                inicio = inicio.getSiguiente();
            } else {
                NodoPelicula anterior, temporal;
                anterior = inicio;
                temporal = inicio.getSiguiente();
                while (temporal != null && temporal.getDato() != elementoEliminar) {
                    anterior = anterior.getSiguiente();
                    temporal = temporal.getSiguiente();
                }
                if (temporal != null) {
                    anterior.setSiguiente(temporal.getSiguiente());
                    if (temporal == fin) {
                        fin = anterior;
                    }
                }
            }
        } else {
            System.out.println("El elemento ingresado no se encuentra en la lista");
        }
    }

    // Mostrar los datos
    public void imprimirLista() {
        NodoPelicula recorrer = inicio;//Apunta a inicio
        System.out.println("");
        while (recorrer != null) {
            System.out.print("El elemento: " + recorrer.getDato());
            recorrer = recorrer.getSiguiente();
        }
    }
}

 /*public void matrizPeliculas(Peliculas pelicula) {

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

    }*/