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
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Pelicula[] getPeliculasRegistradas() {
        return peliculasRegistradas;
    }

    public void setPeliculasRegistradas(Pelicula[] peliculasRegistradas) {
        this.peliculasRegistradas = peliculasRegistradas;
    }

    public Cliente[] getClientesRegistrados() {
        return clientesRegistrados;
    }

    public void setClientesRegistrados(Cliente[] clientesRegistrados) {
        this.clientesRegistrados = clientesRegistrados;
    }

    public void mostrarInfoVideoClub () {
        System.out.println(cif);
        System.out.println(direccion);
        System.out.println(fechaAlta);
        System.out.println(peliculasRegistradas);
        System.out.println(clientesRegistrados);
    }

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

}




