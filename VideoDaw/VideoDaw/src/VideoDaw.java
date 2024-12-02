import java.io.OptionalDataException;
import java.time.LocalDate;


public class VideoDaw {
    private String cif;
    private String direccion;
    private LocalDate fechaAlta;
    private Pelicula[] peliculasRegistradas;
    private Cliente[] clientesRegistrados;

    public VideoDaw(String cif, String direccion, LocalDate fechaAlta, Pelicula[] peliculasRegistradas, Cliente[] clientesRegistrados) {
        this.cif = cif;
        this.direccion = direccion;
        this.fechaAlta = fechaAlta;
        this.peliculasRegistradas = peliculasRegistradas;
        this.clientesRegistrados = clientesRegistrados;
    }

    public String getCif() {
        return this.cif;
    }
    public String getDireccion() {
        return this.direccion;
    }
    public LocalDate getFechaAlta() {
        return this.fechaAlta;
    }
    public Pelicula[] getPeliculasRegistradas() {
        return this.peliculasRegistradas;
    }
    public Cliente[] getClientesRegistrados() {
        return this.clientesRegistrados;
    }

    //metodo para mostrar info del video club
    public void mostrarInfoVideoClub () {
        System.out.println(cif);
        System.out.println(direccion);
        System.out.println(fechaAlta);
        System.out.println(peliculasRegistradas);
        System.out.println(clientesRegistrados);
    }

    //metodo para mostrar los peliulas registradas de un videoclub
    public void mostrarPeliculasRegistradas() {
        if (peliculasRegistradas == null || peliculasRegistradas.length == 0) {
            System.out.println("No hay películas registradas en el videoclub.");
            return;
        }

        System.out.println("Películas registradas en el videoclub:");
        for (Pelicula pelicula : peliculasRegistradas) {
            if (pelicula != null) {
                System.out.println(pelicula.toString());
            }
        }
    }

    //metodo para mostrar los clientes registrados de un videoclub
    public void mostrarClientesRegistradas() {
        if (clientesRegistrados == null || clientesRegistrados.length == 0) {
            System.out.println("No hay clientes registrados en el videoclub.");
            return;
        }

        System.out.println("Clientes registradas en el videoclub:");
        for (Cliente cliente : clientesRegistrados) {
            if (cliente != null) {
                System.out.println(cliente.toString());
            }
        }
    }

    public void alquilarPelicula(Pelicula p){

    }
}




