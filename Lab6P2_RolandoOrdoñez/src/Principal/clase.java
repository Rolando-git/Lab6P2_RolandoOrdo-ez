package Principal;

import java.util.ArrayList;

public class clase {

    private String nombre;
    private String seccion;
    private String codigo;
    private String c_carrera;
    private int maxima;
    private int numero;
    private ArrayList<proyecto> proyectos;
    private ArrayList<alumno> alumnos = new ArrayList();

    public clase() {
    }

    public clase(String nombre, String seccion, String codigo, String c_carrera, int maxima, int numero, ArrayList<proyecto> proyectos) {
        this.nombre = nombre;
        this.seccion = seccion;
        this.codigo = codigo;
        this.c_carrera = c_carrera;
        this.maxima = maxima;
        this.numero = numero;
        this.proyectos = proyectos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getC_carrera() {
        return c_carrera;
    }

    public void setC_carrera(String c_carrera) {
        this.c_carrera = c_carrera;
    }

    public int getMaxima() {
        return maxima;
    }

    public void setMaxima(int maxima) {
        this.maxima = maxima;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(ArrayList<proyecto> proyectos) {
        this.proyectos = proyectos;
    }

    public ArrayList<alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(alumno a) throws miException{
        if (maxima<30){
            this.alumnos.add(a);
        }
        else{
            throw new miException("El aula ha alcanzado su capacidad maxima");
        }
    }

    @Override
    public String toString() {
        return nombre + ", seccion=" + seccion + ", numero=" + numero;
    }

}
