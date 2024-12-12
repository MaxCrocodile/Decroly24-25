import java.time.LocalDate;
import java.util.regex.Pattern;

public class Persona {
    private static int contadorID = 1; // Contador para asignar un ID automáticamente
    private int id;
    private String nombre;
    private LocalDate fechaNacimiento;
    private boolean esAlumno; // Para identificar si es alumno o profesor
    private String NIE;
    private double salario; // Salario solo para personas que no son alumnos

    // Constructor
    public Persona(String nombre, LocalDate fechaNacimiento, boolean esAlumno, String NIE, double salario) throws IllegalArgumentException {
        if (validarNIE(NIE)) {
            this.id = contadorID++;
            this.nombre = nombre;
            this.fechaNacimiento = fechaNacimiento;
            this.esAlumno = esAlumno;
            this.NIE = NIE;
            if (!esAlumno) {
                this.salario = salario; // Solo asignamos salario si no es alumno
            }
        } else {
            throw new IllegalArgumentException("NIE inválido. Debe tener el formato Z12345678R.");
        }
    }

    // Método para validar el formato del NIE
    private boolean validarNIE(String NIE) {
        String regex = "^[A-Z]\\d{8}[A-Z]$";
        return Pattern.matches(regex, NIE);
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public boolean esAlumno() {
        return esAlumno;
    }

    public String getNIE() {
        return NIE;
    }

    public double getSalario() {
        return salario;
    }

    public void cambiarSalario(double nuevoSalario) {
        this.salario = nuevoSalario;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                "\nNombre: " + nombre +
                "\nFecha de nacimiento: " + fechaNacimiento +
                "\nEs Alumno: " + esAlumno +
                "\nNIE: " + NIE +
                (esAlumno ? "" : "\nSalario: " + salario);
    }
}
