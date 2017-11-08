package logico;

public class Universitario extends Solicitantes {
	
	private String carrera;
	private String area;
	private String Indice;
	
	public Universitario(String cedula, String nombre, String apellido, String telefono, String email, String sexo,
			String estadoCivil, String calle, String region, String ciudad, String pais, String fechaNacimiento,
			String estudio, String salirioSolicitado, boolean dispMudarse, boolean dispViajar, String tipoJornada,
			String experienciaLaboral, String areaTrabajoSolicitada, boolean experiencialaboral2, String nombreEmpresa1,
			String areaTrabajo1, int tiempotrabajoRealizado1, String nombreEmpresa2, String areaTrabajo2,
			int tiempotrabajoRealizado2, String nombreEmpresa3, String areaTrabajo3, int tiempotrabajoRealizado3,
			String institucionAcademica, boolean aceptarTerminosyCondiciones, String carrera, String area,
			String indice) {
		super(cedula, nombre, apellido, telefono, email, sexo, estadoCivil, calle, region, ciudad, pais,
				fechaNacimiento, estudio, salirioSolicitado, dispMudarse, dispViajar, tipoJornada, experienciaLaboral,
				areaTrabajoSolicitada, experiencialaboral2, nombreEmpresa1, areaTrabajo1, tiempotrabajoRealizado1,
				nombreEmpresa2, areaTrabajo2, tiempotrabajoRealizado2, nombreEmpresa3, areaTrabajo3,
				tiempotrabajoRealizado3, institucionAcademica, aceptarTerminosyCondiciones);
		this.carrera = carrera;
		this.area = area;
		Indice = indice;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getIndice() {
		return Indice;
	}

	public void setIndice(String indice) {
		Indice = indice;
	}
}
