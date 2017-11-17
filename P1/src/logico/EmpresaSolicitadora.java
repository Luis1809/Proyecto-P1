package logico;

import java.util.ArrayList;

public class EmpresaSolicitadora {
	
	private String nombreEmpresa;
	private String id;
	private String emailEmpresa;
	private String telefonoEmpresa;
	private String direccion; 
	private String paisEmpresa;
	private int plaza;
	private String areaTrabajo;
	private ArrayList<Solicitantes>mySolicitante;
	

	public EmpresaSolicitadora(String nombreEmpresa, String id, String emailEmpresa, String telefonoEmpresa,
			String direccion, String paisEmpresa, int plaza, String areaTrabajo,
			ArrayList<Solicitantes> mySolicitante) {
		super();
		this.nombreEmpresa = nombreEmpresa;
		this.id = id;
		this.emailEmpresa = emailEmpresa;
		this.telefonoEmpresa = telefonoEmpresa;
		this.direccion = direccion;
		this.paisEmpresa = paisEmpresa;
		this.plaza = plaza;
		this.areaTrabajo = areaTrabajo;
		this.mySolicitante = mySolicitante;
	}
	
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmailEmpresa() {
		return emailEmpresa;
	}
	public void setEmailEmpresa(String emailEmpresa) {
		this.emailEmpresa = emailEmpresa;
	}
	public String getTelefonoEmpresa() {
		return telefonoEmpresa;
	}
	public void setTelefonoEmpresa(String telefonoEmpresa) {
		this.telefonoEmpresa = telefonoEmpresa;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getPaisEmpresa() {
		return paisEmpresa;
	}
	public void setPaisEmpresa(String paisEmpresa) {
		this.paisEmpresa = paisEmpresa;
	}
	public int getPlaza() {
		return plaza;
	}
	public void setPlaza(int plaza) {
		this.plaza = plaza;
	}
	public String getAreaTrabajo() {
		return areaTrabajo;
	}
	public void setAreaTrabajo(String areaTrabajo) {
		this.areaTrabajo = areaTrabajo;
	}
	public ArrayList<Solicitantes> getMySolicitante() {
		return mySolicitante;
	}
	public void setMySolicitante(ArrayList<Solicitantes> mySolicitante) {
		this.mySolicitante = mySolicitante;
	}
	
	
}
