package logico;

import java.util.ArrayList;

public class EmpresaSolicitadora {
	
	private String nombre;
	private String email;
	private String telefono;
	private String calle; 
	private String region;
	private String ciudad; 
	private String pais;
	private String sueldo;
	private String tipoJornada;
	private boolean dispMudarse;
	private boolean dispViajar;
	private String areaTrabajo;
	private String puestoDeTrabajo;
	private ArrayList<Solicitantes>mySolicitante;
	
	public EmpresaSolicitadora(String nombre, String email, String telefono, String calle, String region, String ciudad,
			String pais, String sueldo, String tipoJornada, boolean dispMudarse, boolean dispViajar, String areaTrabajo,
			String puestoDeTrabajo, ArrayList<Solicitantes> mySolicitante) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;
		this.calle = calle;
		this.region = region;
		this.ciudad = ciudad;
		this.pais = pais;
		this.sueldo = sueldo;
		this.tipoJornada = tipoJornada;
		this.dispMudarse = dispMudarse;
		this.dispViajar = dispViajar;
		this.areaTrabajo = areaTrabajo;
		this.puestoDeTrabajo = puestoDeTrabajo;
		this.mySolicitante = mySolicitante;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getSueldo() {
		return sueldo;
	}

	public void setSueldo(String sueldo) {
		this.sueldo = sueldo;
	}

	public String getTipoJornada() {
		return tipoJornada;
	}

	public void setTipoJornada(String tipoJornada) {
		this.tipoJornada = tipoJornada;
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

	public String getAreaTrabajo() {
		return areaTrabajo;
	}

	public void setAreaTrabajo(String areaTrabajo) {
		this.areaTrabajo = areaTrabajo;
	}

	public String getPuestoDeTrabajo() {
		return puestoDeTrabajo;
	}

	public void setPuestoDeTrabajo(String puestoDeTrabajo) {
		this.puestoDeTrabajo = puestoDeTrabajo;
	}

	public ArrayList<Solicitantes> getMySolicitante() {
		return mySolicitante;
	}

	public void setMySolicitante(ArrayList<Solicitantes> mySolicitante) {
		this.mySolicitante = mySolicitante;
	}
	
	
	
	
}
