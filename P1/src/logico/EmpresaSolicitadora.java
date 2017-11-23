package logico;

import java.util.ArrayList;

public class EmpresaSolicitadora {
	
	private String nombreEmpresa;
	private String emailEmpresa;
	private String telefonoEmpresa;
	private String direccion; 
	private String ciudad;
	private String paisEmpresa;
	private String areaTrabajo;
	private String RNC;
	private ArrayList<Solicitudes>miSolicitudes;
	private ArrayList<Solicitantes>miSolicitantes;
	
	public EmpresaSolicitadora(String nombreEmpresa, String emailEmpresa, String telefonoEmpresa,
			String direccion, String ciudad, String paisEmpresa, String areaTrabajo, String rNC) {
		super();
		this.nombreEmpresa = nombreEmpresa;
		this.emailEmpresa = emailEmpresa;
		this.telefonoEmpresa = telefonoEmpresa;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.paisEmpresa = paisEmpresa;
		this.areaTrabajo = areaTrabajo;
		RNC = rNC;
		this.miSolicitudes = new ArrayList<>();
		this.miSolicitantes = new ArrayList<>();
	}
	
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
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
	public String getAreaTrabajo() {
		return areaTrabajo;
	}
	public void setAreaTrabajo(String areaTrabajo) {
		this.areaTrabajo = areaTrabajo;
	}

	public String getRNC() {
		return RNC;
	}

	public void setRNC(String rNC) {
		RNC = rNC;
	}
	public ArrayList<Solicitudes> getMiSolicitudes() {
		return miSolicitudes;
	}
	public void setMiSolicitudes(ArrayList<Solicitudes> miSolicitudes) {
		this.miSolicitudes = miSolicitudes;
	}
	public ArrayList<Solicitantes> getMiSolicitantes() {
		return miSolicitantes;
	}
	public void setMiSolicitantes(ArrayList<Solicitantes> miSolicitantes) {
		this.miSolicitantes = miSolicitantes;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
}
