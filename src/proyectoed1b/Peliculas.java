
package proyectoed1b;

/**
 *
 * @author barragán - rodríguez - guevara
 */
public class Peliculas {

    private int ip;
    private String nombre;
    private int año;
    private int calificacion;
    private String genero;
    private String estado;

    public Peliculas() {
        
    }

    public Peliculas(int ip, String nombre, int año, int calificacion, String genero, String estado) {
        this.ip = ip;
        this.nombre = nombre;
        this.año = año;
        this.calificacion = calificacion;
        this.genero = genero;
        this.estado = estado;
    }

    public int getIp() {
        return ip;
    }

    public void setIp(int ip) {
        this.ip = ip;
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
}
