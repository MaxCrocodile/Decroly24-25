import java.util.ArrayList;

public class Clases {
    private static int contadorID = 1; // Contador para asignar un ID automáticamente
    private int id;
    private String nombreClase;
    private ArrayList<Persona> personas;

    // Constructor
    public Clases(String nombreClase) {
        this.id = contadorID++;
        this.nombreClase = nombreClase;
        this.personas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNombreClase() {
        return nombreClase;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void agregarPersona(Persona persona) {
        personas.add(persona);
    }

    public void eliminarPersona(int id) {
        personas.removeIf(persona -> persona.getId() == id);
    }

    @Override
    public String toString() {
        return "ID Clase: " + id +
                "\nNombre Clase: " + nombreClase +
                "\nTotal de personas en la clase: " + personas.size();
    }
}
