package logico;

import java.util.ArrayList;

public class SolicitudesTecnico extends Solicitudes {

	private String tecnico; //Cual tecnico se realizo
	
	public SolicitudesTecnico(String sexo, String estadoCivil, String cuidad, String pais, int salirioSolicitado,
			boolean dispMudarse, boolean dispViajar, String tipoJornada, ArrayList<String> idioma, String areaInteres,
			boolean licencia, String area, int anosExp, int plaza, String tecnico, float porcientoAceptable) {
		super(sexo, estadoCivil, cuidad, pais, salirioSolicitado, dispMudarse, dispViajar, tipoJornada, idioma,
				areaInteres, licencia, area, anosExp, plaza, porcientoAceptable);
		this.tecnico = tecnico;
	}
	
	public String getTecnico() {
		return tecnico;
	}
	public void setTecnico(String tecnico) {
		this.tecnico = tecnico;
	}

}
