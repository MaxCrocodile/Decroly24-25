import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Trabajador {
    private String nombre;
    private LocalDate fechaNacimiento;
    private String DNI;
    private String direccion;
    private String numeroSS;

    //Constructor
    public Trabajador(String nombre, String DNI, String direccion, String numeroSS, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroSS = generarSS();
    }



    //metodo para generar numeroSS
    public static String generarSS() {
        return "SS-" + Math.random() * 1000000000 ;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getDNI() {
        return DNI;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroSS() {
        return numeroSS;
    }



}
