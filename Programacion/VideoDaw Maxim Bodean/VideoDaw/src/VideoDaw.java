import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class VideoDaw {
    private String cif;
    private String direccion;
    private LocalDate fechaAlta;
    private List<Pelicula> peliculasRegistradas;
    private List<Cliente> clientesRegistrados;


    //Constructor
    public VideoDaw(String cif, String direccion, LocalDate fechaAlta) {
        if (!esCifValido(cif)) {
            throw new IllegalArgumentException("CIF inválido. Debe seguir el formato: una letra seguida de 8 dígitos.");
        }
        this.cif = cif;
        this.direccion = direccion;
        this.fechaAlta = fechaAlta;
        //ponemos arraylist en el constructor para intializar una lista nueva de objectos que va a contener esta lista
        this.peliculasRegistradas = new ArrayList<>();
        this.clientesRegistrados = new ArrayList<>();
    }



    //Metodo para comprobar formato de CIF
    private boolean esCifValido(String cif) {
        return cif != null && cif.matches("^[A-Z]\\d{8}$");
    }

    //Getters and Setters
    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        //si esCCifValido sale como true setter set el cif si no sale linea cif invalido
        if (!esCifValido(cif)) {
            throw new IllegalArgumentException("CIF inválido.");
        }
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

    public List<Pelicula> getPeliculasRegistradas() {
        return peliculasRegistradas;
    }

    public void setPeliculasRegistradas(List<Pelicula> peliculasRegistradas) {
        this.peliculasRegistradas = peliculasRegistradas;
    }

    public List<Cliente> getClientesRegistrados() {
        return clientesRegistrados;
    }

    public void setClientesRegistrados(List<Cliente> clientesRegistrados) {
        this.clientesRegistrados = clientesRegistrados;
    }

    //Metodo para registrar pelicula
    public void registrarPelicula(Pelicula pelicula) {
        peliculasRegistradas.add(pelicula);
        System.out.println("Pelicula "+ pelicula.getTitulo() +" registrada");
    }

    //Metodo para registrar Cliente
    public void registrarCliente(Cliente cliente) {
        clientesRegistrados.add(cliente);
        System.out.println("Cliente con nombre "+ cliente.getNombre() +" registrado con ID:" + cliente.getID());
    }

    //Metodo para alquilar pelicula
    //en este metodo tenemos tipos de datos Cliente y Pelicula con nombres cliente y peliculas que ha hecho creando mas arriba
    public void alquilarPelicula(Cliente cliente, Pelicula pelicula){
        //metodo verifica si pelicula no esta alquilada ya
        if (!pelicula.Alquilada()) {
            //si pelicula no esta alquilada metodo avanse a proximo paso y cambia estado del pelicula de false a true para hacer este pelicula indisponible para otros clientes
            pelicula.setAlquilada(true);
            //metodo agrega fecha de alquiler
            pelicula.setFechaAlquiler(LocalDateTime.now());
            //pelicula se agrega a lista de peliculas alquiladas del cliente
            cliente.getPeliculasAlquiladas().add(pelicula);
            System.out.println("Pelicula "+ pelicula.getTitulo() +" alquilada,para el cliente "+ cliente.getNombre());
        }else{
            //este linea sale si pelicula ya este alquilada
            System.out.println("Pelicula ya esta alquilada");
        }
    }


    //Metodo para devolver pelicula
    public void devolverPelicula(Pelicula pelicula,Cliente cliente){
        //Metodo verifica si el cliente de verdad tiene este pelicula
        if (cliente.getPeliculasAlquiladas().contains(pelicula)){
            //si el cliente de verdad tiene la pelicula alquilada se guarda hora de devolver
            LocalDateTime fechaDevolution = LocalDateTime.now();
            //se cambio el estado de la pelicula para ser disponible para otros clientes
            pelicula.setAlquilada(false);
            //borramos pelicula de lista de peliculas alquiladas del cliente
            cliente.getPeliculasAlquiladas().remove(pelicula);
            System.out.println("Película "+ pelicula.getTitulo() +" esta ahora disponible para otros clientes");
        }else{
            System.out.println("El cliente no tiene esta película.");
        }
    }
}

