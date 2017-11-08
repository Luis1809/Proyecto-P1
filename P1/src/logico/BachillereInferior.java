package logico;

public class BachillereInferior extends Solicitantes{
	
	private int ultimoAnoCursado;
	
	public BachillereInferior(String cedula, String nombre, String apellido, String telefono, String email, String sexo,
			String estadoCivil, String calle, String region, String ciudad, String pais, String fechaNacimiento,
			String estudio, String salirioSolicitado, boolean dispMudarse, boolean dispViajar, String tipoJornada,
			String experienciaLaboral, String areaTrabajoSolicitada, boolean experiencialaboral2, String nombreEmpresa1,
			String areaTrabajo1, int tiempotrabajoRealizado1, String nombreEmpresa2, String areaTrabajo2,
			int tiempotrabajoRealizado2, String nombreEmpresa3, String areaTrabajo3, int tiempotrabajoRealizado3,
			String institucionAcademica, boolean aceptarTerminosyCondiciones, int ultimoAnoCursado) {
		super(cedula, nombre, apellido, telefono, email, sexo, estadoCivil, calle, region, ciudad, pais,
				fechaNacimiento, estudio, salirioSolicitado, dispMudarse, dispViajar, tipoJornada, experienciaLaboral,
				areaTrabajoSolicitada, experiencialaboral2, nombreEmpresa1, areaTrabajo1, tiempotrabajoRealizado1,
				nombreEmpresa2, areaTrabajo2, tiempotrabajoRealizado2, nombreEmpresa3, areaTrabajo3,
				tiempotrabajoRealizado3, institucionAcademica, aceptarTerminosyCondiciones);
		this.ultimoAnoCursado = ultimoAnoCursado;
	}

	public int getUltimoAnoCursado() {
		return ultimoAnoCursado;
	}

	public void setUltimoAnoCursado(int ultimoAnoCursado) {
		this.ultimoAnoCursado = ultimoAnoCursado;
	}

}
