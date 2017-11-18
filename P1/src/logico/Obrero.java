package logico;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

public class Obrero extends Solicitantes{
	private ArrayList<String> listaHabilidades;
	
	public Obrero(String cedula, String nombre, String apellido, String telefono, String email, String sexo,
			String estadoCivil, String direccion, String cuidad, String pais, Date fechaNacimiento,
			int salirioSolicitado, boolean dispMudarse, boolean dispViajar, String tipoJornada,
			ArrayList<String> idioma, String areaInteres, boolean habilitado, boolean licencia, LocalDate fecha,
			ArrayList<ExperienciaLaboral> exp, ArrayList<String> listaHabilidades) {
		super(cedula, nombre, apellido, telefono, email, sexo, estadoCivil, direccion, cuidad, pais, fechaNacimiento,
				salirioSolicitado, dispMudarse, dispViajar, tipoJornada, idioma, areaInteres, habilitado, licencia,
				fecha, exp);
		this.listaHabilidades = listaHabilidades;
	}

	public ArrayList<String> getListaHabilidades() {
		return listaHabilidades;
	}

	public void setListaHabilidades(ArrayList<String> listaHabilidades) {
		this.listaHabilidades = listaHabilidades;
	}

	
}
