
public class Pelicula {
    private String cod;
    private String titulo;
    private Genero genero;
    private LocalDate fechaRegistro;
    private LocalDate fechaBaja;
    private LocalDateTime fechaAlquiler;
    private boolean isAlquilada;

    public enum Genero {
        DRAMA, COMEDIA, ACCION, TERROR, ROMANCE
    }
}

    public Pelicula() {
    }

    public Pelicula(String cod, String titulo, Genero genero, LocalDate fechaRegistro, LocalDate fechaBaja, LocalDateTime fechaAlquiler, boolean isAlquilada) {
        this.cod = cod;
        this.titulo = titulo;
        this.genero = genero;
        this.fechaRegistro = fechaRegistro;
        this.fechaBaja = fechaBaja;
        this.fechaAlquiler = fechaAlquiler;
        this.isAlquilada = isAlquilada;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
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

    public boolean isAlquilada() {
        return isAlquilada;
    }

    public void setAlquilada(boolean isAlquilada) {
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
