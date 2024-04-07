package ar.edu.unju.fi.model;

public class Materia {
   private String codigo;
   private String nombre;
   
   public Materia() {
	   
   }
   
   

   @Override
public String toString() {
	return "codigo=" + codigo + ", nombre=" + nombre;
}

public Materia(String codigo, String nombre) {
    this.codigo = codigo;
	this.nombre = nombre;
  }

public String getCodigo() {
	return codigo;
}

public void setCodigo(String codigo) {
	this.codigo = codigo;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}
   
   
   
}
