package logico;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

public class Obrero extends Solicitantes{

	private ArrayList<String> listaHabilidades;
	
	public Obrero(String cedula, String nombre, String apellido, String telefono, String email, String sexo,
			String nacionalidad, String estadoCivil, String direccion, String cuidad, String pais,
			LocalDate fechaNacimiento, int salirioSolicitado, boolean dispMudarse, boolean dispViajar,
			String tipoJornada, ArrayList<String> idioma, String areaInteres, boolean habilitado, boolean licencia,
			LocalDate fecha, String nombreEmpresa, String areaTrabajo1, int tiempotrabajoRealizado1,
			String nombreReferente, String numeroReferente, ArrayList<String> listaHabilidades) {
		super(cedula, nombre, apellido, telefono, email, sexo, nacionalidad, estadoCivil, direccion, cuidad, pais,
				fechaNacimiento, salirioSolicitado, dispMudarse, dispViajar, tipoJornada, idioma, areaInteres,
				habilitado, licencia, fecha, nombreEmpresa, areaTrabajo1, tiempotrabajoRealizado1, nombreReferente,
				numeroReferente);
		this.listaHabilidades = listaHabilidades;
	}
	
	public ArrayList<String> getListaHabilidades() {
		return listaHabilidades;
	}

	public void setListaHabilidades(ArrayList<String> listaHabilidades) {
		this.listaHabilidades = listaHabilidades;
	}

	
}
