package logico;

import java.io.Serializable;
import java.util.ArrayList;

public class SolicitudesUni extends Solicitudes implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2650121604933790146L;
	private String institucion; 
	private String carrera;
	
	public SolicitudesUni(String sexo, String estadoCivil, String cuidad, String pais, int salirioSolicitado,
			boolean dispMudarse, boolean dispViajar, String tipoJornada, ArrayList<String> idioma, String areaInteres,
			boolean licencia, String areadeExp, int anosExp, float porcientoAceptable, int plaza, String institucion,
			String carrera) {
		super(sexo, estadoCivil, cuidad, pais, salirioSolicitado, dispMudarse, dispViajar, tipoJornada, idioma,
				areaInteres, licencia, areadeExp, anosExp, porcientoAceptable, plaza);
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
