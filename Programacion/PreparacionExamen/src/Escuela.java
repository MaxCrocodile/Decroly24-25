import java.util.ArrayList;

public class Escuela {
    private static int contadorID = 1; // Contador para asignar un ID automáticamente
    private int id;
    private String nombreEscuela;
    private ArrayList<Clases> clases;

    // Constructor
    public Escuela(String nombreEscuela) {
        this.id = contadorID++;
        this.nombreEscuela = nombreEscuela;
        this.clases = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNombreEscuela() {
        return nombreEscuela;
    }

    public ArrayList<Clases> getClases() {
        return clases;
    }

    public void agregarClase(Clases clase) {
        clases.add(clase);
    }

    public void eliminarClase(int id) {
        clases.removeIf(clase -> clase.getId() == id);
    }

    @Override
    public String toString() {
        return "ID Escuela: " + id +
                "\nNombre: " + nombreEscuela +
                "\nTotal de clases: " + clases.size();
    }
}
