package logico;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

public class Tecnico extends Solicitantes implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3609684295683397705L;
	private String institucion; 
	private String tecnico; //Cual tecnico se realizo

	public Tecnico(String cedula, String nombre, String apellido, String telefono, String email, String sexo,
			String nacionalidad, String estadoCivil, String direccion, String cuidad, String pais,
			Date fechaNacimiento, int salirioSolicitado, boolean dispMudarse, boolean dispViajar,
			String tipoJornada, ArrayList<String> idioma, String areaInteres, boolean habilitado, boolean licencia,
			LocalDate fecha, String nombreEmpresa, String areaTrabajo1, int tiempotrabajoRealizado1,
			String nombreReferente, String numeroReferente, String institucion, String tecnico) {
		super(cedula, nombre, apellido, telefono, email, sexo, nacionalidad, estadoCivil, direccion, cuidad, pais,
				fechaNacimiento, salirioSolicitado, dispMudarse, dispViajar, tipoJornada, idioma, areaInteres,
				habilitado, licencia, fecha, nombreEmpresa, areaTrabajo1, tiempotrabajoRealizado1, nombreReferente,
				numeroReferente);
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
}
