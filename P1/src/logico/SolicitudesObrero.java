package logico;

import java.util.ArrayList;

public class SolicitudesObrero extends Solicitudes {

	private ArrayList<String> listaHabilidades;
	
	public SolicitudesObrero(String sexo, String estadoCivil, String cuidad, String pais, int salirioSolicitado,
			boolean dispMudarse, boolean dispViajar, String tipoJornada, ArrayList<String> idioma, String areaInteres,
			boolean licencia, String areadeExp, int anosExp, float porcientoAceptable, int plaza,
			ArrayList<String> listaHabilidades) {
		super(sexo, estadoCivil, cuidad, pais, salirioSolicitado, dispMudarse, dispViajar, tipoJornada, idioma,
				areaInteres, licencia, areadeExp, anosExp, porcientoAceptable, plaza);
		this.listaHabilidades = listaHabilidades;
	}

	
	public ArrayList<String> getListaHabilidades() {
		return listaHabilidades;
	}

	public void setListaHabilidades(ArrayList<String> listaHabilidades) {
		this.listaHabilidades = listaHabilidades;
	}
}
