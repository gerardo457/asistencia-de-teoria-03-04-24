package ar.edu.unju.fi.model;

import java.time.LocalDate;

public class capacitacion {
      private int codigo;
      private String nombre;
      private short totaldehoras;
      private LocalDate fechainicio;
      private capacitador capacitador;

 public capacitacion() {
	
 }

public capacitacion(int codigo, String nombre, short totaldehoras, LocalDate fechainicio,
		ar.edu.unju.fi.model.capacitador capacitador) {
	this.codigo = codigo;
	this.nombre = nombre;
	this.totaldehoras = totaldehoras;
	this.fechainicio = fechainicio;
	this.capacitador = capacitador;
}

public int getCodigo() {
	return codigo;
}

public void setCodigo(int codigo) {
	this.codigo = codigo;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public short getTotaldehoras() {
	return totaldehoras;
}

public void setTotaldehoras(short totaldehoras) {
	this.totaldehoras = totaldehoras;
}

public LocalDate getFechainicio() {
	return fechainicio;
}

public void setFechainicio(LocalDate fechainicio) {
	this.fechainicio = fechainicio;
}

public capacitador getCapacitador() {
	return capacitador;
}

public void setCapacitador(capacitador capacitador) {
	this.capacitador = capacitador;
}
 
 
}

