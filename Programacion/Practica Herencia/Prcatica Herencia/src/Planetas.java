public class Planetas extends Astros {
        private double distanciaSol;
        private double orbitaSol;
        private boolean tieneSatelitos;

    public Planetas(double radioEcuatorial, double rotationEja, double masa, double temperaturaMedia, double gravedad, double distanciaSol, double orbitaSol, boolean tieneSatelitos) {
        super(radioEcuatorial, rotationEja, masa, temperaturaMedia, gravedad);
        this.distanciaSol = distanciaSol;
        this.orbitaSol = orbitaSol;
        this.tieneSatelitos = tieneSatelitos;
    }

    public double getDistanciaSol() {
        return distanciaSol;
    }

    public double getOrbitaSol() {
        return orbitaSol;
    }

    public boolean isTieneSatelitos() {
        return tieneSatelitos;
    }

    public void mostrarInfoAstros(){
        super.MostrarInfoAstros();
        System.out.println("Distancia a la sol: " + distanciaSol + " Km ");
        System.out.println("Orbita de la sol: " + orbitaSol);
        System.out.println("Tiene satelitos: " + tieneSatelitos);
    }
}

