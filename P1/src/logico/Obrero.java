package logico;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

public class Obrero extends Solicitantes{
	
	private String listaHabilidades;


	public Obrero(String cedula, String nombre, String apellido, String telefono, String email, String sexo,
			String estadoCivil, String direccion, String pais, Date fechaNacimiento, String salirioSolicitado,
			boolean dispMudarse, boolean dispViajar, String tipoJornada, String idioma, String areaTrabajoSolicitada,
			boolean habilitado, boolean licencia, LocalDate fecha, ArrayList<ExperienciaLaboral> exp,
			String listaHabilidades) {
		super(cedula, nombre, apellido, telefono, email, sexo, estadoCivil, direccion, pais, fechaNacimiento,
				salirioSolicitado, dispMudarse, dispViajar, tipoJornada, idioma, areaTrabajoSolicitada, habilitado,
				licencia, fecha, exp);
		this.listaHabilidades = listaHabilidades;
	}
	
	public String getListaHabilidades() {
		return listaHabilidades;
	}

	public void setListaHabilidades(String listaHabilidades) {
		this.listaHabilidades = listaHabilidades;
	}
}
