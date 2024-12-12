import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Empresa {
    private String nombre;
    private String cif;
    private LocalDate fechaFundation;
    private int maxTrabajadores;
    private ArrayList<Trabajador> trabajadores;

    //Constructor
    public Empresa(String nombre, String cif, String direccion, LocalDate fechaFundation, int maxTrabajadores) {
        this.nombre = nombre;
        this.cif = cif;
        this.fechaFundation = fechaFundation;
        this.maxTrabajadores = maxTrabajadores;
        this.trabajadores = new ArrayList<Trabajador>();
    }


    public String getCif() {
        return cif;
    }

    public LocalDate getFechaFundation() {
        return fechaFundation;
    }

    public int getMaxTrabajadores() {
        return maxTrabajadores;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Trabajador> getTrabajadores() {
        return trabajadores;
    }


    //Metodo para ver cuanto personas tenemos en la empresa
    public int getNumTrabajadores() {
        return trabajadores.size();
    }

    //Metodo para registrar trabajador
    public void registrarTrabajador(Trabajador trbajadores) {
        trabajadores.add(trbajadores);
        System.out.println("Trabjador con nombre "+ trbajadores.getNombre() + " registrado ");
    }


    public void mostrarInfoEmpresa() {
        System.out.println("=== Información de la Empresa ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("CIF: " + cif);
        System.out.println("Fecha de Fundación: " + fechaFundation);
        System.out.println("Número Máximo de Trabajadores: " + maxTrabajadores);
        System.out.println("Número Actual de Trabajadores: " + getNumTrabajadores());
        System.out.println("===============================");
    }

    public void mostrarInformacionTrabajadores() {
        System.out.println("=== Información de los Trabajadores ===");
        for (Trabajador trabajador : trabajadores) {
            System.out.println("------------------------------");
            System.out.println("Nombre: " + trabajador.getNombre());
            System.out.println("DNI: " + trabajador.getDNI());
            System.out.println("Dirección: " + trabajador.getDireccion());
            System.out.println("Fecha de Nacimiento: " + trabajador.getFechaNacimiento());
            System.out.println("Número de Seguridad Social: " + trabajador.getNumeroSS());
        }
        System.out.println("===============================");
    }

}
