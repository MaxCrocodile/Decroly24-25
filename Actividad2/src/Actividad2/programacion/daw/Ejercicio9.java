package Actividad2.programacion.daw;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hora, minutos, segundos;
		
		System.out.println("Escribe hora");
		hora = sc.nextInt();
		System.out.println("Escribe los minnutos");
		minutos = sc.nextInt();
		System.out.println("Escribe los segundos");
		segundos = sc.nextInt();
		
		segundos++;

        if (segundos == 60) {
            segundos = 00;
            minutos++;
        }
        if(minutos == 60) {
        	minutos = 00;
        	hora++;
        }
        if (hora == 24) {
        	hora = 00;
        	System.out.println("Otro dia");
        }
		System.out.println(hora + ":" + minutos + ":" + segundos);
		sc.close();
	}

}