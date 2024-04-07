package ar.edu.unju.fi.model;

public class capacitador {
	private Integer legajo;
	private String apellido;
	private String nombre;
	private String titulo;


 public capacitador() {
	
}


public capacitador(Integer legajo, String apellido, String nombre, String titulo) {
	this.legajo = legajo;
	this.apellido = apellido;
	this.nombre = nombre;
	this.titulo = titulo;
}

public String getDatos() {
   return this.nombre + " " + this.apellido;	
}
public Integer getLegajo() {
	return legajo;
}


public void setLegajo(Integer legajo) {
	this.legajo = legajo;
}


public String getApellido() {
	return apellido;
}


public void setApellido(String apellido) {
	this.apellido = apellido;
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public String getTitulo() {
	return titulo;
}


public void setTitulo(String titulo) {
	this.titulo = titulo;
}



}