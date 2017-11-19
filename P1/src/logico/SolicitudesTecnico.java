package logico;

import java.util.ArrayList;

public class SolicitudesTecnico extends Solicitudes {

	private String institucion; 
	private String tecnico; //Cual tecnico se realizo
	
	public SolicitudesTecnico(String sexo, String estadoCivil, String cuidad, String pais, int salirioSolicitado,
			boolean dispMudarse, boolean dispViajar, String tipoJornada, ArrayList<String> idioma, String areaInteres,
			boolean licencia, String area, int anosExp, int plaza, String institucion, String tecnico,float porcientoAceptable) {
		super(sexo, estadoCivil, cuidad, pais, salirioSolicitado, dispMudarse, dispViajar, tipoJornada, idioma,
				areaInteres, licencia, area, anosExp, plaza, porcientoAceptable);
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
