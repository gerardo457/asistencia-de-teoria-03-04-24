package ar.edu.unju.fi.model;

import java.time.LocalDate;

public class Pago {
  private int codigo;
  private LocalDate fecha;
  private int couta;
  private capacitador capacitador;
  private Estudiante estudiante;

public Pago() {
	
}

public Pago(int codigo, LocalDate fecha, int couta, ar.edu.unju.fi.model.capacitador capacitador,
		Estudiante estudiante) {
	this.codigo = codigo;
	this.fecha = fecha;
	this.couta = couta;
	this.capacitador = capacitador;
	this.estudiante = estudiante;
}

public int getCodigo() {
	return codigo;
}

public void setCodigo(int codigo) {
	this.codigo = codigo;
}

public LocalDate getFecha() {
	return fecha;
}

public void setFecha(LocalDate fecha) {
	this.fecha = fecha;
}

public int getCouta() {
	return couta;
}

public void setCouta(int couta) {
	this.couta = couta;
}

public capacitador getCapacitador() {
	return capacitador;
}

public void setCapacitador(capacitador capacitador) {
	this.capacitador = capacitador;
}

public Estudiante getEstudiante() {
	return estudiante;
}

public void setEstudiante(Estudiante estudiante) {
	this.estudiante = estudiante;
}

}
