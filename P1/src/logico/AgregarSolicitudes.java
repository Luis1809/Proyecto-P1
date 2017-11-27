package logico;

import java.io.Serializable;
import java.time.LocalDate;

public  abstract class AgregarSolicitudes implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2605346607434897765L;
	private int salirioSolicitado;//NO 
	private boolean dispMudarse;
	private boolean dispViajar;
	private String tipoJornada; //Tiempo Completo, medio Tiempo 
	private String areaInteres; //Area en la cual desea trabajar
	private LocalDate Fecha;
	private float porciento;
	
	public AgregarSolicitudes(int salirioSolicitado, boolean dispMudarse, boolean dispViajar, String tipoJornada,
			String areaInteres, LocalDate fecha) {
		super();
		this.salirioSolicitado = salirioSolicitado;
		this.dispMudarse = dispMudarse;
		this.dispViajar = dispViajar;
		this.tipoJornada = tipoJornada;
		this.areaInteres = areaInteres;
		Fecha = fecha;
		this.porciento = 0;
	}

	public int getSalirioSolicitado() {
		return salirioSolicitado;
	}

	public void setSalirioSolicitado(int salirioSolicitado) {
		this.salirioSolicitado = salirioSolicitado;
	}

	public boolean isDispMudarse() {
		return dispMudarse;
	}

	public void setDispMudarse(boolean dispMudarse) {
		this.dispMudarse = dispMudarse;
	}

	public boolean isDispViajar() {
		return dispViajar;
	}

	public void setDispViajar(boolean dispViajar) {
		this.dispViajar = dispViajar;
	}

	public String getTipoJornada() {
		return tipoJornada;
	}

	public void setTipoJornada(String tipoJornada) {
		this.tipoJornada = tipoJornada;
	}

	public String getAreaInteres() {
		return areaInteres;
	}

	public void setAreaInteres(String areaInteres) {
		this.areaInteres = areaInteres;
	}

	public LocalDate getFecha() {
		return Fecha;
	}

	public void setFecha(LocalDate fecha) {
		Fecha = fecha;
	}

	public float getPorciento() {
		return porciento;
	}

	public void setPorciento(float porciento) {
		this.porciento = porciento;
	}
}
