package logico;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

public class Universitario extends Solicitantes {

	private String institucion; 
	private String carrera;
	
	public Universitario(String cedula, String nombre, String apellido, String telefono, String email, String sexo,
			String nacionalidad, String estadoCivil, String direccion, String cuidad, String pais,
			LocalDate fechaNacimiento, int salirioSolicitado, boolean dispMudarse, boolean dispViajar,
			String tipoJornada, ArrayList<String> idioma, String areaInteres, boolean habilitado, boolean licencia,
			LocalDate fecha, String nombreEmpresa, String areaTrabajo1, int tiempotrabajoRealizado1,
			String nombreReferente, String numeroReferente, String institucion, String carrera) {
		super(cedula, nombre, apellido, telefono, email, sexo, nacionalidad, estadoCivil, direccion, cuidad, pais,
				fechaNacimiento, salirioSolicitado, dispMudarse, dispViajar, tipoJornada, idioma, areaInteres,
				habilitado, licencia, fecha, nombreEmpresa, areaTrabajo1, tiempotrabajoRealizado1, nombreReferente,
				numeroReferente);
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
}
