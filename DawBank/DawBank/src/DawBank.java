import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class DawBank {
    public static void main(String[] args) throws Exception {
        String dniIntroducido = null;
        Pattern pat = Pattern.compile("[0-9]{7,8}[A-Z a-z]");
        Scanner miScanner= new Scanner(System.in);

        System.out.println("Introduce el DNI:");
        dniIntroducido = miScanner.nextLine();
        Matcher mat = pat.matcher(dniIntroducido);
        
        while(!mat.matches()){
            System.out.println("El Dni introducido es incorrecto, por favor "
                    + "introduzca un Dni válido.");

            System.out.print("Introduce un Dni correcto:");
            
            dniIntroducido = miScanner.nextLine();
            mat = pat.matcher(dniIntroducido);
        }
         System.out.println("El Dni " + dniIntroducido + " es un Dni válido");
    }
}
