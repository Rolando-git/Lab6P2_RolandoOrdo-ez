package Principal;

import java.util.ArrayList;

public class docente {

    private String nombre;
    private String apellido;
    private String usuario;
    private String password;
    private String n_registro;
    private String titulo;
    private String posgrado;
    private int impartido_clase;
    private String facultad;
    private ArrayList<proyecto> proyectos = new ArrayList();

    public docente() {
    }

    public docente(String nombre, String apellido, String usuario, String password, String n_registro, String titulo, String posgrado, int impartido_clase, String facultad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.password = password;
        this.n_registro = n_registro;
        this.titulo = titulo;
        this.posgrado = posgrado;
        this.impartido_clase = impartido_clase;
        this.facultad = facultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getN_registro() {
        return n_registro;
    }

    public void setN_registro(String n_registro) {
        this.n_registro = n_registro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPosgrado() {
        return posgrado;
    }

    public void setPosgrado(String posgrado) {
        this.posgrado = posgrado;
    }

    public int getImpartido_clase() {
        return impartido_clase;
    }

    public void setImpartido_clase(int impartido_clase) {
        this.impartido_clase = impartido_clase;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public ArrayList<proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(proyecto p) {
        this.proyectos.add(p);
    }

    @Override
    public String toString() {
        return nombre + apellido;
    }

}
