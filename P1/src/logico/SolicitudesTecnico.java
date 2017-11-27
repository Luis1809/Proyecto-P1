package logico;

import java.io.Serializable;
import java.util.ArrayList;

public class SolicitudesTecnico extends Solicitudes implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2417590439500389498L;
	private String tecnico; //Cual tecnico se realizo

	public SolicitudesTecnico(String sexo, String estadoCivil, String cuidad, String pais, int salirioSolicitado,
			boolean dispMudarse, boolean dispViajar, String tipoJornada, ArrayList<String> idioma, String areaInteres,
			boolean licencia, String areadeExp, int anosExp, float porcientoAceptable, int plaza, String tecnico) {
		super(sexo, estadoCivil, cuidad, pais, salirioSolicitado, dispMudarse, dispViajar, tipoJornada, idioma,
				areaInteres, licencia, areadeExp, anosExp, porcientoAceptable, plaza);
		this.tecnico = tecnico;
	}

	public String getTecnico() {
		return tecnico;
	}
	public void setTecnico(String tecnico) {
		this.tecnico = tecnico;
	}

}
