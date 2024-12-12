import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class Pelicula {
    private static int contador = 1;
    private Map<Integer, Pelicula> peliculaDataBase = new HashMap<>();

    private int id;
    private String titulo;
    private LocalDate fechaRegistro;
    private LocalDate fechaBaja;
    private LocalDateTime fechaAlquiler;
    private boolean isAlquilada;

    public Pelicula(int id, String titulo, LocalDate fechaRegistro, boolean isAlquilada) {
        this.id = id;
        this.titulo = titulo;
        this.fechaRegistro = fechaRegistro;
        this.fechaBaja = fechaBaja = null;
        this.fechaAlquiler = fechaAlquiler = null;
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

    public String registrarPelicula() {
        Scanner scanner = new Scanner(System.in);

        // Auto ID
        int id = contador++;

        // Nombre de pelicula
        System.out.print("Escribe el nombre de la pelicula: ");
        String titulo = scanner.nextLine();

        // Set fecha de hoy
        LocalDate fechaRegistro = LocalDate.now();


        boolean isAlquilada = false;

        // Create a new movie and add it to the database
        Pelicula newPelicula = new Pelicula(id, titulo, fechaRegistro, isAlquilada);
        peliculaDataBase.put(id, newPelicula);

        return "Pelicula \"" + titulo + "\" registrada " + LocalDate.now() + ".";
    }






    //to do : metodo para registrar pelicula,metodo para mostrar los peliculas disponibles,metodo para alquilar pelicula.
}
