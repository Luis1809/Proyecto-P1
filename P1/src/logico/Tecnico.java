package logico;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

public class Tecnico extends Solicitantes {

	private String institucion; 
	private String tecnico; //Cual tecnico se realizo

	public Tecnico(String cedula, String nombre, String apellido, String telefono, String email, String sexo,
			String nacionalidad, String estadoCivil, String direccion, String cuidad, String pais,
			LocalDate fechaNacimiento, int salirioSolicitado, boolean dispMudarse, boolean dispViajar,
			String tipoJornada, ArrayList<String> idioma, String areaInteres, boolean habilitado, boolean licencia,
			LocalDate fecha, ArrayList<ExperienciaLaboral> exp, String institucion, String tecnico) {
		super(cedula, nombre, apellido, telefono, email, sexo, nacionalidad, estadoCivil, direccion, cuidad, pais,
				fechaNacimiento, salirioSolicitado, dispMudarse, dispViajar, tipoJornada, idioma, areaInteres,
				habilitado, licencia, fecha, exp);
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
