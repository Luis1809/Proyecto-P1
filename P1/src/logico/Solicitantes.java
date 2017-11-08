package logico;

public class Solicitantes {

	private String cedula;
	private String nombre;
	private String apellido;
	private String telefono;
	private String email;
	private String sexo;
	private String estadoCivil; //Soltero, Casado, Viudo, Divorsiado, Union Libre
	private String calle; //Direccion
	private String region; //Direccion
	private String ciudad; //Direccion
	private String pais;  //Direccion
	private String fechaNacimiento;
	private String estudio;
	private String salirioSolicitado;
	private boolean dispMudarse;
	private boolean dispViajar;
	private String tipoJornada; //Tiempo Completo, medio Tiempo 
	private String experienciaLaboral;
	private String areaTrabajoSolicitada; //Salud,Educacion,Turismo,Ventas,Comunicacion/Publicidad,Bancaria,Construccion,Technologia,Agricultura
	
	private String areaTrabajoSolicitada1;
	private String trabajoRealizado1;
	private int tiempotrabajoRealizado1;
	
	private String areaTrabajoSolicitada2;
	private String trabajoRealizado2;
	private int tiempotrabajoRealizado2;
	
	private String areaTrabajoSolicitada3;
	private String trabajoRealizado3;
	private int tiempotrabajoRealizado3;
	private boolean AceptarTerminosyCondiciones;
	
	public Solicitantes(String cedula, String nombre, String apellido, String telefono, String email, String sexo,
			String estadoCivil, String calle, String region, String ciudad, String pais, String fechaNacimiento,
			String estudio, String salirioSolicitado, boolean dispMudarse, boolean dispViajar, String tipoJornada,
			String experienciaLaboral, String areaTrabajoSolicitada, String areaTrabajoSolicitada1,
			String trabajoRealizado1, int tiempotrabajoRealizado1, String areaTrabajoSolicitada2,
			String trabajoRealizado2, int tiempotrabajoRealizado2, String areaTrabajoSolicitada3,
			String trabajoRealizado3, int tiempotrabajoRealizado3, boolean aceptarTerminosyCondiciones) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.email = email;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.calle = calle;
		this.region = region;
		this.ciudad = ciudad;
		this.pais = pais;
		this.fechaNacimiento = fechaNacimiento;
		this.estudio = estudio;
		this.salirioSolicitado = salirioSolicitado;
		this.dispMudarse = dispMudarse;
		this.dispViajar = dispViajar;
		this.tipoJornada = tipoJornada;
		this.experienciaLaboral = experienciaLaboral;
		this.areaTrabajoSolicitada = areaTrabajoSolicitada;
		this.areaTrabajoSolicitada1 = areaTrabajoSolicitada1;
		this.trabajoRealizado1 = trabajoRealizado1;
		this.tiempotrabajoRealizado1 = tiempotrabajoRealizado1;
		this.areaTrabajoSolicitada2 = areaTrabajoSolicitada2;
		this.trabajoRealizado2 = trabajoRealizado2;
		this.tiempotrabajoRealizado2 = tiempotrabajoRealizado2;
		this.areaTrabajoSolicitada3 = areaTrabajoSolicitada3;
		this.trabajoRealizado3 = trabajoRealizado3;
		this.tiempotrabajoRealizado3 = tiempotrabajoRealizado3;
		AceptarTerminosyCondiciones = aceptarTerminosyCondiciones;
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

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getEstudio() {
		return estudio;
	}

	public void setEstudio(String estudio) {
		this.estudio = estudio;
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

	public String getExperienciaLaboral() {
		return experienciaLaboral;
	}

	public void setExperienciaLaboral(String experienciaLaboral) {
		this.experienciaLaboral = experienciaLaboral;
	}

	public String getAreaTrabajoSolicitada() {
		return areaTrabajoSolicitada;
	}

	public void setAreaTrabajoSolicitada(String areaTrabajoSolicitada) {
		this.areaTrabajoSolicitada = areaTrabajoSolicitada;
	}

	public String getAreaTrabajoSolicitada1() {
		return areaTrabajoSolicitada1;
	}

	public void setAreaTrabajoSolicitada1(String areaTrabajoSolicitada1) {
		this.areaTrabajoSolicitada1 = areaTrabajoSolicitada1;
	}

	public String getTrabajoRealizado1() {
		return trabajoRealizado1;
	}

	public void setTrabajoRealizado1(String trabajoRealizado1) {
		this.trabajoRealizado1 = trabajoRealizado1;
	}

	public int getTiempotrabajoRealizado1() {
		return tiempotrabajoRealizado1;
	}

	public void setTiempotrabajoRealizado1(int tiempotrabajoRealizado1) {
		this.tiempotrabajoRealizado1 = tiempotrabajoRealizado1;
	}

	public String getAreaTrabajoSolicitada2() {
		return areaTrabajoSolicitada2;
	}

	public void setAreaTrabajoSolicitada2(String areaTrabajoSolicitada2) {
		this.areaTrabajoSolicitada2 = areaTrabajoSolicitada2;
	}

	public String getTrabajoRealizado2() {
		return trabajoRealizado2;
	}

	public void setTrabajoRealizado2(String trabajoRealizado2) {
		this.trabajoRealizado2 = trabajoRealizado2;
	}

	public int getTiempotrabajoRealizado2() {
		return tiempotrabajoRealizado2;
	}

	public void setTiempotrabajoRealizado2(int tiempotrabajoRealizado2) {
		this.tiempotrabajoRealizado2 = tiempotrabajoRealizado2;
	}

	public String getAreaTrabajoSolicitada3() {
		return areaTrabajoSolicitada3;
	}

	public void setAreaTrabajoSolicitada3(String areaTrabajoSolicitada3) {
		this.areaTrabajoSolicitada3 = areaTrabajoSolicitada3;
	}

	public String getTrabajoRealizado3() {
		return trabajoRealizado3;
	}

	public void setTrabajoRealizado3(String trabajoRealizado3) {
		this.trabajoRealizado3 = trabajoRealizado3;
	}

	public int getTiempotrabajoRealizado3() {
		return tiempotrabajoRealizado3;
	}

	public void setTiempotrabajoRealizado3(int tiempotrabajoRealizado3) {
		this.tiempotrabajoRealizado3 = tiempotrabajoRealizado3;
	}

	public boolean isAceptarTerminosyCondiciones() {
		return AceptarTerminosyCondiciones;
	}

	public void setAceptarTerminosyCondiciones(boolean aceptarTerminosyCondiciones) {
		AceptarTerminosyCondiciones = aceptarTerminosyCondiciones;
	}
}
