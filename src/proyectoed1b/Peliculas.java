
package proyectoed1b;

/**
 *
 * @author barragán - rodríguez - guevara
 */
public class Peliculas {

    private int id;
    private String nombre;
    private int año;
    private int calificacion;
    private String genero;
    private String estado;

    public Peliculas() {
        
    }

    public Peliculas(int id, String nombre, int año, int calificacion, String genero, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.año = año;
        this.calificacion = calificacion;
        this.genero = genero;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "\nPeliculas" + "\n"+
                "ID: " + id + "\n" + 
                "Nombre: " + nombre +"\n" + 
                "Año: " + año + "\n" +
                "Calificación: " + calificacion +"\n" + 
                "Género: " + genero + "\n" +
                "Estado: " + estado +"\n";
    }

    
}
