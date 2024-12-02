import java.time.LocalDate;
import java.util.List;

public class Cliente {
    private String dni;
    private String nombre;
    private int numSocio;
    private String direccion;
    private LocalDate fechaNacimiento;
    private LocalDate fechaBaja;
    private List<String> peliculasAlquiladas;


    public Cliente(String dni, String nombre, int numSocio, String direccion, LocalDate fechaNacimiento, LocalDate fechaBaja, List<String> peliculasAlquiladas) {
        this.dni = dni;
        this.nombre = nombre;
        this.numSocio = numSocio;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaBaja = fechaBaja;
        this.peliculasAlquiladas = peliculasAlquiladas;
    }

   public String getDni(){
        return this.dni;
   }
   public String getNombre(){
        return this.nombre;
   }
   public int getNumSocio(){
        return this.numSocio;
   }
   public String getDireccion(){
        return this.direccion;
   }
   public LocalDate getFechaNacimiento(){
        return this.fechaNacimiento;
   }
   public LocalDate getFechaBaja(){
        return this.fechaBaja;
   }
   public List<String> getPeliculasAlquiladas(){
        return this.peliculasAlquiladas;
   }

    public void mostrarInfoCliente() {
        System.out.println("DNI: " + dni);
        System.out.println("Nombre: " + nombre);
        System.out.println("NumSocio: " + numSocio);
        System.out.println("Direccion: " + direccion);
        System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
        System.out.println("Fecha de Baja: " + fechaBaja);
    }

    public void mostrarPeliculasAlquiladas() {
        System.out.println("Películas Alquiladas: " + peliculasAlquiladas);
    }


}
