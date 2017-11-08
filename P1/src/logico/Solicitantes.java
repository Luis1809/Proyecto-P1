package logico;

public abstract class Solicitantes {
	protected String cedula;
	protected String nombre;
	protected String apellido;
	protected String telefono;
	protected String email;
	protected String sexo;
	protected String estadoCivil; //Soltero, Casado, Viudo, Divorsiado, Union Libre
	protected String calle; //Direccion
	protected String region; //Direccion
	protected String ciudad; //Direccion
	protected String pais;  //Direccion
	protected String fechaNacimiento;
	protected String estudio;
	protected String salirioSolicitado;
	protected boolean dispMudarse;
	protected boolean dispViajar;
	protected String tipoJornada; //Tiempo Completo, medio Tiempo 
	protected String experienciaLaboral;
	protected String areaTrabajoSolicitada; //Salud,Educacion,Turismo,Ventas,Comunicacion/Publicidad,Bancaria,Construccion,Technologia,Agricultura
	
	protected boolean experiencialaboral;
	
	protected String nombreEmpresa1;
	protected String areaTrabajo1;
	protected int tiempotrabajoRealizado1;
	
	protected String nombreEmpresa2;
	protected String areaTrabajo2;
	protected int tiempotrabajoRealizado2;
	
	protected String nombreEmpresa3;
	protected String areaTrabajo3;
	protected int tiempotrabajoRealizado3;
	
	protected String institucionAcademica;
	protected boolean AceptarTerminosyCondiciones;
	
	public Solicitantes(String cedula, String nombre, String apellido, String telefono, String email, String sexo,
			String estadoCivil, String calle, String region, String ciudad, String pais, String fechaNacimiento,
			String estudio, String salirioSolicitado, boolean dispMudarse, boolean dispViajar, String tipoJornada,
			String experienciaLaboral, String areaTrabajoSolicitada, boolean experiencialaboral2, String nombreEmpresa1,
			String areaTrabajo1, int tiempotrabajoRealizado1, String nombreEmpresa2, String areaTrabajo2,
			int tiempotrabajoRealizado2, String nombreEmpresa3, String areaTrabajo3, int tiempotrabajoRealizado3,
			String institucionAcademica, boolean aceptarTerminosyCondiciones) {
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
		experiencialaboral = experiencialaboral2;
		this.nombreEmpresa1 = nombreEmpresa1;
		this.areaTrabajo1 = areaTrabajo1;
		this.tiempotrabajoRealizado1 = tiempotrabajoRealizado1;
		this.nombreEmpresa2 = nombreEmpresa2;
		this.areaTrabajo2 = areaTrabajo2;
		this.tiempotrabajoRealizado2 = tiempotrabajoRealizado2;
		this.nombreEmpresa3 = nombreEmpresa3;
		this.areaTrabajo3 = areaTrabajo3;
		this.tiempotrabajoRealizado3 = tiempotrabajoRealizado3;
		this.institucionAcademica = institucionAcademica;
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


	public boolean isExperiencialaboral() {
		return experiencialaboral;
	}


	public void setExperiencialaboral(boolean experiencialaboral) {
		this.experiencialaboral = experiencialaboral;
	}


	public String getNombreEmpresa1() {
		return nombreEmpresa1;
	}


	public void setNombreEmpresa1(String nombreEmpresa1) {
		this.nombreEmpresa1 = nombreEmpresa1;
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


	public String getNombreEmpresa2() {
		return nombreEmpresa2;
	}


	public void setNombreEmpresa2(String nombreEmpresa2) {
		this.nombreEmpresa2 = nombreEmpresa2;
	}


	public String getAreaTrabajo2() {
		return areaTrabajo2;
	}


	public void setAreaTrabajo2(String areaTrabajo2) {
		this.areaTrabajo2 = areaTrabajo2;
	}


	public int getTiempotrabajoRealizado2() {
		return tiempotrabajoRealizado2;
	}


	public void setTiempotrabajoRealizado2(int tiempotrabajoRealizado2) {
		this.tiempotrabajoRealizado2 = tiempotrabajoRealizado2;
	}


	public String getNombreEmpresa3() {
		return nombreEmpresa3;
	}


	public void setNombreEmpresa3(String nombreEmpresa3) {
		this.nombreEmpresa3 = nombreEmpresa3;
	}


	public String getAreaTrabajo3() {
		return areaTrabajo3;
	}


	public void setAreaTrabajo3(String areaTrabajo3) {
		this.areaTrabajo3 = areaTrabajo3;
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


	public String getInstitucionAcademica() {
		return institucionAcademica;
	}


	public void setInstitucionAcademica(String institucionAcademica) {
		this.institucionAcademica = institucionAcademica;
	}
	
	
}
