package logico;

import java.util.ArrayList;

public class EmpresaSolicitadora {
	
	private String nombreEmpresa;
	private String emailEmpresa;
	private String telefonoEmpresa;
	private String calleEmpresa; 
	private String regionEmpresa;
	private String ciudadEmpresa; 
	private String paisEmpresa;
	private String sueldoRequerido;
	private String tipoJornadaRequerido;
	private boolean dispMudarseRequerido;
	private boolean dispViajarRequerido;
	private String areaTrabajoRequerido;
	private String puestoDeTrabajoRequerido;
	private String sexoRequerido;
	private String estadoCivilRequerido;
	private String edadRequerida;
	private ArrayList<Solicitantes>mySolicitante;
	
	public EmpresaSolicitadora(String nombreEmpresa, String emailEmpresa, String telefonoEmpresa, String calleEmpresa,
			String regionEmpresa, String ciudadEmpresa, String paisEmpresa, String sueldoRequerido,
			String tipoJornadaRequerido, boolean dispMudarseRequerido, boolean dispViajarRequerido,
			String areaTrabajoRequerido, String puestoDeTrabajoRequerido, String sexoRequerido,
			String estadoCivilRequerido, String edadRequerida, ArrayList<Solicitantes> mySolicitante) {
		super();
		this.nombreEmpresa = nombreEmpresa;
		this.emailEmpresa = emailEmpresa;
		this.telefonoEmpresa = telefonoEmpresa;
		this.calleEmpresa = calleEmpresa;
		this.regionEmpresa = regionEmpresa;
		this.ciudadEmpresa = ciudadEmpresa;
		this.paisEmpresa = paisEmpresa;
		this.sueldoRequerido = sueldoRequerido;
		this.tipoJornadaRequerido = tipoJornadaRequerido;
		this.dispMudarseRequerido = dispMudarseRequerido;
		this.dispViajarRequerido = dispViajarRequerido;
		this.areaTrabajoRequerido = areaTrabajoRequerido;
		this.puestoDeTrabajoRequerido = puestoDeTrabajoRequerido;
		this.sexoRequerido = sexoRequerido;
		this.estadoCivilRequerido = estadoCivilRequerido;
		this.edadRequerida = edadRequerida;
		this.mySolicitante = mySolicitante;
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
	public String getCalleEmpresa() {
		return calleEmpresa;
	}
	public void setCalleEmpresa(String calleEmpresa) {
		this.calleEmpresa = calleEmpresa;
	}
	public String getRegionEmpresa() {
		return regionEmpresa;
	}
	public void setRegionEmpresa(String regionEmpresa) {
		this.regionEmpresa = regionEmpresa;
	}
	public String getCiudadEmpresa() {
		return ciudadEmpresa;
	}
	public void setCiudadEmpresa(String ciudadEmpresa) {
		this.ciudadEmpresa = ciudadEmpresa;
	}
	public String getPaisEmpresa() {
		return paisEmpresa;
	}
	public void setPaisEmpresa(String paisEmpresa) {
		this.paisEmpresa = paisEmpresa;
	}
	public String getSueldoRequerido() {
		return sueldoRequerido;
	}
	public void setSueldoRequerido(String sueldoRequerido) {
		this.sueldoRequerido = sueldoRequerido;
	}
	public String getTipoJornadaRequerido() {
		return tipoJornadaRequerido;
	}
	public void setTipoJornadaRequerido(String tipoJornadaRequerido) {
		this.tipoJornadaRequerido = tipoJornadaRequerido;
	}
	public boolean isDispMudarseRequerido() {
		return dispMudarseRequerido;
	}
	public void setDispMudarseRequerido(boolean dispMudarseRequerido) {
		this.dispMudarseRequerido = dispMudarseRequerido;
	}
	public boolean isDispViajarRequerido() {
		return dispViajarRequerido;
	}
	public void setDispViajarRequerido(boolean dispViajarRequerido) {
		this.dispViajarRequerido = dispViajarRequerido;
	}
	public String getAreaTrabajoRequerido() {
		return areaTrabajoRequerido;
	}
	public void setAreaTrabajoRequerido(String areaTrabajoRequerido) {
		this.areaTrabajoRequerido = areaTrabajoRequerido;
	}
	public String getPuestoDeTrabajoRequerido() {
		return puestoDeTrabajoRequerido;
	}
	public void setPuestoDeTrabajoRequerido(String puestoDeTrabajoRequerido) {
		this.puestoDeTrabajoRequerido = puestoDeTrabajoRequerido;
	}
	public String getSexoRequerido() {
		return sexoRequerido;
	}
	public void setSexoRequerido(String sexoRequerido) {
		this.sexoRequerido = sexoRequerido;
	}
	public String getEstadoCivilRequerido() {
		return estadoCivilRequerido;
	}
	public void setEstadoCivilRequerido(String estadoCivilRequerido) {
		this.estadoCivilRequerido = estadoCivilRequerido;
	}
	public String getEdadRequerida() {
		return edadRequerida;
	}
	public void setEdadRequerida(String edadRequerida) {
		this.edadRequerida = edadRequerida;
	}
	public ArrayList<Solicitantes> getMySolicitante() {
		return mySolicitante;
	}
	public void setMySolicitante(ArrayList<Solicitantes> mySolicitante) {
		this.mySolicitante = mySolicitante;
	}

	
	
}
