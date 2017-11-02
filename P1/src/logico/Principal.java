package logico;

import java.util.ArrayList;

public class Principal {
	private int nombre;
	private String tipo;
	private ArrayList<Proyecto> miPriyecto;
	public int getNombre() {
		return nombre;
	}
	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public ArrayList<Proyecto> getMiPriyecto() {
		return miPriyecto;
	}
	public void setMiPriyecto(ArrayList<Proyecto> miPriyecto) {
		this.miPriyecto = miPriyecto;
	}
	

}
