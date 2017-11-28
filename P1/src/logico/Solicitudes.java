package logico;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Solicitudes implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9075807511658271835L;
	protected boolean Satisfecho;
	protected String sexo;
	protected String estadoCivil; //Soltero, Casado, Viudo, Divorsiado, Union Libre
	protected String cuidad;
	protected String pais;  //Direccion
	protected int salirioSolicitado;//Menor a X 
	protected boolean dispMudarse;
	protected boolean dispViajar;
	protected String tipoJornada; //Tiempo Completo, medio Tiempo 
	protected ArrayList<String> idioma;
	protected String areaInteres; //Area de la empresa, completar esto automaticamente
	protected boolean licencia; //Posee licencia de conducir
	protected String areadeExp; //Area de experiencia requerida
	protected int anosExp; //En el area suministrada 
	protected float porcientoAceptable;
	protected int plaza; //Numero de trabajadores que se necesitan
	protected String id;
	protected ArrayList<Solicitantes> miSolicitantes;
	
	public Solicitudes(String sexo, String estadoCivil, String cuidad, String pais,
			int salirioSolicitado, boolean dispMudarse, boolean dispViajar, String tipoJornada,
			ArrayList<String> idioma, String areaInteres, boolean licencia, String areadeExp, int anosExp,
			float porcientoAceptable, int plaza) {
		super();
		this.Satisfecho = false;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.cuidad = cuidad;
		this.pais = pais;
		this.salirioSolicitado = salirioSolicitado;
		this.dispMudarse = dispMudarse;
		this.dispViajar = dispViajar;
		this.tipoJornada = tipoJornada;
		this.idioma = idioma;
		this.areaInteres = areaInteres;
		this.licencia = licencia;
		this.areadeExp = areadeExp;
		this.anosExp = anosExp;
		this.porcientoAceptable = porcientoAceptable;
		this.plaza = plaza;
		this.miSolicitantes = new ArrayList<>();
		this.id = "";
	}
	
	public void eliminarSolicitud(Solicitantes s){
		getMiSolicitantes().remove(s);
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public String getCuidad() {
		return cuidad;
	}
	public void setCuidad(String cuidad) {
		this.cuidad = cuidad;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public int getSalirioSolicitado() {
		return salirioSolicitado;
	}
	public void setSalirioSolicitado(int salirioSolicitado) {
		this.salirioSolicitado = salirioSolicitado;
	}
	public boolean isDispMudarse() {
		return dispMudarse;
	}
	public void setDispMudarse(boolean dispMudarse) {
		this.dispMudarse = dispMudarse;
	}
	public boolean isDispViajar() {
		return dispViajar;
	}
	public void setDispViajar(boolean dispViajar) {
		this.dispViajar = dispViajar;
	}
	public String getTipoJornada() {
		return tipoJornada;
	}
	public void setTipoJornada(String tipoJornada) {
		this.tipoJornada = tipoJornada;
	}
	public ArrayList<String> getIdioma() {
		return idioma;
	}
	public void setIdioma(ArrayList<String> idioma) {
		this.idioma = idioma;
	}
	public String getAreaInteres() {
		return areaInteres;
	}
	public void setAreaInteres(String areaInteres) {
		this.areaInteres = areaInteres;
	}
	public boolean isLicencia() {
		return licencia;
	}
	public void setLicencia(boolean licencia) {
		this.licencia = licencia;
	}
	public String getAreadeExp() {
		return areadeExp;
	}
	public void setAreadeExp(String area) {
		this.areadeExp = area;
	}
	public int getAnosExp() {
		return anosExp;
	}
	public void setAnosExp(int anosExp) {
		this.anosExp = anosExp;
	}
	public int getPlaza() {
		return plaza;
	}
	public void setPlaza(int plaza) {
		this.plaza = plaza;
	}

	

	public float getPorcientoAceptable() {
		return porcientoAceptable;
	}

	public void setPorcientoAceptable(float porcientoAceptable) {
		this.porcientoAceptable = porcientoAceptable;
	}

	public ArrayList<Solicitantes> getMiSolicitantes() {
		return miSolicitantes;
	}

	public void setMiSolicitantes(ArrayList<Solicitantes> miSolicitantes) {
		this.miSolicitantes = miSolicitantes;
	}


	public boolean isSatisfecho() {
		return Satisfecho;
	}


	public void setSatisfecho(boolean satisfecho) {
		Satisfecho = satisfecho;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}
}
