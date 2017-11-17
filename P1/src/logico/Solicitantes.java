package logico;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Solicitantes {
	
	protected String cedula;
	protected String nombre;
	protected String apellido;
	protected String telefono;
	protected String email;
	protected String sexo;
	protected String estadoCivil; //Soltero, Casado, Viudo, Divorsiado, Union Libre
	protected String direccion;
	protected String pais;  //Direccion
	protected Date fechaNacimiento;
	protected String salirioSolicitado;
	protected boolean dispMudarse;
	protected boolean dispViajar;
	protected String tipoJornada; //Tiempo Completo, medio Tiempo 
	protected String idioma;
	
	protected String areaTrabajoSolicitada; //Salud,Educacion,Turismo,Ventas,Comunicacion/Publicidad,Bancaria,Construccion,Technologia,Agricultura
	protected boolean habilitado; //El solicitante no ha sido escogido
	
	protected boolean licencia; //Posee licencia de conducir
	protected LocalDate Fecha;
	
	protected ArrayList<ExperienciaLaboral> exp;
	

	public Solicitantes(String cedula, String nombre, String apellido, String telefono, String email, String sexo,
			String estadoCivil, String direccion, String pais, Date fechaNacimiento, String salirioSolicitado,
			boolean dispMudarse, boolean dispViajar, String tipoJornada, String idioma, String areaTrabajoSolicitada,
			boolean habilitado, boolean licencia, LocalDate fecha, ArrayList<ExperienciaLaboral> exp) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.email = email;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.direccion = direccion;
		this.pais = pais;
		this.fechaNacimiento = fechaNacimiento;
		this.salirioSolicitado = salirioSolicitado;
		this.dispMudarse = dispMudarse;
		this.dispViajar = dispViajar;
		this.tipoJornada = tipoJornada;
		this.idioma = idioma;
		this.areaTrabajoSolicitada = areaTrabajoSolicitada;
		this.habilitado = habilitado;
		this.licencia = licencia;
		Fecha = fecha;
		this.exp = exp;
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

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getAreaTrabajoSolicitada() {
		return areaTrabajoSolicitada;
	}

	public void setAreaTrabajoSolicitada(String areaTrabajoSolicitada) {
		this.areaTrabajoSolicitada = areaTrabajoSolicitada;
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

	public LocalDate getFecha() {
		return Fecha;
	}

	public void setFecha(LocalDate fecha) {
		Fecha = fecha;
	}

	public ArrayList<ExperienciaLaboral> getExp() {
		return exp;
	}

	public void setExp(ArrayList<ExperienciaLaboral> exp) {
		this.exp = exp;
	}
		
	
	
}
