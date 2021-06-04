package Principal;

import java.io.File;
import java.util.Date;

public class proyecto {

    private String titulo;
    private File descripcion;
    private int puntuacion;
    private int dificultad;
    private String duracion;
    private int participantes;
    private Date entrega;

    public proyecto() {
    }

    public proyecto(String titulo, File descripcion, int puntuacion, int dificultad, String duracion, int participantes, Date entrega) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.puntuacion = puntuacion;
        this.dificultad = dificultad;
        this.duracion = duracion;
        this.participantes = participantes;
        this.entrega = entrega;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public File getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(File descripcion) {
        this.descripcion = descripcion;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getParticipantes() {
        return participantes;
    }

    public void setParticipantes(int participantes) {
        this.participantes = participantes;
    }

    public Date getEntrega() {
        return entrega;
    }

    public void setEntrega(Date entrega) {
        this.entrega = entrega;
    }

    @Override
    public String toString() {
        return "proyecto{" + "titulo=" + titulo + ", puntuacion=" + puntuacion + ", dificultad=" + dificultad + ", duracion=" + duracion + ", participantes=" + participantes + ", entrega=" + entrega + '}';
    }

}
