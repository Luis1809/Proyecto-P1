package logico;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

public class Solicitantes implements Serializable{

	private static final long serialVersionUID = -4254348379578729161L;
	protected String cedula;
	protected String nombre;
	protected String apellido;
	protected String telefono;
	protected String email;
	protected String sexo;
	protected String nacionalidad;
	protected String estadoCivil; //Soltero, Casado, Viudo, Divorsiado, Union Libre
	protected String direccion;
	protected String cuidad; //Ciudad Para la empresa
	protected String pais;  //Direccion
	protected Date fechaNacimiento;
	protected ArrayList<String> idioma;
	protected boolean habilitado; //El solicitante no ha sido escogido
	protected boolean licencia; //Posee licencia de conducir
	protected String nombreEmpresa;
	protected String areaTrabajo1;
	protected int tiempotrabajoRealizado1; // 5 anos
	protected String nombreReferente;
	protected String numeroReferente;
	protected ArrayList<AgregarSolicitudes> miSolicitud;
	
	public Solicitantes(String cedula, String nombre, String apellido, String telefono, String email, String sexo,
			String nacionalidad, String estadoCivil, String direccion, String cuidad, String pais, Date fechaNacimiento,
			ArrayList<String> idioma, boolean habilitado, boolean licencia, String nombreEmpresa, String areaTrabajo1,
			int tiempotrabajoRealizado1, String nombreReferente, String numeroReferente) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.email = email;
		this.sexo = sexo;
		this.nacionalidad = nacionalidad;
		this.estadoCivil = estadoCivil;
		this.direccion = direccion;
		this.cuidad = cuidad;
		this.pais = pais;
		this.fechaNacimiento = fechaNacimiento;
		this.idioma = idioma;
		this.habilitado = habilitado;
		this.licencia = licencia;
		this.nombreEmpresa = nombreEmpresa;
		this.areaTrabajo1 = areaTrabajo1;
		this.tiempotrabajoRealizado1 = tiempotrabajoRealizado1;
		this.nombreReferente = nombreReferente;
		this.numeroReferente = numeroReferente;
		this.miSolicitud = new ArrayList<>();
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public boolean isHabilitado() {
		return habilitado;
	}
	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}
	public boolean isLicencia() {
		return licencia;
	}
	public void setLicencia(boolean licencia) {
		this.licencia = licencia;
	}

	public String getCuidad() {
		return cuidad;
	}
	public void setCuidad(String cuidad) {
		this.cuidad = cuidad;
	}
	public ArrayList<String> getIdioma() {
		return idioma;
	}
	public void setIdioma(ArrayList<String> idioma) {
		this.idioma = idioma;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	public String getAreaTrabajo1() {
		return areaTrabajo1;
	}
	public void setAreaTrabajo1(String areaTrabajo1) {
		this.areaTrabajo1 = areaTrabajo1;
	}
	public int getTiempotrabajoRealizado1() {
		return tiempotrabajoRealizado1;
	}
	public void setTiempotrabajoRealizado1(int tiempotrabajoRealizado1) {
		this.tiempotrabajoRealizado1 = tiempotrabajoRealizado1;
	}
	public String getNombreReferente() {
		return nombreReferente;
	}
	public void setNombreReferente(String nombreReferente) {
		this.nombreReferente = nombreReferente;
	}
	public String getNumeroReferente() {
		return numeroReferente;
	}
	public void setNumeroReferente(String numeroReferente) {
		this.numeroReferente = numeroReferente;
	}


	public ArrayList<AgregarSolicitudes> getMiSolicitud() {
		return miSolicitud;
	}


	public void setMiSolicitud(ArrayList<AgregarSolicitudes> miSolicitud) {
		this.miSolicitud = miSolicitud;
	}
}
