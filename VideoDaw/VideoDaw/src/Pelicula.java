import java.time.LocalDate;
import java.time.LocalDateTime;

public class Pelicula {
    private static int contador;

    private int id;
    private String titulo;
    private LocalDate fechaRegistro;
    private LocalDate fechaBaja;
    private LocalDateTime fechaAlquiler;
    private boolean isAlquilada;

    public Pelicula(int id, String titulo, LocalDate fechaRegistro, LocalDate fechaBaja, LocalDateTime fechaAlquiler ) {
        this.id = contador++;
        this.titulo = titulo;
        this.fechaRegistro = fechaRegistro;
        this.fechaBaja = fechaBaja;
        this.fechaAlquiler = fechaAlquiler;
        this.isAlquilada = false;

    }

    public int getId() {
        return this.id;
    }
    public String getTitulo() {
        return this.titulo;
    }
    public LocalDate getFechaRegistro() {
        return this.fechaRegistro;
    }
    public LocalDate getFechaBaja() {
        return this.fechaBaja;
    }
    public LocalDateTime getFechaAlquiler() {
        return this.fechaAlquiler;
    }
    public boolean isAlquilada() {
        return this.isAlquilada;
    }
    public void setAlquilada(boolean alquilada) {
        isAlquilada = alquilada;
    }

    public String mostrarInfoPelicula(){
        return String.format("ID: %s, Titulo: %s, Fecha Registro: %s,Fecha Alquiler: %s, Fecha Baja: %s, Es Alquilada: %s",
                this.id, this.titulo, this.fechaRegistro,this.fechaAlquiler, this.fechaBaja, this.isAlquilada);
    }

    //to do : metodo para mostrar los peliculas disponibles,metodo para alquilar pelicula.
}
