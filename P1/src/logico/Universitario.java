package logico;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

public class Universitario extends AgregarSolicitudes implements Serializable{

	private static final long serialVersionUID = -7341882960328332552L;
	private String institucion; 
	private String carrera;
	
	public Universitario(int salirioSolicitado, boolean dispMudarse, boolean dispViajar, String tipoJornada,
			String areaInteres, LocalDate fecha, String institucion, String carrera) {
		super(salirioSolicitado, dispMudarse, dispViajar, tipoJornada, areaInteres, fecha);
		this.institucion = institucion;
		this.carrera = carrera;
	}
	
	public String getInstitucion() {
		return institucion;
	}

	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	@Override
	public String toString() {
		return "Universitario [institucion=" + institucion + ", carrera=" + carrera + ", getSalirioSolicitado()="
				+ getSalirioSolicitado() + ", isDispMudarse()=" + isDispMudarse() + ", isDispViajar()=" + isDispViajar()
				+ ", getTipoJornada()=" + getTipoJornada() + ", getAreaInteres()=" + getAreaInteres() + ", getFecha()="
				+ getFecha() + ", getPorciento()=" + getPorciento() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
}
