package logico;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

public class Obrero extends AgregarSolicitudes implements Serializable{

	private static final long serialVersionUID = 2802464278152137032L;
	private ArrayList<String> listaHabilidades;
	

	public Obrero(int salirioSolicitado, boolean dispMudarse, boolean dispViajar, String tipoJornada,
			String areaInteres, LocalDate fecha, ArrayList<String> listaHabilidades) {
		super(salirioSolicitado, dispMudarse, dispViajar, tipoJornada, areaInteres, fecha);
		this.listaHabilidades = listaHabilidades;
	}
	
	public ArrayList<String> getListaHabilidades() {
		return listaHabilidades;
	}

	public void setListaHabilidades(ArrayList<String> listaHabilidades) {
		this.listaHabilidades = listaHabilidades;
	}

	
}
