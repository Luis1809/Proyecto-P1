package logico;

import java.util.ArrayList;

public abstract class Solicitudes {
	protected boolean SatisfechoOimcompleto;
	protected String sexo;
	protected String estadoCivil; //Soltero, Casado, Viudo, Divorsiado, Union Libre
	protected String cuidad;
	protected String pais;  //Direccion
	protected String salirioSolicitado;//Menor a X 
	protected boolean dispMudarse;
	protected boolean dispViajar;
	protected String tipoJornada; //Tiempo Completo, medio Tiempo 
	protected ArrayList<String> idioma;
	protected String areaInteres; //Area de la empresa, completar esto automaticamente
	protected boolean licencia; //Posee licencia de conducir
	protected String areadeExp; //Area de experiencia requerida
	protected String anosExp; //En el area suministrada 
	protected float porcientoAceptable;
	protected int plaza; //Numero de trabajadores que se necesitan
	
	public Solicitudes(String sexo, String estadoCivil, String cuidad, String pais, String salirioSolicitado,
			boolean dispMudarse, boolean dispViajar, String tipoJornada, ArrayList<String> idioma, String areaInteres,
			boolean licencia, String area, String anosExp, int plaza) {
		super();
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
		this.areadeExp = area;
		this.anosExp = anosExp;
		this.plaza = plaza;
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
	public String getSalirioSolicitado() {
		return salirioSolicitado;
	}
	public void setSalirioSolicitado(String salirioSolicitado) {
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
	public String getAnosExp() {
		return anosExp;
	}
	public void setAnosExp(String anosExp) {
		this.anosExp = anosExp;
	}
	public int getPlaza() {
		return plaza;
	}
	public void setPlaza(int plaza) {
		this.plaza = plaza;
	}
	
}
