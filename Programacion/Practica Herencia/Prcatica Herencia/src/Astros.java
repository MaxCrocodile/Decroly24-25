public class Astros {
    private double radioEcuatorial;
    private double rotationEja;
    private double masa;
    private double temperaturaMedia;
    private double gravedad;


    //Constructor
    public Astros(double radioEcuatorial, double rotationEja, double masa, double temperaturaMedia, double gravedad) {
        this.radioEcuatorial = radioEcuatorial;
        this.rotationEja = rotationEja;
        this.masa = masa;
        this.temperaturaMedia = temperaturaMedia;
        this.gravedad = gravedad;

    }

    //Setters and Getters
    public double getRadioEcuatorial() {
        return radioEcuatorial;
    }

    public double getRotationEja() {
        return rotationEja;
    }

    public double getMasa() {
        return masa;
    }

    public double getTemperaturaMedia() {
        return temperaturaMedia;
    }

    public double getGravedad() {
        return gravedad;
    }

    public void MostrarInfoAstros() {
        System.out.println("Radio Ecuatorial: " + radioEcuatorial + " Km ");
        System.out.println("Rotation Eja: " + rotationEja + " m/s ");
        System.out.println("Masa: " + masa + " Kg ");
        System.out.println("Temperatura Media: " + temperaturaMedia + " grados ");
        System.out.println("Gravedad: " + gravedad);
    }

}
