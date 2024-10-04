package Actividad2.programacion.daw;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);                
		String nombre;
		double horas , salario , salarioTotal, salarioNormal, salarioImpositable, salarioPrimeroImp ,salarioSegundoImp;
		
		
		System.out.println ("Hello,what is your name?");
		nombre = sc.nextLine();
		
		System.out.println("How much hours a week do you work?");
		horas = sc.nextInt();
		
		System.out.println("How much you gain for hour?");
		salario = sc.nextDouble();
		
		
		if (horas <= 35) {
			
			salarioTotal = horas*salario;
			System.out.println("Max,you earn " + salarioTotal + " Euros per week");      //menos de 35 horas
		
		}else {
			
			salarioNormal = 35*salario;
			double horasExtra = horas - 35;
			double salarioExtra = horasExtra*(salario*1.5);
			salarioTotal = salarioNormal + salarioExtra;
			System.out.println(nombre + "you earn " + salarioTotal + " Euros per week");        //mas de 35 horas
			
		}
		
		System.out.println(nombre + "you earn" + salarioTotal + " Euros per week");

      
        if (salarioTotal > 900) {
            salarioSegundoImp = (salarioTotal - 900) * 0.45;  
            salarioPrimeroImp = (900 - 500) * 0.75;           
            salarioTotal = salarioSegundoImp + salarioPrimeroImp + 500;
        } else if (salarioTotal > 500) {
            salarioImpositable = (salarioTotal - 500) * 0.75; 
            salarioTotal = salarioImpositable + 500;
        }

        System.out.println("After taxes, you earn:" + salarioTotal + " Euros per week");

        sc.close();
    }
}