package Principal;

public class alumno {

    private String nombre;
    private String apellido;
    private String usuario;
    private String password;
    private String registro;
    private String ID;
    private String carrera;
    private int anio;
    private double promedio;
    private String facultad;

    public alumno() {
    }

    public alumno(String nombre, String apellido, String usuario, String password, String registro, String ID, String carrera, int anio, double promedio, String facultad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.password = password;
        this.registro = registro;
        this.ID = ID;
        this.carrera = carrera;
        this.anio = anio;
        this.promedio = promedio;
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

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    @Override
    public String toString() {
        return "alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", registro=" + registro + ", ID=" + ID + ", carrera=" + carrera + ", anio=" + anio + ", promedio=" + promedio + ", facultad=" + facultad + '}';
    }

}
