import java.time.LocalDate;
import java.time.LocalDateTime;

public class Pelicula {
    private static int contadorPelicula = 1;

    private String cod;
    private String titulo;
    private Genero genero;
    private LocalDate fechaRegistro;
    private LocalDate fechaBaja;
    private LocalDateTime fechaAlquiler;
    private boolean Alquilada;

    //Constructor
    public Pelicula(String cod, String titulo, Genero genero, boolean Alquilada) {
        this.cod = cod;
        this.titulo = titulo;
        this.genero = genero;
        this.fechaRegistro = LocalDate.now();
        this.Alquilada = false;
    }

    public static String generarCodPelicula() {
        return String.format("P-%04d", contadorPelicula++);
    }

    //Getters y Setters
    public String getCod() {
        return cod;
    }
    public void setCod(String cod) {

        this.cod = generarCodPelicula();
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public LocalDate getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(LocalDate fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public LocalDateTime getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDateTime fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public boolean Alquilada() {
        return Alquilada;
    }

    public void setAlquilada(boolean alquilada) {
        Alquilada = alquilada;
    }

    //Metodo para mostrar info de pelicua
    public void mostrarInfoPelicula() {
        System.out.println("Codigo: " + cod);
        System.out.println("Titulo: " + titulo);
        System.out.println("Genero: " + genero);
        System.out.println("Fecha de Registro: " + fechaRegistro);
        //Misma operation como en el clase cliente
        System.out.println("Fecha de Baja: " + (fechaBaja == null ? fechaBaja : "Pelicula Activa"));
        //el ? pregunta si peliula es alquilada y despues viene primero salida para true y segunda salida para false
        System.out.println("Estado: " + (Alquilada ? "Alquilada" : "Disponible"));
    }

}
