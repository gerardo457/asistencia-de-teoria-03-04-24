package ar.edu.unju.fi.main;

import java.time.LocalDate;

import ar.edu.unju.fi.model.Estudiante;
import ar.edu.unju.fi.model.capacitacion;
import ar.edu.unju.fi.model.capacitador;

public class Principal {

	public static void main(String[] args) {
	  capacitador profevega = new capacitador(1234,"Vega","ariel","Ing.Informatica");
	  capacitacion capa = new capacitacion(1,"pe",(short)240,LocalDate.of(2024, 2, 5),profevega);
	  publicar(capa);
	}
	
	public static void publicar(capacitacion capacitacion) {
		System.out.println("codigo: " + capacitacion.getCodigo());
		System.out.println("materia: " + capacitacion.getNombre());
		System.out.println("horas: " + capacitacion.getTotaldehoras());
		System.out.println("fecha: " + capacitacion.getFechainicio());
		System.out.println("capacitador: " + capacitacion.getCapacitador().getDatos());
	}
	
	
}
