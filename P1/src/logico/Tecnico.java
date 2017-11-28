package logico;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

public class Tecnico extends AgregarSolicitudes implements Serializable{

	private static final long serialVersionUID = -3609684295683397705L;
	private String institucion; 
	private String tecnico; //Cual tecnico se realizo
	
	public Tecnico(int salirioSolicitado, boolean dispMudarse, boolean dispViajar, String tipoJornada,
			String areaInteres, LocalDate fecha, String institucion, String tecnico) {
		super(salirioSolicitado, dispMudarse, dispViajar, tipoJornada, areaInteres, fecha);
		this.institucion = institucion;
		this.tecnico = tecnico;
	}

	public String getInstitucion() {
		return institucion;
	}

	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}

	public String getTecnico() {
		return tecnico;
	}

	public void setTecnico(String tecnico) {
		this.tecnico = tecnico;
	}

	@Override
	public String toString() {
		return "Tecnico [institucion=" + institucion + ", tecnico=" + tecnico + ", getSalirioSolicitado()="
				+ getSalirioSolicitado() + ", isDispMudarse()=" + isDispMudarse() + ", isDispViajar()=" + isDispViajar()
				+ ", getTipoJornada()=" + getTipoJornada() + ", getAreaInteres()=" + getAreaInteres() + ", getFecha()="
				+ getFecha() + ", getPorciento()=" + getPorciento() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
}
