package logico;

import java.util.ArrayList;

public class SolicitudesUni extends Solicitudes {
	
	private String institucion; 
	private String carrera;
	
	public SolicitudesUni(String sexo, String estadoCivil, String cuidad, String pais, String salirioSolicitado,
			boolean dispMudarse, boolean dispViajar, String tipoJornada, ArrayList<String> idioma, String areaInteres,
			boolean licencia, String area, String anosExp, int plaza, String institucion, String carrera) {
		super(sexo, estadoCivil, cuidad, pais, salirioSolicitado, dispMudarse, dispViajar, tipoJornada, idioma,
				areaInteres, licencia, area, anosExp, plaza);
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
