
public class Cliente {
    private String dni;
    private String nombre;
    private int numSocio;
    private String direccion;
    private LocalDate fechaNacimiento;
    private LocalDate fechaBaja;
    private List<String> peliculasAlquiladas;

    public Cliente() {
    }

    public Cliente(String dni, String nombre, int numSocio, String direccion, LocalDate fechaNacimiento, LocalDate fechaBaja, List<String> peliculasAlquiladas) {
        this.dni = dni;
        this.nombre = nombre;
        this.numSocio = numSocio;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaBaja = fechaBaja;
        this.peliculasAlquiladas = peliculasAlquiladas;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
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

    public List<String> getPeliculasAlquiladas() {
        return peliculasAlquiladas;
    }

    public void setPeliculasAlquiladas(List<String> peliculasAlquiladas) {
        this.peliculasAlquiladas = peliculasAlquiladas;
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
