public class Satelite extends Astros  {
    private double distanciaPlaneta;
    private double orbitaPlanetaria;
    private String planetaMadre;

    public Satelite(double radioEcuatorial, double rotationEja, double masa, double temperaturaMedia, double gravedad, double distanciaPlaneta, double orbitaPlanetaria, String planetaMadre) {
        super(radioEcuatorial, rotationEja, masa, temperaturaMedia, gravedad);
        this.distanciaPlaneta = distanciaPlaneta;
        this.orbitaPlanetaria = orbitaPlanetaria;
        this.planetaMadre = planetaMadre;
    }

    public double getDistanciaPlaneta() {
        return distanciaPlaneta;
    }

    public double getOrbitaPlanetaria() {
        return orbitaPlanetaria;
    }

    public String getPlanetaMadre() {
        return planetaMadre;
    }

    public void mostrarInfoAstros(){
        super.MostrarInfoAstros();
        System.out.println("Distancia al planeta madre: " + distanciaPlaneta + " Km ");
        System.out.println("Orbita del planeta madre: " + orbitaPlanetaria);
        System.out.println("Planeta madre: " + planetaMadre);
    }
}
