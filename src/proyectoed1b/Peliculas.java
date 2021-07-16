
package proyectoed1b;

/**
 *
 * @author barragán - rodríguez - guevara
 */
public class Peliculas {

    private String id;
    private String nombre;
    private String año;
    private String calificacion;
    private String genero;
    private String estado;

    public Peliculas() {
        
    }

    public Peliculas(String id, String nombre, String calificacion, String genero, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.calificacion = calificacion;
        this.genero = genero;
        this.estado = estado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
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
}
