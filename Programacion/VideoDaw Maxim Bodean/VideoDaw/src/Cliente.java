import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private static int contadorSocio = 1;

    private String dni;
    private String nombre;
    private String ID;
    private String direccion;
    private LocalDate fechaNacimiento;
    private LocalDate fechaBaja;
    private List<Pelicula> peliculasAlquiladas;

    //Constructor
    public Cliente(String dni, String nombre, String direccion, LocalDate fechaNacimiento) {
            this.dni =dni;
            this.nombre =nombre;
            this.ID = generarID();
            this.fechaNacimiento =fechaNacimiento;
        //ponemos arraylist en el constructor para intializar una lista nueva de peliculas alquiladas de un cliente
            this.peliculasAlquiladas =new ArrayList<>();
    }

    //metodo para generar num de socio
    public String generarID() {
        return String.format("S-", contadorSocio++);
    }

    // metodo para validar el NIE
    private boolean NIEValidator(String nie) {
        return nie != null && nie.matches("^[XYZ]\\d{7}[A-Z]$");
    }

    //Getters y Setters

    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        if (!NIEValidator(dni)) {
            throw new IllegalArgumentException("DNI inválido.");
        }
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = generarID();
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public LocalDate getFechaBaja() {
        return fechaBaja;
    }
    public void setFechaBaja(LocalDate fechaBaja) {
        this.fechaBaja = fechaBaja;
    }
    public List<Pelicula> getPeliculasAlquiladas() {
        return peliculasAlquiladas;
    }

    //Metodo para mostrar info de Cliente
    public void mostrarInfoCliente() {
        System.out.println("DNI: " + dni);
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + ID);
        System.out.println("Direccion: " + direccion);
        System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
        // si fechaBaja no es null(vacio) metodo escribe que el cliente es activo
        //i can explain this like this:
        // ? asks a condition and if it is righ he will axecute all thatis after ":"
        System.out.println("Fecha de Baja: " + (fechaBaja == null ? fechaBaja : "Cliente Activo"));
    }

    //Metodo para mostrar las peliculas alquiladas
    public void mostrarPeliculasAlquiladas(){
        System.out.println("Películas alquiladas:");
        if(peliculasAlquiladas.isEmpty()) {
            System.out.println("No tiene pelulas alquiladas");
            }else {
                for(Pelicula p : peliculasAlquiladas) {
                    System.out.println(p.getTitulo());
            }
        }
    }


}
