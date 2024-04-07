package ar.edu.unju.fi.main;

import java.util.Scanner;

import ar.edu.unju.fi.model.Alumno;
import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.model.RegistroNota;

public class Main {

	public static void main(String[] args) {
		Alumno alumno = generaralumno();
	    registrarnotas(alumno,1);
		}
	
	    public static Alumno generaralumno() {
	    	Alumno alumno = new Alumno();
	    	Scanner sc = new Scanner(System.in);
			System.out.print("Ingrese legajo: ");
			Integer legajo = sc.nextInt();
			System.out.print("Ingrese apellido: ");
			String apellido = sc.next();
			System.out.print("Ingrese nombre: ");
			String nombre = sc.next();
			
			alumno.setLegajo(legajo);
			alumno.setApellido(apellido);
			alumno.setNombre(nombre);
			return alumno;
	    }
	    
	    public static void registrarnotas(Alumno alumno, int numMaterias){
	    	Scanner sc = new Scanner(System.in);
			while(numMaterias <= 4) {
				System.out.print("Ingrese codigo de materia: ");
				String codigo = sc.next();
				System.out.print("Ingrese nombre de materia: ");
				String Nombremateria = sc.next();
				
				Materia materia = new Materia(codigo, Nombremateria);
				
				System.out.print("Ingrese el codigo del registro de la nota: ");
				String codigoNota = sc.next();
				System.out.print("Ingrese la nota final: ");
				float NotaFinal = sc.nextFloat();
				
				RegistroNota registro = new RegistroNota(codigoNota,alumno,materia,NotaFinal);
				
				System.out.println(registro.toString());
				numMaterias++;
	        }
			sc.close();
         }
}
