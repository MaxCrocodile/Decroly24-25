import java.time.LocalDate;
import java.time.LocalDateTime;

public class Pelicula {
    private int id = 1;
    private String titulo;
    private final Genero genero;
    private LocalDate fechaRegistro;
    private LocalDate fechaBaja;
    private LocalDateTime fechaAlquiler;
    private boolean isAlquilada;

    public enum genero {
        DRAMA, COMEDIA, ACCION, TERROR, ROMANCE
    }

    public Pelicula(String titulo, Genero genero, LocalDate fechaRegistro, LocalDate fechaBaja, LocalDateTime fechaAlquiler, boolean isAlquilada) {
        this.id = id++;
        this.titulo = titulo;
        Pelicula.genero genero1 = genero.values();
        this.genero = genero1 myVar : genero1.values();
        this.fechaRegistro = fechaRegistro;
        this.fechaBaja = fechaBaja;
        this.fechaAlquiler = fechaAlquiler;
        this.isAlquilada = isAlquilada;
    }

    public void mostrarInfoPelicula() {
        System.out.println("Codigo: " + cod);
        System.out.println("Titulo: " + titulo);
        System.out.println("Genero: " + genero);
        System.out.println("Fecha de Registro: " + fechaRegistro);
        System.out.println("Fecha de Baja: " + fechaBaja);
        System.out.println("Fecha de Alquiler: " + fechaAlquiler);
        System.out.println("Esta Alquilada: " + isAlquilada);
    }
